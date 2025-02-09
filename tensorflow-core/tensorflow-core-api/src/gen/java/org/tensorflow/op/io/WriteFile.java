/* Copyright 2018 The TensorFlow Authors. All Rights Reserved.

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
=======================================================================*/

// This class has been generated, DO NOT EDIT!

package org.tensorflow.op.io;

import java.util.Arrays;
import org.tensorflow.GraphOperation;
import org.tensorflow.Operand;
import org.tensorflow.Operation;
import org.tensorflow.OperationBuilder;
import org.tensorflow.op.RawOp;
import org.tensorflow.op.RawOpInputs;
import org.tensorflow.op.Scope;
import org.tensorflow.op.annotation.Endpoint;
import org.tensorflow.op.annotation.OpInputsMetadata;
import org.tensorflow.op.annotation.OpMetadata;
import org.tensorflow.op.annotation.Operator;
import org.tensorflow.types.TString;

/**
 * Writes {@code contents} to the file at input {@code filename}.
 * Creates the file and recursively creates directory if it does not exist.
 */
@OpMetadata(
    opType = WriteFile.OP_NAME,
    inputsClass = WriteFile.Inputs.class
)
@Operator(
    group = "io"
)
public final class WriteFile extends RawOp {
  /**
   * The name of this op, as known by TensorFlow core engine
   */
  public static final String OP_NAME = "WriteFile";

  public WriteFile(Operation operation) {
    super(operation, OP_NAME);
  }

  /**
   * Factory method to create a class wrapping a new WriteFile operation.
   *
   * @param scope current scope
   * @param filename scalar. The name of the file to which we write the contents.
   * @param contents scalar. The content to be written to the output file.
   * @return a new instance of WriteFile
   */
  @Endpoint(
      describeByClass = true
  )
  public static WriteFile create(Scope scope, Operand<TString> filename,
      Operand<TString> contents) {
    OperationBuilder opBuilder = scope.opBuilder(OP_NAME, "WriteFile");
    opBuilder.addInput(filename.asOutput());
    opBuilder.addInput(contents.asOutput());
    return new WriteFile(opBuilder.build());
  }

  @OpInputsMetadata(
      outputsClass = WriteFile.class
  )
  public static class Inputs extends RawOpInputs<WriteFile> {
    /**
     * scalar. The name of the file to which we write the contents.
     */
    public final Operand<TString> filename;

    /**
     * scalar. The content to be written to the output file.
     */
    public final Operand<TString> contents;

    public Inputs(GraphOperation op) {
      super(new WriteFile(op), op, Arrays.asList());
      int inputIndex = 0;
      filename = (Operand<TString>) op.input(inputIndex++);
      contents = (Operand<TString>) op.input(inputIndex++);
    }
  }
}
