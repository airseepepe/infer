/*
 * Copyright (c) 2019-present, Facebook, Inc.
 *
 * This source code is licensed under the MIT license found in the
 * LICENSE file in the root directory of this source tree.
 */

public class Client<T> {

  String foo() {
    Library<T> lib = new Library<T>();
    return lib.get().toString();
  }
}
