package com.jagex;

import java.util.Date;
import java.util.Map;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kg")
public abstract class Class111 implements Interface5 {

	@OriginalMember(owner = "client!kg", name = "uk", descriptor = "I")
	static int anInt1096;

	@OriginalMember(owner = "client!kg", name = "p", descriptor = "Ljava/util/Map;")
	final Map aMap12;

	@OriginalMember(owner = "client!kg", name = "p", descriptor = "([I[II)V", line = 19)
	public static void method9215(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1) {
		if (arg0 == null || arg1 == null) {
			Class98.anIntArray105 = null;
			Class207.anIntArray348 = null;
			Class460.aByteArrayArrayArray12 = null;
			return;
		}
		Class98.anIntArray105 = arg0;
		Class207.anIntArray348 = new int[arg0.length];
		Class460.aByteArrayArrayArray12 = new byte[arg0.length][][];
		for (@Pc(24) int local24 = 0; local24 < Class98.anIntArray105.length; local24++) {
			Class460.aByteArrayArrayArray12[local24] = new byte[arg1[local24]][];
		}
	}

	@OriginalMember(owner = "client!kg", name = "<init>", descriptor = "(Ljava/util/Map;)V", line = 97)
	Class111(@OriginalArg(0) Map arg0) {
		this.aMap12 = arg0;
	}

	@OriginalMember(owner = "client!kg", name = "bk", descriptor = "(Lclient!yf;B)V", line = 4777)
	static final void method9216(@OriginalArg(0) Class665 arg0) {
		arg0.anInt5784 -= 617999126;
		@Pc(13) int local13 = arg0.anIntArray536[arg0.anInt5784 * 2088438307];
		@Pc(23) int local23 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 1];
		if (Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3.aClass628_1 != null) {
			Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3.aClass628_1.method32557(local13, local23, Class537.aClass35_Sub7_1);
		}
	}

	@OriginalMember(owner = "client!kg", name = "ll", descriptor = "(Lclient!yf;I)V", line = 6682)
	static final void method9217(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		@Pc(16) Class277 local16 = Class155.method23628(local12);
		@Pc(22) Class273 local22 = Class35_Sub11.aClass273Array1[local12 >> 16];
		Class634.method32668(local16, local22, arg0);
	}

	@OriginalMember(owner = "client!kg", name = "agk", descriptor = "(Lclient!yf;I)V", line = 10438)
	static final void method9218(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		@Pc(17) Class77_Sub1_Sub19 local17 = Class615.aClass465_1.method29551(local12);
		if (local17.anIntArray288 == null) {
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = 0;
		} else {
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = local17.anIntArray288.length;
		}
	}

	@OriginalMember(owner = "client!kg", name = "lv", descriptor = "([Lclient!gm;II)V", line = 11817)
	static final void method9219(@OriginalArg(0) Class277[] arg0, @OriginalArg(1) int arg1) {
		for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
			@Pc(9) Class277 local9 = arg0[local1];
			if (local9 != null && arg1 == local9.anInt3876 * -742015869 && !client.method25381(local9)) {
				if (local9.anInt3857 * -1960530827 == 0) {
					method9219(arg0, local9.anInt3863 * -1278450723);
					if (local9.aClass277Array4 != null) {
						method9219(local9.aClass277Array4, local9.anInt3863 * -1278450723);
					}
					@Pc(56) Class77_Sub38 local56 = (Class77_Sub38) client.aClass12_20.method173((long) (local9.anInt3863 * -1278450723));
					if (local56 != null) {
						Class238.method25924(local56.anInt3113 * 1225863589);
					}
				}
				if (local9.anInt3857 * -1960530827 == 6 && local9.anInt3904 * 1565138829 != -1) {
					if (local9.aClass151_6 == null) {
						local9.aClass151_6 = new Class151_Sub2();
						local9.aClass151_6.method23401(local9.anInt3904 * 1565138829);
					}
					if (local9.aClass151_6.method23463(client.anInt3418 * -636695479) && local9.aClass151_6.method23445()) {
						local9.aClass151_6.method23457();
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!kg", name = "aoq", descriptor = "(Lclient!yf;B)V", line = 12039)
	static final void method9220(@OriginalArg(0) Class665 arg0) {
		arg0.anInt5784 -= 617999126;
		@Pc(13) int local13 = arg0.anIntArray536[arg0.anInt5784 * 2088438307];
		@Pc(27) String local27 = (String) arg0.anObjectArray45[(arg0.anInt5781 -= 1460193483) * 1485266147];
		@Pc(42) boolean local42 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 1] == 1;
		Class36.method641(local13, local27, local42);
	}

	@OriginalMember(owner = "client!kg", name = "mc", descriptor = "(J)Ljava/lang/String;", line = 12358)
	static String method9221(@OriginalArg(0) long arg0) {
		return Class275.method26552(new Date(arg0), "EEE dd-MMM-yyyy HH:mm:ss zzz");
	}
}
