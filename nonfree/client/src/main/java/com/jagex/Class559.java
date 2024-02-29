package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tp")
public class Class559 {

	@OriginalMember(owner = "client!tp", name = "l", descriptor = "Lclient!tp;")
	static Class559 aClass559_2;

	@OriginalMember(owner = "client!tp", name = "ul", descriptor = "I")
	static int anInt5280;

	@OriginalMember(owner = "client!tp", name = "v", descriptor = "I")
	static int anInt5279 = 0;

	@OriginalMember(owner = "client!tp", name = "c", descriptor = "Lclient!tp;")
	public Class559 aClass559_1;

	@OriginalMember(owner = "client!tp", name = "p", descriptor = "Lclient!ary;")
	public Class104_Sub1_Sub1 aClass104_Sub1_Sub1_1;

	@OriginalMember(owner = "client!tp", name = "<init>", descriptor = "()V", line = 11)
	Class559() {
	}

	@OriginalMember(owner = "client!tp", name = "v", descriptor = "(Lclient!ary;)Lclient!tp;", line = 15)
	static Class559 method31274(@OriginalArg(0) Class104_Sub1_Sub1 arg0) {
		@Pc(5) Class559 local5;
		if (aClass559_2 == null) {
			local5 = new Class559();
		} else {
			local5 = aClass559_2;
			aClass559_2 = aClass559_2.aClass559_1;
			local5.aClass559_1 = null;
			anInt5279 -= -510773381;
		}
		local5.aClass104_Sub1_Sub1_1 = arg0;
		return local5;
	}

	@OriginalMember(owner = "client!tp", name = "l", descriptor = "(Lclient!yf;I)V", line = 25)
	static void method31275(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[arg0.anInt5784 * 2088438307 - 1] = ((Class303) Class252.aClass42_Sub2_1.method18319(arg0.anIntArray536[arg0.anInt5784 * 2088438307 - 1])).anInt4053 * -610952925;
	}

	@OriginalMember(owner = "client!tp", name = "c", descriptor = "(I)V", line = 27)
	void method31276() {
		if (anInt5279 * 1950158771 < 500) {
			this.aClass104_Sub1_Sub1_1 = null;
			this.aClass559_1 = aClass559_2;
			aClass559_2 = this;
			anInt5279 += -510773381;
		}
	}

	@OriginalMember(owner = "client!tp", name = "l", descriptor = "()V", line = 27)
	void method31277() {
		if (anInt5279 * 1950158771 < 500) {
			this.aClass104_Sub1_Sub1_1 = null;
			this.aClass559_1 = aClass559_2;
			aClass559_2 = this;
			anInt5279 += -510773381;
		}
	}

	@OriginalMember(owner = "client!tp", name = "y", descriptor = "()V", line = 27)
	void method31278() {
		if (anInt5279 * 1950158771 < 500) {
			this.aClass104_Sub1_Sub1_1 = null;
			this.aClass559_1 = aClass559_2;
			aClass559_2 = this;
			anInt5279 += -510773381;
		}
	}

	@OriginalMember(owner = "client!tp", name = "w", descriptor = "()V", line = 27)
	void method31279() {
		if (anInt5279 * 1950158771 < 500) {
			this.aClass104_Sub1_Sub1_1 = null;
			this.aClass559_1 = aClass559_2;
			aClass559_2 = this;
			anInt5279 += -510773381;
		}
	}

	@OriginalMember(owner = "client!tp", name = "ir", descriptor = "(Lclient!yf;B)V", line = 6090)
	static final void method31280(@OriginalArg(0) Class665 arg0) {
		@Pc(8) Class662 local8 = arg0.aBoolean857 ? arg0.aClass662_1 : arg0.aClass662_2;
		@Pc(11) Class277 local11 = local8.aClass277_12;
		@Pc(14) Class273 local14 = local8.aClass273_4;
		Class196.method25465(local11, local14, arg0);
	}

	@OriginalMember(owner = "client!tp", name = "pd", descriptor = "(Lclient!yf;B)V", line = 7398)
	static final void method31281(@OriginalArg(0) Class665 arg0) {
		@Pc(8) Class662 local8 = arg0.aBoolean857 ? arg0.aClass662_1 : arg0.aClass662_2;
		@Pc(11) Class277 local11 = local8.aClass277_12;
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = local11.anInt3872 * -1196182029;
	}

	@OriginalMember(owner = "client!tp", name = "ys", descriptor = "(Lclient!yf;I)V", line = 8899)
	static final void method31282(@OriginalArg(0) Class665 arg0) {
		@Pc(13) String local13 = (String) arg0.anObjectArray45[(arg0.anInt5781 -= 1460193483) * 1485266147];
		Class59.method877(local13);
	}

	@OriginalMember(owner = "client!tp", name = "agz", descriptor = "(Lclient!yf;I)V", line = 10457)
	static final void method31283(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		@Pc(17) Class77_Sub1_Sub13 local17 = RuntimeException_Sub4.aClass41_2.method688(local12);
		if (local17.anIntArray285 == null) {
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = 0;
		} else {
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = local17.anIntArray285.length;
		}
	}

	@OriginalMember(owner = "client!tp", name = "aih", descriptor = "(Lclient!yf;I)V", line = 10945)
	static final void method31284(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = Class136.aClass77_Sub1_Sub8_2 == null ? -1 : Class136.aClass77_Sub1_Sub8_2.anInt3004 * 848546455;
	}
}
