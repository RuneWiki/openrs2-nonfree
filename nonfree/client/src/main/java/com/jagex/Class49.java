package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!abz")
public class Class49 implements Interface75 {

	@OriginalMember(owner = "client!abz", name = "w", descriptor = "I")
	static int anInt178;

	@OriginalMember(owner = "client!abz", name = "p", descriptor = "Lclient!abz;")
	public static final Class49 aClass49_1 = new Class49(0);

	@OriginalMember(owner = "client!abz", name = "c", descriptor = "Lclient!abz;")
	public static final Class49 aClass49_2 = new Class49(1);

	@OriginalMember(owner = "client!abz", name = "v", descriptor = "I")
	final int anInt179;

	@OriginalMember(owner = "client!abz", name = "<init>", descriptor = "(I)V", line = 10)
	Class49(@OriginalArg(0) int arg0) {
		this.anInt179 = arg0 * -454869109;
	}

	@OriginalMember(owner = "client!abz", name = "c", descriptor = "()I", line = 15)
	@Override
	public int method36479() {
		return this.anInt179 * 1737814051;
	}

	@OriginalMember(owner = "client!abz", name = "l", descriptor = "()I", line = 15)
	@Override
	public int method36478() {
		return this.anInt179 * 1737814051;
	}

	@OriginalMember(owner = "client!abz", name = "y", descriptor = "()I", line = 15)
	@Override
	public int method36477() {
		return this.anInt179 * 1737814051;
	}

	@OriginalMember(owner = "client!abz", name = "s", descriptor = "(III)I", line = 219)
	public static final int method750(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == -1) {
			return 12345678;
		}
		arg1 = arg1 * (arg0 & 0x7F) >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return arg1 + (arg0 & 0xFF80);
	}

	@OriginalMember(owner = "client!abz", name = "asb", descriptor = "(Lclient!yf;B)V", line = 12765)
	static final void method751(@OriginalArg(0) Class665 arg0) {
		@Pc(2) Class145_Sub1 local2 = Class162.method24339();
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = local2 == null ? 0 : local2.anInt2063 * -1395637313;
	}

	@OriginalMember(owner = "client!abz", name = "auv", descriptor = "(Lclient!yf;B)V", line = 13059)
	static final void method752(@OriginalArg(0) Class665 arg0) {
	}
}
