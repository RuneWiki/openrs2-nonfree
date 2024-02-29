package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vj")
public class Class597 implements Interface75 {

	@OriginalMember(owner = "client!vj", name = "uz", descriptor = "Lclient!agn;")
	public static Class107_Sub1 aClass107_Sub1_2;

	@OriginalMember(owner = "client!vj", name = "p", descriptor = "Lclient!vj;")
	public static final Class597 aClass597_4 = new Class597(0);

	@OriginalMember(owner = "client!vj", name = "c", descriptor = "Lclient!vj;")
	public static final Class597 aClass597_3 = new Class597(1);

	@OriginalMember(owner = "client!vj", name = "v", descriptor = "Lclient!vj;")
	public static final Class597 aClass597_5 = new Class597(2);

	@OriginalMember(owner = "client!vj", name = "l", descriptor = "I")
	final int anInt5508;

	@OriginalMember(owner = "client!vj", name = "v", descriptor = "()[Lclient!vj;", line = 14)
	public static Class597[] method31926() {
		return new Class597[] { aClass597_3, aClass597_5, aClass597_4 };
	}

	@OriginalMember(owner = "client!vj", name = "w", descriptor = "()[Lclient!vj;", line = 14)
	public static Class597[] method31927() {
		return new Class597[] { aClass597_3, aClass597_5, aClass597_4 };
	}

	@OriginalMember(owner = "client!vj", name = "<init>", descriptor = "(I)V", line = 17)
	Class597(@OriginalArg(0) int arg0) {
		this.anInt5508 = arg0 * 1137140565;
	}

	@OriginalMember(owner = "client!vj", name = "l", descriptor = "()I", line = 22)
	@Override
	public int method36478() {
		return this.anInt5508 * -1454276099;
	}

	@OriginalMember(owner = "client!vj", name = "y", descriptor = "()I", line = 22)
	@Override
	public int method36477() {
		return this.anInt5508 * -1454276099;
	}

	@OriginalMember(owner = "client!vj", name = "c", descriptor = "()I", line = 22)
	@Override
	public int method36479() {
		return this.anInt5508 * -1454276099;
	}

	@OriginalMember(owner = "client!vj", name = "p", descriptor = "(I)V", line = 67)
	static void method31928() {
		Class156.anInt3233 = 0;
		Class156.anInt3238 = 1312565957;
		Class156.anInt3234 = 1660827629;
		Class156.anInt3235 = -517634255;
	}

	@OriginalMember(owner = "client!vj", name = "xq", descriptor = "(Lclient!yf;B)V", line = 8842)
	static final void method31929(@OriginalArg(0) Class665 arg0) {
		if (client.anInt3453 * -1050164879 == 0) {
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = -2;
		} else if (client.anInt3453 * -1050164879 == 1) {
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = -1;
		} else {
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = client.anInt3529 * -1979292205;
		}
	}

	@OriginalMember(owner = "client!vj", name = "azg", descriptor = "(Lclient!yf;ZI)V", line = 13812)
	static final void method31930(@OriginalArg(0) Class665 arg0, @OriginalArg(1) boolean arg1) {
		arg0.anInt5784 -= 617999126;
		@Pc(13) int local13 = arg0.anIntArray536[arg0.anInt5784 * 2088438307];
		@Pc(23) int local23 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 1];
		@Pc(27) Class60 local27 = Class530.method30733(local13);
		if (local27 == null) {
			throw new RuntimeException();
		}
		Class483.aList20 = local27.method881(local23);
		if (Class483.aList20 != null) {
			Class527.anIterator3 = Class483.aList20.iterator();
			if (arg1) {
				arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = Class483.aList20.size();
			}
		} else if (arg1) {
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = 0;
		}
	}
}
