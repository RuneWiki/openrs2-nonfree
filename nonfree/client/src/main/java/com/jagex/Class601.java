package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vo")
public class Class601 {

	@OriginalMember(owner = "client!vo", name = "w", descriptor = "I")
	public static final int anInt5548 = 8;

	@OriginalMember(owner = "client!vo", name = "c", descriptor = "I")
	public static final int anInt5549 = 9;

	@OriginalMember(owner = "client!vo", name = "p", descriptor = "I")
	public static final int anInt5550 = 2;

	@OriginalMember(owner = "client!vo", name = "l", descriptor = "I")
	public static final int anInt5551 = 511;

	@OriginalMember(owner = "client!vo", name = "v", descriptor = "I")
	public static final int anInt5552 = 512;

	@OriginalMember(owner = "client!vo", name = "y", descriptor = "I")
	public static final int anInt5553 = 1024;

	@OriginalMember(owner = "client!vo", name = "t", descriptor = "I")
	public static final int anInt5554 = 256;

	@OriginalMember(owner = "client!vo", name = "q", descriptor = "I")
	public static final int anInt5555 = 128;

	@OriginalMember(owner = "client!vo", name = "x", descriptor = "I")
	public static final int anInt5556 = 7;

	static {
		Math.sqrt(131072.0D);
	}

	@OriginalMember(owner = "client!vo", name = "<init>", descriptor = "()V", line = 19)
	Class601() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!vo", name = "i", descriptor = "(CI)Z", line = 190)
	public static boolean method32040(@OriginalArg(0) char arg0) {
		return arg0 >= '0' && arg0 <= '9' || arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}

	@OriginalMember(owner = "client!vo", name = "vy", descriptor = "(Lclient!yf;I)V", line = 8398)
	static final void method32041(@OriginalArg(0) Class665 arg0) {
		arg0.anObjectArray45[(arg0.anInt5781 += 1460193483) * 1485266147 - 1] = Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3.method21134();
	}

	@OriginalMember(owner = "client!vo", name = "zl", descriptor = "(Lclient!yf;B)V", line = 9096)
	static final void method32042(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = client.aClass243_1.method26024().size();
	}
}
