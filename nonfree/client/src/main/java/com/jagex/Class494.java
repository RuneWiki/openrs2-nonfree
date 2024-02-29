package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qp")
final class Class494 implements Interface10 {

	@OriginalMember(owner = "client!qp", name = "tr", descriptor = "Lclient!ajy;")
	public static Class77_Sub25 aClass77_Sub25_1;

	@OriginalMember(owner = "client!qp", name = "bv", descriptor = "Lclient!cy;")
	public static Class83 aClass83_29;

	@OriginalMember(owner = "client!qp", name = "v", descriptor = "(Lclient!akv;)Ljava/lang/Object;", line = 20)
	@Override
	public Object method30208(@OriginalArg(0) Class77_Sub39 arg0) {
		return arg0.method22510();
	}

	@OriginalMember(owner = "client!qp", name = "p", descriptor = "(Lclient!akv;I)Ljava/lang/Object;", line = 20)
	@Override
	public Object method30209(@OriginalArg(0) Class77_Sub39 arg0) {
		return arg0.method22510();
	}

	@OriginalMember(owner = "client!qp", name = "c", descriptor = "(Lclient!akv;)Ljava/lang/Object;", line = 20)
	@Override
	public Object method30210(@OriginalArg(0) Class77_Sub39 arg0) {
		return arg0.method22510();
	}

	@OriginalMember(owner = "client!qp", name = "l", descriptor = "(Lclient!akv;)Ljava/lang/Object;", line = 20)
	@Override
	public Object method30211(@OriginalArg(0) Class77_Sub39 arg0) {
		return arg0.method22510();
	}

	@OriginalMember(owner = "client!qp", name = "f", descriptor = "(Lclient!arc;B)V", line = 871)
	static void method30052(@OriginalArg(0) Class77_Sub39_Sub1 arg0) {
		@Pc(8) boolean local8 = arg0.method22478() == 1;
		if (!local8) {
			return;
		}
		@Pc(12) boolean local12 = false;
		@Pc(18) int local18 = arg0.method22171() << 24;
		@Pc(26) int local26 = local18 | arg0.method22171() << 16;
		@Pc(34) int local34 = local26 | arg0.method22171() << 8;
		@Pc(40) int local40 = local34 | arg0.method22171();
		Class638.aClass240_1.method25931(Class143_Sub2.aLong104 * -5998193912056988893L, local40);
	}

	@OriginalMember(owner = "client!qp", name = "ag", descriptor = "(I)V", line = 905)
	public static void method30053() {
		for (@Pc(4) Class77_Sub1_Sub11 local4 = (Class77_Sub1_Sub11) Class683.aClass691_17.method36335(); local4 != null; local4 = (Class77_Sub1_Sub11) Class683.aClass691_17.method36340()) {
			if (local4.anInt3023 * -475442105 > 1) {
				local4.anInt3023 = 0;
				Class683.aClass232_93.method25844(local4, ((Class77_Sub1_Sub7) local4.aClass691_11.aClass77_Sub1_66.aClass77_Sub1_62).aLong150 * -6387465159951953483L);
				local4.aClass691_11.method36321();
			}
		}
		Class683.anInt5840 = 0;
		Class683.anInt5826 = 0;
		Class683.aClass695_55.method36380();
		Class683.aClass12_39.method188();
		Class683.aClass691_17.method36321();
		Class683.aBoolean861 = false;
	}

	@OriginalMember(owner = "client!qp", name = "jt", descriptor = "(Lclient!yf;I)V", line = 6302)
	static final void method30054(@OriginalArg(0) Class665 arg0) {
		@Pc(8) Class662 local8 = arg0.aBoolean857 ? arg0.aClass662_1 : arg0.aClass662_2;
		@Pc(11) Class277 local11 = local8.aClass277_12;
		Class345.method27832(local11, arg0);
	}

	@OriginalMember(owner = "client!qp", name = "mu", descriptor = "(Lclient!yf;I)V", line = 6747)
	static final void method30055(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		@Pc(16) Class277 local16 = Class155.method23628(local12);
		@Pc(22) Class273 local22 = Class35_Sub11.aClass273Array1[local12 >> 16];
		Class681.method36083(local16, local22, arg0);
	}

	@OriginalMember(owner = "client!qp", name = "oh", descriptor = "(Lclient!gm;Lclient!gh;Lclient!yf;I)V", line = 7121)
	static final void method30056(@OriginalArg(0) Class277 arg0, @OriginalArg(1) Class273 arg1, @OriginalArg(2) Class665 arg2) {
		@Pc(13) String local13 = (String) arg2.anObjectArray45[(arg2.anInt5781 -= 1460193483) * 1485266147];
		if (Class139.method14334(local13, arg2) != null) {
			local13 = local13.substring(0, local13.length() - 1);
		}
		arg0.anObjectArray10 = Class73.method1040(local13, arg2);
		arg0.aBoolean681 = true;
	}

	@OriginalMember(owner = "client!qp", name = "yv", descriptor = "(Lclient!yf;S)V", line = 8909)
	static final void method30057(@OriginalArg(0) Class665 arg0) {
		@Pc(13) String local13 = (String) arg0.anObjectArray45[(arg0.anInt5781 -= 1460193483) * 1485266147];
		Class639.method32726(local13, false);
	}

	@OriginalMember(owner = "client!qp", name = "aby", descriptor = "(Lclient!yf;I)V", line = 9422)
	static final void method30058(@OriginalArg(0) Class665 arg0) {
		arg0.anInt5784 -= 617999126;
		@Pc(13) int local13 = arg0.anIntArray536[arg0.anInt5784 * 2088438307];
		@Pc(23) int local23 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 1];
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = client.aClass497ArrayArray1[local23][local13].anInt5062 * -1308130767;
	}
}
