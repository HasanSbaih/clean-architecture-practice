package io.hasanSbaih.usecase;

import io.hasanSbaih.Request;
import io.hasanSbaih.Response;
import io.hasanSbaih.UseCase;

/**
 * Created by u562 on 11/13/2016.
 */
public interface FunctinalUseCase<T extends Request, R extends Response> extends UseCase {
    R execute(T request);
}
