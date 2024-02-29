package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qj")
public class Class489 implements Interface75 {

	@OriginalMember(owner = "client!qj", name = "bg", descriptor = "I")
	public static int anInt5050;

	@OriginalMember(owner = "client!qj", name = "p", descriptor = "Lclient!qj;")
	public static final Class489 aClass489_2 = new Class489(4, 0, Integer.class, new Class483());

	@OriginalMember(owner = "client!qj", name = "c", descriptor = "Lclient!qj;")
	public static final Class489 aClass489_3 = new Class489(3, 1, Long.class, new Class494());

	@OriginalMember(owner = "client!qj", name = "v", descriptor = "Lclient!qj;")
	public static final Class489 aClass489_6 = new Class489(0, 2, String.class, new Class492());

	@OriginalMember(owner = "client!qj", name = "l", descriptor = "Lclient!qj;")
	static final Class489 aClass489_4 = new Class489(1, 3, Class77_Sub36.class, new Class488());

	@OriginalMember(owner = "client!qj", name = "y", descriptor = "Lclient!qj;")
	static final Class489 aClass489_5 = new Class489(2, 4, Class287.class, new Class499());

	@OriginalMember(owner = "client!qj", name = "w", descriptor = "I")
	public final int anInt5048;

	@OriginalMember(owner = "client!qj", name = "t", descriptor = "I")
	final int anInt5049;

	@OriginalMember(owner = "client!qj", name = "q", descriptor = "Ljava/lang/Class;")
	public final Class aClass2;

	@OriginalMember(owner = "client!qj", name = "x", descriptor = "Lclient!acv;")
	final Interface10 anInterface10_1;

	@OriginalMember(owner = "client!qj", name = "s", descriptor = "()[Lclient!qj;", line = 44)
	public static Class489[] method30000() {
		return new Class489[] { aClass489_6, aClass489_3, aClass489_4, aClass489_5, aClass489_2 };
	}

	@OriginalMember(owner = "client!qj", name = "q", descriptor = "()[Lclient!qj;", line = 44)
	public static Class489[] method30001() {
		return new Class489[] { aClass489_6, aClass489_3, aClass489_4, aClass489_5, aClass489_2 };
	}

	@OriginalMember(owner = "client!qj", name = "x", descriptor = "()[Lclient!qj;", line = 44)
	public static Class489[] method30002() {
		return new Class489[] { aClass489_6, aClass489_3, aClass489_4, aClass489_5, aClass489_2 };
	}

	@OriginalMember(owner = "client!qj", name = "d", descriptor = "()[Lclient!qj;", line = 44)
	public static Class489[] method30003() {
		return new Class489[] { aClass489_6, aClass489_3, aClass489_4, aClass489_5, aClass489_2 };
	}

	@OriginalMember(owner = "client!qj", name = "p", descriptor = "(I)[Lclient!qj;", line = 44)
	public static Class489[] method30004() {
		return new Class489[] { aClass489_6, aClass489_3, aClass489_4, aClass489_5, aClass489_2 };
	}

	@OriginalMember(owner = "client!qj", name = "<init>", descriptor = "(IILjava/lang/Class;Lclient!acv;)V", line = 47)
	Class489(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class arg2, @OriginalArg(3) Interface10 arg3) {
		this.anInt5048 = arg0 * 1634014943;
		this.anInt5049 = arg1 * 629894381;
		this.aClass2 = arg2;
		this.anInterface10_1 = arg3;
	}

	@OriginalMember(owner = "client!qj", name = "l", descriptor = "(II)V", line = 55)
	static void method30005(@OriginalArg(0) int arg0) {
		Class73.aClass232_5.method25847(arg0);
	}

	@OriginalMember(owner = "client!qj", name = "v", descriptor = "(Ljava/lang/Class;B)Lclient!qj;", line = 56)
	static Class489 method30006(@OriginalArg(0) Class arg0) {
		@Pc(2) Class489[] local2 = method30004();
		for (@Pc(4) int local4 = 0; local4 < local2.length; local4++) {
			@Pc(12) Class489 local12 = local2[local4];
			if (arg0 == local12.aClass2) {
				return local12;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!qj", name = "r", descriptor = "(Ljava/lang/Class;)Lclient!qj;", line = 56)
	static Class489 method30007(@OriginalArg(0) Class arg0) {
		@Pc(2) Class489[] local2 = method30004();
		for (@Pc(4) int local4 = 0; local4 < local2.length; local4++) {
			@Pc(12) Class489 local12 = local2[local4];
			if (arg0 == local12.aClass2) {
				return local12;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!qj", name = "g", descriptor = "(Ljava/lang/Class;)Lclient!qj;", line = 56)
	static Class489 method30008(@OriginalArg(0) Class arg0) {
		@Pc(2) Class489[] local2 = method30004();
		for (@Pc(4) int local4 = 0; local4 < local2.length; local4++) {
			@Pc(12) Class489 local12 = local2[local4];
			if (arg0 == local12.aClass2) {
				return local12;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!qj", name = "z", descriptor = "(Ljava/lang/Class;)Lclient!qj;", line = 56)
	static Class489 method30009(@OriginalArg(0) Class arg0) {
		@Pc(2) Class489[] local2 = method30004();
		for (@Pc(4) int local4 = 0; local4 < local2.length; local4++) {
			@Pc(12) Class489 local12 = local2[local4];
			if (arg0 == local12.aClass2) {
				return local12;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!qj", name = "j", descriptor = "(Ljava/lang/Class;)Lclient!acv;", line = 68)
	public static Interface10 method30010(@OriginalArg(0) Class arg0) {
		@Pc(3) Class489 local3 = method30006(arg0);
		if (local3 == null) {
			throw new IllegalArgumentException();
		}
		return local3.anInterface10_1;
	}

	@OriginalMember(owner = "client!qj", name = "w", descriptor = "(Ljava/lang/Class;I)Lclient!acv;", line = 68)
	public static Interface10 method30011(@OriginalArg(0) Class arg0) {
		@Pc(3) Class489 local3 = method30006(arg0);
		if (local3 == null) {
			throw new IllegalArgumentException();
		}
		return local3.anInterface10_1;
	}

	@OriginalMember(owner = "client!qj", name = "c", descriptor = "()I", line = 74)
	@Override
	public int method36479() {
		return this.anInt5049 * -419180315;
	}

	@OriginalMember(owner = "client!qj", name = "l", descriptor = "()I", line = 74)
	@Override
	public int method36478() {
		return this.anInt5049 * -419180315;
	}

	@OriginalMember(owner = "client!qj", name = "y", descriptor = "()I", line = 74)
	@Override
	public int method36477() {
		return this.anInt5049 * -419180315;
	}

	@OriginalMember(owner = "client!qj", name = "i", descriptor = "(Lclient!akv;)Ljava/lang/Object;", line = 78)
	public Object method30012(@OriginalArg(0) Class77_Sub39 arg0) {
		return this.anInterface10_1.method30209(arg0);
	}

	@OriginalMember(owner = "client!qj", name = "t", descriptor = "(Lclient!akv;I)Ljava/lang/Object;", line = 78)
	public Object method30013(@OriginalArg(0) Class77_Sub39 arg0) {
		return this.anInterface10_1.method30209(arg0);
	}

	@OriginalMember(owner = "client!qj", name = "k", descriptor = "(Lclient!akv;)Ljava/lang/Object;", line = 78)
	public Object method30014(@OriginalArg(0) Class77_Sub39 arg0) {
		return this.anInterface10_1.method30209(arg0);
	}

	@OriginalMember(owner = "client!qj", name = "ai", descriptor = "(Lclient!yf;I)V", line = 210)
	static void method30015(@OriginalArg(0) Class665 arg0) {
		@Pc(2) int local2 = Class703.method36543();
		if (local2 >= 0) {
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = Class77_Sub26.aTwitchEventLiveStreams1.viewerCounts[local2];
			arg0.anObjectArray45[(arg0.anInt5781 += 1460193483) * 1485266147 - 1] = Class77_Sub26.aTwitchEventLiveStreams1.channelUrls[local2];
			arg0.anObjectArray45[(arg0.anInt5781 += 1460193483) * 1485266147 - 1] = Class77_Sub26.aTwitchEventLiveStreams1.previewUrlTemplates[local2];
			arg0.anObjectArray45[(arg0.anInt5781 += 1460193483) * 1485266147 - 1] = Class77_Sub26.aTwitchEventLiveStreams1.streamTitles[local2];
			arg0.anObjectArray45[(arg0.anInt5781 += 1460193483) * 1485266147 - 1] = Class77_Sub26.aTwitchEventLiveStreams1.channelDisplayNames[local2];
			return;
		}
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = -1;
		arg0.anObjectArray45[(arg0.anInt5781 += 1460193483) * 1485266147 - 1] = "";
		arg0.anObjectArray45[(arg0.anInt5781 += 1460193483) * 1485266147 - 1] = "";
		arg0.anObjectArray45[(arg0.anInt5781 += 1460193483) * 1485266147 - 1] = "";
		arg0.anObjectArray45[(arg0.anInt5781 += 1460193483) * 1485266147 - 1] = "";
	}

	@OriginalMember(owner = "client!qj", name = "fb", descriptor = "(Lclient!yf;I)V", line = 5476)
	static final void method30016(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		@Pc(16) Class277 local16 = Class155.method23628(local12);
		@Pc(22) Class273 local22 = Class35_Sub11.aClass273Array1[local12 >> 16];
		Class276.method26570(local16, local22, arg0);
	}

	@OriginalMember(owner = "client!qj", name = "zg", descriptor = "(Lclient!yf;S)V", line = 9176)
	static final void method30017(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = client.aClass243_1.method26027().size();
	}

	@OriginalMember(owner = "client!qj", name = "ama", descriptor = "(Lclient!yf;I)V", line = 11753)
	static final void method30018(@OriginalArg(0) Class665 arg0) throws Exception_Sub2 {
		arg0.anInt5784 -= 617999126;
		@Pc(18) boolean local18 = arg0.anIntArray536[arg0.anInt5784 * 2088438307] == 1;
		@Pc(33) boolean local33 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 1] == 1;
		Class597.aClass107_Sub1_2.method8843(local18, local33);
	}
}
