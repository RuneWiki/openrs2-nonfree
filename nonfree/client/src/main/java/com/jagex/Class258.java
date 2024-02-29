package com.jagex;

import java.util.ArrayList;
import java.util.List;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ft")
public class Class258 {

	// $FF: synthetic field
	@OriginalMember(owner = "client!ft", name = "this$0", descriptor = "Lclient!fw;")
	final Class261 this$0;

	@OriginalMember(owner = "client!ft", name = "p", descriptor = "Ljava/util/List;")
	List aList5;

	@OriginalMember(owner = "client!ft", name = "l", descriptor = "(IIII)V", line = 32)
	public static void method26228(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Class86.method19916(new Class48_Sub1(arg0, arg1, arg2, client.anInt3404 * 1262399261, Class7.aClass129_1.anInt1344 * 1930739095, Class7.aClass129_1.anInt1345 * 1871597189, Class7.aClass129_1.method12184(), Class7.aClass129_1.method12179(), Class643.aClass469_3.method29586()));
	}

	@OriginalMember(owner = "client!ft", name = "l", descriptor = "(I)I", line = 70)
	public static int method26229() {
		if (Class40.anInt159 * 743618349 == -1) {
			@Pc(7) Class40[] local7 = Class28.method493();
			for (@Pc(9) int local9 = 0; local9 < local7.length; local9++) {
				@Pc(17) Class40 local17 = local7[local9];
				if (local17.anInt158 * -389811879 > Class40.anInt159 * 743618349) {
					Class40.anInt159 = local17.anInt158 * -1873494435;
				}
			}
			Class40.anInt159 += -60444507;
		}
		return Class40.anInt159 * 743618349;
	}

	@OriginalMember(owner = "client!ft", name = "l", descriptor = "(Lclient!ajc;B)V", line = 106)
	static final void method26230(@OriginalArg(0) Class77_Sub4 arg0) {
		@Pc(3) Class556 local3 = client.aClass517_1.method30435();
		if (local3 == null) {
			return;
		}
		@Pc(8) Interface61 local8 = null;
		if (arg0.anInt1459 * -1831835741 == 0) {
			local8 = (Interface61) local3.method31179(arg0.anInt1456 * -511427777, arg0.anInt1452 * -1522052283, arg0.anInt1454 * -1246362377);
		}
		if (arg0.anInt1459 * -1831835741 == 1) {
			local8 = (Interface61) local3.method31187(arg0.anInt1456 * -511427777, arg0.anInt1452 * -1522052283, arg0.anInt1454 * -1246362377);
		}
		if (arg0.anInt1459 * -1831835741 == 2) {
			local8 = (Interface61) local3.method31191(arg0.anInt1456 * -511427777, arg0.anInt1452 * -1522052283, arg0.anInt1454 * -1246362377, client.anInterface63_1);
		}
		if (arg0.anInt1459 * -1831835741 == 3) {
			local8 = (Interface61) local3.method31195(arg0.anInt1456 * -511427777, arg0.anInt1452 * -1522052283, arg0.anInt1454 * -1246362377);
		}
		if (local8 == null) {
			arg0.anInt1450 = -1091872063;
			arg0.anInt1455 = 0;
			arg0.anInt1451 = 0;
		} else {
			arg0.anInt1450 = local8.method13060() * 1091872063;
			arg0.anInt1455 = local8.method13057() * -1023683665;
			arg0.anInt1451 = local8.method13058() * -600477765;
		}
	}

	@OriginalMember(owner = "client!ft", name = "j", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)Z", line = 219)
	static boolean method26231(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1) {
		Class675.anInt5802 = -663357284;
		Class589.aClass82_3 = client.aClass82_2;
		return Class591.method31826(false, false, arg0, arg1, -1L);
	}

	@OriginalMember(owner = "client!ft", name = "dw", descriptor = "(I)V", line = 293)
	static void method26232() {
		Class208.method25580();
		Class136_Sub1.aClass77_Sub1_Sub8_2 = null;
		Class524.aClass77_Sub1_Sub8_4 = null;
		Class136_Sub1.aClass12_15.method188();
		Class136_Sub1.aClass12_16.method188();
		for (@Pc(13) int local13 = 0; local13 < 3; local13++) {
			for (@Pc(18) int local18 = 0; local18 < 5; local18++) {
				Class136_Sub1.aClass94ArrayArray1[local13][local18] = null;
				Class136_Sub1.aClass17ArrayArray1[local13][local18] = null;
			}
		}
	}

	@OriginalMember(owner = "client!ft", name = "<init>", descriptor = "(Lclient!fw;)V", line = 933)
	Class258(@OriginalArg(0) Class261 arg0) {
		this.this$0 = arg0;
		this.aList5 = new ArrayList();
	}

	@OriginalMember(owner = "client!ft", name = "p", descriptor = "(Lclient!qs;I)V", line = 938)
	void method26233(@OriginalArg(0) Class496 arg0) {
		this.aList5.add(arg0);
	}

	@OriginalMember(owner = "client!ft", name = "y", descriptor = "(Lclient!qs;)V", line = 938)
	void method26234(@OriginalArg(0) Class496 arg0) {
		this.aList5.add(arg0);
	}

	@OriginalMember(owner = "client!ft", name = "w", descriptor = "(Lclient!qs;)V", line = 938)
	void method26235(@OriginalArg(0) Class496 arg0) {
		this.aList5.add(arg0);
	}

	@OriginalMember(owner = "client!ft", name = "c", descriptor = "(Lclient!qs;I)V", line = 942)
	void method26236(@OriginalArg(0) Class496 arg0) {
		this.aList5.remove(arg0);
	}

	@OriginalMember(owner = "client!ft", name = "t", descriptor = "(Lclient!qs;)V", line = 942)
	void method26237(@OriginalArg(0) Class496 arg0) {
		this.aList5.remove(arg0);
	}

	@OriginalMember(owner = "client!ft", name = "v", descriptor = "(I)Ljava/util/List;", line = 946)
	List method26238() {
		return this.aList5;
	}

	@OriginalMember(owner = "client!ft", name = "q", descriptor = "()Ljava/util/List;", line = 946)
	List method26239() {
		return this.aList5;
	}

	@OriginalMember(owner = "client!ft", name = "x", descriptor = "()Ljava/util/List;", line = 946)
	List method26240() {
		return this.aList5;
	}

	@OriginalMember(owner = "client!ft", name = "l", descriptor = "(Lclient!qs;I)Z", line = 950)
	boolean method26241(@OriginalArg(0) Class496 arg0) {
		return this.aList5.contains(arg0);
	}

	@OriginalMember(owner = "client!ft", name = "d", descriptor = "(Lclient!qs;)Z", line = 950)
	boolean method26242(@OriginalArg(0) Class496 arg0) {
		return this.aList5.contains(arg0);
	}

	@OriginalMember(owner = "client!ft", name = "ax", descriptor = "(Lclient!yf;I)V", line = 4472)
	static final void method26243(@OriginalArg(0) Class665 arg0) {
		arg0.anInt5784 -= 617999126;
		if (arg0.anIntArray536[arg0.anInt5784 * 2088438307] <= arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 1]) {
			arg0.anInt5786 += arg0.anIntArray535[arg0.anInt5786 * 662605117] * -793595371;
		}
	}

	@OriginalMember(owner = "client!ft", name = "ajb", descriptor = "(Lclient!yf;I)V", line = 11207)
	static final void method26244(@OriginalArg(0) Class665 arg0) {
		arg0.anInt5784 -= 617999126;
		@Pc(13) int local13 = arg0.anIntArray536[arg0.anInt5784 * 2088438307];
		@Pc(23) int local23 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 1];
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = Class657.method33053(local13, local23) ? 1 : 0;
	}
}
