package io.hasanSbaih.usecase;

import io.hasanSbaih.Request;
import io.hasanSbaih.UseCase;

/**
 * Created by u562 on 11/13/2016.
 */
public interface CommandUseCase<T extends Request> extends UseCase {
    void execute(T Request);
}
