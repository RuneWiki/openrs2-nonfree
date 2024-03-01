package com.jagex;

import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ajg")
public class OutputStream_Sub1 extends OutputStream {

	@OriginalMember(owner = "client!ajg", name = "<init>", descriptor = "()V", line = 286)
	OutputStream_Sub1() {
	}

	@OriginalMember(owner = "client!ajg", name = "write", descriptor = "(I)V", line = 289)
	@Override
	public void write(@OriginalArg(0) int arg0) throws IOException {
		throw new IOException();
	}
}
