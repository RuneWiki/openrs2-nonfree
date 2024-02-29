package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!yn")
public class Class671 implements Interface75 {

	@OriginalMember(owner = "client!yn", name = "t", descriptor = "I")
	public static final int anInt5792 = 4;

	@OriginalMember(owner = "client!yn", name = "ap", descriptor = "I")
	public static int anInt5794;

	@OriginalMember(owner = "client!yn", name = "p", descriptor = "Lclient!yn;")
	public static final Class671 aClass671_2 = new Class671(0, (byte) -1);

	@OriginalMember(owner = "client!yn", name = "c", descriptor = "Lclient!yn;")
	public static final Class671 aClass671_1 = new Class671(1, (byte) 0);

	@OriginalMember(owner = "client!yn", name = "v", descriptor = "Lclient!yn;")
	public static final Class671 aClass671_4 = new Class671(2, (byte) 1);

	@OriginalMember(owner = "client!yn", name = "l", descriptor = "Lclient!yn;")
	public static final Class671 aClass671_5 = new Class671(3, (byte) 2);

	@OriginalMember(owner = "client!yn", name = "y", descriptor = "Lclient!yn;")
	public static final Class671 aClass671_3 = new Class671(4, (byte) 3);

	@OriginalMember(owner = "client!yn", name = "w", descriptor = "I")
	public final int anInt5793;

	@OriginalMember(owner = "client!yn", name = "q", descriptor = "B")
	public byte aByte175;

	@OriginalMember(owner = "client!yn", name = "p", descriptor = "(B)[Lclient!yn;", line = 19)
	public static Class671[] method33202() {
		return new Class671[] { aClass671_2, aClass671_1, aClass671_4, aClass671_5, aClass671_3 };
	}

	@OriginalMember(owner = "client!yn", name = "w", descriptor = "()[Lclient!yn;", line = 19)
	public static Class671[] method33203() {
		return new Class671[] { aClass671_2, aClass671_1, aClass671_4, aClass671_5, aClass671_3 };
	}

	@OriginalMember(owner = "client!yn", name = "<init>", descriptor = "(IB)V", line = 22)
	Class671(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		this.anInt5793 = arg0 * 630869325;
		this.aByte175 = arg1;
	}

	@OriginalMember(owner = "client!yn", name = "y", descriptor = "()I", line = 28)
	@Override
	public int method36477() {
		return this.aByte175;
	}

	@OriginalMember(owner = "client!yn", name = "l", descriptor = "()I", line = 28)
	@Override
	public int method36478() {
		return this.aByte175;
	}

	@OriginalMember(owner = "client!yn", name = "c", descriptor = "()I", line = 28)
	@Override
	public int method36479() {
		return this.aByte175;
	}

	@OriginalMember(owner = "client!yn", name = "v", descriptor = "(B)I", line = 32)
	public int method33204() {
		return this.aByte175 + 1;
	}

	@OriginalMember(owner = "client!yn", name = "t", descriptor = "()I", line = 32)
	public int method33205() {
		return this.aByte175 + 1;
	}

	@OriginalMember(owner = "client!yn", name = "uw", descriptor = "(Lclient!yf;I)V", line = 8302)
	static final void method33206(@OriginalArg(0) Class665 arg0) {
		arg0.anInt5784 -= 617999126;
		@Pc(13) int local13 = arg0.anIntArray536[arg0.anInt5784 * 2088438307];
		@Pc(23) int local23 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 1];
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = Class22.method421(local13, local23, false);
	}
}
