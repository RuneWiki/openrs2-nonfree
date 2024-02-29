package com.jagex;

import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aoq")
public class OutputStream_Sub1 extends OutputStream {

	@OriginalMember(owner = "client!aoq", name = "y", descriptor = "[Lclient!wp;")
	static Class626[] aClass626Array1;

	@OriginalMember(owner = "client!aoq", name = "<init>", descriptor = "()V", line = 288)
	OutputStream_Sub1() {
	}

	@OriginalMember(owner = "client!aoq", name = "c", descriptor = "(I)V", line = 291)
	public void method17957() throws IOException {
		throw new IOException();
	}

	@OriginalMember(owner = "client!aoq", name = "p", descriptor = "(I)V", line = 291)
	public void method17958() throws IOException {
		throw new IOException();
	}

	@OriginalMember(owner = "client!aoq", name = "write", descriptor = "(I)V", line = 291)
	@Override
	public void write(@OriginalArg(0) int arg0) throws IOException {
		throw new IOException();
	}

	@OriginalMember(owner = "client!aoq", name = "v", descriptor = "(I)V", line = 291)
	public void method17959() throws IOException {
		throw new IOException();
	}

	@OriginalMember(owner = "client!aoq", name = "tb", descriptor = "(Lclient!yf;I)V", line = 8140)
	static final void method17960(@OriginalArg(0) Class665 arg0) {
		arg0.anInt5784 -= -895972103;
		@Pc(8) Class410[] local8 = Class683.method36094();
		@Pc(11) Class402[] local11 = Class700.method36485();
		Class501.method30222(local8[arg0.anIntArray536[arg0.anInt5784 * 2088438307]], local11[arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 1]], arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 2], arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 3], arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 4], arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 5], arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 6], arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 7], arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 8], arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 9], arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 10]);
	}
}
