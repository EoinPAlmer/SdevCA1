package controllers;

import play.mvc.*;

import java.util.concurrent.CompletionStage;
import java.util.concurrent.CompletableFuture;

import models.*;

import javax.annotation.processing.Completion;

public class AuthCustomer extends Action.Simple {

    public CompletionStage<Result> call(Http.Context ctx) {

        String id = ctx.session().get("email");
        if (id != null) {
            User u = User.getUserById(id);
            if (u.getRole().equals("customer")){
                return delegate.call(ctx);
            }
        }
        ctx.flash().put("error", "customer Login Required.");
        return CompletableFuture.completedFuture(redirect(routes.HomeController.index()));
    }
}