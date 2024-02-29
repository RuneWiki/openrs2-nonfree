package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gz")
public class Class290 implements Interface75 {

	@OriginalMember(owner = "client!gz", name = "p", descriptor = "Lclient!gz;")
	static final Class290 aClass290_4 = new Class290(2, 0);

	@OriginalMember(owner = "client!gz", name = "c", descriptor = "Lclient!gz;")
	static final Class290 aClass290_2 = new Class290(0, 1);

	@OriginalMember(owner = "client!gz", name = "v", descriptor = "Lclient!gz;")
	static final Class290 aClass290_3 = new Class290(3, 2);

	@OriginalMember(owner = "client!gz", name = "l", descriptor = "Lclient!gz;")
	static final Class290 aClass290_5 = new Class290(1, 3);

	@OriginalMember(owner = "client!gz", name = "y", descriptor = "I")
	final int anInt4005;

	@OriginalMember(owner = "client!gz", name = "w", descriptor = "I")
	final int anInt4004;

	@OriginalMember(owner = "client!gz", name = "p", descriptor = "(I)[Lclient!gz;", line = 18)
	static Class290[] method26991() {
		return new Class290[] { aClass290_2, aClass290_5, aClass290_4, aClass290_3 };
	}

	@OriginalMember(owner = "client!gz", name = "v", descriptor = "()[Lclient!gz;", line = 18)
	static Class290[] method26992() {
		return new Class290[] { aClass290_2, aClass290_5, aClass290_4, aClass290_3 };
	}

	@OriginalMember(owner = "client!gz", name = "w", descriptor = "()[Lclient!gz;", line = 18)
	static Class290[] method26993() {
		return new Class290[] { aClass290_2, aClass290_5, aClass290_4, aClass290_3 };
	}

	@OriginalMember(owner = "client!gz", name = "<init>", descriptor = "(II)V", line = 21)
	Class290(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt4005 = arg0 * -440668325;
		this.anInt4004 = arg1 * -1429775921;
	}

	@OriginalMember(owner = "client!gz", name = "c", descriptor = "()I", line = 27)
	@Override
	public int method36479() {
		return this.anInt4004 * 2105085231;
	}

	@OriginalMember(owner = "client!gz", name = "l", descriptor = "()I", line = 27)
	@Override
	public int method36478() {
		return this.anInt4004 * 2105085231;
	}

	@OriginalMember(owner = "client!gz", name = "y", descriptor = "()I", line = 27)
	@Override
	public int method36477() {
		return this.anInt4004 * 2105085231;
	}

	@OriginalMember(owner = "client!gz", name = "s", descriptor = "(IB)J", line = 119)
	public static long method26994(@OriginalArg(0) int arg0) {
		return (long) (arg0 + 11745) * 86400000L;
	}

	@OriginalMember(owner = "client!gz", name = "d", descriptor = "(IIII)Z", line = 326)
	static boolean method26995(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) Class556 local3 = client.aClass517_1.method30435();
		@Pc(5) boolean local5 = true;
		@Pc(13) Interface61 local13 = (Interface61) local3.method31179(arg0, arg1, arg2);
		if (local13 != null) {
			local5 &= Class438.method28918(local13);
		}
		local13 = (Interface61) local3.method31191(arg0, arg1, arg2, client.anInterface63_1);
		if (local13 != null) {
			local5 &= Class438.method28918(local13);
		}
		local13 = (Interface61) local3.method31195(arg0, arg1, arg2);
		if (local13 != null) {
			local5 &= Class438.method28918(local13);
		}
		return local5;
	}

	@OriginalMember(owner = "client!gz", name = "bn", descriptor = "(III)Z", line = 1910)
	static boolean method26996(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 >= 1000 && arg0 < 1000) {
			return true;
		} else if (arg1 >= 1000 || arg0 >= 1000) {
			return arg1 >= 1000 && arg0 >= 1000;
		} else if (Class285.method26725(arg0)) {
			return true;
		} else {
			return !Class285.method26725(arg1);
		}
	}

	@OriginalMember(owner = "client!gz", name = "hw", descriptor = "(Lclient!yf;I)V", line = 5803)
	static final void method26997(@OriginalArg(0) Class665 arg0) {
		@Pc(8) Class662 local8 = arg0.aBoolean857 ? arg0.aClass662_1 : arg0.aClass662_2;
		@Pc(11) Class277 local11 = local8.aClass277_12;
		@Pc(14) Class273 local14 = local8.aClass273_4;
		Class77_Sub19.method13488(local11, local14, true, 2, arg0);
	}

	@OriginalMember(owner = "client!gz", name = "aat", descriptor = "(Lclient!yf;I)V", line = 9222)
	static final void method26998(@OriginalArg(0) Class665 arg0) {
		if (Class199.aClass368_2 == null) {
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = 0;
		} else {
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = 1;
			arg0.aClass368_3 = Class199.aClass368_2;
			arg0.aMap22.put(Class127.aClass127_71, Class92.method23490(arg0.aClass368_3));
		}
	}

	@OriginalMember(owner = "client!gz", name = "acd", descriptor = "(Lclient!yf;I)V", line = 9597)
	static final void method26999(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[arg0.anInt5784 * 2088438307 - 1] = Class411.method28577(arg0.anIntArray536[arg0.anInt5784 * 2088438307 - 1]);
	}

	@OriginalMember(owner = "client!gz", name = "kl", descriptor = "(ZS)V", line = 10829)
	static final void method27000(@OriginalArg(0) boolean arg0) {
		Class520.method30574(client.anInt3459 * -993629849, Class149_Sub4.anInt2368 * 1771907305, Class19.anInt108 * -1091172141, arg0);
	}

	@OriginalMember(owner = "client!gz", name = "aur", descriptor = "(Lclient!yf;B)V", line = 13003)
	static final void method27001(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = Class615.anInt5589 * 1332349073;
	}

	@OriginalMember(owner = "client!gz", name = "azr", descriptor = "(Lclient!yf;I)V", line = 13701)
	static final void method27002(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = client.aClass248_1.method26140(local12);
	}
}
