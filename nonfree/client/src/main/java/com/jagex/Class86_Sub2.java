package com.jagex;

import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aeh")
public class Class86_Sub2 extends Class86 {

	@OriginalMember(owner = "client!aeh", name = "bu", descriptor = "[Lclient!af;")
	Class95[] aClass95Array1;

	@OriginalMember(owner = "client!aeh", name = "ad", descriptor = "I")
	int anInt538;

	@OriginalMember(owner = "client!aeh", name = "ac", descriptor = "Z")
	boolean aBoolean96;

	@OriginalMember(owner = "client!aeh", name = "av", descriptor = "[I")
	int[] anIntArray39;

	@OriginalMember(owner = "client!aeh", name = "ar", descriptor = "Z")
	boolean aBoolean97;

	@OriginalMember(owner = "client!aeh", name = "ae", descriptor = "I")
	int anInt539;

	@OriginalMember(owner = "client!aeh", name = "ah", descriptor = "[F")
	float[] aFloatArray15;

	@OriginalMember(owner = "client!aeh", name = "bw", descriptor = "F")
	float aFloat28;

	@OriginalMember(owner = "client!aeh", name = "aq", descriptor = "I")
	int anInt540;

	@OriginalMember(owner = "client!aeh", name = "am", descriptor = "I")
	int anInt541;

	@OriginalMember(owner = "client!aeh", name = "ay", descriptor = "I")
	int anInt542;

	@OriginalMember(owner = "client!aeh", name = "bv", descriptor = "Lclient!oi;")
	Class442 aClass442_18;

	@OriginalMember(owner = "client!aeh", name = "an", descriptor = "I")
	int anInt543;

	@OriginalMember(owner = "client!aeh", name = "ab", descriptor = "I")
	int anInt544;

	@OriginalMember(owner = "client!aeh", name = "bs", descriptor = "F")
	float aFloat29;

	@OriginalMember(owner = "client!aeh", name = "bn", descriptor = "Lclient!er;")
	Class232 aClass232_8;

	@OriginalMember(owner = "client!aeh", name = "aw", descriptor = "I")
	int anInt545;

	@OriginalMember(owner = "client!aeh", name = "af", descriptor = "I")
	int anInt546;

	@OriginalMember(owner = "client!aeh", name = "bc", descriptor = "Lclient!oi;")
	Class442 aClass442_19;

	@OriginalMember(owner = "client!aeh", name = "az", descriptor = "Lclient!ow;")
	Class455 aClass455_7;

	@OriginalMember(owner = "client!aeh", name = "ba", descriptor = "[[F")
	float[][] aFloatArrayArray5;

	@OriginalMember(owner = "client!aeh", name = "at", descriptor = "I")
	int anInt547;

	@OriginalMember(owner = "client!aeh", name = "bl", descriptor = "I")
	int anInt548;

	@OriginalMember(owner = "client!aeh", name = "ap", descriptor = "I")
	int anInt549;

	@OriginalMember(owner = "client!aeh", name = "bd", descriptor = "I")
	int anInt550;

	@OriginalMember(owner = "client!aeh", name = "by", descriptor = "I")
	int anInt551;

	@OriginalMember(owner = "client!aeh", name = "bx", descriptor = "F")
	float aFloat30;

	@OriginalMember(owner = "client!aeh", name = "bj", descriptor = "Lclient!oi;")
	Class442 aClass442_20;

	@OriginalMember(owner = "client!aeh", name = "bi", descriptor = "F")
	float aFloat31;

	@OriginalMember(owner = "client!aeh", name = "bb", descriptor = "I")
	int anInt552;

	@OriginalMember(owner = "client!aeh", name = "as", descriptor = "I")
	int anInt553;

	@OriginalMember(owner = "client!aeh", name = "bt", descriptor = "F")
	float aFloat32;

	@OriginalMember(owner = "client!aeh", name = "bz", descriptor = "I")
	int anInt554;

	@OriginalMember(owner = "client!aeh", name = "bg", descriptor = "F")
	float aFloat33;

	@OriginalMember(owner = "client!aeh", name = "bf", descriptor = "Lclient!er;")
	Class232 aClass232_9;

	@OriginalMember(owner = "client!aeh", name = "aa", descriptor = "I")
	int anInt555;

	@OriginalMember(owner = "client!aeh", name = "bp", descriptor = "Lclient!cy;")
	Class83 aClass83_2;

	@OriginalMember(owner = "client!aeh", name = "bm", descriptor = "I")
	int anInt556;

	@OriginalMember(owner = "client!aeh", name = "bo", descriptor = "Lclient!cy;")
	Class83 aClass83_3;

	@OriginalMember(owner = "client!aeh", name = "bk", descriptor = "Lclient!aeo;")
	Class92_Sub1 aClass92_Sub1_1;

	@OriginalMember(owner = "client!aeh", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lclient!dp;Lclient!eo;Lclient!md;Lclient!mp;Lclient!mn;II)V", line = 57)
	Class86_Sub2(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Class209 arg1, @OriginalArg(2) Interface24 arg2, @OriginalArg(3) Interface44 arg3, @OriginalArg(4) Interface47 arg4, @OriginalArg(5) Interface45 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this(arg1, arg2, arg3, arg4, arg5);
		try {
			this.method19948(arg0, arg6, arg7);
			this.method19959(arg0);
		} catch (@Pc(18) Throwable local18) {
			local18.printStackTrace();
			this.method19929();
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!aeh", name = "<init>", descriptor = "(Lclient!dp;Lclient!eo;Lclient!md;Lclient!mp;Lclient!mn;)V", line = 70)
	Class86_Sub2(@OriginalArg(0) Class209 arg0, @OriginalArg(1) Interface24 arg1, @OriginalArg(2) Interface44 arg2, @OriginalArg(3) Interface47 arg3, @OriginalArg(4) Interface45 arg4) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.aBoolean97 = false;
		this.aBoolean96 = false;
		this.anInt553 = 0;
		this.anInt540 = 0;
		this.anInt541 = 0;
		this.anInt542 = 0;
		this.anInt555 = 1542543749;
		this.anInt549 = 148110106;
		this.anInt545 = -1468517186;
		this.aFloatArrayArray5 = new float[6][4];
		this.aFloat29 = 1.0F;
		this.aFloat32 = 0.0F;
		this.aClass232_8 = new Class232(16);
		this.anInt556 = -1860330887;
		try {
			this.aClass232_9 = new Class232(10485760, 256);
			this.aClass455_7 = new Class455();
			this.aClass442_19 = new Class442();
			this.aClass442_20 = new Class442();
			this.aClass442_18 = new Class442();
			this.method4882(1);
			this.method4880(0);
			Class463.method29543(true, true);
			this.aBoolean96 = true;
			this.anInt538 = (int) Class280.method26667() * -382802617;
		} catch (@Pc(102) Throwable local102) {
			local102.printStackTrace();
			this.method19929();
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!aeh", name = "eu", descriptor = "()Lclient!do;", line = 91)
	@Override
	public Class208 method20372() {
		return new Class208(0, "Pure Java", 1, "CPU", 0L, false);
	}

	@OriginalMember(owner = "client!aeh", name = "y", descriptor = "()Lclient!do;", line = 91)
	@Override
	public Class208 method20046() {
		return new Class208(0, "Pure Java", 1, "CPU", 0L, false);
	}

	@OriginalMember(owner = "client!aeh", name = "ew", descriptor = "()Lclient!do;", line = 91)
	@Override
	public Class208 method20084() {
		return new Class208(0, "Pure Java", 1, "CPU", 0L, false);
	}

	@OriginalMember(owner = "client!aeh", name = "ea", descriptor = "(II)V", line = 95)
	@Override
	void method20152(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception_Sub7 {
		this.aClass92_Sub2_6.method23349(arg0, arg1);
		if (this.anInterface24_55 != null) {
			this.anInterface24_55.method4227();
		}
	}

	@OriginalMember(owner = "client!aeh", name = "ec", descriptor = "(II)V", line = 95)
	@Override
	void method20153(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception_Sub7 {
		this.aClass92_Sub2_6.method23349(arg0, arg1);
		if (this.anInterface24_55 != null) {
			this.anInterface24_55.method4227();
		}
	}

	@OriginalMember(owner = "client!aeh", name = "t", descriptor = "(II)V", line = 95)
	@Override
	void method20047(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception_Sub7 {
		this.aClass92_Sub2_6.method23349(arg0, arg1);
		if (this.anInterface24_55 != null) {
			this.anInterface24_55.method4227();
		}
	}

	@OriginalMember(owner = "client!aeh", name = "q", descriptor = "()V", line = 99)
	@Override
	public void method20331() {
	}

	@OriginalMember(owner = "client!aeh", name = "el", descriptor = "()V", line = 99)
	@Override
	public void method20154() {
	}

	@OriginalMember(owner = "client!aeh", name = "d", descriptor = "()V", line = 102)
	@Override
	void method20113() {
		if (this.aBoolean96) {
			Class459.method29505(true, false);
			this.aBoolean96 = false;
		}
		this.aBoolean97 = true;
	}

	@OriginalMember(owner = "client!aeh", name = "mc", descriptor = "()V", line = 102)
	@Override
	void method20315() {
		if (this.aBoolean96) {
			Class459.method29505(true, false);
			this.aBoolean96 = false;
		}
		this.aBoolean97 = true;
	}

	@OriginalMember(owner = "client!aeh", name = "mn", descriptor = "()V", line = 102)
	@Override
	void method20332() {
		if (this.aBoolean96) {
			Class459.method29505(true, false);
			this.aBoolean96 = false;
		}
		this.aBoolean97 = true;
	}

	@OriginalMember(owner = "client!aeh", name = "ms", descriptor = "()V", line = 102)
	@Override
	void method20333() {
		if (this.aBoolean96) {
			Class459.method29505(true, false);
			this.aBoolean96 = false;
		}
		this.aBoolean97 = true;
	}

	@OriginalMember(owner = "client!aeh", name = "s", descriptor = "(I)V", line = 110)
	@Override
	public void method20368(@OriginalArg(0) int arg0) {
		@Pc(6) int local6 = arg0 - this.anInt538 * 1255617655;
		for (@Pc(12) Class77_Sub14 local12 = (Class77_Sub14) this.aClass232_9.method25861(); local12 != null; local12 = (Class77_Sub14) this.aClass232_9.method25863()) {
			if (local12.aBoolean327) {
				local12.anInt1480 += local6;
				@Pc(28) int local28 = local12.anInt1480 / 50;
				if (local28 > 0) {
					@Pc(37) Class215 local37 = this.aClass209_9.method25584(local12.anInt1478);
					@Pc(43) float local43 = (float) (local37.anInt3714 * 1264459495);
					local12.method13405((int) ((float) local37.aByte113 * ((float) local6 / 1000.0F) / 64.0F * local43), (int) (local43 * ((float) local6 / 1000.0F * (float) local37.aByte114 / 64.0F)));
					local12.anInt1480 -= local28 * 50;
				}
				local12.aBoolean327 = false;
			}
		}
		this.anInt538 = arg0 * -382802617;
		this.aClass232_8.method25847(5);
		this.aClass232_9.method25847(5);
	}

	@OriginalMember(owner = "client!aeh", name = "eg", descriptor = "(I)V", line = 110)
	@Override
	public void method20108(@OriginalArg(0) int arg0) {
		@Pc(6) int local6 = arg0 - this.anInt538 * 1255617655;
		for (@Pc(12) Class77_Sub14 local12 = (Class77_Sub14) this.aClass232_9.method25861(); local12 != null; local12 = (Class77_Sub14) this.aClass232_9.method25863()) {
			if (local12.aBoolean327) {
				local12.anInt1480 += local6;
				@Pc(28) int local28 = local12.anInt1480 / 50;
				if (local28 > 0) {
					@Pc(37) Class215 local37 = this.aClass209_9.method25584(local12.anInt1478);
					@Pc(43) float local43 = (float) (local37.anInt3714 * 1264459495);
					local12.method13405((int) ((float) local37.aByte113 * ((float) local6 / 1000.0F) / 64.0F * local43), (int) (local43 * ((float) local6 / 1000.0F * (float) local37.aByte114 / 64.0F)));
					local12.anInt1480 -= local28 * 50;
				}
				local12.aBoolean327 = false;
			}
		}
		this.anInt538 = arg0 * -382802617;
		this.aClass232_8.method25847(5);
		this.aClass232_9.method25847(5);
	}

	@OriginalMember(owner = "client!aeh", name = "eb", descriptor = "(I)V", line = 110)
	@Override
	public void method20165(@OriginalArg(0) int arg0) {
		@Pc(6) int local6 = arg0 - this.anInt538 * 1255617655;
		for (@Pc(12) Class77_Sub14 local12 = (Class77_Sub14) this.aClass232_9.method25861(); local12 != null; local12 = (Class77_Sub14) this.aClass232_9.method25863()) {
			if (local12.aBoolean327) {
				local12.anInt1480 += local6;
				@Pc(28) int local28 = local12.anInt1480 / 50;
				if (local28 > 0) {
					@Pc(37) Class215 local37 = this.aClass209_9.method25584(local12.anInt1478);
					@Pc(43) float local43 = (float) (local37.anInt3714 * 1264459495);
					local12.method13405((int) ((float) local37.aByte113 * ((float) local6 / 1000.0F) / 64.0F * local43), (int) (local43 * ((float) local6 / 1000.0F * (float) local37.aByte114 / 64.0F)));
					local12.anInt1480 -= local28 * 50;
				}
				local12.aBoolean327 = false;
			}
		}
		this.anInt538 = arg0 * -382802617;
		this.aClass232_8.method25847(5);
		this.aClass232_9.method25847(5);
	}

	@OriginalMember(owner = "client!aeh", name = "ez", descriptor = "(I)V", line = 110)
	@Override
	public void method20158(@OriginalArg(0) int arg0) {
		@Pc(6) int local6 = arg0 - this.anInt538 * 1255617655;
		for (@Pc(12) Class77_Sub14 local12 = (Class77_Sub14) this.aClass232_9.method25861(); local12 != null; local12 = (Class77_Sub14) this.aClass232_9.method25863()) {
			if (local12.aBoolean327) {
				local12.anInt1480 += local6;
				@Pc(28) int local28 = local12.anInt1480 / 50;
				if (local28 > 0) {
					@Pc(37) Class215 local37 = this.aClass209_9.method25584(local12.anInt1478);
					@Pc(43) float local43 = (float) (local37.anInt3714 * 1264459495);
					local12.method13405((int) ((float) local37.aByte113 * ((float) local6 / 1000.0F) / 64.0F * local43), (int) (local43 * ((float) local6 / 1000.0F * (float) local37.aByte114 / 64.0F)));
					local12.anInt1480 -= local28 * 50;
				}
				local12.aBoolean327 = false;
			}
		}
		this.anInt538 = arg0 * -382802617;
		this.aClass232_8.method25847(5);
		this.aClass232_9.method25847(5);
	}

	@OriginalMember(owner = "client!aeh", name = "ey", descriptor = "(I)V", line = 110)
	@Override
	public void method20381(@OriginalArg(0) int arg0) {
		@Pc(6) int local6 = arg0 - this.anInt538 * 1255617655;
		for (@Pc(12) Class77_Sub14 local12 = (Class77_Sub14) this.aClass232_9.method25861(); local12 != null; local12 = (Class77_Sub14) this.aClass232_9.method25863()) {
			if (local12.aBoolean327) {
				local12.anInt1480 += local6;
				@Pc(28) int local28 = local12.anInt1480 / 50;
				if (local28 > 0) {
					@Pc(37) Class215 local37 = this.aClass209_9.method25584(local12.anInt1478);
					@Pc(43) float local43 = (float) (local37.anInt3714 * 1264459495);
					local12.method13405((int) ((float) local37.aByte113 * ((float) local6 / 1000.0F) / 64.0F * local43), (int) (local43 * ((float) local6 / 1000.0F * (float) local37.aByte114 / 64.0F)));
					local12.anInt1480 -= local28 * 50;
				}
				local12.aBoolean327 = false;
			}
		}
		this.anInt538 = arg0 * -382802617;
		this.aClass232_8.method25847(5);
		this.aClass232_9.method25847(5);
	}

	@OriginalMember(owner = "client!aeh", name = "r", descriptor = "()I", line = 130)
	@Override
	public int method20049() {
		return 0;
	}

	@OriginalMember(owner = "client!aeh", name = "ev", descriptor = "()I", line = 130)
	@Override
	public int method20185() {
		return 0;
	}

	@OriginalMember(owner = "client!aeh", name = "ek", descriptor = "()I", line = 130)
	@Override
	public int method20109() {
		return 0;
	}

	@OriginalMember(owner = "client!aeh", name = "fv", descriptor = "()I", line = 130)
	@Override
	public int method20373() {
		return 0;
	}

	@OriginalMember(owner = "client!aeh", name = "sf", descriptor = "()Z", line = 134)
	boolean method4842() {
		return this.aBoolean97;
	}

	@OriginalMember(owner = "client!aeh", name = "so", descriptor = "()Z", line = 134)
	boolean method4843() {
		return this.aBoolean97;
	}

	@OriginalMember(owner = "client!aeh", name = "sb", descriptor = "()Z", line = 134)
	boolean method4844() {
		return this.aBoolean97;
	}

	@OriginalMember(owner = "client!aeh", name = "rq", descriptor = "()Z", line = 134)
	boolean method4845() {
		return this.aBoolean97;
	}

	@OriginalMember(owner = "client!aeh", name = "rb", descriptor = "(I)[I", line = 139)
	int[] method4846(@OriginalArg(0) int arg0) {
		@Pc(3) Class232 local3 = this.aClass232_9;
		@Pc(15) Class77_Sub14 local15;
		synchronized (this.aClass232_9) {
			local15 = (Class77_Sub14) this.aClass232_9.method25835((long) (arg0 & 0xFFFF) | Long.MIN_VALUE);
			if (local15 == null) {
				@Pc(24) Class215 local24 = this.aClass209_9.method25584(arg0);
				@Pc(29) int local29 = local24.anInt3714 * 1264459495;
				if (!this.anInterface24_55.method4231(Class596.aClass596_2, arg0, Class609.aClass609_2, 0.7F, local29, local29)) {
					return null;
				}
				@Pc(60) int[] local60;
				if (Class597.aClass597_4 == local24.aClass597_2) {
					local60 = this.anInterface24_55.method4224(Class596.aClass596_2, arg0, 0.7F, local29, local29);
				} else {
					local60 = this.anInterface24_55.method4225(Class596.aClass596_2, arg0, 0.7F, local29, local29);
				}
				local15 = new Class77_Sub14(arg0, local29, local60, local24.aClass597_2 != Class597.aClass597_3);
				this.aClass232_9.method25845(local15, (long) (arg0 & 0xFFFF) | Long.MIN_VALUE, local29 * local29);
			}
		}
		local15.aBoolean327 = true;
		return local15.method13400();
	}

	@OriginalMember(owner = "client!aeh", name = "sq", descriptor = "(I)[I", line = 139)
	int[] method4847(@OriginalArg(0) int arg0) {
		@Pc(3) Class232 local3 = this.aClass232_9;
		@Pc(15) Class77_Sub14 local15;
		synchronized (this.aClass232_9) {
			local15 = (Class77_Sub14) this.aClass232_9.method25835((long) (arg0 & 0xFFFF) | Long.MIN_VALUE);
			if (local15 == null) {
				@Pc(24) Class215 local24 = this.aClass209_9.method25584(arg0);
				@Pc(29) int local29 = local24.anInt3714 * 1264459495;
				if (!this.anInterface24_55.method4231(Class596.aClass596_2, arg0, Class609.aClass609_2, 0.7F, local29, local29)) {
					return null;
				}
				@Pc(60) int[] local60;
				if (Class597.aClass597_4 == local24.aClass597_2) {
					local60 = this.anInterface24_55.method4224(Class596.aClass596_2, arg0, 0.7F, local29, local29);
				} else {
					local60 = this.anInterface24_55.method4225(Class596.aClass596_2, arg0, 0.7F, local29, local29);
				}
				local15 = new Class77_Sub14(arg0, local29, local60, local24.aClass597_2 != Class597.aClass597_3);
				this.aClass232_9.method25845(local15, (long) (arg0 & 0xFFFF) | Long.MIN_VALUE, local29 * local29);
			}
		}
		local15.aBoolean327 = true;
		return local15.method13400();
	}

	@OriginalMember(owner = "client!aeh", name = "sv", descriptor = "(I)[I", line = 139)
	int[] method4848(@OriginalArg(0) int arg0) {
		@Pc(3) Class232 local3 = this.aClass232_9;
		@Pc(15) Class77_Sub14 local15;
		synchronized (this.aClass232_9) {
			local15 = (Class77_Sub14) this.aClass232_9.method25835((long) (arg0 & 0xFFFF) | Long.MIN_VALUE);
			if (local15 == null) {
				@Pc(24) Class215 local24 = this.aClass209_9.method25584(arg0);
				@Pc(29) int local29 = local24.anInt3714 * 1264459495;
				if (!this.anInterface24_55.method4231(Class596.aClass596_2, arg0, Class609.aClass609_2, 0.7F, local29, local29)) {
					return null;
				}
				@Pc(60) int[] local60;
				if (Class597.aClass597_4 == local24.aClass597_2) {
					local60 = this.anInterface24_55.method4224(Class596.aClass596_2, arg0, 0.7F, local29, local29);
				} else {
					local60 = this.anInterface24_55.method4225(Class596.aClass596_2, arg0, 0.7F, local29, local29);
				}
				local15 = new Class77_Sub14(arg0, local29, local60, local24.aClass597_2 != Class597.aClass597_3);
				this.aClass232_9.method25845(local15, (long) (arg0 & 0xFFFF) | Long.MIN_VALUE, local29 * local29);
			}
		}
		local15.aBoolean327 = true;
		return local15.method13400();
	}

	@OriginalMember(owner = "client!aeh", name = "ss", descriptor = "(I)[I", line = 139)
	int[] method4849(@OriginalArg(0) int arg0) {
		@Pc(3) Class232 local3 = this.aClass232_9;
		@Pc(15) Class77_Sub14 local15;
		synchronized (this.aClass232_9) {
			local15 = (Class77_Sub14) this.aClass232_9.method25835((long) (arg0 & 0xFFFF) | Long.MIN_VALUE);
			if (local15 == null) {
				@Pc(24) Class215 local24 = this.aClass209_9.method25584(arg0);
				@Pc(29) int local29 = local24.anInt3714 * 1264459495;
				if (!this.anInterface24_55.method4231(Class596.aClass596_2, arg0, Class609.aClass609_2, 0.7F, local29, local29)) {
					return null;
				}
				@Pc(60) int[] local60;
				if (Class597.aClass597_4 == local24.aClass597_2) {
					local60 = this.anInterface24_55.method4224(Class596.aClass596_2, arg0, 0.7F, local29, local29);
				} else {
					local60 = this.anInterface24_55.method4225(Class596.aClass596_2, arg0, 0.7F, local29, local29);
				}
				local15 = new Class77_Sub14(arg0, local29, local60, local24.aClass597_2 != Class597.aClass597_3);
				this.aClass232_9.method25845(local15, (long) (arg0 & 0xFFFF) | Long.MIN_VALUE, local29 * local29);
			}
		}
		local15.aBoolean327 = true;
		return local15.method13400();
	}

	@OriginalMember(owner = "client!aeh", name = "ru", descriptor = "(I)Z", line = 161)
	boolean method4850(@OriginalArg(0) int arg0) {
		@Pc(5) Class215 local5 = this.aClass209_9.method25584(arg0);
		return this.anInterface24_55.method4231(Class596.aClass596_2, arg0, Class609.aClass609_2, 0.7F, local5.anInt3714 * 1264459495, local5.anInt3714 * 1264459495);
	}

	@OriginalMember(owner = "client!aeh", name = "sx", descriptor = "(I)I", line = 166)
	int method4851(@OriginalArg(0) int arg0) {
		return this.aClass209_9.method25584(arg0).anInt3714 * 1264459495;
	}

	@OriginalMember(owner = "client!aeh", name = "sw", descriptor = "(I)I", line = 166)
	int method4852(@OriginalArg(0) int arg0) {
		return this.aClass209_9.method25584(arg0).anInt3714 * 1264459495;
	}

	@OriginalMember(owner = "client!aeh", name = "rg", descriptor = "(I)I", line = 166)
	int method4853(@OriginalArg(0) int arg0) {
		return this.aClass209_9.method25584(arg0).anInt3714 * 1264459495;
	}

	@OriginalMember(owner = "client!aeh", name = "rp", descriptor = "(I)Lclient!vj;", line = 170)
	Class597 method4854(@OriginalArg(0) int arg0) {
		return this.aClass209_9.method25584(arg0).aClass597_2;
	}

	@OriginalMember(owner = "client!aeh", name = "sa", descriptor = "(I)Lclient!vj;", line = 170)
	Class597 method4855(@OriginalArg(0) int arg0) {
		return this.aClass209_9.method25584(arg0).aClass597_2;
	}

	@OriginalMember(owner = "client!aeh", name = "rn", descriptor = "(I)B", line = 174)
	byte method4856(@OriginalArg(0) int arg0) {
		return this.aClass209_9.method25584(arg0).aByte115;
	}

	@OriginalMember(owner = "client!aeh", name = "sg", descriptor = "(I)B", line = 174)
	byte method4857(@OriginalArg(0) int arg0) {
		return this.aClass209_9.method25584(arg0).aByte115;
	}

	@OriginalMember(owner = "client!aeh", name = "st", descriptor = "(I)B", line = 174)
	byte method4858(@OriginalArg(0) int arg0) {
		return this.aClass209_9.method25584(arg0).aByte115;
	}

	@OriginalMember(owner = "client!aeh", name = "rz", descriptor = "(I)I", line = 178)
	int method4859(@OriginalArg(0) int arg0) {
		return this.aClass209_9.method25584(arg0).aShort162 & 0xFFFF;
	}

	@OriginalMember(owner = "client!aeh", name = "ri", descriptor = "(I)Z", line = 182)
	boolean method4860(@OriginalArg(0) int arg0) {
		@Pc(5) Class215 local5 = this.aClass209_9.method25584(arg0);
		return local5.aByte121 != 0 || local5.aByte116 != 0;
	}

	@OriginalMember(owner = "client!aeh", name = "sj", descriptor = "(I)Z", line = 182)
	boolean method4861(@OriginalArg(0) int arg0) {
		@Pc(5) Class215 local5 = this.aClass209_9.method25584(arg0);
		return local5.aByte121 != 0 || local5.aByte116 != 0;
	}

	@OriginalMember(owner = "client!aeh", name = "sl", descriptor = "(I)Z", line = 182)
	boolean method4862(@OriginalArg(0) int arg0) {
		@Pc(5) Class215 local5 = this.aClass209_9.method25584(arg0);
		return local5.aByte121 != 0 || local5.aByte116 != 0;
	}

	@OriginalMember(owner = "client!aeh", name = "g", descriptor = "()Z", line = 187)
	@Override
	public boolean method20050() {
		return false;
	}

	@OriginalMember(owner = "client!aeh", name = "fq", descriptor = "()Z", line = 187)
	@Override
	public boolean method20161() {
		return false;
	}

	@OriginalMember(owner = "client!aeh", name = "z", descriptor = "()Z", line = 191)
	@Override
	public boolean method20051() {
		return false;
	}

	@OriginalMember(owner = "client!aeh", name = "no", descriptor = "()Z", line = 191)
	@Override
	public boolean method20354() {
		return false;
	}

	@OriginalMember(owner = "client!aeh", name = "j", descriptor = "()Z", line = 195)
	@Override
	public boolean method20052() {
		return true;
	}

	@OriginalMember(owner = "client!aeh", name = "mp", descriptor = "()Z", line = 195)
	@Override
	public boolean method20334() {
		return true;
	}

	@OriginalMember(owner = "client!aeh", name = "mz", descriptor = "()Z", line = 195)
	@Override
	public boolean method20260() {
		return true;
	}

	@OriginalMember(owner = "client!aeh", name = "md", descriptor = "()Z", line = 195)
	@Override
	public boolean method20336() {
		return true;
	}

	@OriginalMember(owner = "client!aeh", name = "fm", descriptor = "()Z", line = 199)
	@Override
	public boolean method20162() {
		return false;
	}

	@OriginalMember(owner = "client!aeh", name = "k", descriptor = "()Z", line = 199)
	@Override
	public boolean method20296() {
		return false;
	}

	@OriginalMember(owner = "client!aeh", name = "u", descriptor = "()Z", line = 203)
	@Override
	public boolean method20178() {
		return false;
	}

	@OriginalMember(owner = "client!aeh", name = "fl", descriptor = "()Z", line = 203)
	@Override
	public boolean method20342() {
		return false;
	}

	@OriginalMember(owner = "client!aeh", name = "ft", descriptor = "()Z", line = 203)
	@Override
	public boolean method20164() {
		return false;
	}

	@OriginalMember(owner = "client!aeh", name = "i", descriptor = "()Z", line = 207)
	@Override
	public boolean method20206() {
		return false;
	}

	@OriginalMember(owner = "client!aeh", name = "fe", descriptor = "()Z", line = 207)
	@Override
	public boolean method20166() {
		return false;
	}

	@OriginalMember(owner = "client!aeh", name = "fk", descriptor = "()Z", line = 207)
	@Override
	public boolean method20241() {
		return false;
	}

	@OriginalMember(owner = "client!aeh", name = "fw", descriptor = "()Z", line = 207)
	@Override
	public boolean method20167() {
		return false;
	}

	@OriginalMember(owner = "client!aeh", name = "e", descriptor = "()Z", line = 211)
	@Override
	public boolean method20055() {
		return false;
	}

	@OriginalMember(owner = "client!aeh", name = "fs", descriptor = "()Z", line = 211)
	@Override
	public boolean method20171() {
		return false;
	}

	@OriginalMember(owner = "client!aeh", name = "fi", descriptor = "()Z", line = 211)
	@Override
	public boolean method20168() {
		return false;
	}

	@OriginalMember(owner = "client!aeh", name = "fz", descriptor = "()Z", line = 211)
	@Override
	public boolean method20169() {
		return false;
	}

	@OriginalMember(owner = "client!aeh", name = "ff", descriptor = "()Z", line = 211)
	@Override
	public boolean method20170() {
		return false;
	}

	@OriginalMember(owner = "client!aeh", name = "f", descriptor = "()Z", line = 215)
	@Override
	public boolean method20056() {
		return false;
	}

	@OriginalMember(owner = "client!aeh", name = "fb", descriptor = "()Z", line = 215)
	@Override
	public boolean method20112() {
		return false;
	}

	@OriginalMember(owner = "client!aeh", name = "fu", descriptor = "()Z", line = 219)
	@Override
	public boolean method20173() {
		return false;
	}

	@OriginalMember(owner = "client!aeh", name = "fo", descriptor = "()Z", line = 219)
	@Override
	public boolean method20174() {
		return false;
	}

	@OriginalMember(owner = "client!aeh", name = "o", descriptor = "()Z", line = 219)
	@Override
	public boolean method20119() {
		return false;
	}

	@OriginalMember(owner = "client!aeh", name = "fd", descriptor = "()Z", line = 223)
	@Override
	public boolean method20353() {
		return true;
	}

	@OriginalMember(owner = "client!aeh", name = "b", descriptor = "()Z", line = 223)
	@Override
	public boolean method20058() {
		return true;
	}

	@OriginalMember(owner = "client!aeh", name = "fj", descriptor = "()Z", line = 223)
	@Override
	public boolean method20175() {
		return true;
	}

	@OriginalMember(owner = "client!aeh", name = "n", descriptor = "()Ljava/lang/String;", line = 227)
	@Override
	public String method20059() {
		return "";
	}

	@OriginalMember(owner = "client!aeh", name = "fh", descriptor = "()Ljava/lang/String;", line = 227)
	@Override
	public String method20176() {
		return "";
	}

	@OriginalMember(owner = "client!aeh", name = "fn", descriptor = "()Ljava/lang/String;", line = 227)
	@Override
	public String method20177() {
		return "";
	}

	@OriginalMember(owner = "client!aeh", name = "a", descriptor = "()[I", line = 231)
	@Override
	public int[] method20060() {
		return null;
	}

	@OriginalMember(owner = "client!aeh", name = "fg", descriptor = "()[I", line = 231)
	@Override
	public int[] method20369() {
		return null;
	}

	@OriginalMember(owner = "client!aeh", name = "fa", descriptor = "()[I", line = 231)
	@Override
	public int[] method20250() {
		return null;
	}

	@OriginalMember(owner = "client!aeh", name = "fp", descriptor = "()[I", line = 231)
	@Override
	public int[] method20179() {
		return null;
	}

	@OriginalMember(owner = "client!aeh", name = "et", descriptor = "(Z)V", line = 234)
	@Override
	public void method20149(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!aeh", name = "fy", descriptor = "(Z)V", line = 234)
	@Override
	public void method20180() {
	}

	@OriginalMember(owner = "client!aeh", name = "fx", descriptor = "(Ljava/awt/Canvas;II)Lclient!aer;", line = 237)
	@Override
	Class92_Sub2 method20053(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return Class592.method31835(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!aeh", name = "ad", descriptor = "(Ljava/awt/Canvas;II)Lclient!aer;", line = 237)
	@Override
	Class92_Sub2 method20062(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return Class592.method31835(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!aeh", name = "fr", descriptor = "(Ljava/awt/Canvas;II)Lclient!aer;", line = 237)
	@Override
	Class92_Sub2 method20182(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return Class592.method31835(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!aeh", name = "sd", descriptor = "(II[I[F)V", line = 241)
	void method4863(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) float[] arg3) {
		this.anInt547 = arg0 * -2095033109;
		this.anInt539 = arg1 * 1188716565;
		this.anIntArray39 = arg2;
		this.aFloatArray15 = arg3;
		for (@Pc(17) int local17 = 0; local17 < this.anInt554 * 442227785; local17++) {
			this.aClass95Array1[local17].method7029();
		}
		this.method20299();
		this.method20078();
	}

	@OriginalMember(owner = "client!aeh", name = "sp", descriptor = "(II[I[F)V", line = 241)
	void method4864(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) float[] arg3) {
		this.anInt547 = arg0 * -2095033109;
		this.anInt539 = arg1 * 1188716565;
		this.anIntArray39 = arg2;
		this.aFloatArray15 = arg3;
		for (@Pc(17) int local17 = 0; local17 < this.anInt554 * 442227785; local17++) {
			this.aClass95Array1[local17].method7029();
		}
		this.method20299();
		this.method20078();
	}

	@OriginalMember(owner = "client!aeh", name = "rv", descriptor = "(II[I[F)V", line = 241)
	void method4865(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) float[] arg3) {
		this.anInt547 = arg0 * -2095033109;
		this.anInt539 = arg1 * 1188716565;
		this.anIntArray39 = arg2;
		this.aFloatArray15 = arg3;
		for (@Pc(17) int local17 = 0; local17 < this.anInt554 * 442227785; local17++) {
			this.aClass95Array1[local17].method7029();
		}
		this.method20299();
		this.method20078();
	}

	@OriginalMember(owner = "client!aeh", name = "sn", descriptor = "(II[I[F)V", line = 241)
	void method4866(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) float[] arg3) {
		this.anInt547 = arg0 * -2095033109;
		this.anInt539 = arg1 * 1188716565;
		this.anIntArray39 = arg2;
		this.aFloatArray15 = arg3;
		for (@Pc(17) int local17 = 0; local17 < this.anInt554 * 442227785; local17++) {
			this.aClass95Array1[local17].method7029();
		}
		this.method20299();
		this.method20078();
	}

	@OriginalMember(owner = "client!aeh", name = "ah", descriptor = "(IIII)[I", line = 251)
	@Override
	public int[] method20066(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anIntArray39 == null) {
			throw new IllegalStateException("");
		}
		@Pc(12) int[] local12 = new int[arg3 * arg2];
		@Pc(14) int local14 = 0;
		for (@Pc(16) int local16 = 0; local16 < arg3; local16++) {
			@Pc(30) int local30 = (local16 + arg1) * 356365251 * this.anInt547 + arg0;
			for (@Pc(32) int local32 = 0; local32 < arg2; local32++) {
				local12[local14++] = this.anIntArray39[local32 + local30];
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!aeh", name = "fc", descriptor = "(IIII)[I", line = 251)
	@Override
	public int[] method20347(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anIntArray39 == null) {
			throw new IllegalStateException("");
		}
		@Pc(12) int[] local12 = new int[arg3 * arg2];
		@Pc(14) int local14 = 0;
		for (@Pc(16) int local16 = 0; local16 < arg3; local16++) {
			@Pc(30) int local30 = (local16 + arg1) * 356365251 * this.anInt547 + arg0;
			for (@Pc(32) int local32 = 0; local32 < arg2; local32++) {
				local12[local14++] = this.anIntArray39[local32 + local30];
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!aeh", name = "gr", descriptor = "(IIII)[I", line = 251)
	@Override
	public int[] method20184(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anIntArray39 == null) {
			throw new IllegalStateException("");
		}
		@Pc(12) int[] local12 = new int[arg3 * arg2];
		@Pc(14) int local14 = 0;
		for (@Pc(16) int local16 = 0; local16 < arg3; local16++) {
			@Pc(30) int local30 = (local16 + arg1) * 356365251 * this.anInt547 + arg0;
			for (@Pc(32) int local32 = 0; local32 < arg2; local32++) {
				local12[local14++] = this.anIntArray39[local32 + local30];
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!aeh", name = "as", descriptor = "()V", line = 263)
	@Override
	public void method20067() {
	}

	@OriginalMember(owner = "client!aeh", name = "gc", descriptor = "()V", line = 263)
	@Override
	public void method20189() {
	}

	@OriginalMember(owner = "client!aeh", name = "gj", descriptor = "()V", line = 263)
	@Override
	public void method20223() {
	}

	@OriginalMember(owner = "client!aeh", name = "ga", descriptor = "()V", line = 263)
	@Override
	public void method20188() {
	}

	@OriginalMember(owner = "client!aeh", name = "gt", descriptor = "()V", line = 263)
	@Override
	public void method20187() {
	}

	@OriginalMember(owner = "client!aeh", name = "gi", descriptor = "()V", line = 263)
	@Override
	public void method20186() {
	}

	@OriginalMember(owner = "client!aeh", name = "h", descriptor = "([I)V", line = 266)
	@Override
	public void method19938(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt547 * 356365251;
		arg0[1] = this.anInt539 * 446066493;
	}

	@OriginalMember(owner = "client!aeh", name = "gy", descriptor = "([I)V", line = 266)
	@Override
	public void method19939(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt547 * 356365251;
		arg0[1] = this.anInt539 * 446066493;
	}

	@OriginalMember(owner = "client!aeh", name = "gz", descriptor = "()Z", line = 271)
	@Override
	public boolean method20191() {
		return false;
	}

	@OriginalMember(owner = "client!aeh", name = "aq", descriptor = "()Z", line = 271)
	@Override
	public boolean method20068() {
		return false;
	}

	@OriginalMember(owner = "client!aeh", name = "gb", descriptor = "()Z", line = 275)
	@Override
	public boolean method20192() {
		return true;
	}

	@OriginalMember(owner = "client!aeh", name = "am", descriptor = "()Z", line = 275)
	@Override
	public boolean method20069() {
		return true;
	}

	@OriginalMember(owner = "client!aeh", name = "ay", descriptor = "()Z", line = 279)
	@Override
	public boolean method20172() {
		return false;
	}

	@OriginalMember(owner = "client!aeh", name = "gu", descriptor = "()Z", line = 279)
	@Override
	public boolean method20193() {
		return false;
	}

	@OriginalMember(owner = "client!aeh", name = "gp", descriptor = "()Z", line = 283)
	@Override
	public boolean method20195() {
		return false;
	}

	@OriginalMember(owner = "client!aeh", name = "af", descriptor = "()Z", line = 283)
	@Override
	public boolean method20371() {
		return false;
	}

	@OriginalMember(owner = "client!aeh", name = "gk", descriptor = "()Z", line = 283)
	@Override
	public boolean method20358() {
		return false;
	}

	@OriginalMember(owner = "client!aeh", name = "an", descriptor = "()I", line = 287)
	@Override
	public int method20070() {
		return -1;
	}

	@OriginalMember(owner = "client!aeh", name = "gq", descriptor = "()I", line = 287)
	@Override
	public int method20380() {
		return -1;
	}

	@OriginalMember(owner = "client!aeh", name = "ge", descriptor = "()I", line = 287)
	@Override
	public int method20288() {
		return -1;
	}

	@OriginalMember(owner = "client!aeh", name = "aa", descriptor = "(III)V", line = 290)
	@Override
	public void method20072(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!aeh", name = "gf", descriptor = "(III)V", line = 290)
	@Override
	public void method20197(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!aeh", name = "ab", descriptor = "()V", line = 291)
	@Override
	public void method20366() {
	}

	@OriginalMember(owner = "client!aeh", name = "go", descriptor = "()V", line = 291)
	@Override
	public void method20054() {
	}

	@OriginalMember(owner = "client!aeh", name = "gx", descriptor = "()V", line = 291)
	@Override
	public void method20198() {
	}

	@OriginalMember(owner = "client!aeh", name = "gv", descriptor = "()V", line = 291)
	@Override
	public void method20199() {
	}

	@OriginalMember(owner = "client!aeh", name = "gd", descriptor = "()V", line = 291)
	@Override
	public void method20200() {
	}

	@OriginalMember(owner = "client!aeh", name = "gn", descriptor = "()V", line = 291)
	@Override
	public void method20044() {
	}

	@OriginalMember(owner = "client!aeh", name = "ap", descriptor = "(II)J", line = 294)
	@Override
	public long method20138(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return 0L;
	}

	@OriginalMember(owner = "client!aeh", name = "nn", descriptor = "(II)J", line = 294)
	@Override
	public long method20337(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return 0L;
	}

	@OriginalMember(owner = "client!aeh", name = "aw", descriptor = "(J)V", line = 297)
	@Override
	public void method20074(@OriginalArg(0) long arg0) {
	}

	@OriginalMember(owner = "client!aeh", name = "gg", descriptor = "(J)V", line = 297)
	@Override
	public void method20201(@OriginalArg(0) long arg0) {
	}

	@OriginalMember(owner = "client!aeh", name = "az", descriptor = "(II[I[I)V", line = 300)
	@Override
	public void method20075(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		this.method19976(arg0, arg1);
		if (this.aClass83_3 == null || this.aClass83_3.method18169() != arg0 || this.aClass83_3.method18171() != arg1) {
			this.aClass83_3 = this.method20102(arg0, arg1, true, true);
			this.aClass92_Sub1_1 = null;
		}
		if (this.aClass92_Sub1_1 == null) {
			this.aClass92_Sub1_1 = this.method20063();
			this.aClass92_Sub1_1.method23513(0, this.aClass83_3.method18173());
		}
		@Pc(59) Class83_Sub1_Sub1 local59 = new Class83_Sub1_Sub1(this, this.anIntArray39, this.anInt547 * 356365251, this.anInt539 * 446066493);
		this.method19968(this.aClass92_Sub1_1);
		this.method20125(1, -16777216);
		local59.method18178(this.anInt2792 * -1555714981, this.anInt2793 * -385311879, this.anInt2794 * 1769547157, this.anInt2795 * -740019615, 1, 0, 0, 0);
		this.aClass83_3.method18175(0, 0, arg0, arg1, arg2, arg3, 0, arg0);
		this.method19972(this.aClass92_Sub1_1);
	}

	@OriginalMember(owner = "client!aeh", name = "gs", descriptor = "(II[I[I)V", line = 300)
	@Override
	public void method20202(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		this.method19976(arg0, arg1);
		if (this.aClass83_3 == null || this.aClass83_3.method18169() != arg0 || this.aClass83_3.method18171() != arg1) {
			this.aClass83_3 = this.method20102(arg0, arg1, true, true);
			this.aClass92_Sub1_1 = null;
		}
		if (this.aClass92_Sub1_1 == null) {
			this.aClass92_Sub1_1 = this.method20063();
			this.aClass92_Sub1_1.method23513(0, this.aClass83_3.method18173());
		}
		@Pc(59) Class83_Sub1_Sub1 local59 = new Class83_Sub1_Sub1(this, this.anIntArray39, this.anInt547 * 356365251, this.anInt539 * 446066493);
		this.method19968(this.aClass92_Sub1_1);
		this.method20125(1, -16777216);
		local59.method18178(this.anInt2792 * -1555714981, this.anInt2793 * -385311879, this.anInt2794 * 1769547157, this.anInt2795 * -740019615, 1, 0, 0, 0);
		this.aClass83_3.method18175(0, 0, arg0, arg1, arg2, arg3, 0, arg0);
		this.method19972(this.aClass92_Sub1_1);
	}

	@OriginalMember(owner = "client!aeh", name = "gl", descriptor = "(II[I[I)V", line = 300)
	@Override
	public void method20203(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		this.method19976(arg0, arg1);
		if (this.aClass83_3 == null || this.aClass83_3.method18169() != arg0 || this.aClass83_3.method18171() != arg1) {
			this.aClass83_3 = this.method20102(arg0, arg1, true, true);
			this.aClass92_Sub1_1 = null;
		}
		if (this.aClass92_Sub1_1 == null) {
			this.aClass92_Sub1_1 = this.method20063();
			this.aClass92_Sub1_1.method23513(0, this.aClass83_3.method18173());
		}
		@Pc(59) Class83_Sub1_Sub1 local59 = new Class83_Sub1_Sub1(this, this.anIntArray39, this.anInt547 * 356365251, this.anInt539 * 446066493);
		this.method19968(this.aClass92_Sub1_1);
		this.method20125(1, -16777216);
		local59.method18178(this.anInt2792 * -1555714981, this.anInt2793 * -385311879, this.anInt2794 * 1769547157, this.anInt2795 * -740019615, 1, 0, 0, 0);
		this.aClass83_3.method18175(0, 0, arg0, arg1, arg2, arg3, 0, arg0);
		this.method19972(this.aClass92_Sub1_1);
	}

	@OriginalMember(owner = "client!aeh", name = "gh", descriptor = "(II[I[I)V", line = 300)
	@Override
	public void method20204(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		this.method19976(arg0, arg1);
		if (this.aClass83_3 == null || this.aClass83_3.method18169() != arg0 || this.aClass83_3.method18171() != arg1) {
			this.aClass83_3 = this.method20102(arg0, arg1, true, true);
			this.aClass92_Sub1_1 = null;
		}
		if (this.aClass92_Sub1_1 == null) {
			this.aClass92_Sub1_1 = this.method20063();
			this.aClass92_Sub1_1.method23513(0, this.aClass83_3.method18173());
		}
		@Pc(59) Class83_Sub1_Sub1 local59 = new Class83_Sub1_Sub1(this, this.anIntArray39, this.anInt547 * 356365251, this.anInt539 * 446066493);
		this.method19968(this.aClass92_Sub1_1);
		this.method20125(1, -16777216);
		local59.method18178(this.anInt2792 * -1555714981, this.anInt2793 * -385311879, this.anInt2794 * 1769547157, this.anInt2795 * -740019615, 1, 0, 0, 0);
		this.aClass83_3.method18175(0, 0, arg0, arg1, arg2, arg3, 0, arg0);
		this.method19972(this.aClass92_Sub1_1);
	}

	@OriginalMember(owner = "client!aeh", name = "gm", descriptor = "(II[I[I)V", line = 300)
	@Override
	public void method20150(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		this.method19976(arg0, arg1);
		if (this.aClass83_3 == null || this.aClass83_3.method18169() != arg0 || this.aClass83_3.method18171() != arg1) {
			this.aClass83_3 = this.method20102(arg0, arg1, true, true);
			this.aClass92_Sub1_1 = null;
		}
		if (this.aClass92_Sub1_1 == null) {
			this.aClass92_Sub1_1 = this.method20063();
			this.aClass92_Sub1_1.method23513(0, this.aClass83_3.method18173());
		}
		@Pc(59) Class83_Sub1_Sub1 local59 = new Class83_Sub1_Sub1(this, this.anIntArray39, this.anInt547 * 356365251, this.anInt539 * 446066493);
		this.method19968(this.aClass92_Sub1_1);
		this.method20125(1, -16777216);
		local59.method18178(this.anInt2792 * -1555714981, this.anInt2793 * -385311879, this.anInt2794 * 1769547157, this.anInt2795 * -740019615, 1, 0, 0, 0);
		this.aClass83_3.method18175(0, 0, arg0, arg1, arg2, arg3, 0, arg0);
		this.method19972(this.aClass92_Sub1_1);
	}

	@OriginalMember(owner = "client!aeh", name = "gw", descriptor = "()V", line = 318)
	@Override
	public void method20130() {
		this.aClass92_Sub1_1 = null;
		this.aClass83_3 = null;
	}

	@OriginalMember(owner = "client!aeh", name = "bj", descriptor = "()V", line = 318)
	@Override
	public void method20077() {
		this.aClass92_Sub1_1 = null;
		this.aClass83_3 = null;
	}

	@OriginalMember(owner = "client!aeh", name = "hl", descriptor = "()V", line = 318)
	@Override
	public void method20287() {
		this.aClass92_Sub1_1 = null;
		this.aClass83_3 = null;
	}

	@OriginalMember(owner = "client!aeh", name = "rt", descriptor = "()V", line = 323)
	void method4867() {
		if (this.aFloatArray15 == null) {
			return;
		}
		@Pc(36) int local36;
		@Pc(42) int local42;
		@Pc(44) int local44;
		if (this.anInt553 * 1709859847 == 0 && this.anInt540 * -1807368365 == this.anInt547 * 356365251 && this.anInt541 * 9823353 == 0 && this.anInt542 * 639238427 == this.anInt539 * 446066493) {
			local36 = this.aFloatArray15.length;
			local42 = local36 - (local36 & 0x7);
			local44 = 0;
			while (local44 < local42) {
				this.aFloatArray15[local44++] = 2.14748365E9F;
				this.aFloatArray15[local44++] = 2.14748365E9F;
				this.aFloatArray15[local44++] = 2.14748365E9F;
				this.aFloatArray15[local44++] = 2.14748365E9F;
				this.aFloatArray15[local44++] = 2.14748365E9F;
				this.aFloatArray15[local44++] = 2.14748365E9F;
				this.aFloatArray15[local44++] = 2.14748365E9F;
				this.aFloatArray15[local44++] = 2.14748365E9F;
			}
			while (local44 < local36) {
				this.aFloatArray15[local44++] = 2.14748365E9F;
			}
			return;
		}
		local36 = this.anInt540 * -1807368365 - this.anInt553 * 1709859847;
		local42 = this.anInt542 * 639238427 - this.anInt541 * 9823353;
		local44 = this.anInt547 * 356365251 - local36;
		@Pc(149) int local149 = this.anInt541 * 9823353 * 356365251 * this.anInt547 + this.anInt553 * 1709859847;
		@Pc(153) int local153 = local36 >> 3;
		@Pc(157) int local157 = local36 & 0x7;
		local36 = local149 - 1;
		for (@Pc(164) int local164 = -local42; local164 < 0; local164++) {
			@Pc(170) int local170;
			if (local153 > 0) {
				local170 = local153;
				do {
					local36++;
					this.aFloatArray15[local36] = 2.14748365E9F;
					local36++;
					this.aFloatArray15[local36] = 2.14748365E9F;
					local36++;
					this.aFloatArray15[local36] = 2.14748365E9F;
					local36++;
					this.aFloatArray15[local36] = 2.14748365E9F;
					local36++;
					this.aFloatArray15[local36] = 2.14748365E9F;
					local36++;
					this.aFloatArray15[local36] = 2.14748365E9F;
					local36++;
					this.aFloatArray15[local36] = 2.14748365E9F;
					local36++;
					this.aFloatArray15[local36] = 2.14748365E9F;
					local170--;
				} while (local170 > 0);
			}
			if (local157 > 0) {
				local170 = local157;
				do {
					local36++;
					this.aFloatArray15[local36] = 2.14748365E9F;
					local170--;
				} while (local170 > 0);
			}
			local36 += local44;
		}
	}

	@OriginalMember(owner = "client!aeh", name = "sz", descriptor = "()V", line = 323)
	void method4868() {
		if (this.aFloatArray15 == null) {
			return;
		}
		@Pc(36) int local36;
		@Pc(42) int local42;
		@Pc(44) int local44;
		if (this.anInt553 * 1709859847 == 0 && this.anInt540 * -1807368365 == this.anInt547 * 356365251 && this.anInt541 * 9823353 == 0 && this.anInt542 * 639238427 == this.anInt539 * 446066493) {
			local36 = this.aFloatArray15.length;
			local42 = local36 - (local36 & 0x7);
			local44 = 0;
			while (local44 < local42) {
				this.aFloatArray15[local44++] = 2.14748365E9F;
				this.aFloatArray15[local44++] = 2.14748365E9F;
				this.aFloatArray15[local44++] = 2.14748365E9F;
				this.aFloatArray15[local44++] = 2.14748365E9F;
				this.aFloatArray15[local44++] = 2.14748365E9F;
				this.aFloatArray15[local44++] = 2.14748365E9F;
				this.aFloatArray15[local44++] = 2.14748365E9F;
				this.aFloatArray15[local44++] = 2.14748365E9F;
			}
			while (local44 < local36) {
				this.aFloatArray15[local44++] = 2.14748365E9F;
			}
			return;
		}
		local36 = this.anInt540 * -1807368365 - this.anInt553 * 1709859847;
		local42 = this.anInt542 * 639238427 - this.anInt541 * 9823353;
		local44 = this.anInt547 * 356365251 - local36;
		@Pc(149) int local149 = this.anInt541 * 9823353 * 356365251 * this.anInt547 + this.anInt553 * 1709859847;
		@Pc(153) int local153 = local36 >> 3;
		@Pc(157) int local157 = local36 & 0x7;
		local36 = local149 - 1;
		for (@Pc(164) int local164 = -local42; local164 < 0; local164++) {
			@Pc(170) int local170;
			if (local153 > 0) {
				local170 = local153;
				do {
					local36++;
					this.aFloatArray15[local36] = 2.14748365E9F;
					local36++;
					this.aFloatArray15[local36] = 2.14748365E9F;
					local36++;
					this.aFloatArray15[local36] = 2.14748365E9F;
					local36++;
					this.aFloatArray15[local36] = 2.14748365E9F;
					local36++;
					this.aFloatArray15[local36] = 2.14748365E9F;
					local36++;
					this.aFloatArray15[local36] = 2.14748365E9F;
					local36++;
					this.aFloatArray15[local36] = 2.14748365E9F;
					local36++;
					this.aFloatArray15[local36] = 2.14748365E9F;
					local170--;
				} while (local170 > 0);
			}
			if (local157 > 0) {
				local170 = local157;
				do {
					local36++;
					this.aFloatArray15[local36] = 2.14748365E9F;
					local170--;
				} while (local170 > 0);
			}
			local36 += local44;
		}
	}

	@OriginalMember(owner = "client!aeh", name = "sm", descriptor = "()V", line = 323)
	void method4869() {
		if (this.aFloatArray15 == null) {
			return;
		}
		@Pc(36) int local36;
		@Pc(42) int local42;
		@Pc(44) int local44;
		if (this.anInt553 * 1709859847 == 0 && this.anInt540 * -1807368365 == this.anInt547 * 356365251 && this.anInt541 * 9823353 == 0 && this.anInt542 * 639238427 == this.anInt539 * 446066493) {
			local36 = this.aFloatArray15.length;
			local42 = local36 - (local36 & 0x7);
			local44 = 0;
			while (local44 < local42) {
				this.aFloatArray15[local44++] = 2.14748365E9F;
				this.aFloatArray15[local44++] = 2.14748365E9F;
				this.aFloatArray15[local44++] = 2.14748365E9F;
				this.aFloatArray15[local44++] = 2.14748365E9F;
				this.aFloatArray15[local44++] = 2.14748365E9F;
				this.aFloatArray15[local44++] = 2.14748365E9F;
				this.aFloatArray15[local44++] = 2.14748365E9F;
				this.aFloatArray15[local44++] = 2.14748365E9F;
			}
			while (local44 < local36) {
				this.aFloatArray15[local44++] = 2.14748365E9F;
			}
			return;
		}
		local36 = this.anInt540 * -1807368365 - this.anInt553 * 1709859847;
		local42 = this.anInt542 * 639238427 - this.anInt541 * 9823353;
		local44 = this.anInt547 * 356365251 - local36;
		@Pc(149) int local149 = this.anInt541 * 9823353 * 356365251 * this.anInt547 + this.anInt553 * 1709859847;
		@Pc(153) int local153 = local36 >> 3;
		@Pc(157) int local157 = local36 & 0x7;
		local36 = local149 - 1;
		for (@Pc(164) int local164 = -local42; local164 < 0; local164++) {
			@Pc(170) int local170;
			if (local153 > 0) {
				local170 = local153;
				do {
					local36++;
					this.aFloatArray15[local36] = 2.14748365E9F;
					local36++;
					this.aFloatArray15[local36] = 2.14748365E9F;
					local36++;
					this.aFloatArray15[local36] = 2.14748365E9F;
					local36++;
					this.aFloatArray15[local36] = 2.14748365E9F;
					local36++;
					this.aFloatArray15[local36] = 2.14748365E9F;
					local36++;
					this.aFloatArray15[local36] = 2.14748365E9F;
					local36++;
					this.aFloatArray15[local36] = 2.14748365E9F;
					local36++;
					this.aFloatArray15[local36] = 2.14748365E9F;
					local170--;
				} while (local170 > 0);
			}
			if (local157 > 0) {
				local170 = local157;
				do {
					local36++;
					this.aFloatArray15[local36] = 2.14748365E9F;
					local170--;
				} while (local170 > 0);
			}
			local36 += local44;
		}
	}

	@OriginalMember(owner = "client!aeh", name = "se", descriptor = "()V", line = 323)
	void method4870() {
		if (this.aFloatArray15 == null) {
			return;
		}
		@Pc(36) int local36;
		@Pc(42) int local42;
		@Pc(44) int local44;
		if (this.anInt553 * 1709859847 == 0 && this.anInt540 * -1807368365 == this.anInt547 * 356365251 && this.anInt541 * 9823353 == 0 && this.anInt542 * 639238427 == this.anInt539 * 446066493) {
			local36 = this.aFloatArray15.length;
			local42 = local36 - (local36 & 0x7);
			local44 = 0;
			while (local44 < local42) {
				this.aFloatArray15[local44++] = 2.14748365E9F;
				this.aFloatArray15[local44++] = 2.14748365E9F;
				this.aFloatArray15[local44++] = 2.14748365E9F;
				this.aFloatArray15[local44++] = 2.14748365E9F;
				this.aFloatArray15[local44++] = 2.14748365E9F;
				this.aFloatArray15[local44++] = 2.14748365E9F;
				this.aFloatArray15[local44++] = 2.14748365E9F;
				this.aFloatArray15[local44++] = 2.14748365E9F;
			}
			while (local44 < local36) {
				this.aFloatArray15[local44++] = 2.14748365E9F;
			}
			return;
		}
		local36 = this.anInt540 * -1807368365 - this.anInt553 * 1709859847;
		local42 = this.anInt542 * 639238427 - this.anInt541 * 9823353;
		local44 = this.anInt547 * 356365251 - local36;
		@Pc(149) int local149 = this.anInt541 * 9823353 * 356365251 * this.anInt547 + this.anInt553 * 1709859847;
		@Pc(153) int local153 = local36 >> 3;
		@Pc(157) int local157 = local36 & 0x7;
		local36 = local149 - 1;
		for (@Pc(164) int local164 = -local42; local164 < 0; local164++) {
			@Pc(170) int local170;
			if (local153 > 0) {
				local170 = local153;
				do {
					local36++;
					this.aFloatArray15[local36] = 2.14748365E9F;
					local36++;
					this.aFloatArray15[local36] = 2.14748365E9F;
					local36++;
					this.aFloatArray15[local36] = 2.14748365E9F;
					local36++;
					this.aFloatArray15[local36] = 2.14748365E9F;
					local36++;
					this.aFloatArray15[local36] = 2.14748365E9F;
					local36++;
					this.aFloatArray15[local36] = 2.14748365E9F;
					local36++;
					this.aFloatArray15[local36] = 2.14748365E9F;
					local36++;
					this.aFloatArray15[local36] = 2.14748365E9F;
					local170--;
				} while (local170 > 0);
			}
			if (local157 > 0) {
				local170 = local157;
				do {
					local36++;
					this.aFloatArray15[local36] = 2.14748365E9F;
					local170--;
				} while (local170 > 0);
			}
			local36 += local44;
		}
	}

	@OriginalMember(owner = "client!aeh", name = "da", descriptor = "(Z)V", line = 375)
	@Override
	public void method20230(@OriginalArg(0) boolean arg0) {
		@Pc(3) Class95 local3 = this.method4886(Thread.currentThread());
		local3.aBoolean162 = arg0;
	}

	@OriginalMember(owner = "client!aeh", name = "nh", descriptor = "(Z)V", line = 375)
	@Override
	public void method20048(@OriginalArg(0) boolean arg0) {
		@Pc(3) Class95 local3 = this.method4886(Thread.currentThread());
		local3.aBoolean162 = arg0;
	}

	@OriginalMember(owner = "client!aeh", name = "na", descriptor = "(Z)V", line = 375)
	@Override
	public void method20346(@OriginalArg(0) boolean arg0) {
		@Pc(3) Class95 local3 = this.method4886(Thread.currentThread());
		local3.aBoolean162 = arg0;
	}

	@OriginalMember(owner = "client!aeh", name = "bv", descriptor = "()V", line = 380)
	@Override
	public void method20078() {
		this.anInt548 = 0;
		this.anInt552 = 0;
		this.anInt550 = this.anInt547 * 910584147;
		this.anInt551 = this.anInt539 * 1362504755;
		this.method4871();
	}

	@OriginalMember(owner = "client!aeh", name = "hu", descriptor = "()V", line = 380)
	@Override
	public void method20207() {
		this.anInt548 = 0;
		this.anInt552 = 0;
		this.anInt550 = this.anInt547 * 910584147;
		this.anInt551 = this.anInt539 * 1362504755;
		this.method4871();
	}

	@OriginalMember(owner = "client!aeh", name = "hw", descriptor = "()V", line = 380)
	@Override
	public void method20208() {
		this.anInt548 = 0;
		this.anInt552 = 0;
		this.anInt550 = this.anInt547 * 910584147;
		this.anInt551 = this.anInt539 * 1362504755;
		this.method4871();
	}

	@OriginalMember(owner = "client!aeh", name = "ht", descriptor = "()V", line = 380)
	@Override
	public void method20209() {
		this.anInt548 = 0;
		this.anInt552 = 0;
		this.anInt550 = this.anInt547 * 910584147;
		this.anInt551 = this.anInt539 * 1362504755;
		this.method4871();
	}

	@OriginalMember(owner = "client!aeh", name = "ba", descriptor = "(IIII)V", line = 388)
	@Override
	public void method20104(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt548 = arg0 * -2028935281;
		this.anInt552 = arg1 * -1799241491;
		this.anInt550 = arg2 * -1869485263;
		this.anInt551 = arg3 * -1888305105;
		this.method4871();
	}

	@OriginalMember(owner = "client!aeh", name = "hz", descriptor = "(IIII)V", line = 388)
	@Override
	public void method20210(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt548 = arg0 * -2028935281;
		this.anInt552 = arg1 * -1799241491;
		this.anInt550 = arg2 * -1869485263;
		this.anInt551 = arg3 * -1888305105;
		this.method4871();
	}

	@OriginalMember(owner = "client!aeh", name = "nl", descriptor = "([I)V", line = 396)
	@Override
	public void method20343(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt548 * -1301915793;
		arg0[1] = this.anInt552 * 332831973;
		arg0[2] = this.anInt550 * -798650927;
		arg0[3] = this.anInt551 * 314738383;
	}

	@OriginalMember(owner = "client!aeh", name = "bl", descriptor = "([I)V", line = 396)
	@Override
	public void method20080(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt548 * -1301915793;
		arg0[1] = this.anInt552 * 332831973;
		arg0[2] = this.anInt550 * -798650927;
		arg0[3] = this.anInt551 * 314738383;
	}

	@OriginalMember(owner = "client!aeh", name = "nv", descriptor = "([I)V", line = 396)
	@Override
	public void method20344(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt548 * -1301915793;
		arg0[1] = this.anInt552 * 332831973;
		arg0[2] = this.anInt550 * -798650927;
		arg0[3] = this.anInt551 * 314738383;
	}

	@OriginalMember(owner = "client!aeh", name = "hq", descriptor = "(FF)V", line = 403)
	@Override
	public void method20211(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		this.aFloat29 = arg1 - arg0;
		this.aFloat32 = arg0 + arg1 - 1.0F;
		for (@Pc(13) int local13 = 0; local13 < this.anInt554 * 442227785; local13++) {
			@Pc(24) Class95 local24 = this.aClass95Array1[local13];
			@Pc(27) Class163 local27 = local24.aClass163_2;
			local27.aFloat243 = this.aFloat29;
			local27.aFloat242 = this.aFloat32;
		}
	}

	@OriginalMember(owner = "client!aeh", name = "bb", descriptor = "(FF)V", line = 403)
	@Override
	public void method20081(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		this.aFloat29 = arg1 - arg0;
		this.aFloat32 = arg0 + arg1 - 1.0F;
		for (@Pc(13) int local13 = 0; local13 < this.anInt554 * 442227785; local13++) {
			@Pc(24) Class95 local24 = this.aClass95Array1[local13];
			@Pc(27) Class163 local27 = local24.aClass163_2;
			local27.aFloat243 = this.aFloat29;
			local27.aFloat242 = this.aFloat32;
		}
	}

	@OriginalMember(owner = "client!aeh", name = "ry", descriptor = "()V", line = 414)
	void method4871() {
		@Pc(9) int local9 = this.anInt540 * -1807368365 - this.anInt553 * 1709859847;
		@Pc(19) int local19 = this.anInt542 * 639238427 - this.anInt541 * 9823353;
		@Pc(30) float local30 = this.aFloat30 = (float) (this.anInt550 * -798650927) / 2.0F;
		@Pc(41) float local41 = this.aFloat31 = (float) (this.anInt551 * 314738383) / 2.0F;
		this.aFloat28 = (float) (this.anInt548 * -1301915793) + local30;
		this.aFloat33 = (float) (this.anInt552 * 332831973) + local41;
		@Pc(61) int local61;
		for (local61 = 0; local61 < this.anInt554 * 442227785; local61++) {
			@Pc(72) Class95 local72 = this.aClass95Array1[local61];
			@Pc(75) Class163 local75 = local72.aClass163_2;
			local75.aFloat239 = local30;
			local75.aFloat241 = local41;
			local75.aFloat238 = this.aFloat28 - (float) (this.anInt553 * 1709859847);
			local75.aFloat240 = this.aFloat33 - (float) (this.anInt541 * 9823353);
			local75.anInt3270 = local9;
			local75.anInt3265 = local19;
		}
		local61 = this.anInt541 * 9823353 * 356365251 * this.anInt547 + this.anInt553 * 1709859847;
		for (@Pc(129) int local129 = this.anInt541 * 9823353; local129 < this.anInt542 * 639238427; local129++) {
			for (@Pc(137) int local137 = 0; local137 < this.anInt554 * 442227785; local137++) {
				this.aClass95Array1[local137].aClass163_2.anIntArray301[local129 - this.anInt541 * 9823353] = local61;
			}
			local61 += this.anInt547 * 356365251;
		}
	}

	@OriginalMember(owner = "client!aeh", name = "hj", descriptor = "()V", line = 438)
	@Override
	public void method20286() {
		this.anInt553 = 0;
		this.anInt541 = 0;
		this.anInt540 = this.anInt547 * 105798609;
		this.anInt542 = this.anInt539 * -875090297;
		this.method4871();
	}

	@OriginalMember(owner = "client!aeh", name = "hr", descriptor = "()V", line = 438)
	@Override
	public void method20212() {
		this.anInt553 = 0;
		this.anInt541 = 0;
		this.anInt540 = this.anInt547 * 105798609;
		this.anInt542 = this.anInt539 * -875090297;
		this.method4871();
	}

	@OriginalMember(owner = "client!aeh", name = "bd", descriptor = "()V", line = 438)
	@Override
	public void method20299() {
		this.anInt553 = 0;
		this.anInt541 = 0;
		this.anInt540 = this.anInt547 * 105798609;
		this.anInt542 = this.anInt539 * -875090297;
		this.method4871();
	}

	@OriginalMember(owner = "client!aeh", name = "hh", descriptor = "()V", line = 438)
	@Override
	public void method20214() {
		this.anInt553 = 0;
		this.anInt541 = 0;
		this.anInt540 = this.anInt547 * 105798609;
		this.anInt542 = this.anInt539 * -875090297;
		this.method4871();
	}

	@OriginalMember(owner = "client!aeh", name = "by", descriptor = "(IIII)V", line = 446)
	@Override
	public void method20151(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (arg1 < 0) {
			arg1 = 0;
		}
		if (arg2 > this.anInt547 * 356365251) {
			arg2 = this.anInt547 * 356365251;
		}
		if (arg3 > this.anInt539 * 446066493) {
			arg3 = this.anInt539 * 446066493;
		}
		this.anInt553 = arg0 * -1685075529;
		this.anInt540 = arg2 * -315695909;
		this.anInt541 = arg1 * 1960003017;
		this.anInt542 = arg3 * -217091821;
		this.method4871();
	}

	@OriginalMember(owner = "client!aeh", name = "hv", descriptor = "(IIII)V", line = 446)
	@Override
	public void method20216(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (arg1 < 0) {
			arg1 = 0;
		}
		if (arg2 > this.anInt547 * 356365251) {
			arg2 = this.anInt547 * 356365251;
		}
		if (arg3 > this.anInt539 * 446066493) {
			arg3 = this.anInt539 * 446066493;
		}
		this.anInt553 = arg0 * -1685075529;
		this.anInt540 = arg2 * -315695909;
		this.anInt541 = arg1 * 1960003017;
		this.anInt542 = arg3 * -217091821;
		this.method4871();
	}

	@OriginalMember(owner = "client!aeh", name = "hg", descriptor = "(IIII)V", line = 446)
	@Override
	public void method20190(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (arg1 < 0) {
			arg1 = 0;
		}
		if (arg2 > this.anInt547 * 356365251) {
			arg2 = this.anInt547 * 356365251;
		}
		if (arg3 > this.anInt539 * 446066493) {
			arg3 = this.anInt539 * 446066493;
		}
		this.anInt553 = arg0 * -1685075529;
		this.anInt540 = arg2 * -315695909;
		this.anInt541 = arg1 * 1960003017;
		this.anInt542 = arg3 * -217091821;
		this.method4871();
	}

	@OriginalMember(owner = "client!aeh", name = "hb", descriptor = "(IIII)V", line = 446)
	@Override
	public void method20215(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (arg1 < 0) {
			arg1 = 0;
		}
		if (arg2 > this.anInt547 * 356365251) {
			arg2 = this.anInt547 * 356365251;
		}
		if (arg3 > this.anInt539 * 446066493) {
			arg3 = this.anInt539 * 446066493;
		}
		this.anInt553 = arg0 * -1685075529;
		this.anInt540 = arg2 * -315695909;
		this.anInt541 = arg1 * 1960003017;
		this.anInt542 = arg3 * -217091821;
		this.method4871();
	}

	@OriginalMember(owner = "client!aeh", name = "bx", descriptor = "(IIII)V", line = 458)
	@Override
	public void method20079(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt553 * 1709859847 < arg0) {
			this.anInt553 = arg0 * -1685075529;
		}
		if (this.anInt541 * 9823353 < arg1) {
			this.anInt541 = arg1 * 1960003017;
		}
		if (this.anInt540 * -1807368365 > arg2) {
			this.anInt540 = arg2 * -315695909;
		}
		if (this.anInt542 * 639238427 > arg3) {
			this.anInt542 = arg3 * -217091821;
		}
		this.method4871();
	}

	@OriginalMember(owner = "client!aeh", name = "hk", descriptor = "(IIII)V", line = 458)
	@Override
	public void method20217(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt553 * 1709859847 < arg0) {
			this.anInt553 = arg0 * -1685075529;
		}
		if (this.anInt541 * 9823353 < arg1) {
			this.anInt541 = arg1 * 1960003017;
		}
		if (this.anInt540 * -1807368365 > arg2) {
			this.anInt540 = arg2 * -315695909;
		}
		if (this.anInt542 * 639238427 > arg3) {
			this.anInt542 = arg3 * -217091821;
		}
		this.method4871();
	}

	@OriginalMember(owner = "client!aeh", name = "hy", descriptor = "(IIII)V", line = 458)
	@Override
	public void method20218(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt553 * 1709859847 < arg0) {
			this.anInt553 = arg0 * -1685075529;
		}
		if (this.anInt541 * 9823353 < arg1) {
			this.anInt541 = arg1 * 1960003017;
		}
		if (this.anInt540 * -1807368365 > arg2) {
			this.anInt540 = arg2 * -315695909;
		}
		if (this.anInt542 * 639238427 > arg3) {
			this.anInt542 = arg3 * -217091821;
		}
		this.method4871();
	}

	@OriginalMember(owner = "client!aeh", name = "hs", descriptor = "(IIII)V", line = 458)
	@Override
	public void method20219(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt553 * 1709859847 < arg0) {
			this.anInt553 = arg0 * -1685075529;
		}
		if (this.anInt541 * 9823353 < arg1) {
			this.anInt541 = arg1 * 1960003017;
		}
		if (this.anInt540 * -1807368365 > arg2) {
			this.anInt540 = arg2 * -315695909;
		}
		if (this.anInt542 * 639238427 > arg3) {
			this.anInt542 = arg3 * -217091821;
		}
		this.method4871();
	}

	@OriginalMember(owner = "client!aeh", name = "hm", descriptor = "(IIII)V", line = 458)
	@Override
	public void method20085(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt553 * 1709859847 < arg0) {
			this.anInt553 = arg0 * -1685075529;
		}
		if (this.anInt541 * 9823353 < arg1) {
			this.anInt541 = arg1 * 1960003017;
		}
		if (this.anInt540 * -1807368365 > arg2) {
			this.anInt540 = arg2 * -315695909;
		}
		if (this.anInt542 * 639238427 > arg3) {
			this.anInt542 = arg3 * -217091821;
		}
		this.method4871();
	}

	@OriginalMember(owner = "client!aeh", name = "bi", descriptor = "([I)V", line = 466)
	@Override
	public void method20142(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt553 * 1709859847;
		arg0[1] = this.anInt541 * 9823353;
		arg0[2] = this.anInt540 * -1807368365;
		arg0[3] = this.anInt542 * 639238427;
	}

	@OriginalMember(owner = "client!aeh", name = "hx", descriptor = "([I)V", line = 466)
	@Override
	public void method20319(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt553 * 1709859847;
		arg0[1] = this.anInt541 * 9823353;
		arg0[2] = this.anInt540 * -1807368365;
		arg0[3] = this.anInt542 * 639238427;
	}

	@OriginalMember(owner = "client!aeh", name = "he", descriptor = "([I)V", line = 466)
	@Override
	public void method20221(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt553 * 1709859847;
		arg0[1] = this.anInt541 * 9823353;
		arg0[2] = this.anInt540 * -1807368365;
		arg0[3] = this.anInt542 * 639238427;
	}

	@OriginalMember(owner = "client!aeh", name = "ho", descriptor = "([I)V", line = 466)
	@Override
	public void method20222(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt553 * 1709859847;
		arg0[1] = this.anInt541 * 9823353;
		arg0[2] = this.anInt540 * -1807368365;
		arg0[3] = this.anInt542 * 639238427;
	}

	@OriginalMember(owner = "client!aeh", name = "iq", descriptor = "([I)V", line = 466)
	@Override
	public void method20101(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt553 * 1709859847;
		arg0[1] = this.anInt541 * 9823353;
		arg0[2] = this.anInt540 * -1807368365;
		arg0[3] = this.anInt542 * 639238427;
	}

	@OriginalMember(owner = "client!aeh", name = "ib", descriptor = "([I)V", line = 466)
	@Override
	public void method20159(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt553 * 1709859847;
		arg0[1] = this.anInt541 * 9823353;
		arg0[2] = this.anInt540 * -1807368365;
		arg0[3] = this.anInt542 * 639238427;
	}

	@OriginalMember(owner = "client!aeh", name = "if", descriptor = "([I)V", line = 466)
	@Override
	public void method20234(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt553 * 1709859847;
		arg0[1] = this.anInt541 * 9823353;
		arg0[2] = this.anInt540 * -1807368365;
		arg0[3] = this.anInt542 * 639238427;
	}

	@OriginalMember(owner = "client!aeh", name = "bg", descriptor = "(II)V", line = 473)
	@Override
	public void method20125(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if ((arg0 & 0x1) != 0) {
			this.method20088(0, 0, this.anInt547 * 356365251, this.anInt539 * 446066493, arg1, 0);
		}
		if ((arg0 & 0x2) != 0) {
			this.method4867();
		}
	}

	@OriginalMember(owner = "client!aeh", name = "id", descriptor = "(II)V", line = 473)
	@Override
	public void method20226(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if ((arg0 & 0x1) != 0) {
			this.method20088(0, 0, this.anInt547 * 356365251, this.anInt539 * 446066493, arg1, 0);
		}
		if ((arg0 & 0x2) != 0) {
			this.method4867();
		}
	}

	@OriginalMember(owner = "client!aeh", name = "ii", descriptor = "(II)V", line = 473)
	@Override
	public void method20227(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if ((arg0 & 0x1) != 0) {
			this.method20088(0, 0, this.anInt547 * 356365251, this.anInt539 * 446066493, arg1, 0);
		}
		if ((arg0 & 0x2) != 0) {
			this.method4867();
		}
	}

	@OriginalMember(owner = "client!aeh", name = "ip", descriptor = "(II)V", line = 473)
	@Override
	public void method20228(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if ((arg0 & 0x1) != 0) {
			this.method20088(0, 0, this.anInt547 * 356365251, this.anInt539 * 446066493, arg1, 0);
		}
		if ((arg0 & 0x2) != 0) {
			this.method4867();
		}
	}

	@OriginalMember(owner = "client!aeh", name = "it", descriptor = "(IIIIII)V", line = 478)
	@Override
	public void method20086(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method20057(arg0, arg1, arg2, arg4, arg5);
		this.method20057(arg0, arg3 + arg1 - 1, arg2, arg4, arg5);
		this.method20377(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
		this.method20377(arg2 + arg0 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
	}

	@OriginalMember(owner = "client!aeh", name = "bp", descriptor = "(IIIIII)V", line = 478)
	@Override
	public void method20087(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method20057(arg0, arg1, arg2, arg4, arg5);
		this.method20057(arg0, arg3 + arg1 - 1, arg2, arg4, arg5);
		this.method20377(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
		this.method20377(arg2 + arg0 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
	}

	@OriginalMember(owner = "client!aeh", name = "iw", descriptor = "(IIIIII)V", line = 478)
	@Override
	public void method20229(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method20057(arg0, arg1, arg2, arg4, arg5);
		this.method20057(arg0, arg3 + arg1 - 1, arg2, arg4, arg5);
		this.method20377(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
		this.method20377(arg2 + arg0 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
	}

	@OriginalMember(owner = "client!aeh", name = "bm", descriptor = "(IIIIII)V", line = 485)
	@Override
	public void method20088(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (this.anIntArray39 == null) {
			return;
		}
		if (arg0 < this.anInt553 * 1709859847) {
			arg2 -= this.anInt553 * 1709859847 - arg0;
			arg0 = this.anInt553 * 1709859847;
		}
		if (arg1 < this.anInt541 * 9823353) {
			arg3 -= this.anInt541 * 9823353 - arg1;
			arg1 = this.anInt541 * 9823353;
		}
		if (arg0 + arg2 > this.anInt540 * -1807368365) {
			arg2 = this.anInt540 * -1807368365 - arg0;
		}
		if (arg3 + arg1 > this.anInt542 * 639238427) {
			arg3 = this.anInt542 * 639238427 - arg1;
		}
		if (arg2 <= 0 || arg3 <= 0 || arg0 > this.anInt540 * -1807368365 || arg1 > this.anInt542 * 639238427) {
			return;
		}
		@Pc(97) int local97 = this.anInt547 * 356365251 - arg2;
		@Pc(106) int local106 = arg1 * this.anInt547 * 356365251 + arg0;
		@Pc(110) int local110 = arg4 >>> 24;
		@Pc(122) int local122;
		@Pc(126) int local126;
		@Pc(133) int local133;
		if (arg5 != 0 && (arg5 != 1 || local110 != 255)) {
			@Pc(252) int local252;
			if (arg5 == 1) {
				@Pc(233) int local233 = ((arg4 >>> 8 & 0xFF00FF) * local110 & 0xFF00FF00) + ((arg4 & 0xFF00FF) * local110 >> 8 & 0xFF00FF);
				local122 = 256 - local110;
				for (local126 = 0; local126 < arg3; local126++) {
					for (local133 = -arg2; local133 < 0; local133++) {
						local252 = this.anIntArray39[local106];
						@Pc(272) int local272 = ((local252 >>> 8 & 0xFF00FF) * local122 & 0xFF00FF00) + (local122 * (local252 & 0xFF00FF) >> 8 & 0xFF00FF);
						this.anIntArray39[local106++] = local272 + local233;
					}
					local106 += local97;
				}
			} else if (arg5 == 2) {
				for (local122 = 0; local122 < arg3; local122++) {
					for (local126 = -arg2; local126 < 0; local126++) {
						local133 = this.anIntArray39[local106];
						local252 = arg4 + local133;
						@Pc(319) int local319 = (local133 & 0xFF00FF) + (arg4 & 0xFF00FF);
						local133 = (local252 - local319 & 0x10000) + (local319 & 0x1000100);
						this.anIntArray39[local106++] = local252 - local133 | local133 - (local133 >>> 8);
					}
					local106 += local97;
				}
			} else {
				throw new IllegalArgumentException();
			}
			return;
		}
		local122 = arg2 >> 3;
		local126 = arg2 & 0x7;
		arg2 = local106 - 1;
		for (local133 = -arg3; local133 < 0; local133++) {
			if (local122 > 0) {
				arg0 = local122;
				do {
					arg2++;
					this.anIntArray39[arg2] = arg4;
					arg2++;
					this.anIntArray39[arg2] = arg4;
					arg2++;
					this.anIntArray39[arg2] = arg4;
					arg2++;
					this.anIntArray39[arg2] = arg4;
					arg2++;
					this.anIntArray39[arg2] = arg4;
					arg2++;
					this.anIntArray39[arg2] = arg4;
					arg2++;
					this.anIntArray39[arg2] = arg4;
					arg2++;
					this.anIntArray39[arg2] = arg4;
					arg0--;
				} while (arg0 > 0);
			}
			if (local126 > 0) {
				arg0 = local126;
				do {
					arg2++;
					this.anIntArray39[arg2] = arg4;
					arg0--;
				} while (arg0 > 0);
			}
			arg2 += local97;
		}
	}

	@OriginalMember(owner = "client!aeh", name = "in", descriptor = "(IIIIII)V", line = 485)
	@Override
	public void method20231(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (this.anIntArray39 == null) {
			return;
		}
		if (arg0 < this.anInt553 * 1709859847) {
			arg2 -= this.anInt553 * 1709859847 - arg0;
			arg0 = this.anInt553 * 1709859847;
		}
		if (arg1 < this.anInt541 * 9823353) {
			arg3 -= this.anInt541 * 9823353 - arg1;
			arg1 = this.anInt541 * 9823353;
		}
		if (arg0 + arg2 > this.anInt540 * -1807368365) {
			arg2 = this.anInt540 * -1807368365 - arg0;
		}
		if (arg3 + arg1 > this.anInt542 * 639238427) {
			arg3 = this.anInt542 * 639238427 - arg1;
		}
		if (arg2 <= 0 || arg3 <= 0 || arg0 > this.anInt540 * -1807368365 || arg1 > this.anInt542 * 639238427) {
			return;
		}
		@Pc(97) int local97 = this.anInt547 * 356365251 - arg2;
		@Pc(106) int local106 = arg1 * this.anInt547 * 356365251 + arg0;
		@Pc(110) int local110 = arg4 >>> 24;
		@Pc(122) int local122;
		@Pc(126) int local126;
		@Pc(133) int local133;
		if (arg5 != 0 && (arg5 != 1 || local110 != 255)) {
			@Pc(252) int local252;
			if (arg5 == 1) {
				@Pc(233) int local233 = ((arg4 >>> 8 & 0xFF00FF) * local110 & 0xFF00FF00) + ((arg4 & 0xFF00FF) * local110 >> 8 & 0xFF00FF);
				local122 = 256 - local110;
				for (local126 = 0; local126 < arg3; local126++) {
					for (local133 = -arg2; local133 < 0; local133++) {
						local252 = this.anIntArray39[local106];
						@Pc(272) int local272 = ((local252 >>> 8 & 0xFF00FF) * local122 & 0xFF00FF00) + (local122 * (local252 & 0xFF00FF) >> 8 & 0xFF00FF);
						this.anIntArray39[local106++] = local272 + local233;
					}
					local106 += local97;
				}
			} else if (arg5 == 2) {
				for (local122 = 0; local122 < arg3; local122++) {
					for (local126 = -arg2; local126 < 0; local126++) {
						local133 = this.anIntArray39[local106];
						local252 = arg4 + local133;
						@Pc(319) int local319 = (local133 & 0xFF00FF) + (arg4 & 0xFF00FF);
						local133 = (local252 - local319 & 0x10000) + (local319 & 0x1000100);
						this.anIntArray39[local106++] = local252 - local133 | local133 - (local133 >>> 8);
					}
					local106 += local97;
				}
			} else {
				throw new IllegalArgumentException();
			}
			return;
		}
		local122 = arg2 >> 3;
		local126 = arg2 & 0x7;
		arg2 = local106 - 1;
		for (local133 = -arg3; local133 < 0; local133++) {
			if (local122 > 0) {
				arg0 = local122;
				do {
					arg2++;
					this.anIntArray39[arg2] = arg4;
					arg2++;
					this.anIntArray39[arg2] = arg4;
					arg2++;
					this.anIntArray39[arg2] = arg4;
					arg2++;
					this.anIntArray39[arg2] = arg4;
					arg2++;
					this.anIntArray39[arg2] = arg4;
					arg2++;
					this.anIntArray39[arg2] = arg4;
					arg2++;
					this.anIntArray39[arg2] = arg4;
					arg2++;
					this.anIntArray39[arg2] = arg4;
					arg0--;
				} while (arg0 > 0);
			}
			if (local126 > 0) {
				arg0 = local126;
				do {
					arg2++;
					this.anIntArray39[arg2] = arg4;
					arg0--;
				} while (arg0 > 0);
			}
			arg2 += local97;
		}
	}

	@OriginalMember(owner = "client!aeh", name = "ig", descriptor = "(IIIIII)V", line = 485)
	@Override
	public void method20360(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (this.anIntArray39 == null) {
			return;
		}
		if (arg0 < this.anInt553 * 1709859847) {
			arg2 -= this.anInt553 * 1709859847 - arg0;
			arg0 = this.anInt553 * 1709859847;
		}
		if (arg1 < this.anInt541 * 9823353) {
			arg3 -= this.anInt541 * 9823353 - arg1;
			arg1 = this.anInt541 * 9823353;
		}
		if (arg0 + arg2 > this.anInt540 * -1807368365) {
			arg2 = this.anInt540 * -1807368365 - arg0;
		}
		if (arg3 + arg1 > this.anInt542 * 639238427) {
			arg3 = this.anInt542 * 639238427 - arg1;
		}
		if (arg2 <= 0 || arg3 <= 0 || arg0 > this.anInt540 * -1807368365 || arg1 > this.anInt542 * 639238427) {
			return;
		}
		@Pc(97) int local97 = this.anInt547 * 356365251 - arg2;
		@Pc(106) int local106 = arg1 * this.anInt547 * 356365251 + arg0;
		@Pc(110) int local110 = arg4 >>> 24;
		@Pc(122) int local122;
		@Pc(126) int local126;
		@Pc(133) int local133;
		if (arg5 != 0 && (arg5 != 1 || local110 != 255)) {
			@Pc(252) int local252;
			if (arg5 == 1) {
				@Pc(233) int local233 = ((arg4 >>> 8 & 0xFF00FF) * local110 & 0xFF00FF00) + ((arg4 & 0xFF00FF) * local110 >> 8 & 0xFF00FF);
				local122 = 256 - local110;
				for (local126 = 0; local126 < arg3; local126++) {
					for (local133 = -arg2; local133 < 0; local133++) {
						local252 = this.anIntArray39[local106];
						@Pc(272) int local272 = ((local252 >>> 8 & 0xFF00FF) * local122 & 0xFF00FF00) + (local122 * (local252 & 0xFF00FF) >> 8 & 0xFF00FF);
						this.anIntArray39[local106++] = local272 + local233;
					}
					local106 += local97;
				}
			} else if (arg5 == 2) {
				for (local122 = 0; local122 < arg3; local122++) {
					for (local126 = -arg2; local126 < 0; local126++) {
						local133 = this.anIntArray39[local106];
						local252 = arg4 + local133;
						@Pc(319) int local319 = (local133 & 0xFF00FF) + (arg4 & 0xFF00FF);
						local133 = (local252 - local319 & 0x10000) + (local319 & 0x1000100);
						this.anIntArray39[local106++] = local252 - local133 | local133 - (local133 >>> 8);
					}
					local106 += local97;
				}
			} else {
				throw new IllegalArgumentException();
			}
			return;
		}
		local122 = arg2 >> 3;
		local126 = arg2 & 0x7;
		arg2 = local106 - 1;
		for (local133 = -arg3; local133 < 0; local133++) {
			if (local122 > 0) {
				arg0 = local122;
				do {
					arg2++;
					this.anIntArray39[arg2] = arg4;
					arg2++;
					this.anIntArray39[arg2] = arg4;
					arg2++;
					this.anIntArray39[arg2] = arg4;
					arg2++;
					this.anIntArray39[arg2] = arg4;
					arg2++;
					this.anIntArray39[arg2] = arg4;
					arg2++;
					this.anIntArray39[arg2] = arg4;
					arg2++;
					this.anIntArray39[arg2] = arg4;
					arg2++;
					this.anIntArray39[arg2] = arg4;
					arg0--;
				} while (arg0 > 0);
			}
			if (local126 > 0) {
				arg0 = local126;
				do {
					arg2++;
					this.anIntArray39[arg2] = arg4;
					arg0--;
				} while (arg0 > 0);
			}
			arg2 += local97;
		}
	}

	@OriginalMember(owner = "client!aeh", name = "bk", descriptor = "(IIIII)V", line = 555)
	@Override
	void method20090(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (this.anIntArray39 == null) {
			return;
		}
		if (arg2 < 0) {
			arg2 = -arg2;
		}
		@Pc(12) int local12 = arg1 - arg2;
		if (local12 < this.anInt541 * 9823353) {
			local12 = this.anInt541 * 9823353;
		}
		@Pc(29) int local29 = arg1 + arg2 + 1;
		if (local29 > this.anInt542 * 639238427) {
			local29 = this.anInt542 * 639238427;
		}
		@Pc(42) int local42 = local12;
		@Pc(46) int local46 = arg2 * arg2;
		@Pc(48) int local48 = 0;
		@Pc(52) int local52 = arg1 - local12;
		@Pc(56) int local56 = local52 * local52;
		@Pc(60) int local60 = local56 - local52;
		if (arg1 > local29) {
			arg1 = local29;
		}
		@Pc(69) int local69 = arg3 >>> 24;
		@Pc(107) int local107;
		@Pc(122) int local122;
		@Pc(142) int local142;
		@Pc(144) int local144;
		if (arg4 == 0 || arg4 == 1 && local69 == 255) {
			while (local42 < arg1) {
				while (local60 <= local46 || local56 <= local46) {
					local56 += local48 + local48;
					local60 += local48++ + local48;
				}
				local107 = arg0 - local48 + 1;
				if (local107 < this.anInt553 * 1709859847) {
					local107 = this.anInt553 * 1709859847;
				}
				local122 = local48 + arg0;
				if (local122 > this.anInt540 * -1807368365) {
					local122 = this.anInt540 * -1807368365;
				}
				local142 = local42 * 356365251 * this.anInt547 + local107;
				for (local144 = local107; local144 < local122; local144++) {
					this.anIntArray39[local142++] = arg3;
				}
				local42++;
				local56 -= local52-- + local52;
				local60 -= local52 + local52;
			}
			local48 = arg2;
			local52 = local42 - arg1;
			local60 = local46 + local52 * local52;
			local56 = local60 - arg2;
			local60 -= local52;
			while (local42 < local29) {
				while (local60 > local46 && local56 > local46) {
					local60 -= local48-- + local48;
					local56 -= local48 + local48;
				}
				local107 = arg0 - local48;
				if (local107 < this.anInt553 * 1709859847) {
					local107 = this.anInt553 * 1709859847;
				}
				local122 = local48 + arg0;
				if (local122 > this.anInt540 * -1807368365 - 1) {
					local122 = this.anInt540 * -1807368365 - 1;
				}
				local142 = local107 + this.anInt547 * 356365251 * local42;
				for (local144 = local107; local144 <= local122; local144++) {
					this.anIntArray39[local142++] = arg3;
				}
				local42++;
				local60 += local52 + local52;
				local56 += local52++ + local52;
			}
			return;
		}
		@Pc(381) int local381;
		@Pc(389) int local389;
		if (arg4 == 1) {
			@Pc(311) int local311 = (local69 << 24) + (local69 * (arg3 & 0xFF00FF) >> 8 & 0xFF00FF) + (local69 * (arg3 & 0xFF00) >> 8 & 0xFF00);
			local107 = 256 - local69;
			while (local42 < arg1) {
				while (local60 <= local46 || local56 <= local46) {
					local56 += local48 + local48;
					local60 += local48++ + local48;
				}
				local122 = arg0 - local48 + 1;
				if (local122 < this.anInt553 * 1709859847) {
					local122 = this.anInt553 * 1709859847;
				}
				local142 = local48 + arg0;
				if (local142 > this.anInt540 * -1807368365) {
					local142 = this.anInt540 * -1807368365;
				}
				local144 = local42 * this.anInt547 * 356365251 + local122;
				for (local381 = local122; local381 < local142; local381++) {
					local389 = this.anIntArray39[local144];
					@Pc(409) int local409 = (local107 * (local389 & 0xFF00) >> 8 & 0xFF00) + (local107 * (local389 & 0xFF00FF) >> 8 & 0xFF00FF);
					this.anIntArray39[local144++] = local409 + local311;
				}
				local42++;
				local56 -= local52-- + local52;
				local60 -= local52 + local52;
			}
			local48 = arg2;
			local52 = -local52;
			local60 = local46 + local52 * local52;
			local56 = local60 - arg2;
			local60 -= local52;
			while (local42 < local29) {
				while (local60 > local46 && local56 > local46) {
					local60 -= local48-- + local48;
					local56 -= local48 + local48;
				}
				local122 = arg0 - local48;
				if (local122 < this.anInt553 * 1709859847) {
					local122 = this.anInt553 * 1709859847;
				}
				local142 = local48 + arg0;
				if (local142 > this.anInt540 * -1807368365 - 1) {
					local142 = this.anInt540 * -1807368365 - 1;
				}
				local144 = local42 * this.anInt547 * 356365251 + local122;
				for (local381 = local122; local381 <= local142; local381++) {
					local389 = this.anIntArray39[local144];
					local389 = (local107 * (local389 & 0xFF00) >> 8 & 0xFF00) + ((local389 & 0xFF00FF) * local107 >> 8 & 0xFF00FF);
					this.anIntArray39[local144++] = local389 + local311;
				}
				local42++;
				local60 += local52 + local52;
				local56 += local52++ + local52;
			}
		} else if (arg4 == 2) {
			@Pc(664) int local664;
			while (local42 < arg1) {
				while (local60 <= local46 || local56 <= local46) {
					local56 += local48 + local48;
					local60 += local48++ + local48;
				}
				local107 = arg0 - local48 + 1;
				if (local107 < this.anInt553 * 1709859847) {
					local107 = this.anInt553 * 1709859847;
				}
				local122 = local48 + arg0;
				if (local122 > this.anInt540 * -1807368365) {
					local122 = this.anInt540 * -1807368365;
				}
				local142 = this.anInt547 * 356365251 * local42 + local107;
				for (local144 = local107; local144 < local122; local144++) {
					local381 = this.anIntArray39[local142];
					local389 = local381 + arg3;
					local664 = (local381 & 0xFF00FF) + (arg3 & 0xFF00FF);
					local381 = (local389 - local664 & 0x10000) + (local664 & 0x1000100);
					this.anIntArray39[local142++] = local389 - local381 | local381 - (local381 >>> 8);
				}
				local42++;
				local56 -= local52-- + local52;
				local60 -= local52 + local52;
			}
			local48 = arg2;
			local52 = -local52;
			local60 = local46 + local52 * local52;
			local56 = local60 - arg2;
			local60 -= local52;
			while (local42 < local29) {
				while (local60 > local46 && local56 > local46) {
					local60 -= local48-- + local48;
					local56 -= local48 + local48;
				}
				local107 = arg0 - local48;
				if (local107 < this.anInt553 * 1709859847) {
					local107 = this.anInt553 * 1709859847;
				}
				local122 = local48 + arg0;
				if (local122 > this.anInt540 * -1807368365 - 1) {
					local122 = this.anInt540 * -1807368365 - 1;
				}
				local142 = local107 + this.anInt547 * 356365251 * local42;
				for (local144 = local107; local144 <= local122; local144++) {
					local381 = this.anIntArray39[local142];
					local389 = local381 + arg3;
					local664 = (arg3 & 0xFF00FF) + (local381 & 0xFF00FF);
					local381 = (local664 & 0x1000100) + (local389 - local664 & 0x10000);
					this.anIntArray39[local142++] = local389 - local381 | local381 - (local381 >>> 8);
				}
				local42++;
				local60 += local52 + local52;
				local56 += local52++ + local52;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!aeh", name = "iy", descriptor = "(IIIII)V", line = 555)
	@Override
	void method20233(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (this.anIntArray39 == null) {
			return;
		}
		if (arg2 < 0) {
			arg2 = -arg2;
		}
		@Pc(12) int local12 = arg1 - arg2;
		if (local12 < this.anInt541 * 9823353) {
			local12 = this.anInt541 * 9823353;
		}
		@Pc(29) int local29 = arg1 + arg2 + 1;
		if (local29 > this.anInt542 * 639238427) {
			local29 = this.anInt542 * 639238427;
		}
		@Pc(42) int local42 = local12;
		@Pc(46) int local46 = arg2 * arg2;
		@Pc(48) int local48 = 0;
		@Pc(52) int local52 = arg1 - local12;
		@Pc(56) int local56 = local52 * local52;
		@Pc(60) int local60 = local56 - local52;
		if (arg1 > local29) {
			arg1 = local29;
		}
		@Pc(69) int local69 = arg3 >>> 24;
		@Pc(107) int local107;
		@Pc(122) int local122;
		@Pc(142) int local142;
		@Pc(144) int local144;
		if (arg4 == 0 || arg4 == 1 && local69 == 255) {
			while (local42 < arg1) {
				while (local60 <= local46 || local56 <= local46) {
					local56 += local48 + local48;
					local60 += local48++ + local48;
				}
				local107 = arg0 - local48 + 1;
				if (local107 < this.anInt553 * 1709859847) {
					local107 = this.anInt553 * 1709859847;
				}
				local122 = local48 + arg0;
				if (local122 > this.anInt540 * -1807368365) {
					local122 = this.anInt540 * -1807368365;
				}
				local142 = local42 * 356365251 * this.anInt547 + local107;
				for (local144 = local107; local144 < local122; local144++) {
					this.anIntArray39[local142++] = arg3;
				}
				local42++;
				local56 -= local52-- + local52;
				local60 -= local52 + local52;
			}
			local48 = arg2;
			local52 = local42 - arg1;
			local60 = local46 + local52 * local52;
			local56 = local60 - arg2;
			local60 -= local52;
			while (local42 < local29) {
				while (local60 > local46 && local56 > local46) {
					local60 -= local48-- + local48;
					local56 -= local48 + local48;
				}
				local107 = arg0 - local48;
				if (local107 < this.anInt553 * 1709859847) {
					local107 = this.anInt553 * 1709859847;
				}
				local122 = local48 + arg0;
				if (local122 > this.anInt540 * -1807368365 - 1) {
					local122 = this.anInt540 * -1807368365 - 1;
				}
				local142 = local107 + this.anInt547 * 356365251 * local42;
				for (local144 = local107; local144 <= local122; local144++) {
					this.anIntArray39[local142++] = arg3;
				}
				local42++;
				local60 += local52 + local52;
				local56 += local52++ + local52;
			}
			return;
		}
		@Pc(381) int local381;
		@Pc(389) int local389;
		if (arg4 == 1) {
			@Pc(311) int local311 = (local69 << 24) + (local69 * (arg3 & 0xFF00FF) >> 8 & 0xFF00FF) + (local69 * (arg3 & 0xFF00) >> 8 & 0xFF00);
			local107 = 256 - local69;
			while (local42 < arg1) {
				while (local60 <= local46 || local56 <= local46) {
					local56 += local48 + local48;
					local60 += local48++ + local48;
				}
				local122 = arg0 - local48 + 1;
				if (local122 < this.anInt553 * 1709859847) {
					local122 = this.anInt553 * 1709859847;
				}
				local142 = local48 + arg0;
				if (local142 > this.anInt540 * -1807368365) {
					local142 = this.anInt540 * -1807368365;
				}
				local144 = local42 * this.anInt547 * 356365251 + local122;
				for (local381 = local122; local381 < local142; local381++) {
					local389 = this.anIntArray39[local144];
					@Pc(409) int local409 = (local107 * (local389 & 0xFF00) >> 8 & 0xFF00) + (local107 * (local389 & 0xFF00FF) >> 8 & 0xFF00FF);
					this.anIntArray39[local144++] = local409 + local311;
				}
				local42++;
				local56 -= local52-- + local52;
				local60 -= local52 + local52;
			}
			local48 = arg2;
			local52 = -local52;
			local60 = local46 + local52 * local52;
			local56 = local60 - arg2;
			local60 -= local52;
			while (local42 < local29) {
				while (local60 > local46 && local56 > local46) {
					local60 -= local48-- + local48;
					local56 -= local48 + local48;
				}
				local122 = arg0 - local48;
				if (local122 < this.anInt553 * 1709859847) {
					local122 = this.anInt553 * 1709859847;
				}
				local142 = local48 + arg0;
				if (local142 > this.anInt540 * -1807368365 - 1) {
					local142 = this.anInt540 * -1807368365 - 1;
				}
				local144 = local42 * this.anInt547 * 356365251 + local122;
				for (local381 = local122; local381 <= local142; local381++) {
					local389 = this.anIntArray39[local144];
					local389 = (local107 * (local389 & 0xFF00) >> 8 & 0xFF00) + ((local389 & 0xFF00FF) * local107 >> 8 & 0xFF00FF);
					this.anIntArray39[local144++] = local389 + local311;
				}
				local42++;
				local60 += local52 + local52;
				local56 += local52++ + local52;
			}
		} else if (arg4 == 2) {
			@Pc(664) int local664;
			while (local42 < arg1) {
				while (local60 <= local46 || local56 <= local46) {
					local56 += local48 + local48;
					local60 += local48++ + local48;
				}
				local107 = arg0 - local48 + 1;
				if (local107 < this.anInt553 * 1709859847) {
					local107 = this.anInt553 * 1709859847;
				}
				local122 = local48 + arg0;
				if (local122 > this.anInt540 * -1807368365) {
					local122 = this.anInt540 * -1807368365;
				}
				local142 = this.anInt547 * 356365251 * local42 + local107;
				for (local144 = local107; local144 < local122; local144++) {
					local381 = this.anIntArray39[local142];
					local389 = local381 + arg3;
					local664 = (local381 & 0xFF00FF) + (arg3 & 0xFF00FF);
					local381 = (local389 - local664 & 0x10000) + (local664 & 0x1000100);
					this.anIntArray39[local142++] = local389 - local381 | local381 - (local381 >>> 8);
				}
				local42++;
				local56 -= local52-- + local52;
				local60 -= local52 + local52;
			}
			local48 = arg2;
			local52 = -local52;
			local60 = local46 + local52 * local52;
			local56 = local60 - arg2;
			local60 -= local52;
			while (local42 < local29) {
				while (local60 > local46 && local56 > local46) {
					local60 -= local48-- + local48;
					local56 -= local48 + local48;
				}
				local107 = arg0 - local48;
				if (local107 < this.anInt553 * 1709859847) {
					local107 = this.anInt553 * 1709859847;
				}
				local122 = local48 + arg0;
				if (local122 > this.anInt540 * -1807368365 - 1) {
					local122 = this.anInt540 * -1807368365 - 1;
				}
				local142 = local107 + this.anInt547 * 356365251 * local42;
				for (local144 = local107; local144 <= local122; local144++) {
					local381 = this.anIntArray39[local142];
					local389 = local381 + arg3;
					local664 = (arg3 & 0xFF00FF) + (local381 & 0xFF00FF);
					local381 = (local664 & 0x1000100) + (local389 - local664 & 0x10000);
					this.anIntArray39[local142++] = local389 - local381 | local381 - (local381 >>> 8);
				}
				local42++;
				local60 += local52 + local52;
				local56 += local52++ + local52;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!aeh", name = "ic", descriptor = "(IIIII)V", line = 555)
	@Override
	void method20361(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (this.anIntArray39 == null) {
			return;
		}
		if (arg2 < 0) {
			arg2 = -arg2;
		}
		@Pc(12) int local12 = arg1 - arg2;
		if (local12 < this.anInt541 * 9823353) {
			local12 = this.anInt541 * 9823353;
		}
		@Pc(29) int local29 = arg1 + arg2 + 1;
		if (local29 > this.anInt542 * 639238427) {
			local29 = this.anInt542 * 639238427;
		}
		@Pc(42) int local42 = local12;
		@Pc(46) int local46 = arg2 * arg2;
		@Pc(48) int local48 = 0;
		@Pc(52) int local52 = arg1 - local12;
		@Pc(56) int local56 = local52 * local52;
		@Pc(60) int local60 = local56 - local52;
		if (arg1 > local29) {
			arg1 = local29;
		}
		@Pc(69) int local69 = arg3 >>> 24;
		@Pc(107) int local107;
		@Pc(122) int local122;
		@Pc(142) int local142;
		@Pc(144) int local144;
		if (arg4 == 0 || arg4 == 1 && local69 == 255) {
			while (local42 < arg1) {
				while (local60 <= local46 || local56 <= local46) {
					local56 += local48 + local48;
					local60 += local48++ + local48;
				}
				local107 = arg0 - local48 + 1;
				if (local107 < this.anInt553 * 1709859847) {
					local107 = this.anInt553 * 1709859847;
				}
				local122 = local48 + arg0;
				if (local122 > this.anInt540 * -1807368365) {
					local122 = this.anInt540 * -1807368365;
				}
				local142 = local42 * 356365251 * this.anInt547 + local107;
				for (local144 = local107; local144 < local122; local144++) {
					this.anIntArray39[local142++] = arg3;
				}
				local42++;
				local56 -= local52-- + local52;
				local60 -= local52 + local52;
			}
			local48 = arg2;
			local52 = local42 - arg1;
			local60 = local46 + local52 * local52;
			local56 = local60 - arg2;
			local60 -= local52;
			while (local42 < local29) {
				while (local60 > local46 && local56 > local46) {
					local60 -= local48-- + local48;
					local56 -= local48 + local48;
				}
				local107 = arg0 - local48;
				if (local107 < this.anInt553 * 1709859847) {
					local107 = this.anInt553 * 1709859847;
				}
				local122 = local48 + arg0;
				if (local122 > this.anInt540 * -1807368365 - 1) {
					local122 = this.anInt540 * -1807368365 - 1;
				}
				local142 = local107 + this.anInt547 * 356365251 * local42;
				for (local144 = local107; local144 <= local122; local144++) {
					this.anIntArray39[local142++] = arg3;
				}
				local42++;
				local60 += local52 + local52;
				local56 += local52++ + local52;
			}
			return;
		}
		@Pc(381) int local381;
		@Pc(389) int local389;
		if (arg4 == 1) {
			@Pc(311) int local311 = (local69 << 24) + (local69 * (arg3 & 0xFF00FF) >> 8 & 0xFF00FF) + (local69 * (arg3 & 0xFF00) >> 8 & 0xFF00);
			local107 = 256 - local69;
			while (local42 < arg1) {
				while (local60 <= local46 || local56 <= local46) {
					local56 += local48 + local48;
					local60 += local48++ + local48;
				}
				local122 = arg0 - local48 + 1;
				if (local122 < this.anInt553 * 1709859847) {
					local122 = this.anInt553 * 1709859847;
				}
				local142 = local48 + arg0;
				if (local142 > this.anInt540 * -1807368365) {
					local142 = this.anInt540 * -1807368365;
				}
				local144 = local42 * this.anInt547 * 356365251 + local122;
				for (local381 = local122; local381 < local142; local381++) {
					local389 = this.anIntArray39[local144];
					@Pc(409) int local409 = (local107 * (local389 & 0xFF00) >> 8 & 0xFF00) + (local107 * (local389 & 0xFF00FF) >> 8 & 0xFF00FF);
					this.anIntArray39[local144++] = local409 + local311;
				}
				local42++;
				local56 -= local52-- + local52;
				local60 -= local52 + local52;
			}
			local48 = arg2;
			local52 = -local52;
			local60 = local46 + local52 * local52;
			local56 = local60 - arg2;
			local60 -= local52;
			while (local42 < local29) {
				while (local60 > local46 && local56 > local46) {
					local60 -= local48-- + local48;
					local56 -= local48 + local48;
				}
				local122 = arg0 - local48;
				if (local122 < this.anInt553 * 1709859847) {
					local122 = this.anInt553 * 1709859847;
				}
				local142 = local48 + arg0;
				if (local142 > this.anInt540 * -1807368365 - 1) {
					local142 = this.anInt540 * -1807368365 - 1;
				}
				local144 = local42 * this.anInt547 * 356365251 + local122;
				for (local381 = local122; local381 <= local142; local381++) {
					local389 = this.anIntArray39[local144];
					local389 = (local107 * (local389 & 0xFF00) >> 8 & 0xFF00) + ((local389 & 0xFF00FF) * local107 >> 8 & 0xFF00FF);
					this.anIntArray39[local144++] = local389 + local311;
				}
				local42++;
				local60 += local52 + local52;
				local56 += local52++ + local52;
			}
		} else if (arg4 == 2) {
			@Pc(664) int local664;
			while (local42 < arg1) {
				while (local60 <= local46 || local56 <= local46) {
					local56 += local48 + local48;
					local60 += local48++ + local48;
				}
				local107 = arg0 - local48 + 1;
				if (local107 < this.anInt553 * 1709859847) {
					local107 = this.anInt553 * 1709859847;
				}
				local122 = local48 + arg0;
				if (local122 > this.anInt540 * -1807368365) {
					local122 = this.anInt540 * -1807368365;
				}
				local142 = this.anInt547 * 356365251 * local42 + local107;
				for (local144 = local107; local144 < local122; local144++) {
					local381 = this.anIntArray39[local142];
					local389 = local381 + arg3;
					local664 = (local381 & 0xFF00FF) + (arg3 & 0xFF00FF);
					local381 = (local389 - local664 & 0x10000) + (local664 & 0x1000100);
					this.anIntArray39[local142++] = local389 - local381 | local381 - (local381 >>> 8);
				}
				local42++;
				local56 -= local52-- + local52;
				local60 -= local52 + local52;
			}
			local48 = arg2;
			local52 = -local52;
			local60 = local46 + local52 * local52;
			local56 = local60 - arg2;
			local60 -= local52;
			while (local42 < local29) {
				while (local60 > local46 && local56 > local46) {
					local60 -= local48-- + local48;
					local56 -= local48 + local48;
				}
				local107 = arg0 - local48;
				if (local107 < this.anInt553 * 1709859847) {
					local107 = this.anInt553 * 1709859847;
				}
				local122 = local48 + arg0;
				if (local122 > this.anInt540 * -1807368365 - 1) {
					local122 = this.anInt540 * -1807368365 - 1;
				}
				local142 = local107 + this.anInt547 * 356365251 * local42;
				for (local144 = local107; local144 <= local122; local144++) {
					local381 = this.anIntArray39[local142];
					local389 = local381 + arg3;
					local664 = (arg3 & 0xFF00FF) + (local381 & 0xFF00FF);
					local381 = (local664 & 0x1000100) + (local389 - local664 & 0x10000);
					this.anIntArray39[local142++] = local389 - local381 | local381 - (local381 >>> 8);
				}
				local42++;
				local60 += local52 + local52;
				local56 += local52++ + local52;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!aeh", name = "br", descriptor = "(IIIII)V", line = 706)
	@Override
	void method20057(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (this.anIntArray39 == null || (arg1 < this.anInt541 * 9823353 || arg1 >= this.anInt542 * 639238427)) {
			return;
		}
		if (arg0 < this.anInt553 * 1709859847) {
			arg2 -= this.anInt553 * 1709859847 - arg0;
			arg0 = this.anInt553 * 1709859847;
		}
		if (arg0 + arg2 > this.anInt540 * -1807368365) {
			arg2 = this.anInt540 * -1807368365 - arg0;
		}
		@Pc(61) int local61 = arg0 + arg1 * 356365251 * this.anInt547;
		@Pc(65) int local65 = arg3 >>> 24;
		@Pc(75) int local75;
		if (arg4 == 0 || arg4 == 1 && local65 == 255) {
			for (local75 = 0; local75 < arg2; local75++) {
				this.anIntArray39[local75 + local61] = arg3;
			}
			return;
		}
		@Pc(121) int local121;
		@Pc(131) int local131;
		if (arg4 == 1) {
			@Pc(115) int local115 = (local65 << 24) + (local65 * (arg3 & 0xFF00) >> 8 & 0xFF00) + (local65 * (arg3 & 0xFF00FF) >> 8 & 0xFF00FF);
			local75 = 256 - local65;
			for (local121 = 0; local121 < arg2; local121++) {
				local131 = this.anIntArray39[local61 + local121];
				@Pc(151) int local151 = (local75 * (local131 & 0xFF00FF) >> 8 & 0xFF00FF) + ((local131 & 0xFF00) * local75 >> 8 & 0xFF00);
				this.anIntArray39[local121 + local61] = local115 + local151;
			}
		} else if (arg4 == 2) {
			for (local75 = 0; local75 < arg2; local75++) {
				local121 = this.anIntArray39[local61 + local75];
				local131 = local121 + arg3;
				@Pc(190) int local190 = (local121 & 0xFF00FF) + (arg3 & 0xFF00FF);
				local121 = (local131 - local190 & 0x10000) + (local190 & 0x1000100);
				this.anIntArray39[local75 + local61] = local131 - local121 | local121 - (local121 >>> 8);
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!aeh", name = "iu", descriptor = "(IIIII)V", line = 706)
	@Override
	void method20345(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (this.anIntArray39 == null || (arg1 < this.anInt541 * 9823353 || arg1 >= this.anInt542 * 639238427)) {
			return;
		}
		if (arg0 < this.anInt553 * 1709859847) {
			arg2 -= this.anInt553 * 1709859847 - arg0;
			arg0 = this.anInt553 * 1709859847;
		}
		if (arg0 + arg2 > this.anInt540 * -1807368365) {
			arg2 = this.anInt540 * -1807368365 - arg0;
		}
		@Pc(61) int local61 = arg0 + arg1 * 356365251 * this.anInt547;
		@Pc(65) int local65 = arg3 >>> 24;
		@Pc(75) int local75;
		if (arg4 == 0 || arg4 == 1 && local65 == 255) {
			for (local75 = 0; local75 < arg2; local75++) {
				this.anIntArray39[local75 + local61] = arg3;
			}
			return;
		}
		@Pc(121) int local121;
		@Pc(131) int local131;
		if (arg4 == 1) {
			@Pc(115) int local115 = (local65 << 24) + (local65 * (arg3 & 0xFF00) >> 8 & 0xFF00) + (local65 * (arg3 & 0xFF00FF) >> 8 & 0xFF00FF);
			local75 = 256 - local65;
			for (local121 = 0; local121 < arg2; local121++) {
				local131 = this.anIntArray39[local61 + local121];
				@Pc(151) int local151 = (local75 * (local131 & 0xFF00FF) >> 8 & 0xFF00FF) + ((local131 & 0xFF00) * local75 >> 8 & 0xFF00);
				this.anIntArray39[local121 + local61] = local115 + local151;
			}
		} else if (arg4 == 2) {
			for (local75 = 0; local75 < arg2; local75++) {
				local121 = this.anIntArray39[local61 + local75];
				local131 = local121 + arg3;
				@Pc(190) int local190 = (local121 & 0xFF00FF) + (arg3 & 0xFF00FF);
				local121 = (local131 - local190 & 0x10000) + (local190 & 0x1000100);
				this.anIntArray39[local75 + local61] = local131 - local121 | local121 - (local121 >>> 8);
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!aeh", name = "rl", descriptor = "(IIIIIIII)V", line = 740)
	void method4872(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (this.anIntArray39 == null || (arg1 < this.anInt541 * 9823353 || arg1 >= this.anInt542 * 639238427)) {
			return;
		}
		@Pc(25) int local25 = arg1 * 356365251 * this.anInt547 + arg0;
		@Pc(29) int local29 = arg3 >>> 24;
		@Pc(33) int local33 = arg6 + arg5;
		@Pc(37) int local37 = arg7 % local33;
		@Pc(47) int local47;
		if (arg4 == 0 || arg4 == 1 && local29 == 255) {
			local47 = 0;
			while (local47 < arg2) {
				if (local47 + arg0 >= this.anInt553 * 1709859847 && local47 + arg0 < this.anInt540 * -1807368365 && local37 < arg5) {
					this.anIntArray39[local47 + local25] = arg3;
				}
				local47++;
				local37++;
				local37 %= local33;
			}
			return;
		}
		@Pc(117) int local117;
		@Pc(146) int local146;
		if (arg4 == 1) {
			@Pc(111) int local111 = ((arg3 & 0xFF00) * local29 >> 8 & 0xFF00) + (local29 * (arg3 & 0xFF00FF) >> 8 & 0xFF00FF) + (local29 << 24);
			local47 = 256 - local29;
			local117 = 0;
			while (local117 < arg2) {
				if (arg0 + local117 >= this.anInt553 * 1709859847 && local117 + arg0 < this.anInt540 * -1807368365 && local37 < arg5) {
					local146 = this.anIntArray39[local117 + local25];
					@Pc(166) int local166 = (local47 * (local146 & 0xFF00FF) >> 8 & 0xFF00FF) + (local47 * (local146 & 0xFF00) >> 8 & 0xFF00);
					this.anIntArray39[local117 + local25] = local111 + local166;
				}
				local117++;
				local37++;
				local37 %= local33;
			}
		} else if (arg4 == 2) {
			local47 = 0;
			while (local47 < arg2) {
				if (arg0 + local47 >= this.anInt553 * 1709859847 && arg0 + local47 < this.anInt540 * -1807368365 && local37 < arg5) {
					local117 = this.anIntArray39[local47 + local25];
					local146 = arg3 + local117;
					@Pc(229) int local229 = (local117 & 0xFF00FF) + (arg3 & 0xFF00FF);
					local117 = (local229 & 0x1000100) + (local146 - local229 & 0x10000);
					this.anIntArray39[local25 + local47] = local146 - local117 | local117 - (local117 >>> 8);
				}
				local47++;
				local37++;
				local37 %= local33;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!aeh", name = "sr", descriptor = "(IIIIIIII)V", line = 740)
	void method4873(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (this.anIntArray39 == null || (arg1 < this.anInt541 * 9823353 || arg1 >= this.anInt542 * 639238427)) {
			return;
		}
		@Pc(25) int local25 = arg1 * 356365251 * this.anInt547 + arg0;
		@Pc(29) int local29 = arg3 >>> 24;
		@Pc(33) int local33 = arg6 + arg5;
		@Pc(37) int local37 = arg7 % local33;
		@Pc(47) int local47;
		if (arg4 == 0 || arg4 == 1 && local29 == 255) {
			local47 = 0;
			while (local47 < arg2) {
				if (local47 + arg0 >= this.anInt553 * 1709859847 && local47 + arg0 < this.anInt540 * -1807368365 && local37 < arg5) {
					this.anIntArray39[local47 + local25] = arg3;
				}
				local47++;
				local37++;
				local37 %= local33;
			}
			return;
		}
		@Pc(117) int local117;
		@Pc(146) int local146;
		if (arg4 == 1) {
			@Pc(111) int local111 = ((arg3 & 0xFF00) * local29 >> 8 & 0xFF00) + (local29 * (arg3 & 0xFF00FF) >> 8 & 0xFF00FF) + (local29 << 24);
			local47 = 256 - local29;
			local117 = 0;
			while (local117 < arg2) {
				if (arg0 + local117 >= this.anInt553 * 1709859847 && local117 + arg0 < this.anInt540 * -1807368365 && local37 < arg5) {
					local146 = this.anIntArray39[local117 + local25];
					@Pc(166) int local166 = (local47 * (local146 & 0xFF00FF) >> 8 & 0xFF00FF) + (local47 * (local146 & 0xFF00) >> 8 & 0xFF00);
					this.anIntArray39[local117 + local25] = local111 + local166;
				}
				local117++;
				local37++;
				local37 %= local33;
			}
		} else if (arg4 == 2) {
			local47 = 0;
			while (local47 < arg2) {
				if (arg0 + local47 >= this.anInt553 * 1709859847 && arg0 + local47 < this.anInt540 * -1807368365 && local37 < arg5) {
					local117 = this.anIntArray39[local47 + local25];
					local146 = arg3 + local117;
					@Pc(229) int local229 = (local117 & 0xFF00FF) + (arg3 & 0xFF00FF);
					local117 = (local229 & 0x1000100) + (local146 - local229 & 0x10000);
					this.anIntArray39[local25 + local47] = local146 - local117 | local117 - (local117 >>> 8);
				}
				local47++;
				local37++;
				local37 %= local33;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!aeh", name = "bq", descriptor = "(IIIII)V", line = 777)
	@Override
	void method20377(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (this.anIntArray39 == null || (arg0 < this.anInt553 * 1709859847 || arg0 >= this.anInt540 * -1807368365)) {
			return;
		}
		if (arg1 < this.anInt541 * 9823353) {
			arg2 -= this.anInt541 * 9823353 - arg1;
			arg1 = this.anInt541 * 9823353;
		}
		if (arg2 + arg1 > this.anInt542 * 639238427) {
			arg2 = this.anInt542 * 639238427 - arg1;
		}
		@Pc(61) int local61 = this.anInt547 * 356365251 * arg1 + arg0;
		@Pc(65) int local65 = arg3 >>> 24;
		@Pc(76) int local76;
		if (arg4 == 0 || arg4 == 1 && local65 == 255) {
			for (local76 = 0; local76 < arg2; local76++) {
				this.anIntArray39[local61 + this.anInt547 * 356365251 * local76] = arg3;
			}
			return;
		}
		@Pc(127) int local127;
		@Pc(139) int local139;
		@Pc(144) int local144;
		if (arg4 == 1) {
			@Pc(121) int local121 = (local65 * (arg3 & 0xFF00) >> 8 & 0xFF00) + (local65 * (arg3 & 0xFF00FF) >> 8 & 0xFF00FF) + (local65 << 24);
			local76 = 256 - local65;
			for (local127 = 0; local127 < arg2; local127++) {
				local139 = local127 * this.anInt547 * 356365251 + local61;
				local144 = this.anIntArray39[local139];
				@Pc(164) int local164 = (local76 * (local144 & 0xFF00FF) >> 8 & 0xFF00FF) + (local76 * (local144 & 0xFF00) >> 8 & 0xFF00);
				this.anIntArray39[local139] = local164 + local121;
			}
		} else if (arg4 == 2) {
			for (local76 = 0; local76 < arg2; local76++) {
				local127 = local61 + local76 * this.anInt547 * 356365251;
				local139 = this.anIntArray39[local127];
				local144 = arg3 + local139;
				@Pc(208) int local208 = (arg3 & 0xFF00FF) + (local139 & 0xFF00FF);
				local139 = (local144 - local208 & 0x10000) + (local208 & 0x1000100);
				this.anIntArray39[local127] = local144 - local139 | local139 - (local139 >>> 8);
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!aeh", name = "is", descriptor = "(IIIII)V", line = 777)
	@Override
	void method20155(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (this.anIntArray39 == null || (arg0 < this.anInt553 * 1709859847 || arg0 >= this.anInt540 * -1807368365)) {
			return;
		}
		if (arg1 < this.anInt541 * 9823353) {
			arg2 -= this.anInt541 * 9823353 - arg1;
			arg1 = this.anInt541 * 9823353;
		}
		if (arg2 + arg1 > this.anInt542 * 639238427) {
			arg2 = this.anInt542 * 639238427 - arg1;
		}
		@Pc(61) int local61 = this.anInt547 * 356365251 * arg1 + arg0;
		@Pc(65) int local65 = arg3 >>> 24;
		@Pc(76) int local76;
		if (arg4 == 0 || arg4 == 1 && local65 == 255) {
			for (local76 = 0; local76 < arg2; local76++) {
				this.anIntArray39[local61 + this.anInt547 * 356365251 * local76] = arg3;
			}
			return;
		}
		@Pc(127) int local127;
		@Pc(139) int local139;
		@Pc(144) int local144;
		if (arg4 == 1) {
			@Pc(121) int local121 = (local65 * (arg3 & 0xFF00) >> 8 & 0xFF00) + (local65 * (arg3 & 0xFF00FF) >> 8 & 0xFF00FF) + (local65 << 24);
			local76 = 256 - local65;
			for (local127 = 0; local127 < arg2; local127++) {
				local139 = local127 * this.anInt547 * 356365251 + local61;
				local144 = this.anIntArray39[local139];
				@Pc(164) int local164 = (local76 * (local144 & 0xFF00FF) >> 8 & 0xFF00FF) + (local76 * (local144 & 0xFF00) >> 8 & 0xFF00);
				this.anIntArray39[local139] = local164 + local121;
			}
		} else if (arg4 == 2) {
			for (local76 = 0; local76 < arg2; local76++) {
				local127 = local61 + local76 * this.anInt547 * 356365251;
				local139 = this.anIntArray39[local127];
				local144 = arg3 + local139;
				@Pc(208) int local208 = (arg3 & 0xFF00FF) + (local139 & 0xFF00FF);
				local139 = (local144 - local208 & 0x10000) + (local208 & 0x1000100);
				this.anIntArray39[local127] = local144 - local139 | local139 - (local139 >>> 8);
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!aeh", name = "ra", descriptor = "(IIIIIIII)V", line = 813)
	void method4874(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (this.anIntArray39 == null || (arg0 < this.anInt553 * 1709859847 || arg0 >= this.anInt540 * -1807368365)) {
			return;
		}
		@Pc(25) int local25 = arg1 * 356365251 * this.anInt547 + arg0;
		@Pc(29) int local29 = arg3 >>> 24;
		@Pc(33) int local33 = arg5 + arg6;
		@Pc(37) int local37 = arg7 % local33;
		@Pc(48) int local48;
		if (arg4 == 0 || arg4 == 1 && local29 == 255) {
			local48 = 0;
			while (local48 < arg2) {
				if (local48 + arg1 >= this.anInt541 * 9823353 && local48 + arg1 < this.anInt542 * 639238427 && local37 < arg5) {
					this.anIntArray39[local48 * 356365251 * this.anInt547 + local25] = arg3;
				}
				local48++;
				local37++;
				local37 %= local33;
			}
			return;
		}
		@Pc(123) int local123;
		@Pc(154) int local154;
		@Pc(159) int local159;
		if (arg4 == 1) {
			@Pc(117) int local117 = ((arg3 & 0xFF00) * local29 >> 8 & 0xFF00) + ((arg3 & 0xFF00FF) * local29 >> 8 & 0xFF00FF) + (local29 << 24);
			local48 = 256 - local29;
			local123 = 0;
			while (local123 < arg2) {
				if (arg1 + local123 >= this.anInt541 * 9823353 && arg1 + local123 < this.anInt542 * 639238427 && local37 < arg5) {
					local154 = local123 * 356365251 * this.anInt547 + local25;
					local159 = this.anIntArray39[local154];
					@Pc(179) int local179 = (local48 * (local159 & 0xFF00) >> 8 & 0xFF00) + (local48 * (local159 & 0xFF00FF) >> 8 & 0xFF00FF);
					this.anIntArray39[local154] = local179 + local117;
				}
				local123++;
				local37++;
				local37 %= local33;
			}
		} else if (arg4 == 2) {
			local48 = 0;
			while (local48 < arg2) {
				if (arg1 + local48 >= this.anInt541 * 9823353 && local48 + arg1 < this.anInt542 * 639238427 && local37 < arg5) {
					local123 = this.anInt547 * 356365251 * local48 + local25;
					local154 = this.anIntArray39[local123];
					local159 = arg3 + local154;
					@Pc(247) int local247 = (local154 & 0xFF00FF) + (arg3 & 0xFF00FF);
					local154 = (local159 - local247 & 0x10000) + (local247 & 0x1000100);
					this.anIntArray39[local123] = local159 - local154 | local154 - (local154 >>> 8);
				}
				local48++;
				local37++;
				local37 %= local33;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!aeh", name = "sk", descriptor = "(IIIIIIII)V", line = 813)
	void method4875(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (this.anIntArray39 == null || (arg0 < this.anInt553 * 1709859847 || arg0 >= this.anInt540 * -1807368365)) {
			return;
		}
		@Pc(25) int local25 = arg1 * 356365251 * this.anInt547 + arg0;
		@Pc(29) int local29 = arg3 >>> 24;
		@Pc(33) int local33 = arg5 + arg6;
		@Pc(37) int local37 = arg7 % local33;
		@Pc(48) int local48;
		if (arg4 == 0 || arg4 == 1 && local29 == 255) {
			local48 = 0;
			while (local48 < arg2) {
				if (local48 + arg1 >= this.anInt541 * 9823353 && local48 + arg1 < this.anInt542 * 639238427 && local37 < arg5) {
					this.anIntArray39[local48 * 356365251 * this.anInt547 + local25] = arg3;
				}
				local48++;
				local37++;
				local37 %= local33;
			}
			return;
		}
		@Pc(123) int local123;
		@Pc(154) int local154;
		@Pc(159) int local159;
		if (arg4 == 1) {
			@Pc(117) int local117 = ((arg3 & 0xFF00) * local29 >> 8 & 0xFF00) + ((arg3 & 0xFF00FF) * local29 >> 8 & 0xFF00FF) + (local29 << 24);
			local48 = 256 - local29;
			local123 = 0;
			while (local123 < arg2) {
				if (arg1 + local123 >= this.anInt541 * 9823353 && arg1 + local123 < this.anInt542 * 639238427 && local37 < arg5) {
					local154 = local123 * 356365251 * this.anInt547 + local25;
					local159 = this.anIntArray39[local154];
					@Pc(179) int local179 = (local48 * (local159 & 0xFF00) >> 8 & 0xFF00) + (local48 * (local159 & 0xFF00FF) >> 8 & 0xFF00FF);
					this.anIntArray39[local154] = local179 + local117;
				}
				local123++;
				local37++;
				local37 %= local33;
			}
		} else if (arg4 == 2) {
			local48 = 0;
			while (local48 < arg2) {
				if (arg1 + local48 >= this.anInt541 * 9823353 && local48 + arg1 < this.anInt542 * 639238427 && local37 < arg5) {
					local123 = this.anInt547 * 356365251 * local48 + local25;
					local154 = this.anIntArray39[local123];
					local159 = arg3 + local154;
					@Pc(247) int local247 = (local154 & 0xFF00FF) + (arg3 & 0xFF00FF);
					local154 = (local159 - local247 & 0x10000) + (local247 & 0x1000100);
					this.anIntArray39[local123] = local159 - local154 | local154 - (local154 >>> 8);
				}
				local48++;
				local37++;
				local37 %= local33;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!aeh", name = "su", descriptor = "(IIIIIIII)V", line = 813)
	void method4876(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (this.anIntArray39 == null || (arg0 < this.anInt553 * 1709859847 || arg0 >= this.anInt540 * -1807368365)) {
			return;
		}
		@Pc(25) int local25 = arg1 * 356365251 * this.anInt547 + arg0;
		@Pc(29) int local29 = arg3 >>> 24;
		@Pc(33) int local33 = arg5 + arg6;
		@Pc(37) int local37 = arg7 % local33;
		@Pc(48) int local48;
		if (arg4 == 0 || arg4 == 1 && local29 == 255) {
			local48 = 0;
			while (local48 < arg2) {
				if (local48 + arg1 >= this.anInt541 * 9823353 && local48 + arg1 < this.anInt542 * 639238427 && local37 < arg5) {
					this.anIntArray39[local48 * 356365251 * this.anInt547 + local25] = arg3;
				}
				local48++;
				local37++;
				local37 %= local33;
			}
			return;
		}
		@Pc(123) int local123;
		@Pc(154) int local154;
		@Pc(159) int local159;
		if (arg4 == 1) {
			@Pc(117) int local117 = ((arg3 & 0xFF00) * local29 >> 8 & 0xFF00) + ((arg3 & 0xFF00FF) * local29 >> 8 & 0xFF00FF) + (local29 << 24);
			local48 = 256 - local29;
			local123 = 0;
			while (local123 < arg2) {
				if (arg1 + local123 >= this.anInt541 * 9823353 && arg1 + local123 < this.anInt542 * 639238427 && local37 < arg5) {
					local154 = local123 * 356365251 * this.anInt547 + local25;
					local159 = this.anIntArray39[local154];
					@Pc(179) int local179 = (local48 * (local159 & 0xFF00) >> 8 & 0xFF00) + (local48 * (local159 & 0xFF00FF) >> 8 & 0xFF00FF);
					this.anIntArray39[local154] = local179 + local117;
				}
				local123++;
				local37++;
				local37 %= local33;
			}
		} else if (arg4 == 2) {
			local48 = 0;
			while (local48 < arg2) {
				if (arg1 + local48 >= this.anInt541 * 9823353 && local48 + arg1 < this.anInt542 * 639238427 && local37 < arg5) {
					local123 = this.anInt547 * 356365251 * local48 + local25;
					local154 = this.anIntArray39[local123];
					local159 = arg3 + local154;
					@Pc(247) int local247 = (local154 & 0xFF00FF) + (arg3 & 0xFF00FF);
					local154 = (local159 - local247 & 0x10000) + (local247 & 0x1000100);
					this.anIntArray39[local123] = local159 - local154 | local154 - (local154 >>> 8);
				}
				local48++;
				local37++;
				local37 %= local33;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!aeh", name = "sc", descriptor = "(IIIIIIII)V", line = 813)
	void method4877(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (this.anIntArray39 == null || (arg0 < this.anInt553 * 1709859847 || arg0 >= this.anInt540 * -1807368365)) {
			return;
		}
		@Pc(25) int local25 = arg1 * 356365251 * this.anInt547 + arg0;
		@Pc(29) int local29 = arg3 >>> 24;
		@Pc(33) int local33 = arg5 + arg6;
		@Pc(37) int local37 = arg7 % local33;
		@Pc(48) int local48;
		if (arg4 == 0 || arg4 == 1 && local29 == 255) {
			local48 = 0;
			while (local48 < arg2) {
				if (local48 + arg1 >= this.anInt541 * 9823353 && local48 + arg1 < this.anInt542 * 639238427 && local37 < arg5) {
					this.anIntArray39[local48 * 356365251 * this.anInt547 + local25] = arg3;
				}
				local48++;
				local37++;
				local37 %= local33;
			}
			return;
		}
		@Pc(123) int local123;
		@Pc(154) int local154;
		@Pc(159) int local159;
		if (arg4 == 1) {
			@Pc(117) int local117 = ((arg3 & 0xFF00) * local29 >> 8 & 0xFF00) + ((arg3 & 0xFF00FF) * local29 >> 8 & 0xFF00FF) + (local29 << 24);
			local48 = 256 - local29;
			local123 = 0;
			while (local123 < arg2) {
				if (arg1 + local123 >= this.anInt541 * 9823353 && arg1 + local123 < this.anInt542 * 639238427 && local37 < arg5) {
					local154 = local123 * 356365251 * this.anInt547 + local25;
					local159 = this.anIntArray39[local154];
					@Pc(179) int local179 = (local48 * (local159 & 0xFF00) >> 8 & 0xFF00) + (local48 * (local159 & 0xFF00FF) >> 8 & 0xFF00FF);
					this.anIntArray39[local154] = local179 + local117;
				}
				local123++;
				local37++;
				local37 %= local33;
			}
		} else if (arg4 == 2) {
			local48 = 0;
			while (local48 < arg2) {
				if (arg1 + local48 >= this.anInt541 * 9823353 && local48 + arg1 < this.anInt542 * 639238427 && local37 < arg5) {
					local123 = this.anInt547 * 356365251 * local48 + local25;
					local154 = this.anIntArray39[local123];
					local159 = arg3 + local154;
					@Pc(247) int local247 = (local154 & 0xFF00FF) + (arg3 & 0xFF00FF);
					local154 = (local159 - local247 & 0x10000) + (local247 & 0x1000100);
					this.anIntArray39[local123] = local159 - local154 | local154 - (local154 >>> 8);
				}
				local48++;
				local37++;
				local37 %= local33;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!aeh", name = "th", descriptor = "(IIIIIIII)V", line = 813)
	void method4878(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (this.anIntArray39 == null || (arg0 < this.anInt553 * 1709859847 || arg0 >= this.anInt540 * -1807368365)) {
			return;
		}
		@Pc(25) int local25 = arg1 * 356365251 * this.anInt547 + arg0;
		@Pc(29) int local29 = arg3 >>> 24;
		@Pc(33) int local33 = arg5 + arg6;
		@Pc(37) int local37 = arg7 % local33;
		@Pc(48) int local48;
		if (arg4 == 0 || arg4 == 1 && local29 == 255) {
			local48 = 0;
			while (local48 < arg2) {
				if (local48 + arg1 >= this.anInt541 * 9823353 && local48 + arg1 < this.anInt542 * 639238427 && local37 < arg5) {
					this.anIntArray39[local48 * 356365251 * this.anInt547 + local25] = arg3;
				}
				local48++;
				local37++;
				local37 %= local33;
			}
			return;
		}
		@Pc(123) int local123;
		@Pc(154) int local154;
		@Pc(159) int local159;
		if (arg4 == 1) {
			@Pc(117) int local117 = ((arg3 & 0xFF00) * local29 >> 8 & 0xFF00) + ((arg3 & 0xFF00FF) * local29 >> 8 & 0xFF00FF) + (local29 << 24);
			local48 = 256 - local29;
			local123 = 0;
			while (local123 < arg2) {
				if (arg1 + local123 >= this.anInt541 * 9823353 && arg1 + local123 < this.anInt542 * 639238427 && local37 < arg5) {
					local154 = local123 * 356365251 * this.anInt547 + local25;
					local159 = this.anIntArray39[local154];
					@Pc(179) int local179 = (local48 * (local159 & 0xFF00) >> 8 & 0xFF00) + (local48 * (local159 & 0xFF00FF) >> 8 & 0xFF00FF);
					this.anIntArray39[local154] = local179 + local117;
				}
				local123++;
				local37++;
				local37 %= local33;
			}
		} else if (arg4 == 2) {
			local48 = 0;
			while (local48 < arg2) {
				if (arg1 + local48 >= this.anInt541 * 9823353 && local48 + arg1 < this.anInt542 * 639238427 && local37 < arg5) {
					local123 = this.anInt547 * 356365251 * local48 + local25;
					local154 = this.anIntArray39[local123];
					local159 = arg3 + local154;
					@Pc(247) int local247 = (local154 & 0xFF00FF) + (arg3 & 0xFF00FF);
					local154 = (local159 - local247 & 0x10000) + (local247 & 0x1000100);
					this.anIntArray39[local123] = local159 - local154 | local154 - (local154 >>> 8);
				}
				local48++;
				local37++;
				local37 %= local33;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!aeh", name = "ti", descriptor = "(IIIIIIII)V", line = 813)
	void method4879(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (this.anIntArray39 == null || (arg0 < this.anInt553 * 1709859847 || arg0 >= this.anInt540 * -1807368365)) {
			return;
		}
		@Pc(25) int local25 = arg1 * 356365251 * this.anInt547 + arg0;
		@Pc(29) int local29 = arg3 >>> 24;
		@Pc(33) int local33 = arg5 + arg6;
		@Pc(37) int local37 = arg7 % local33;
		@Pc(48) int local48;
		if (arg4 == 0 || arg4 == 1 && local29 == 255) {
			local48 = 0;
			while (local48 < arg2) {
				if (local48 + arg1 >= this.anInt541 * 9823353 && local48 + arg1 < this.anInt542 * 639238427 && local37 < arg5) {
					this.anIntArray39[local48 * 356365251 * this.anInt547 + local25] = arg3;
				}
				local48++;
				local37++;
				local37 %= local33;
			}
			return;
		}
		@Pc(123) int local123;
		@Pc(154) int local154;
		@Pc(159) int local159;
		if (arg4 == 1) {
			@Pc(117) int local117 = ((arg3 & 0xFF00) * local29 >> 8 & 0xFF00) + ((arg3 & 0xFF00FF) * local29 >> 8 & 0xFF00FF) + (local29 << 24);
			local48 = 256 - local29;
			local123 = 0;
			while (local123 < arg2) {
				if (arg1 + local123 >= this.anInt541 * 9823353 && arg1 + local123 < this.anInt542 * 639238427 && local37 < arg5) {
					local154 = local123 * 356365251 * this.anInt547 + local25;
					local159 = this.anIntArray39[local154];
					@Pc(179) int local179 = (local48 * (local159 & 0xFF00) >> 8 & 0xFF00) + (local48 * (local159 & 0xFF00FF) >> 8 & 0xFF00FF);
					this.anIntArray39[local154] = local179 + local117;
				}
				local123++;
				local37++;
				local37 %= local33;
			}
		} else if (arg4 == 2) {
			local48 = 0;
			while (local48 < arg2) {
				if (arg1 + local48 >= this.anInt541 * 9823353 && local48 + arg1 < this.anInt542 * 639238427 && local37 < arg5) {
					local123 = this.anInt547 * 356365251 * local48 + local25;
					local154 = this.anIntArray39[local123];
					local159 = arg3 + local154;
					@Pc(247) int local247 = (local154 & 0xFF00FF) + (arg3 & 0xFF00FF);
					local154 = (local159 - local247 & 0x10000) + (local247 & 0x1000100);
					this.anIntArray39[local123] = local159 - local154 | local154 - (local154 >>> 8);
				}
				local48++;
				local37++;
				local37 %= local33;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!aeh", name = "bh", descriptor = "(IIIIII)V", line = 854)
	@Override
	public void method20092(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (this.anIntArray39 == null) {
			return;
		}
		arg2 -= arg0;
		arg3 -= arg1;
		if (arg3 == 0) {
			if (arg2 >= 0) {
				this.method20057(arg0, arg1, arg2 + 1, arg4, arg5);
			} else {
				this.method20057(arg2 + arg0, arg1, -arg2 + 1, arg4, arg5);
			}
		} else if (arg2 != 0) {
			if (arg3 + arg2 < 0) {
				arg0 += arg2;
				arg2 = -arg2;
				arg1 += arg3;
				arg3 = -arg3;
			}
			@Pc(108) int local108;
			@Pc(151) int local151;
			@Pc(166) int local166;
			@Pc(234) int local234;
			@Pc(255) int local255;
			@Pc(260) int local260;
			@Pc(342) int local342;
			@Pc(223) int local223;
			if (arg2 > arg3) {
				arg1 <<= 0x10;
				arg1 += 32768;
				@Pc(98) int local98 = arg3 << 16;
				local108 = (int) Math.floor((double) local98 / (double) arg2 + 0.5D);
				arg2 += arg0;
				if (arg0 < this.anInt553 * 1709859847) {
					arg1 += (this.anInt553 * 1709859847 - arg0) * local108;
					arg0 = this.anInt553 * 1709859847;
				}
				if (arg2 >= this.anInt540 * -1807368365) {
					arg2 = this.anInt540 * -1807368365 - 1;
				}
				local151 = arg4 >>> 24;
				if (arg5 == 0 || arg5 == 1 && local151 == 255) {
					while (arg0 <= arg2) {
						local166 = arg1 >> 16;
						if (local166 >= this.anInt541 * 9823353 && local166 < this.anInt542 * 639238427) {
							this.anIntArray39[arg0 + local166 * this.anInt547 * 356365251] = arg4;
						}
						arg1 += local108;
						arg0++;
					}
				} else if (arg5 == 1) {
					local223 = (local151 << 24) + (local151 * (arg4 & 0xFF00) >> 8 & 0xFF00) + ((arg4 & 0xFF00FF) * local151 >> 8 & 0xFF00FF);
					local166 = 256 - local151;
					while (arg0 <= arg2) {
						local234 = arg1 >> 16;
						if (local234 >= this.anInt541 * 9823353 && local234 < this.anInt542 * 639238427) {
							local255 = this.anInt547 * 356365251 * local234 + arg0;
							local260 = this.anIntArray39[local255];
							@Pc(280) int local280 = (local166 * (local260 & 0xFF00) >> 8 & 0xFF00) + ((local260 & 0xFF00FF) * local166 >> 8 & 0xFF00FF);
							this.anIntArray39[local255] = local223 + local280;
						}
						arg1 += local108;
						arg0++;
					}
				} else if (arg5 == 2) {
					while (arg0 <= arg2) {
						local166 = arg1 >> 16;
						if (local166 >= this.anInt541 * 9823353 && local166 < this.anInt542 * 639238427) {
							local234 = local166 * this.anInt547 * 356365251 + arg0;
							local255 = this.anIntArray39[local234];
							local260 = local255 + arg4;
							local342 = (local255 & 0xFF00FF) + (arg4 & 0xFF00FF);
							local255 = (local260 - local342 & 0x10000) + (local342 & 0x1000100);
							this.anIntArray39[local234] = local260 - local255 | local255 - (local255 >>> 8);
						}
						arg1 += local108;
						arg0++;
					}
				} else {
					throw new IllegalArgumentException();
				}
			} else {
				arg0 <<= 0x10;
				arg0 += 32768;
				@Pc(388) int local388 = arg2 << 16;
				local108 = (int) Math.floor((double) local388 / (double) arg3 + 0.5D);
				arg3 += arg1;
				if (arg1 < this.anInt541 * 9823353) {
					arg0 += (this.anInt541 * 9823353 - arg1) * local108;
					arg1 = this.anInt541 * 9823353;
				}
				if (arg3 >= this.anInt542 * 639238427) {
					arg3 = this.anInt542 * 639238427 - 1;
				}
				local151 = arg4 >>> 24;
				if (arg5 == 0 || arg5 == 1 && local151 == 255) {
					while (arg1 <= arg3) {
						local166 = arg0 >> 16;
						if (local166 >= this.anInt553 * 1709859847 && local166 < this.anInt540 * -1807368365) {
							this.anIntArray39[local166 + this.anInt547 * 356365251 * arg1] = arg4;
						}
						arg0 += local108;
						arg1++;
					}
				} else if (arg5 == 1) {
					local223 = ((arg4 & 0xFF00FF) * local151 >> 8 & 0xFF00FF) + (local151 * (arg4 & 0xFF00) >> 8 & 0xFF00) + (local151 << 24);
					local166 = 256 - local151;
					while (arg1 <= arg3) {
						local234 = arg0 >> 16;
						if (local234 >= this.anInt553 * 1709859847 && local234 < this.anInt540 * -1807368365) {
							local255 = local234 + arg1 * this.anInt547 * 356365251;
							local260 = this.anIntArray39[local255];
							local260 = (local166 * (local260 & 0xFF00) >> 8 & 0xFF00) + ((local260 & 0xFF00FF) * local166 >> 8 & 0xFF00FF);
							this.anIntArray39[local234 + arg1 * 356365251 * this.anInt547] = local223 + local260;
						}
						arg0 += local108;
						arg1++;
					}
				} else if (arg5 == 2) {
					while (arg1 <= arg3) {
						local166 = arg0 >> 16;
						if (local166 >= this.anInt553 * 1709859847 && local166 < this.anInt540 * -1807368365) {
							local234 = this.anInt547 * 356365251 * arg1 + local166;
							local255 = this.anIntArray39[local234];
							local260 = arg4 + local255;
							local342 = (arg4 & 0xFF00FF) + (local255 & 0xFF00FF);
							local255 = (local342 & 0x1000100) + (local260 - local342 & 0x10000);
							this.anIntArray39[local234] = local260 - local255 | local255 - (local255 >>> 8);
						}
						arg0 += local108;
						arg1++;
					}
				} else {
					throw new IllegalArgumentException();
				}
			}
		} else if (arg3 >= 0) {
			this.method20377(arg0, arg1, arg3 + 1, arg4, arg5);
		} else {
			this.method20377(arg0, arg3 + arg1, -arg3 + 1, arg4, arg5);
		}
	}

	@OriginalMember(owner = "client!aeh", name = "ix", descriptor = "(IIIIII)V", line = 854)
	@Override
	public void method20236(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (this.anIntArray39 == null) {
			return;
		}
		arg2 -= arg0;
		arg3 -= arg1;
		if (arg3 == 0) {
			if (arg2 >= 0) {
				this.method20057(arg0, arg1, arg2 + 1, arg4, arg5);
			} else {
				this.method20057(arg2 + arg0, arg1, -arg2 + 1, arg4, arg5);
			}
		} else if (arg2 != 0) {
			if (arg3 + arg2 < 0) {
				arg0 += arg2;
				arg2 = -arg2;
				arg1 += arg3;
				arg3 = -arg3;
			}
			@Pc(108) int local108;
			@Pc(151) int local151;
			@Pc(166) int local166;
			@Pc(234) int local234;
			@Pc(255) int local255;
			@Pc(260) int local260;
			@Pc(342) int local342;
			@Pc(223) int local223;
			if (arg2 > arg3) {
				arg1 <<= 0x10;
				arg1 += 32768;
				@Pc(98) int local98 = arg3 << 16;
				local108 = (int) Math.floor((double) local98 / (double) arg2 + 0.5D);
				arg2 += arg0;
				if (arg0 < this.anInt553 * 1709859847) {
					arg1 += (this.anInt553 * 1709859847 - arg0) * local108;
					arg0 = this.anInt553 * 1709859847;
				}
				if (arg2 >= this.anInt540 * -1807368365) {
					arg2 = this.anInt540 * -1807368365 - 1;
				}
				local151 = arg4 >>> 24;
				if (arg5 == 0 || arg5 == 1 && local151 == 255) {
					while (arg0 <= arg2) {
						local166 = arg1 >> 16;
						if (local166 >= this.anInt541 * 9823353 && local166 < this.anInt542 * 639238427) {
							this.anIntArray39[arg0 + local166 * this.anInt547 * 356365251] = arg4;
						}
						arg1 += local108;
						arg0++;
					}
				} else if (arg5 == 1) {
					local223 = (local151 << 24) + (local151 * (arg4 & 0xFF00) >> 8 & 0xFF00) + ((arg4 & 0xFF00FF) * local151 >> 8 & 0xFF00FF);
					local166 = 256 - local151;
					while (arg0 <= arg2) {
						local234 = arg1 >> 16;
						if (local234 >= this.anInt541 * 9823353 && local234 < this.anInt542 * 639238427) {
							local255 = this.anInt547 * 356365251 * local234 + arg0;
							local260 = this.anIntArray39[local255];
							@Pc(280) int local280 = (local166 * (local260 & 0xFF00) >> 8 & 0xFF00) + ((local260 & 0xFF00FF) * local166 >> 8 & 0xFF00FF);
							this.anIntArray39[local255] = local223 + local280;
						}
						arg1 += local108;
						arg0++;
					}
				} else if (arg5 == 2) {
					while (arg0 <= arg2) {
						local166 = arg1 >> 16;
						if (local166 >= this.anInt541 * 9823353 && local166 < this.anInt542 * 639238427) {
							local234 = local166 * this.anInt547 * 356365251 + arg0;
							local255 = this.anIntArray39[local234];
							local260 = local255 + arg4;
							local342 = (local255 & 0xFF00FF) + (arg4 & 0xFF00FF);
							local255 = (local260 - local342 & 0x10000) + (local342 & 0x1000100);
							this.anIntArray39[local234] = local260 - local255 | local255 - (local255 >>> 8);
						}
						arg1 += local108;
						arg0++;
					}
				} else {
					throw new IllegalArgumentException();
				}
			} else {
				arg0 <<= 0x10;
				arg0 += 32768;
				@Pc(388) int local388 = arg2 << 16;
				local108 = (int) Math.floor((double) local388 / (double) arg3 + 0.5D);
				arg3 += arg1;
				if (arg1 < this.anInt541 * 9823353) {
					arg0 += (this.anInt541 * 9823353 - arg1) * local108;
					arg1 = this.anInt541 * 9823353;
				}
				if (arg3 >= this.anInt542 * 639238427) {
					arg3 = this.anInt542 * 639238427 - 1;
				}
				local151 = arg4 >>> 24;
				if (arg5 == 0 || arg5 == 1 && local151 == 255) {
					while (arg1 <= arg3) {
						local166 = arg0 >> 16;
						if (local166 >= this.anInt553 * 1709859847 && local166 < this.anInt540 * -1807368365) {
							this.anIntArray39[local166 + this.anInt547 * 356365251 * arg1] = arg4;
						}
						arg0 += local108;
						arg1++;
					}
				} else if (arg5 == 1) {
					local223 = ((arg4 & 0xFF00FF) * local151 >> 8 & 0xFF00FF) + (local151 * (arg4 & 0xFF00) >> 8 & 0xFF00) + (local151 << 24);
					local166 = 256 - local151;
					while (arg1 <= arg3) {
						local234 = arg0 >> 16;
						if (local234 >= this.anInt553 * 1709859847 && local234 < this.anInt540 * -1807368365) {
							local255 = local234 + arg1 * this.anInt547 * 356365251;
							local260 = this.anIntArray39[local255];
							local260 = (local166 * (local260 & 0xFF00) >> 8 & 0xFF00) + ((local260 & 0xFF00FF) * local166 >> 8 & 0xFF00FF);
							this.anIntArray39[local234 + arg1 * 356365251 * this.anInt547] = local223 + local260;
						}
						arg0 += local108;
						arg1++;
					}
				} else if (arg5 == 2) {
					while (arg1 <= arg3) {
						local166 = arg0 >> 16;
						if (local166 >= this.anInt553 * 1709859847 && local166 < this.anInt540 * -1807368365) {
							local234 = this.anInt547 * 356365251 * arg1 + local166;
							local255 = this.anIntArray39[local234];
							local260 = arg4 + local255;
							local342 = (arg4 & 0xFF00FF) + (local255 & 0xFF00FF);
							local255 = (local342 & 0x1000100) + (local260 - local342 & 0x10000);
							this.anIntArray39[local234] = local260 - local255 | local255 - (local255 >>> 8);
						}
						arg0 += local108;
						arg1++;
					}
				} else {
					throw new IllegalArgumentException();
				}
			}
		} else if (arg3 >= 0) {
			this.method20377(arg0, arg1, arg3 + 1, arg4, arg5);
		} else {
			this.method20377(arg0, arg3 + arg1, -arg3 + 1, arg4, arg5);
		}
	}

	@OriginalMember(owner = "client!aeh", name = "cb", descriptor = "(IIIIIIIII)V", line = 980)
	@Override
	public void method20094(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (this.anIntArray39 == null) {
			return;
		}
		arg2 -= arg0;
		arg3 -= arg1;
		@Pc(33) int local33;
		@Pc(37) int local37;
		if (arg3 == 0) {
			if (arg2 >= 0) {
				this.method4872(arg0, arg1, arg2 + 1, arg4, arg5, arg6, arg7, arg8);
			} else {
				local33 = arg7 + arg6;
				local37 = arg8 % local33;
				local37 = arg6 + local33 - local37 - (-arg2 + 1) % local33;
				arg8 = local37 % local33;
				if (arg8 < 0) {
					arg8 += local33;
				}
				this.method4872(arg0 + arg2, arg1, -arg2 + 1, arg4, arg5, arg6, arg7, arg8);
			}
		} else if (arg2 != 0) {
			local37 = arg8 << 8;
			@Pc(149) int local149 = arg6 << 8;
			@Pc(153) int local153 = arg7 << 8;
			local33 = local149 + local153;
			arg8 = local37 % local33;
			@Pc(178) int local178;
			@Pc(182) int local182;
			if (arg2 + arg3 < 0) {
				local178 = (int) (Math.sqrt((double) (arg3 * arg3 + arg2 * arg2)) * 256.0D);
				local182 = local178 % local33;
				local37 = local33 + local149 - arg8 - local182;
				arg8 = local37 % local33;
				if (arg8 < 0) {
					arg8 += local33;
				}
				arg0 += arg2;
				arg2 = -arg2;
				arg1 += arg3;
				arg3 = -arg3;
			}
			@Pc(260) int local260;
			@Pc(276) int local276;
			@Pc(367) int local367;
			@Pc(403) int local403;
			@Pc(408) int local408;
			@Pc(513) int local513;
			@Pc(243) int local243;
			@Pc(229) int local229;
			@Pc(356) int local356;
			if (arg2 > arg3) {
				arg1 <<= 0x10;
				arg1 += 32768;
				local229 = arg3 << 16;
				local178 = (int) Math.floor((double) local229 / (double) arg2 + 0.5D);
				local243 = arg2 + arg0;
				local182 = arg4 >>> 24;
				local260 = (int) Math.sqrt((double) ((local178 >> 8) * (local178 >> 8) + 65536));
				if (arg5 == 0 || arg5 == 1 && local182 == 255) {
					while (arg0 <= local243) {
						local276 = arg1 >> 16;
						if (arg0 >= this.anInt553 * 1709859847 && arg0 < this.anInt540 * -1807368365 && local276 >= this.anInt541 * 9823353 && local276 < this.anInt542 * 639238427 && arg8 < local149) {
							this.anIntArray39[arg0 + this.anInt547 * 356365251 * local276] = arg4;
						}
						arg1 += local178;
						arg0++;
						local37 = arg8 + local260;
						arg8 = local37 % local33;
					}
				} else if (arg5 == 1) {
					local356 = (local182 * (arg4 & 0xFF00) >> 8 & 0xFF00) + ((arg4 & 0xFF00FF) * local182 >> 8 & 0xFF00FF) + (local182 << 24);
					local276 = 256 - local182;
					while (arg0 <= local243) {
						local367 = arg1 >> 16;
						if (arg0 >= this.anInt553 * 1709859847 && arg0 < this.anInt540 * -1807368365 && local367 >= this.anInt541 * 9823353 && local367 < this.anInt542 * 639238427 && arg8 < local149) {
							local403 = arg0 + local367 * this.anInt547 * 356365251;
							local408 = this.anIntArray39[local403];
							@Pc(428) int local428 = (local276 * (local408 & 0xFF00) >> 8 & 0xFF00) + ((local408 & 0xFF00FF) * local276 >> 8 & 0xFF00FF);
							this.anIntArray39[local403] = local356 + local428;
						}
						arg1 += local178;
						arg0++;
						local37 = arg8 + local260;
						arg8 = local37 % local33;
					}
				} else if (arg5 == 2) {
					while (arg0 <= local243) {
						local276 = arg1 >> 16;
						if (arg0 >= this.anInt553 * 1709859847 && arg0 < this.anInt540 * -1807368365 && local276 >= this.anInt541 * 9823353 && local276 < this.anInt542 * 639238427 && arg8 < local149) {
							local367 = this.anInt547 * 356365251 * local276 + arg0;
							local403 = this.anIntArray39[local367];
							local408 = arg4 + local403;
							local513 = (arg4 & 0xFF00FF) + (local403 & 0xFF00FF);
							local403 = (local408 - local513 & 0x10000) + (local513 & 0x1000100);
							this.anIntArray39[local367] = local408 - local403 | local403 - (local403 >>> 8);
						}
						arg1 += local178;
						arg0++;
						local37 = arg8 + local260;
						arg8 = local37 % local33;
					}
				} else {
					throw new IllegalArgumentException();
				}
			} else {
				arg0 <<= 0x10;
				arg0 += 32768;
				local243 = arg2 << 16;
				local178 = (int) Math.floor((double) local243 / (double) arg3 + 0.5D);
				local229 = arg3 + arg1;
				local182 = arg4 >>> 24;
				local260 = (int) Math.sqrt((double) ((local178 >> 8) * (local178 >> 8) + 65536));
				if (arg5 == 0 || arg5 == 1 && local182 == 255) {
					while (arg1 <= local229) {
						local276 = arg0 >> 16;
						if (arg1 >= this.anInt541 * 9823353 && arg1 < this.anInt542 * 639238427 && local276 >= this.anInt553 * 1709859847 && local276 < this.anInt540 * -1807368365 && arg8 < local149) {
							this.anIntArray39[local276 + arg1 * 356365251 * this.anInt547] = arg4;
						}
						arg0 += local178;
						arg1++;
						local37 = arg8 + local260;
						arg8 = local37 % local33;
					}
				} else if (arg5 == 1) {
					local356 = ((arg4 & 0xFF00) * local182 >> 8 & 0xFF00) + (local182 * (arg4 & 0xFF00FF) >> 8 & 0xFF00FF) + (local182 << 24);
					local276 = 256 - local182;
					while (arg1 <= local229) {
						local367 = arg0 >> 16;
						if (arg1 >= this.anInt541 * 9823353 && arg1 < this.anInt542 * 639238427 && local367 >= this.anInt553 * 1709859847 && local367 < this.anInt540 * -1807368365 && arg8 < local149) {
							local403 = local367 + arg1 * this.anInt547 * 356365251;
							local408 = this.anIntArray39[local403];
							local408 = ((local408 & 0xFF00) * local276 >> 8 & 0xFF00) + (local276 * (local408 & 0xFF00FF) >> 8 & 0xFF00FF);
							this.anIntArray39[arg1 * 356365251 * this.anInt547 + local367] = local356 + local408;
						}
						arg0 += local178;
						arg1++;
						local37 = arg8 + local260;
						arg8 = local37 % local33;
					}
				} else if (arg5 == 2) {
					while (arg1 <= local229) {
						local276 = arg0 >> 16;
						if (arg1 >= this.anInt541 * 9823353 && arg1 < this.anInt542 * 639238427 && local276 >= this.anInt553 * 1709859847 && local276 < this.anInt540 * -1807368365 && arg8 < local149) {
							local367 = local276 + this.anInt547 * 356365251 * arg1;
							local403 = this.anIntArray39[local367];
							local408 = arg4 + local403;
							local513 = (arg4 & 0xFF00FF) + (local403 & 0xFF00FF);
							local403 = (local408 - local513 & 0x10000) + (local513 & 0x1000100);
							this.anIntArray39[local367] = local408 - local403 | local403 - (local403 >>> 8);
						}
						arg0 += local178;
						arg1++;
						local37 = arg8 + local260;
						arg8 = local37 % local33;
					}
				} else {
					throw new IllegalArgumentException();
				}
			}
		} else if (arg3 >= 0) {
			this.method4874(arg0, arg1, arg3 + 1, arg4, arg5, arg6, arg7, arg8);
		} else {
			local33 = arg7 + arg6;
			local37 = arg8 % local33;
			local37 = local33 + arg6 - local37 - (-arg3 + 1) % local33;
			arg8 = local37 % local33;
			if (arg8 < 0) {
				arg8 += local33;
			}
			this.method4874(arg0, arg1 + arg3, -arg3 + 1, arg4, arg5, arg6, arg7, arg8);
		}
	}

	@OriginalMember(owner = "client!aeh", name = "iz", descriptor = "(IIIIIIIII)V", line = 980)
	@Override
	public void method20237(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (this.anIntArray39 == null) {
			return;
		}
		arg2 -= arg0;
		arg3 -= arg1;
		@Pc(33) int local33;
		@Pc(37) int local37;
		if (arg3 == 0) {
			if (arg2 >= 0) {
				this.method4872(arg0, arg1, arg2 + 1, arg4, arg5, arg6, arg7, arg8);
			} else {
				local33 = arg7 + arg6;
				local37 = arg8 % local33;
				local37 = arg6 + local33 - local37 - (-arg2 + 1) % local33;
				arg8 = local37 % local33;
				if (arg8 < 0) {
					arg8 += local33;
				}
				this.method4872(arg0 + arg2, arg1, -arg2 + 1, arg4, arg5, arg6, arg7, arg8);
			}
		} else if (arg2 != 0) {
			local37 = arg8 << 8;
			@Pc(149) int local149 = arg6 << 8;
			@Pc(153) int local153 = arg7 << 8;
			local33 = local149 + local153;
			arg8 = local37 % local33;
			@Pc(178) int local178;
			@Pc(182) int local182;
			if (arg2 + arg3 < 0) {
				local178 = (int) (Math.sqrt((double) (arg3 * arg3 + arg2 * arg2)) * 256.0D);
				local182 = local178 % local33;
				local37 = local33 + local149 - arg8 - local182;
				arg8 = local37 % local33;
				if (arg8 < 0) {
					arg8 += local33;
				}
				arg0 += arg2;
				arg2 = -arg2;
				arg1 += arg3;
				arg3 = -arg3;
			}
			@Pc(260) int local260;
			@Pc(276) int local276;
			@Pc(367) int local367;
			@Pc(403) int local403;
			@Pc(408) int local408;
			@Pc(513) int local513;
			@Pc(243) int local243;
			@Pc(229) int local229;
			@Pc(356) int local356;
			if (arg2 > arg3) {
				arg1 <<= 0x10;
				arg1 += 32768;
				local229 = arg3 << 16;
				local178 = (int) Math.floor((double) local229 / (double) arg2 + 0.5D);
				local243 = arg2 + arg0;
				local182 = arg4 >>> 24;
				local260 = (int) Math.sqrt((double) ((local178 >> 8) * (local178 >> 8) + 65536));
				if (arg5 == 0 || arg5 == 1 && local182 == 255) {
					while (arg0 <= local243) {
						local276 = arg1 >> 16;
						if (arg0 >= this.anInt553 * 1709859847 && arg0 < this.anInt540 * -1807368365 && local276 >= this.anInt541 * 9823353 && local276 < this.anInt542 * 639238427 && arg8 < local149) {
							this.anIntArray39[arg0 + this.anInt547 * 356365251 * local276] = arg4;
						}
						arg1 += local178;
						arg0++;
						local37 = arg8 + local260;
						arg8 = local37 % local33;
					}
				} else if (arg5 == 1) {
					local356 = (local182 * (arg4 & 0xFF00) >> 8 & 0xFF00) + ((arg4 & 0xFF00FF) * local182 >> 8 & 0xFF00FF) + (local182 << 24);
					local276 = 256 - local182;
					while (arg0 <= local243) {
						local367 = arg1 >> 16;
						if (arg0 >= this.anInt553 * 1709859847 && arg0 < this.anInt540 * -1807368365 && local367 >= this.anInt541 * 9823353 && local367 < this.anInt542 * 639238427 && arg8 < local149) {
							local403 = arg0 + local367 * this.anInt547 * 356365251;
							local408 = this.anIntArray39[local403];
							@Pc(428) int local428 = (local276 * (local408 & 0xFF00) >> 8 & 0xFF00) + ((local408 & 0xFF00FF) * local276 >> 8 & 0xFF00FF);
							this.anIntArray39[local403] = local356 + local428;
						}
						arg1 += local178;
						arg0++;
						local37 = arg8 + local260;
						arg8 = local37 % local33;
					}
				} else if (arg5 == 2) {
					while (arg0 <= local243) {
						local276 = arg1 >> 16;
						if (arg0 >= this.anInt553 * 1709859847 && arg0 < this.anInt540 * -1807368365 && local276 >= this.anInt541 * 9823353 && local276 < this.anInt542 * 639238427 && arg8 < local149) {
							local367 = this.anInt547 * 356365251 * local276 + arg0;
							local403 = this.anIntArray39[local367];
							local408 = arg4 + local403;
							local513 = (arg4 & 0xFF00FF) + (local403 & 0xFF00FF);
							local403 = (local408 - local513 & 0x10000) + (local513 & 0x1000100);
							this.anIntArray39[local367] = local408 - local403 | local403 - (local403 >>> 8);
						}
						arg1 += local178;
						arg0++;
						local37 = arg8 + local260;
						arg8 = local37 % local33;
					}
				} else {
					throw new IllegalArgumentException();
				}
			} else {
				arg0 <<= 0x10;
				arg0 += 32768;
				local243 = arg2 << 16;
				local178 = (int) Math.floor((double) local243 / (double) arg3 + 0.5D);
				local229 = arg3 + arg1;
				local182 = arg4 >>> 24;
				local260 = (int) Math.sqrt((double) ((local178 >> 8) * (local178 >> 8) + 65536));
				if (arg5 == 0 || arg5 == 1 && local182 == 255) {
					while (arg1 <= local229) {
						local276 = arg0 >> 16;
						if (arg1 >= this.anInt541 * 9823353 && arg1 < this.anInt542 * 639238427 && local276 >= this.anInt553 * 1709859847 && local276 < this.anInt540 * -1807368365 && arg8 < local149) {
							this.anIntArray39[local276 + arg1 * 356365251 * this.anInt547] = arg4;
						}
						arg0 += local178;
						arg1++;
						local37 = arg8 + local260;
						arg8 = local37 % local33;
					}
				} else if (arg5 == 1) {
					local356 = ((arg4 & 0xFF00) * local182 >> 8 & 0xFF00) + (local182 * (arg4 & 0xFF00FF) >> 8 & 0xFF00FF) + (local182 << 24);
					local276 = 256 - local182;
					while (arg1 <= local229) {
						local367 = arg0 >> 16;
						if (arg1 >= this.anInt541 * 9823353 && arg1 < this.anInt542 * 639238427 && local367 >= this.anInt553 * 1709859847 && local367 < this.anInt540 * -1807368365 && arg8 < local149) {
							local403 = local367 + arg1 * this.anInt547 * 356365251;
							local408 = this.anIntArray39[local403];
							local408 = ((local408 & 0xFF00) * local276 >> 8 & 0xFF00) + (local276 * (local408 & 0xFF00FF) >> 8 & 0xFF00FF);
							this.anIntArray39[arg1 * 356365251 * this.anInt547 + local367] = local356 + local408;
						}
						arg0 += local178;
						arg1++;
						local37 = arg8 + local260;
						arg8 = local37 % local33;
					}
				} else if (arg5 == 2) {
					while (arg1 <= local229) {
						local276 = arg0 >> 16;
						if (arg1 >= this.anInt541 * 9823353 && arg1 < this.anInt542 * 639238427 && local276 >= this.anInt553 * 1709859847 && local276 < this.anInt540 * -1807368365 && arg8 < local149) {
							local367 = local276 + this.anInt547 * 356365251 * arg1;
							local403 = this.anIntArray39[local367];
							local408 = arg4 + local403;
							local513 = (arg4 & 0xFF00FF) + (local403 & 0xFF00FF);
							local403 = (local408 - local513 & 0x10000) + (local513 & 0x1000100);
							this.anIntArray39[local367] = local408 - local403 | local403 - (local403 >>> 8);
						}
						arg0 += local178;
						arg1++;
						local37 = arg8 + local260;
						arg8 = local37 % local33;
					}
				} else {
					throw new IllegalArgumentException();
				}
			}
		} else if (arg3 >= 0) {
			this.method4874(arg0, arg1, arg3 + 1, arg4, arg5, arg6, arg7, arg8);
		} else {
			local33 = arg7 + arg6;
			local37 = arg8 % local33;
			local37 = local33 + arg6 - local37 - (-arg3 + 1) % local33;
			arg8 = local37 % local33;
			if (arg8 < 0) {
				arg8 += local33;
			}
			this.method4874(arg0, arg1 + arg3, -arg3 + 1, arg4, arg5, arg6, arg7, arg8);
		}
	}

	@OriginalMember(owner = "client!aeh", name = "be", descriptor = "(IIIIIILclient!cd;II)V", line = 1134)
	@Override
	public void method20160(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class90 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (this.anIntArray39 == null) {
			return;
		}
		@Pc(6) Class90_Sub2 local6 = (Class90_Sub2) arg6;
		@Pc(9) int[] local9 = local6.anIntArray67;
		@Pc(12) int[] local12 = local6.anIntArray68;
		@Pc(25) int local25 = this.anInt541 * 9823353 > arg8 ? this.anInt541 * 9823353 : arg8;
		@Pc(44) int local44 = this.anInt542 * 639238427 < local9.length + arg8 ? this.anInt542 * 639238427 : arg8 + local9.length;
		arg2 -= arg0;
		arg3 -= arg1;
		if (arg2 + arg3 < 0) {
			arg0 += arg2;
			arg2 = -arg2;
			arg1 += arg3;
			arg3 = -arg3;
		}
		@Pc(95) int local95;
		@Pc(138) int local138;
		@Pc(153) int local153;
		@Pc(157) int local157;
		@Pc(169) int local169;
		@Pc(251) int local251;
		@Pc(270) int local270;
		@Pc(275) int local275;
		@Pc(371) int local371;
		@Pc(224) int local224;
		if (arg2 <= arg3) {
			arg0 <<= 0x10;
			arg0 += 32768;
			@Pc(417) int local417 = arg2 << 16;
			local95 = (int) Math.floor((double) local417 / (double) arg3 + 0.5D);
			arg3 += arg1;
			if (arg1 < local25) {
				arg0 += (local25 - arg1) * local95;
				arg1 = local25;
			}
			if (arg3 >= local44) {
				arg3 = local44 - 1;
			}
			local138 = arg4 >>> 24;
			if (arg5 == 0 || arg5 == 1 && local138 == 255) {
				while (arg1 <= arg3) {
					local153 = arg0 >> 16;
					local157 = arg1 - arg8;
					local169 = local9[local157] + arg7;
					if (local153 >= this.anInt553 * 1709859847 && local153 < this.anInt540 * -1807368365 && local153 >= local169 && local153 < local12[local157] + local169) {
						this.anIntArray39[arg1 * 356365251 * this.anInt547 + local153] = arg4;
					}
					arg0 += local95;
					arg1++;
				}
			} else if (arg5 == 1) {
				local224 = ((arg4 & 0xFF00FF) * local138 >> 8 & 0xFF00FF) + (local138 * (arg4 & 0xFF00) >> 8 & 0xFF00) + (local138 << 24);
				local153 = 256 - local138;
				while (arg1 <= arg3) {
					local157 = arg0 >> 16;
					local169 = arg1 - arg8;
					local251 = arg7 + local9[local169];
					if (local157 >= this.anInt553 * 1709859847 && local157 < this.anInt540 * -1807368365 && local157 >= local251 && local157 < local251 + local12[local169]) {
						local270 = local157 + this.anInt547 * 356365251 * arg1;
						local275 = this.anIntArray39[local270];
						local275 = (local153 * (local275 & 0xFF00) >> 8 & 0xFF00) + ((local275 & 0xFF00FF) * local153 >> 8 & 0xFF00FF);
						this.anIntArray39[arg1 * 356365251 * this.anInt547 + local157] = local224 + local275;
					}
					arg0 += local95;
					arg1++;
				}
			} else if (arg5 == 2) {
				while (arg1 <= arg3) {
					local153 = arg0 >> 16;
					local157 = arg1 - arg8;
					local169 = arg7 + local9[local157];
					if (local153 >= this.anInt553 * 1709859847 && local153 < this.anInt540 * -1807368365 && local153 >= local169 && local153 < local12[local157] + local169) {
						local251 = local153 + arg1 * this.anInt547 * 356365251;
						local270 = this.anIntArray39[local251];
						local275 = arg4 + local270;
						local371 = (local270 & 0xFF00FF) + (arg4 & 0xFF00FF);
						local270 = (local275 - local371 & 0x10000) + (local371 & 0x1000100);
						this.anIntArray39[local251] = local275 - local270 | local270 - (local270 >>> 8);
					}
					arg0 += local95;
					arg1++;
				}
			} else {
				throw new IllegalArgumentException();
			}
			return;
		}
		arg1 <<= 0x10;
		arg1 += 32768;
		@Pc(85) int local85 = arg3 << 16;
		local95 = (int) Math.floor((double) local85 / (double) arg2 + 0.5D);
		arg2 += arg0;
		if (arg0 < this.anInt553 * 1709859847) {
			arg1 += (this.anInt553 * 1709859847 - arg0) * local95;
			arg0 = this.anInt553 * 1709859847;
		}
		if (arg2 >= this.anInt540 * -1807368365) {
			arg2 = this.anInt540 * -1807368365 - 1;
		}
		local138 = arg4 >>> 24;
		if (arg5 == 0 || arg5 == 1 && local138 == 255) {
			while (arg0 <= arg2) {
				local153 = arg1 >> 16;
				local157 = local153 - arg8;
				if (local153 >= local25 && local153 < local44) {
					local169 = local9[local157] + arg7;
					if (arg0 >= local169 && arg0 < local169 + local12[local157]) {
						this.anIntArray39[this.anInt547 * 356365251 * local153 + arg0] = arg4;
					}
				}
				arg1 += local95;
				arg0++;
			}
		} else if (arg5 == 1) {
			local224 = ((arg4 & 0xFF00) * local138 >> 8 & 0xFF00) + ((arg4 & 0xFF00FF) * local138 >> 8 & 0xFF00FF) + (local138 << 24);
			local153 = 256 - local138;
			while (arg0 <= arg2) {
				local157 = arg1 >> 16;
				local169 = local157 - arg8;
				if (local157 >= local25 && local157 < local44) {
					local251 = arg7 + local9[local169];
					if (arg0 >= local251 && arg0 < local251 + local12[local169]) {
						local270 = arg0 + this.anInt547 * 356365251 * local157;
						local275 = this.anIntArray39[local270];
						@Pc(295) int local295 = (local153 * (local275 & 0xFF00FF) >> 8 & 0xFF00FF) + ((local275 & 0xFF00) * local153 >> 8 & 0xFF00);
						this.anIntArray39[local270] = local295 + local224;
					}
				}
				arg1 += local95;
				arg0++;
			}
		} else if (arg5 == 2) {
			while (arg0 <= arg2) {
				local153 = arg1 >> 16;
				local157 = local153 - arg8;
				if (local153 >= local25 && local153 < local44) {
					local169 = arg7 + local9[local157];
					if (arg0 >= local169 && arg0 < local12[local157] + local169) {
						local251 = this.anInt547 * 356365251 * local153 + arg0;
						local270 = this.anIntArray39[local251];
						local275 = arg4 + local270;
						local371 = (local270 & 0xFF00FF) + (arg4 & 0xFF00FF);
						local270 = (local275 - local371 & 0x10000) + (local371 & 0x1000100);
						this.anIntArray39[local251] = local275 - local270 | local270 - (local270 >>> 8);
					}
				}
				arg1 += local95;
				arg0++;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!aeh", name = "ia", descriptor = "(IIIIIILclient!cd;II)V", line = 1134)
	@Override
	public void method20205(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class90 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (this.anIntArray39 == null) {
			return;
		}
		@Pc(6) Class90_Sub2 local6 = (Class90_Sub2) arg6;
		@Pc(9) int[] local9 = local6.anIntArray67;
		@Pc(12) int[] local12 = local6.anIntArray68;
		@Pc(25) int local25 = this.anInt541 * 9823353 > arg8 ? this.anInt541 * 9823353 : arg8;
		@Pc(44) int local44 = this.anInt542 * 639238427 < local9.length + arg8 ? this.anInt542 * 639238427 : arg8 + local9.length;
		arg2 -= arg0;
		arg3 -= arg1;
		if (arg2 + arg3 < 0) {
			arg0 += arg2;
			arg2 = -arg2;
			arg1 += arg3;
			arg3 = -arg3;
		}
		@Pc(95) int local95;
		@Pc(138) int local138;
		@Pc(153) int local153;
		@Pc(157) int local157;
		@Pc(169) int local169;
		@Pc(251) int local251;
		@Pc(270) int local270;
		@Pc(275) int local275;
		@Pc(371) int local371;
		@Pc(224) int local224;
		if (arg2 <= arg3) {
			arg0 <<= 0x10;
			arg0 += 32768;
			@Pc(417) int local417 = arg2 << 16;
			local95 = (int) Math.floor((double) local417 / (double) arg3 + 0.5D);
			arg3 += arg1;
			if (arg1 < local25) {
				arg0 += (local25 - arg1) * local95;
				arg1 = local25;
			}
			if (arg3 >= local44) {
				arg3 = local44 - 1;
			}
			local138 = arg4 >>> 24;
			if (arg5 == 0 || arg5 == 1 && local138 == 255) {
				while (arg1 <= arg3) {
					local153 = arg0 >> 16;
					local157 = arg1 - arg8;
					local169 = local9[local157] + arg7;
					if (local153 >= this.anInt553 * 1709859847 && local153 < this.anInt540 * -1807368365 && local153 >= local169 && local153 < local12[local157] + local169) {
						this.anIntArray39[arg1 * 356365251 * this.anInt547 + local153] = arg4;
					}
					arg0 += local95;
					arg1++;
				}
			} else if (arg5 == 1) {
				local224 = ((arg4 & 0xFF00FF) * local138 >> 8 & 0xFF00FF) + (local138 * (arg4 & 0xFF00) >> 8 & 0xFF00) + (local138 << 24);
				local153 = 256 - local138;
				while (arg1 <= arg3) {
					local157 = arg0 >> 16;
					local169 = arg1 - arg8;
					local251 = arg7 + local9[local169];
					if (local157 >= this.anInt553 * 1709859847 && local157 < this.anInt540 * -1807368365 && local157 >= local251 && local157 < local251 + local12[local169]) {
						local270 = local157 + this.anInt547 * 356365251 * arg1;
						local275 = this.anIntArray39[local270];
						local275 = (local153 * (local275 & 0xFF00) >> 8 & 0xFF00) + ((local275 & 0xFF00FF) * local153 >> 8 & 0xFF00FF);
						this.anIntArray39[arg1 * 356365251 * this.anInt547 + local157] = local224 + local275;
					}
					arg0 += local95;
					arg1++;
				}
			} else if (arg5 == 2) {
				while (arg1 <= arg3) {
					local153 = arg0 >> 16;
					local157 = arg1 - arg8;
					local169 = arg7 + local9[local157];
					if (local153 >= this.anInt553 * 1709859847 && local153 < this.anInt540 * -1807368365 && local153 >= local169 && local153 < local12[local157] + local169) {
						local251 = local153 + arg1 * this.anInt547 * 356365251;
						local270 = this.anIntArray39[local251];
						local275 = arg4 + local270;
						local371 = (local270 & 0xFF00FF) + (arg4 & 0xFF00FF);
						local270 = (local275 - local371 & 0x10000) + (local371 & 0x1000100);
						this.anIntArray39[local251] = local275 - local270 | local270 - (local270 >>> 8);
					}
					arg0 += local95;
					arg1++;
				}
			} else {
				throw new IllegalArgumentException();
			}
			return;
		}
		arg1 <<= 0x10;
		arg1 += 32768;
		@Pc(85) int local85 = arg3 << 16;
		local95 = (int) Math.floor((double) local85 / (double) arg2 + 0.5D);
		arg2 += arg0;
		if (arg0 < this.anInt553 * 1709859847) {
			arg1 += (this.anInt553 * 1709859847 - arg0) * local95;
			arg0 = this.anInt553 * 1709859847;
		}
		if (arg2 >= this.anInt540 * -1807368365) {
			arg2 = this.anInt540 * -1807368365 - 1;
		}
		local138 = arg4 >>> 24;
		if (arg5 == 0 || arg5 == 1 && local138 == 255) {
			while (arg0 <= arg2) {
				local153 = arg1 >> 16;
				local157 = local153 - arg8;
				if (local153 >= local25 && local153 < local44) {
					local169 = local9[local157] + arg7;
					if (arg0 >= local169 && arg0 < local169 + local12[local157]) {
						this.anIntArray39[this.anInt547 * 356365251 * local153 + arg0] = arg4;
					}
				}
				arg1 += local95;
				arg0++;
			}
		} else if (arg5 == 1) {
			local224 = ((arg4 & 0xFF00) * local138 >> 8 & 0xFF00) + ((arg4 & 0xFF00FF) * local138 >> 8 & 0xFF00FF) + (local138 << 24);
			local153 = 256 - local138;
			while (arg0 <= arg2) {
				local157 = arg1 >> 16;
				local169 = local157 - arg8;
				if (local157 >= local25 && local157 < local44) {
					local251 = arg7 + local9[local169];
					if (arg0 >= local251 && arg0 < local251 + local12[local169]) {
						local270 = arg0 + this.anInt547 * 356365251 * local157;
						local275 = this.anIntArray39[local270];
						@Pc(295) int local295 = (local153 * (local275 & 0xFF00FF) >> 8 & 0xFF00FF) + ((local275 & 0xFF00) * local153 >> 8 & 0xFF00);
						this.anIntArray39[local270] = local295 + local224;
					}
				}
				arg1 += local95;
				arg0++;
			}
		} else if (arg5 == 2) {
			while (arg0 <= arg2) {
				local153 = arg1 >> 16;
				local157 = local153 - arg8;
				if (local153 >= local25 && local153 < local44) {
					local169 = arg7 + local9[local157];
					if (arg0 >= local169 && arg0 < local12[local157] + local169) {
						local251 = this.anInt547 * 356365251 * local153 + arg0;
						local270 = this.anIntArray39[local251];
						local275 = arg4 + local270;
						local371 = (local270 & 0xFF00FF) + (arg4 & 0xFF00FF);
						local270 = (local275 - local371 & 0x10000) + (local371 & 0x1000100);
						this.anIntArray39[local251] = local275 - local270 | local270 - (local270 >>> 8);
					}
				}
				arg1 += local95;
				arg0++;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!aeh", name = "cg", descriptor = "(IIIIIILclient!cd;IIIII)V", line = 1273)
	@Override
	public void method20095(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class90 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		if (this.anIntArray39 == null) {
			return;
		}
		@Pc(7) Class90_Sub2 local7 = (Class90_Sub2) arg6;
		@Pc(10) int[] local10 = local7.anIntArray67;
		@Pc(13) int[] local13 = local7.anIntArray68;
		@Pc(26) int local26 = this.anInt541 * 9823353 > arg8 ? this.anInt541 * 9823353 : arg8;
		@Pc(45) int local45 = this.anInt542 * 639238427 < arg8 + local10.length ? this.anInt542 * 639238427 : local10.length + arg8;
		@Pc(49) int local49 = arg11 << 8;
		@Pc(53) int local53 = arg9 << 8;
		@Pc(57) int local57 = arg10 << 8;
		@Pc(61) int local61 = local57 + local53;
		arg11 = local49 % local61;
		arg2 -= arg0;
		arg3 -= arg1;
		@Pc(90) int local90;
		@Pc(94) int local94;
		if (arg3 + arg2 < 0) {
			local90 = (int) (Math.sqrt((double) (arg3 * arg3 + arg2 * arg2)) * 256.0D);
			local94 = local90 % local61;
			local49 = local53 + local61 - arg11 - local94;
			arg11 = local49 % local61;
			if (arg11 < 0) {
				arg11 += local61;
			}
			arg0 += arg2;
			arg2 = -arg2;
			arg1 += arg3;
			arg3 = -arg3;
		}
		@Pc(172) int local172;
		@Pc(187) int local187;
		@Pc(191) int local191;
		@Pc(218) int local218;
		@Pc(323) int local323;
		@Pc(342) int local342;
		@Pc(347) int local347;
		@Pc(155) int local155;
		@Pc(141) int local141;
		@Pc(281) int local281;
		if (arg2 <= arg3) {
			arg0 <<= 0x10;
			arg0 += 32768;
			local155 = arg2 << 16;
			local90 = (int) Math.floor((double) local155 / (double) arg3 + 0.5D);
			local94 = (int) Math.sqrt((double) ((local90 >> 8) * (local90 >> 8) + 65536));
			local141 = arg3 + arg1;
			local172 = arg4 >>> 24;
			if (arg5 == 0 || arg5 == 1 && local172 == 255) {
				while (arg1 <= local141) {
					local187 = arg0 >> 16;
					local191 = arg1 - arg8;
					if (arg1 >= local26 && arg1 < local45 && local187 >= this.anInt553 * 1709859847 && local187 < this.anInt540 * -1807368365 && arg11 < local53 && local187 >= arg7 + local10[local191] && local187 < local13[local191] + arg7 + local10[local191]) {
						this.anIntArray39[this.anInt547 * 356365251 * arg1 + local187] = arg4;
					}
					arg0 += local90;
					arg1++;
					local49 = arg11 + local94;
					arg11 = local49 % local61;
				}
			} else if (arg5 == 1) {
				local281 = (local172 << 24) + (local172 * (arg4 & 0xFF00FF) >> 8 & 0xFF00FF) + (local172 * (arg4 & 0xFF00) >> 8 & 0xFF00);
				local187 = 256 - local172;
				while (arg1 <= local141) {
					local191 = arg0 >> 16;
					local218 = arg1 - arg8;
					if (arg1 >= local26 && arg1 < local45 && local191 >= this.anInt553 * 1709859847 && local191 < this.anInt540 * -1807368365 && arg11 < local53 && local191 >= arg7 + local10[local218] && local191 < arg7 + local10[local218] + local13[local218]) {
						local323 = local191 + arg1 * 356365251 * this.anInt547;
						local342 = this.anIntArray39[local323];
						local342 = (local187 * (local342 & 0xFF00FF) >> 8 & 0xFF00FF) + (local187 * (local342 & 0xFF00) >> 8 & 0xFF00);
						this.anIntArray39[this.anInt547 * 356365251 * arg1 + local191] = local342 + local281;
					}
					arg0 += local90;
					arg1++;
					local49 = arg11 + local94;
					arg11 = local49 % local61;
				}
			} else if (arg5 == 2) {
				while (arg1 <= local141) {
					local187 = arg0 >> 16;
					local191 = arg1 - arg8;
					if (arg1 >= local26 && arg1 < local45 && local187 >= this.anInt553 * 1709859847 && local187 < this.anInt540 * -1807368365 && arg11 < local53 && local187 >= local10[local191] + arg7 && local187 < local13[local191] + local10[local191] + arg7) {
						local218 = local187 + this.anInt547 * 356365251 * arg1;
						local323 = this.anIntArray39[local218];
						local342 = local323 + arg4;
						local347 = (local323 & 0xFF00FF) + (arg4 & 0xFF00FF);
						local323 = (local342 - local347 & 0x10000) + (local347 & 0x1000100);
						this.anIntArray39[local218] = local342 - local323 | local323 - (local323 >>> 8);
					}
					arg0 += local90;
					arg1++;
					local49 = arg11 + local94;
					arg11 = local49 % local61;
				}
			} else {
				throw new IllegalArgumentException();
			}
			return;
		}
		arg1 <<= 0x10;
		arg1 += 32768;
		local141 = arg3 << 16;
		local90 = (int) Math.floor((double) local141 / (double) arg2 + 0.5D);
		local155 = arg2 + arg0;
		local94 = arg4 >>> 24;
		local172 = (int) Math.sqrt((double) ((local90 >> 8) * (local90 >> 8) + 65536));
		if (arg5 == 0 || arg5 == 1 && local94 == 255) {
			while (arg0 <= local155) {
				local187 = arg1 >> 16;
				local191 = local187 - arg8;
				if (arg0 >= this.anInt553 * 1709859847 && arg0 < this.anInt540 * -1807368365 && local187 >= local26 && local187 < local45 && arg11 < local53) {
					local218 = arg7 + local10[local191];
					if (arg0 >= local218 && arg0 < local13[local191] + local218) {
						this.anIntArray39[arg0 + local187 * this.anInt547 * 356365251] = arg4;
					}
				}
				arg1 += local90;
				arg0++;
				local49 = arg11 + local172;
				arg11 = local49 % local61;
			}
		} else if (arg5 == 1) {
			local281 = ((arg4 & 0xFF00) * local94 >> 8 & 0xFF00) + (local94 * (arg4 & 0xFF00FF) >> 8 & 0xFF00FF) + (local94 << 24);
			local187 = 256 - local94;
			while (arg0 <= local155) {
				local191 = arg1 >> 16;
				local218 = local191 - arg8;
				if (arg0 >= this.anInt553 * 1709859847 && arg0 < this.anInt540 * -1807368365 && local191 >= local26 && local191 < local45 && arg11 < local53) {
					local323 = local10[local218] + arg7;
					if (arg0 >= local323 && arg0 < local13[local218] + local323) {
						local342 = arg0 + local191 * 356365251 * this.anInt547;
						local347 = this.anIntArray39[local342];
						@Pc(367) int local367 = (local187 * (local347 & 0xFF00FF) >> 8 & 0xFF00FF) + (local187 * (local347 & 0xFF00) >> 8 & 0xFF00);
						this.anIntArray39[local342] = local367 + local281;
					}
				}
				arg1 += local90;
				arg0++;
				local49 = arg11 + local172;
				arg11 = local49 % local61;
			}
		} else if (arg5 == 2) {
			while (arg0 <= local155) {
				local187 = arg1 >> 16;
				local191 = local187 - arg8;
				if (arg0 >= this.anInt553 * 1709859847 && arg0 < this.anInt540 * -1807368365 && local187 >= local26 && local187 < local45 && arg11 < local53) {
					local218 = arg7 + local10[local191];
					if (arg0 >= local218 && arg0 < local218 + local13[local191]) {
						local323 = local187 * this.anInt547 * 356365251 + arg0;
						local342 = this.anIntArray39[local323];
						local347 = arg4 + local342;
						@Pc(466) int local466 = (arg4 & 0xFF00FF) + (local342 & 0xFF00FF);
						local342 = (local347 - local466 & 0x10000) + (local466 & 0x1000100);
						this.anIntArray39[local323] = local347 - local342 | local342 - (local342 >>> 8);
					}
				}
				arg1 += local90;
				arg0++;
				local49 = arg11 + local172;
				arg11 = local49 % local61;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!aeh", name = "ij", descriptor = "(IIIIIILclient!cd;IIIII)V", line = 1273)
	@Override
	public void method20238(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class90 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		if (this.anIntArray39 == null) {
			return;
		}
		@Pc(7) Class90_Sub2 local7 = (Class90_Sub2) arg6;
		@Pc(10) int[] local10 = local7.anIntArray67;
		@Pc(13) int[] local13 = local7.anIntArray68;
		@Pc(26) int local26 = this.anInt541 * 9823353 > arg8 ? this.anInt541 * 9823353 : arg8;
		@Pc(45) int local45 = this.anInt542 * 639238427 < arg8 + local10.length ? this.anInt542 * 639238427 : local10.length + arg8;
		@Pc(49) int local49 = arg11 << 8;
		@Pc(53) int local53 = arg9 << 8;
		@Pc(57) int local57 = arg10 << 8;
		@Pc(61) int local61 = local57 + local53;
		arg11 = local49 % local61;
		arg2 -= arg0;
		arg3 -= arg1;
		@Pc(90) int local90;
		@Pc(94) int local94;
		if (arg3 + arg2 < 0) {
			local90 = (int) (Math.sqrt((double) (arg3 * arg3 + arg2 * arg2)) * 256.0D);
			local94 = local90 % local61;
			local49 = local53 + local61 - arg11 - local94;
			arg11 = local49 % local61;
			if (arg11 < 0) {
				arg11 += local61;
			}
			arg0 += arg2;
			arg2 = -arg2;
			arg1 += arg3;
			arg3 = -arg3;
		}
		@Pc(172) int local172;
		@Pc(187) int local187;
		@Pc(191) int local191;
		@Pc(218) int local218;
		@Pc(323) int local323;
		@Pc(342) int local342;
		@Pc(347) int local347;
		@Pc(155) int local155;
		@Pc(141) int local141;
		@Pc(281) int local281;
		if (arg2 <= arg3) {
			arg0 <<= 0x10;
			arg0 += 32768;
			local155 = arg2 << 16;
			local90 = (int) Math.floor((double) local155 / (double) arg3 + 0.5D);
			local94 = (int) Math.sqrt((double) ((local90 >> 8) * (local90 >> 8) + 65536));
			local141 = arg3 + arg1;
			local172 = arg4 >>> 24;
			if (arg5 == 0 || arg5 == 1 && local172 == 255) {
				while (arg1 <= local141) {
					local187 = arg0 >> 16;
					local191 = arg1 - arg8;
					if (arg1 >= local26 && arg1 < local45 && local187 >= this.anInt553 * 1709859847 && local187 < this.anInt540 * -1807368365 && arg11 < local53 && local187 >= arg7 + local10[local191] && local187 < local13[local191] + arg7 + local10[local191]) {
						this.anIntArray39[this.anInt547 * 356365251 * arg1 + local187] = arg4;
					}
					arg0 += local90;
					arg1++;
					local49 = arg11 + local94;
					arg11 = local49 % local61;
				}
			} else if (arg5 == 1) {
				local281 = (local172 << 24) + (local172 * (arg4 & 0xFF00FF) >> 8 & 0xFF00FF) + (local172 * (arg4 & 0xFF00) >> 8 & 0xFF00);
				local187 = 256 - local172;
				while (arg1 <= local141) {
					local191 = arg0 >> 16;
					local218 = arg1 - arg8;
					if (arg1 >= local26 && arg1 < local45 && local191 >= this.anInt553 * 1709859847 && local191 < this.anInt540 * -1807368365 && arg11 < local53 && local191 >= arg7 + local10[local218] && local191 < arg7 + local10[local218] + local13[local218]) {
						local323 = local191 + arg1 * 356365251 * this.anInt547;
						local342 = this.anIntArray39[local323];
						local342 = (local187 * (local342 & 0xFF00FF) >> 8 & 0xFF00FF) + (local187 * (local342 & 0xFF00) >> 8 & 0xFF00);
						this.anIntArray39[this.anInt547 * 356365251 * arg1 + local191] = local342 + local281;
					}
					arg0 += local90;
					arg1++;
					local49 = arg11 + local94;
					arg11 = local49 % local61;
				}
			} else if (arg5 == 2) {
				while (arg1 <= local141) {
					local187 = arg0 >> 16;
					local191 = arg1 - arg8;
					if (arg1 >= local26 && arg1 < local45 && local187 >= this.anInt553 * 1709859847 && local187 < this.anInt540 * -1807368365 && arg11 < local53 && local187 >= local10[local191] + arg7 && local187 < local13[local191] + local10[local191] + arg7) {
						local218 = local187 + this.anInt547 * 356365251 * arg1;
						local323 = this.anIntArray39[local218];
						local342 = local323 + arg4;
						local347 = (local323 & 0xFF00FF) + (arg4 & 0xFF00FF);
						local323 = (local342 - local347 & 0x10000) + (local347 & 0x1000100);
						this.anIntArray39[local218] = local342 - local323 | local323 - (local323 >>> 8);
					}
					arg0 += local90;
					arg1++;
					local49 = arg11 + local94;
					arg11 = local49 % local61;
				}
			} else {
				throw new IllegalArgumentException();
			}
			return;
		}
		arg1 <<= 0x10;
		arg1 += 32768;
		local141 = arg3 << 16;
		local90 = (int) Math.floor((double) local141 / (double) arg2 + 0.5D);
		local155 = arg2 + arg0;
		local94 = arg4 >>> 24;
		local172 = (int) Math.sqrt((double) ((local90 >> 8) * (local90 >> 8) + 65536));
		if (arg5 == 0 || arg5 == 1 && local94 == 255) {
			while (arg0 <= local155) {
				local187 = arg1 >> 16;
				local191 = local187 - arg8;
				if (arg0 >= this.anInt553 * 1709859847 && arg0 < this.anInt540 * -1807368365 && local187 >= local26 && local187 < local45 && arg11 < local53) {
					local218 = arg7 + local10[local191];
					if (arg0 >= local218 && arg0 < local13[local191] + local218) {
						this.anIntArray39[arg0 + local187 * this.anInt547 * 356365251] = arg4;
					}
				}
				arg1 += local90;
				arg0++;
				local49 = arg11 + local172;
				arg11 = local49 % local61;
			}
		} else if (arg5 == 1) {
			local281 = ((arg4 & 0xFF00) * local94 >> 8 & 0xFF00) + (local94 * (arg4 & 0xFF00FF) >> 8 & 0xFF00FF) + (local94 << 24);
			local187 = 256 - local94;
			while (arg0 <= local155) {
				local191 = arg1 >> 16;
				local218 = local191 - arg8;
				if (arg0 >= this.anInt553 * 1709859847 && arg0 < this.anInt540 * -1807368365 && local191 >= local26 && local191 < local45 && arg11 < local53) {
					local323 = local10[local218] + arg7;
					if (arg0 >= local323 && arg0 < local13[local218] + local323) {
						local342 = arg0 + local191 * 356365251 * this.anInt547;
						local347 = this.anIntArray39[local342];
						@Pc(367) int local367 = (local187 * (local347 & 0xFF00FF) >> 8 & 0xFF00FF) + (local187 * (local347 & 0xFF00) >> 8 & 0xFF00);
						this.anIntArray39[local342] = local367 + local281;
					}
				}
				arg1 += local90;
				arg0++;
				local49 = arg11 + local172;
				arg11 = local49 % local61;
			}
		} else if (arg5 == 2) {
			while (arg0 <= local155) {
				local187 = arg1 >> 16;
				local191 = local187 - arg8;
				if (arg0 >= this.anInt553 * 1709859847 && arg0 < this.anInt540 * -1807368365 && local187 >= local26 && local187 < local45 && arg11 < local53) {
					local218 = arg7 + local10[local191];
					if (arg0 >= local218 && arg0 < local218 + local13[local191]) {
						local323 = local187 * this.anInt547 * 356365251 + arg0;
						local342 = this.anIntArray39[local323];
						local347 = arg4 + local342;
						@Pc(466) int local466 = (arg4 & 0xFF00FF) + (local342 & 0xFF00FF);
						local342 = (local347 - local466 & 0x10000) + (local466 & 0x1000100);
						this.anIntArray39[local323] = local347 - local342 | local342 - (local342 >>> 8);
					}
				}
				arg1 += local90;
				arg0++;
				local49 = arg11 + local172;
				arg11 = local49 % local61;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!aeh", name = "cc", descriptor = "(IIIIIII)V", line = 1423)
	@Override
	public void method20096(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (this.anIntArray39 == null) {
			return;
		}
		@Pc(7) Class95 local7 = this.method4886(Thread.currentThread());
		@Pc(10) Class163 local10 = local7.aClass163_2;
		@Pc(14) int local14 = arg2 - arg0;
		@Pc(18) int local18 = arg3 - arg1;
		@Pc(25) int local25 = local14 >= 0 ? local14 : -local14;
		@Pc(32) int local32 = local18 >= 0 ? local18 : -local18;
		@Pc(34) int local34 = local25;
		if (local25 < local32) {
			local34 = local32;
		}
		if (local34 == 0) {
			return;
		}
		@Pc(49) int local49 = (local14 << 16) / local34;
		@Pc(55) int local55 = (local18 << 16) / local34;
		local14 += local49 >> 16;
		local18 += local55 >> 16;
		if (local55 <= local49) {
			local49 = -local49;
		} else {
			local55 = -local55;
		}
		@Pc(83) int local83 = local55 * arg5 >> 17;
		@Pc(91) int local91 = arg5 * local55 + 1 >> 17;
		@Pc(97) int local97 = arg5 * local49 >> 17;
		@Pc(105) int local105 = arg5 * local49 + 1 >> 17;
		@Pc(110) int local110 = arg0 - local10.method24348();
		@Pc(115) int local115 = arg1 - local10.method24349();
		@Pc(119) int local119 = local83 + local110;
		@Pc(123) int local123 = local110 - local91;
		@Pc(129) int local129 = local14 + local110 - local91;
		@Pc(135) int local135 = local14 + local110 + local83;
		@Pc(139) int local139 = local115 + local97;
		@Pc(143) int local143 = local115 - local105;
		@Pc(149) int local149 = local115 + local18 - local105;
		@Pc(155) int local155 = local97 + local115 + local18;
		if (arg6 == 0) {
			local10.anInt3269 = 0;
		} else if (arg6 == 1) {
			local10.anInt3269 = 255 - (arg4 >>> 24);
		} else {
			throw new IllegalArgumentException();
		}
		this.method20230(false);
		local10.aBoolean558 = local119 < 0 || local119 > local10.anInt3270 || local123 < 0 || local123 > local10.anInt3270 || local129 < 0 || local129 > local10.anInt3270;
		local10.method24367(true, false, false, (float) local139, (float) local143, (float) local149, (float) local119, (float) local123, (float) local129, 100.0F, 100.0F, 100.0F, arg4);
		local10.aBoolean558 = local119 < 0 || local119 > local10.anInt3270 || local129 < 0 || local129 > local10.anInt3270 || local135 < 0 || local135 > local10.anInt3270;
		local10.method24367(true, false, false, (float) local139, (float) local149, (float) local155, (float) local119, (float) local129, (float) local135, 100.0F, 100.0F, 100.0F, arg4);
		this.method20230(true);
	}

	@OriginalMember(owner = "client!aeh", name = "ik", descriptor = "(IIIIIII)V", line = 1423)
	@Override
	public void method20239(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (this.anIntArray39 == null) {
			return;
		}
		@Pc(7) Class95 local7 = this.method4886(Thread.currentThread());
		@Pc(10) Class163 local10 = local7.aClass163_2;
		@Pc(14) int local14 = arg2 - arg0;
		@Pc(18) int local18 = arg3 - arg1;
		@Pc(25) int local25 = local14 >= 0 ? local14 : -local14;
		@Pc(32) int local32 = local18 >= 0 ? local18 : -local18;
		@Pc(34) int local34 = local25;
		if (local25 < local32) {
			local34 = local32;
		}
		if (local34 == 0) {
			return;
		}
		@Pc(49) int local49 = (local14 << 16) / local34;
		@Pc(55) int local55 = (local18 << 16) / local34;
		local14 += local49 >> 16;
		local18 += local55 >> 16;
		if (local55 <= local49) {
			local49 = -local49;
		} else {
			local55 = -local55;
		}
		@Pc(83) int local83 = local55 * arg5 >> 17;
		@Pc(91) int local91 = arg5 * local55 + 1 >> 17;
		@Pc(97) int local97 = arg5 * local49 >> 17;
		@Pc(105) int local105 = arg5 * local49 + 1 >> 17;
		@Pc(110) int local110 = arg0 - local10.method24348();
		@Pc(115) int local115 = arg1 - local10.method24349();
		@Pc(119) int local119 = local83 + local110;
		@Pc(123) int local123 = local110 - local91;
		@Pc(129) int local129 = local14 + local110 - local91;
		@Pc(135) int local135 = local14 + local110 + local83;
		@Pc(139) int local139 = local115 + local97;
		@Pc(143) int local143 = local115 - local105;
		@Pc(149) int local149 = local115 + local18 - local105;
		@Pc(155) int local155 = local97 + local115 + local18;
		if (arg6 == 0) {
			local10.anInt3269 = 0;
		} else if (arg6 == 1) {
			local10.anInt3269 = 255 - (arg4 >>> 24);
		} else {
			throw new IllegalArgumentException();
		}
		this.method20230(false);
		local10.aBoolean558 = local119 < 0 || local119 > local10.anInt3270 || local123 < 0 || local123 > local10.anInt3270 || local129 < 0 || local129 > local10.anInt3270;
		local10.method24367(true, false, false, (float) local139, (float) local143, (float) local149, (float) local119, (float) local123, (float) local129, 100.0F, 100.0F, 100.0F, arg4);
		local10.aBoolean558 = local119 < 0 || local119 > local10.anInt3270 || local129 < 0 || local129 > local10.anInt3270 || local135 < 0 || local135 > local10.anInt3270;
		local10.method24367(true, false, false, (float) local139, (float) local149, (float) local155, (float) local119, (float) local129, (float) local135, 100.0F, 100.0F, 100.0F, arg4);
		this.method20230(true);
	}

	@OriginalMember(owner = "client!aeh", name = "ir", descriptor = "(IIIIIII)V", line = 1423)
	@Override
	public void method20348(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (this.anIntArray39 == null) {
			return;
		}
		@Pc(7) Class95 local7 = this.method4886(Thread.currentThread());
		@Pc(10) Class163 local10 = local7.aClass163_2;
		@Pc(14) int local14 = arg2 - arg0;
		@Pc(18) int local18 = arg3 - arg1;
		@Pc(25) int local25 = local14 >= 0 ? local14 : -local14;
		@Pc(32) int local32 = local18 >= 0 ? local18 : -local18;
		@Pc(34) int local34 = local25;
		if (local25 < local32) {
			local34 = local32;
		}
		if (local34 == 0) {
			return;
		}
		@Pc(49) int local49 = (local14 << 16) / local34;
		@Pc(55) int local55 = (local18 << 16) / local34;
		local14 += local49 >> 16;
		local18 += local55 >> 16;
		if (local55 <= local49) {
			local49 = -local49;
		} else {
			local55 = -local55;
		}
		@Pc(83) int local83 = local55 * arg5 >> 17;
		@Pc(91) int local91 = arg5 * local55 + 1 >> 17;
		@Pc(97) int local97 = arg5 * local49 >> 17;
		@Pc(105) int local105 = arg5 * local49 + 1 >> 17;
		@Pc(110) int local110 = arg0 - local10.method24348();
		@Pc(115) int local115 = arg1 - local10.method24349();
		@Pc(119) int local119 = local83 + local110;
		@Pc(123) int local123 = local110 - local91;
		@Pc(129) int local129 = local14 + local110 - local91;
		@Pc(135) int local135 = local14 + local110 + local83;
		@Pc(139) int local139 = local115 + local97;
		@Pc(143) int local143 = local115 - local105;
		@Pc(149) int local149 = local115 + local18 - local105;
		@Pc(155) int local155 = local97 + local115 + local18;
		if (arg6 == 0) {
			local10.anInt3269 = 0;
		} else if (arg6 == 1) {
			local10.anInt3269 = 255 - (arg4 >>> 24);
		} else {
			throw new IllegalArgumentException();
		}
		this.method20230(false);
		local10.aBoolean558 = local119 < 0 || local119 > local10.anInt3270 || local123 < 0 || local123 > local10.anInt3270 || local129 < 0 || local129 > local10.anInt3270;
		local10.method24367(true, false, false, (float) local139, (float) local143, (float) local149, (float) local119, (float) local123, (float) local129, 100.0F, 100.0F, 100.0F, arg4);
		local10.aBoolean558 = local119 < 0 || local119 > local10.anInt3270 || local129 < 0 || local129 > local10.anInt3270 || local135 < 0 || local135 > local10.anInt3270;
		local10.method24367(true, false, false, (float) local139, (float) local149, (float) local155, (float) local119, (float) local129, (float) local135, 100.0F, 100.0F, 100.0F, arg4);
		this.method20230(true);
	}

	@OriginalMember(owner = "client!aeh", name = "im", descriptor = "(IIIIIII)V", line = 1423)
	@Override
	public void method20132(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (this.anIntArray39 == null) {
			return;
		}
		@Pc(7) Class95 local7 = this.method4886(Thread.currentThread());
		@Pc(10) Class163 local10 = local7.aClass163_2;
		@Pc(14) int local14 = arg2 - arg0;
		@Pc(18) int local18 = arg3 - arg1;
		@Pc(25) int local25 = local14 >= 0 ? local14 : -local14;
		@Pc(32) int local32 = local18 >= 0 ? local18 : -local18;
		@Pc(34) int local34 = local25;
		if (local25 < local32) {
			local34 = local32;
		}
		if (local34 == 0) {
			return;
		}
		@Pc(49) int local49 = (local14 << 16) / local34;
		@Pc(55) int local55 = (local18 << 16) / local34;
		local14 += local49 >> 16;
		local18 += local55 >> 16;
		if (local55 <= local49) {
			local49 = -local49;
		} else {
			local55 = -local55;
		}
		@Pc(83) int local83 = local55 * arg5 >> 17;
		@Pc(91) int local91 = arg5 * local55 + 1 >> 17;
		@Pc(97) int local97 = arg5 * local49 >> 17;
		@Pc(105) int local105 = arg5 * local49 + 1 >> 17;
		@Pc(110) int local110 = arg0 - local10.method24348();
		@Pc(115) int local115 = arg1 - local10.method24349();
		@Pc(119) int local119 = local83 + local110;
		@Pc(123) int local123 = local110 - local91;
		@Pc(129) int local129 = local14 + local110 - local91;
		@Pc(135) int local135 = local14 + local110 + local83;
		@Pc(139) int local139 = local115 + local97;
		@Pc(143) int local143 = local115 - local105;
		@Pc(149) int local149 = local115 + local18 - local105;
		@Pc(155) int local155 = local97 + local115 + local18;
		if (arg6 == 0) {
			local10.anInt3269 = 0;
		} else if (arg6 == 1) {
			local10.anInt3269 = 255 - (arg4 >>> 24);
		} else {
			throw new IllegalArgumentException();
		}
		this.method20230(false);
		local10.aBoolean558 = local119 < 0 || local119 > local10.anInt3270 || local123 < 0 || local123 > local10.anInt3270 || local129 < 0 || local129 > local10.anInt3270;
		local10.method24367(true, false, false, (float) local139, (float) local143, (float) local149, (float) local119, (float) local123, (float) local129, 100.0F, 100.0F, 100.0F, arg4);
		local10.aBoolean558 = local119 < 0 || local119 > local10.anInt3270 || local129 < 0 || local129 > local10.anInt3270 || local135 < 0 || local135 > local10.anInt3270;
		local10.method24367(true, false, false, (float) local139, (float) local149, (float) local155, (float) local119, (float) local129, (float) local135, 100.0F, 100.0F, 100.0F, arg4);
		this.method20230(true);
	}

	@OriginalMember(owner = "client!aeh", name = "cf", descriptor = "(IIIIII)I", line = 1465)
	@Override
	public int method20097(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) int local1 = 0;
		@Pc(34) float local34 = (float) arg0 * this.aClass442_18.aFloatArray109[2] + this.aClass442_18.aFloatArray109[14] + this.aClass442_18.aFloatArray109[6] * (float) arg1 + this.aClass442_18.aFloatArray109[10] * (float) arg2;
		@Pc(67) float local67 = (float) arg5 * this.aClass442_18.aFloatArray109[10] + this.aClass442_18.aFloatArray109[14] + this.aClass442_18.aFloatArray109[2] * (float) arg3 + this.aClass442_18.aFloatArray109[6] * (float) arg4;
		@Pc(100) float local100 = this.aClass442_18.aFloatArray109[11] * (float) arg2 + this.aClass442_18.aFloatArray109[7] * (float) arg1 + this.aClass442_18.aFloatArray109[3] * (float) arg0 + this.aClass442_18.aFloatArray109[15];
		@Pc(133) float local133 = this.aClass442_18.aFloatArray109[7] * (float) arg4 + (float) arg3 * this.aClass442_18.aFloatArray109[3] + this.aClass442_18.aFloatArray109[15] + this.aClass442_18.aFloatArray109[11] * (float) arg5;
		if (local34 < -local100 && local67 < -local133) {
			local1 |= 0x10;
		} else if (local34 > local100 && local67 > local133) {
			local1 |= 0x20;
		}
		@Pc(193) float local193 = (float) arg2 * this.aClass442_18.aFloatArray109[8] + (float) arg0 * this.aClass442_18.aFloatArray109[0] + this.aClass442_18.aFloatArray109[12] + this.aClass442_18.aFloatArray109[4] * (float) arg1;
		@Pc(226) float local226 = (float) arg4 * this.aClass442_18.aFloatArray109[4] + (float) arg3 * this.aClass442_18.aFloatArray109[0] + this.aClass442_18.aFloatArray109[12] + (float) arg5 * this.aClass442_18.aFloatArray109[8];
		if (local193 < -local100 && local226 < -local133) {
			local1 |= 0x1;
		}
		if (local193 > local100 && local226 > local133) {
			local1 |= 0x2;
		}
		@Pc(285) float local285 = this.aClass442_18.aFloatArray109[13] + this.aClass442_18.aFloatArray109[1] * (float) arg0 + this.aClass442_18.aFloatArray109[5] * (float) arg1 + (float) arg2 * this.aClass442_18.aFloatArray109[9];
		@Pc(318) float local318 = (float) arg3 * this.aClass442_18.aFloatArray109[1] + this.aClass442_18.aFloatArray109[13] + (float) arg4 * this.aClass442_18.aFloatArray109[5] + this.aClass442_18.aFloatArray109[9] * (float) arg5;
		if (local285 < -local100 && local318 < -local133) {
			local1 |= 0x4;
		}
		if (local285 > local100 && local318 > local133) {
			local1 |= 0x8;
		}
		return local1;
	}

	@OriginalMember(owner = "client!aeh", name = "io", descriptor = "(IIIIII)I", line = 1465)
	@Override
	public int method20242(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) int local1 = 0;
		@Pc(34) float local34 = (float) arg0 * this.aClass442_18.aFloatArray109[2] + this.aClass442_18.aFloatArray109[14] + this.aClass442_18.aFloatArray109[6] * (float) arg1 + this.aClass442_18.aFloatArray109[10] * (float) arg2;
		@Pc(67) float local67 = (float) arg5 * this.aClass442_18.aFloatArray109[10] + this.aClass442_18.aFloatArray109[14] + this.aClass442_18.aFloatArray109[2] * (float) arg3 + this.aClass442_18.aFloatArray109[6] * (float) arg4;
		@Pc(100) float local100 = this.aClass442_18.aFloatArray109[11] * (float) arg2 + this.aClass442_18.aFloatArray109[7] * (float) arg1 + this.aClass442_18.aFloatArray109[3] * (float) arg0 + this.aClass442_18.aFloatArray109[15];
		@Pc(133) float local133 = this.aClass442_18.aFloatArray109[7] * (float) arg4 + (float) arg3 * this.aClass442_18.aFloatArray109[3] + this.aClass442_18.aFloatArray109[15] + this.aClass442_18.aFloatArray109[11] * (float) arg5;
		if (local34 < -local100 && local67 < -local133) {
			local1 |= 0x10;
		} else if (local34 > local100 && local67 > local133) {
			local1 |= 0x20;
		}
		@Pc(193) float local193 = (float) arg2 * this.aClass442_18.aFloatArray109[8] + (float) arg0 * this.aClass442_18.aFloatArray109[0] + this.aClass442_18.aFloatArray109[12] + this.aClass442_18.aFloatArray109[4] * (float) arg1;
		@Pc(226) float local226 = (float) arg4 * this.aClass442_18.aFloatArray109[4] + (float) arg3 * this.aClass442_18.aFloatArray109[0] + this.aClass442_18.aFloatArray109[12] + (float) arg5 * this.aClass442_18.aFloatArray109[8];
		if (local193 < -local100 && local226 < -local133) {
			local1 |= 0x1;
		}
		if (local193 > local100 && local226 > local133) {
			local1 |= 0x2;
		}
		@Pc(285) float local285 = this.aClass442_18.aFloatArray109[13] + this.aClass442_18.aFloatArray109[1] * (float) arg0 + this.aClass442_18.aFloatArray109[5] * (float) arg1 + (float) arg2 * this.aClass442_18.aFloatArray109[9];
		@Pc(318) float local318 = (float) arg3 * this.aClass442_18.aFloatArray109[1] + this.aClass442_18.aFloatArray109[13] + (float) arg4 * this.aClass442_18.aFloatArray109[5] + this.aClass442_18.aFloatArray109[9] * (float) arg5;
		if (local285 < -local100 && local318 < -local133) {
			local1 |= 0x4;
		}
		if (local285 > local100 && local318 > local133) {
			local1 |= 0x8;
		}
		return local1;
	}

	@OriginalMember(owner = "client!aeh", name = "il", descriptor = "(IIIILclient!ow;Lclient!oh;)Z", line = 1484)
	@Override
	boolean method20194(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class455 arg4, @OriginalArg(5) Class441 arg5) {
		@Pc(2) Class442 local2 = this.method20282();
		local2.method28969(arg4);
		local2.method28965(this.aClass442_18);
		return arg5.method28950(arg0, arg1, arg2, arg3, local2, this.aFloat28, this.aFloat33, this.aFloat30, this.aFloat31);
	}

	@OriginalMember(owner = "client!aeh", name = "cp", descriptor = "(IIIILclient!ow;Lclient!oh;)Z", line = 1484)
	@Override
	boolean method20098(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class455 arg4, @OriginalArg(5) Class441 arg5) {
		@Pc(2) Class442 local2 = this.method20282();
		local2.method28969(arg4);
		local2.method28965(this.aClass442_18);
		return arg5.method28950(arg0, arg1, arg2, arg3, local2, this.aFloat28, this.aFloat33, this.aFloat30, this.aFloat31);
	}

	@OriginalMember(owner = "client!aeh", name = "ih", descriptor = "(IIIILclient!ow;Lclient!oh;)Z", line = 1484)
	@Override
	boolean method20243(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class455 arg4, @OriginalArg(5) Class441 arg5) {
		@Pc(2) Class442 local2 = this.method20282();
		local2.method28969(arg4);
		local2.method28965(this.aClass442_18);
		return arg5.method28950(arg0, arg1, arg2, arg3, local2, this.aFloat28, this.aFloat33, this.aFloat30, this.aFloat31);
	}

	@OriginalMember(owner = "client!aeh", name = "ie", descriptor = "(IIIILclient!ow;Lclient!oh;)Z", line = 1484)
	@Override
	boolean method20244(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class455 arg4, @OriginalArg(5) Class441 arg5) {
		@Pc(2) Class442 local2 = this.method20282();
		local2.method28969(arg4);
		local2.method28965(this.aClass442_18);
		return arg5.method28950(arg0, arg1, arg2, arg3, local2, this.aFloat28, this.aFloat33, this.aFloat30, this.aFloat31);
	}

	@OriginalMember(owner = "client!aeh", name = "cw", descriptor = "(Lclient!ow;Lclient!eh;Lclient!oh;)V", line = 1491)
	@Override
	public void method20099(@OriginalArg(0) Class455 arg0, @OriginalArg(1) Class224 arg1, @OriginalArg(2) Class441 arg2) {
		@Pc(2) Class442 local2 = this.method20282();
		local2.method28969(arg0);
		local2.method28965(this.aClass442_18);
		arg1.method25775(arg2, this.aClass442_20, local2, this.aFloat28, this.aFloat33, this.aFloat30, this.aFloat31);
	}

	@OriginalMember(owner = "client!aeh", name = "iv", descriptor = "(Lclient!ow;Lclient!eh;Lclient!oh;)V", line = 1491)
	@Override
	public void method20245(@OriginalArg(0) Class455 arg0, @OriginalArg(1) Class224 arg1, @OriginalArg(2) Class441 arg2) {
		@Pc(2) Class442 local2 = this.method20282();
		local2.method28969(arg0);
		local2.method28965(this.aClass442_18);
		arg1.method25775(arg2, this.aClass442_20, local2, this.aFloat28, this.aFloat33, this.aFloat30, this.aFloat31);
	}

	@OriginalMember(owner = "client!aeh", name = "js", descriptor = "(I)Lclient!aja;", line = 1498)
	@Override
	public Class77_Sub2 method20247(@OriginalArg(0) int arg0) {
		return null;
	}

	@OriginalMember(owner = "client!aeh", name = "ck", descriptor = "(I)Lclient!aja;", line = 1498)
	@Override
	public Class77_Sub2 method20100(@OriginalArg(0) int arg0) {
		return null;
	}

	@OriginalMember(owner = "client!aeh", name = "jz", descriptor = "(I)Lclient!aja;", line = 1498)
	@Override
	public Class77_Sub2 method20355(@OriginalArg(0) int arg0) {
		return null;
	}

	@OriginalMember(owner = "client!aeh", name = "jr", descriptor = "(Lclient!aja;)V", line = 1501)
	@Override
	public void method20248(@OriginalArg(0) Class77_Sub2 arg0) {
	}

	@OriginalMember(owner = "client!aeh", name = "jv", descriptor = "(Lclient!aja;)V", line = 1501)
	@Override
	public void method20249(@OriginalArg(0) Class77_Sub2 arg0) {
	}

	@OriginalMember(owner = "client!aeh", name = "ch", descriptor = "(Lclient!aja;)V", line = 1501)
	@Override
	public void method20300(@OriginalArg(0) Class77_Sub2 arg0) {
	}

	@OriginalMember(owner = "client!aeh", name = "jo", descriptor = "(IIZZ)Lclient!cy;", line = 1504)
	@Override
	public Class83 method20181(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3) {
		return arg2 ? new Class83_Sub1_Sub1(this, arg0, arg1) : new Class83_Sub1_Sub3(this, arg0, arg1);
	}

	@OriginalMember(owner = "client!aeh", name = "ca", descriptor = "(IIZZ)Lclient!cy;", line = 1504)
	@Override
	public Class83 method20102(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3) {
		return arg2 ? new Class83_Sub1_Sub1(this, arg0, arg1) : new Class83_Sub1_Sub3(this, arg0, arg1);
	}

	@OriginalMember(owner = "client!aeh", name = "jl", descriptor = "(IIZZ)Lclient!cy;", line = 1504)
	@Override
	public Class83 method20350(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3) {
		return arg2 ? new Class83_Sub1_Sub1(this, arg0, arg1) : new Class83_Sub1_Sub3(this, arg0, arg1);
	}

	@OriginalMember(owner = "client!aeh", name = "jn", descriptor = "([IIIIIZ)Lclient!cy;", line = 1509)
	@Override
	public Class83 method20128(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		@Pc(1) boolean local1 = false;
		@Pc(3) int local3 = arg1;
		for (@Pc(5) int local5 = 0; local5 < arg4; local5++) {
			for (@Pc(10) int local10 = 0; local10 < arg3; local10++) {
				@Pc(20) int local20 = arg0[local3++] >>> 24;
				if (local20 != 0 && local20 != 255) {
					local1 = true;
					return local1 ? new Class83_Sub1_Sub1(this, arg0, arg1, arg2, arg3, arg4, arg5) : new Class83_Sub1_Sub3(this, arg0, arg1, arg2, arg3, arg4, arg5);
				}
			}
		}
		return local1 ? new Class83_Sub1_Sub1(this, arg0, arg1, arg2, arg3, arg4, arg5) : new Class83_Sub1_Sub3(this, arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!aeh", name = "cr", descriptor = "([IIIIIZ)Lclient!cy;", line = 1509)
	@Override
	public Class83 method20103(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		@Pc(1) boolean local1 = false;
		@Pc(3) int local3 = arg1;
		for (@Pc(5) int local5 = 0; local5 < arg4; local5++) {
			for (@Pc(10) int local10 = 0; local10 < arg3; local10++) {
				@Pc(20) int local20 = arg0[local3++] >>> 24;
				if (local20 != 0 && local20 != 255) {
					local1 = true;
					return local1 ? new Class83_Sub1_Sub1(this, arg0, arg1, arg2, arg3, arg4, arg5) : new Class83_Sub1_Sub3(this, arg0, arg1, arg2, arg3, arg4, arg5);
				}
			}
		}
		return local1 ? new Class83_Sub1_Sub1(this, arg0, arg1, arg2, arg3, arg4, arg5) : new Class83_Sub1_Sub3(this, arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!aeh", name = "ct", descriptor = "(Lclient!dg;Z)Lclient!cy;", line = 1525)
	@Override
	public Class83 method20076(@OriginalArg(0) Class89 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(2) int local2 = arg0.method6682();
		@Pc(5) int local5 = arg0.method6683();
		@Pc(80) Class83_Sub1 local80;
		if (arg1 && !arg0.method6693() && arg0.method6680()) {
			@Pc(16) Class89_Sub2 local16 = (Class89_Sub2) arg0;
			@Pc(21) int[] local21 = new int[local16.anIntArray69.length];
			@Pc(26) byte[] local26 = new byte[local2 * local5];
			@Pc(28) int local28;
			for (local28 = 0; local28 < local5; local28++) {
				@Pc(35) int local35 = local2 * local28;
				for (@Pc(37) int local37 = 0; local37 < local2; local37++) {
					local26[local35 + local37] = local16.aByteArray16[local35 + local37];
				}
			}
			for (local28 = 0; local28 < local16.anIntArray69.length; local28++) {
				local21[local28] = local16.anIntArray69[local28];
			}
			local80 = new Class83_Sub1_Sub2(this, local26, local21, local2, local5);
		} else {
			@Pc(85) int[] local85 = arg0.method6686(false);
			if (arg0.method6693()) {
				local80 = new Class83_Sub1_Sub1(this, local85, local2, local5);
			} else {
				local80 = new Class83_Sub1_Sub3(this, local85, local2, local5);
			}
		}
		local80.method18167(arg0.method6684(), arg0.method6701(), arg0.method6685(), arg0.method6687());
		return local80;
	}

	@OriginalMember(owner = "client!aeh", name = "nk", descriptor = "(Lclient!dg;Z)Lclient!cy;", line = 1525)
	@Override
	public Class83 method20071(@OriginalArg(0) Class89 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(2) int local2 = arg0.method6682();
		@Pc(5) int local5 = arg0.method6683();
		@Pc(80) Class83_Sub1 local80;
		if (arg1 && !arg0.method6693() && arg0.method6680()) {
			@Pc(16) Class89_Sub2 local16 = (Class89_Sub2) arg0;
			@Pc(21) int[] local21 = new int[local16.anIntArray69.length];
			@Pc(26) byte[] local26 = new byte[local2 * local5];
			@Pc(28) int local28;
			for (local28 = 0; local28 < local5; local28++) {
				@Pc(35) int local35 = local2 * local28;
				for (@Pc(37) int local37 = 0; local37 < local2; local37++) {
					local26[local35 + local37] = local16.aByteArray16[local35 + local37];
				}
			}
			for (local28 = 0; local28 < local16.anIntArray69.length; local28++) {
				local21[local28] = local16.anIntArray69[local28];
			}
			local80 = new Class83_Sub1_Sub2(this, local26, local21, local2, local5);
		} else {
			@Pc(85) int[] local85 = arg0.method6686(false);
			if (arg0.method6693()) {
				local80 = new Class83_Sub1_Sub1(this, local85, local2, local5);
			} else {
				local80 = new Class83_Sub1_Sub3(this, local85, local2, local5);
			}
		}
		local80.method18167(arg0.method6684(), arg0.method6701(), arg0.method6685(), arg0.method6687());
		return local80;
	}

	@OriginalMember(owner = "client!aeh", name = "jd", descriptor = "(IIIIZ)Lclient!cy;", line = 1551)
	@Override
	public Class83 method20253(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		if (this.anIntArray39 == null) {
			throw new IllegalStateException("");
		}
		@Pc(13) int[] local13 = new int[arg3 * arg2];
		@Pc(22) int local22 = arg0 + arg1 * 356365251 * this.anInt547;
		@Pc(29) int local29 = this.anInt547 * 356365251 - arg2;
		for (@Pc(31) int local31 = 0; local31 < arg3; local31++) {
			@Pc(38) int local38 = arg2 * local31;
			for (@Pc(40) int local40 = 0; local40 < arg2; local40++) {
				local13[local40 + local38] = this.anIntArray39[local22++];
			}
			local22 += local29;
		}
		if (arg4) {
			return new Class83_Sub1_Sub1(this, local13, arg2, arg3);
		} else {
			return new Class83_Sub1_Sub3(this, local13, arg2, arg3);
		}
	}

	@OriginalMember(owner = "client!aeh", name = "cv", descriptor = "(IIIIZ)Lclient!cy;", line = 1551)
	@Override
	public Class83 method20105(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		if (this.anIntArray39 == null) {
			throw new IllegalStateException("");
		}
		@Pc(13) int[] local13 = new int[arg3 * arg2];
		@Pc(22) int local22 = arg0 + arg1 * 356365251 * this.anInt547;
		@Pc(29) int local29 = this.anInt547 * 356365251 - arg2;
		for (@Pc(31) int local31 = 0; local31 < arg3; local31++) {
			@Pc(38) int local38 = arg2 * local31;
			for (@Pc(40) int local40 = 0; local40 < arg2; local40++) {
				local13[local40 + local38] = this.anIntArray39[local22++];
			}
			local22 += local29;
		}
		if (arg4) {
			return new Class83_Sub1_Sub1(this, local13, arg2, arg3);
		} else {
			return new Class83_Sub1_Sub3(this, local13, arg2, arg3);
		}
	}

	@OriginalMember(owner = "client!aeh", name = "jk", descriptor = "(IIIIZ)Lclient!cy;", line = 1551)
	@Override
	public Class83 method20254(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		if (this.anIntArray39 == null) {
			throw new IllegalStateException("");
		}
		@Pc(13) int[] local13 = new int[arg3 * arg2];
		@Pc(22) int local22 = arg0 + arg1 * 356365251 * this.anInt547;
		@Pc(29) int local29 = this.anInt547 * 356365251 - arg2;
		for (@Pc(31) int local31 = 0; local31 < arg3; local31++) {
			@Pc(38) int local38 = arg2 * local31;
			for (@Pc(40) int local40 = 0; local40 < arg2; local40++) {
				local13[local40 + local38] = this.anIntArray39[local22++];
			}
			local22 += local29;
		}
		if (arg4) {
			return new Class83_Sub1_Sub1(this, local13, arg2, arg3);
		} else {
			return new Class83_Sub1_Sub3(this, local13, arg2, arg3);
		}
	}

	@OriginalMember(owner = "client!aeh", name = "co", descriptor = "(II[I[I)Lclient!cd;", line = 1567)
	@Override
	public Class90 method20362(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return new Class90_Sub2(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!aeh", name = "jg", descriptor = "(II[I[I)Lclient!cd;", line = 1567)
	@Override
	public Class90 method20246(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return new Class90_Sub2(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!aeh", name = "ne", descriptor = "(ILclient!cd;II)V", line = 1571)
	@Override
	public void method20339(@OriginalArg(0) int arg0, @OriginalArg(1) Class90 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anIntArray39 == null) {
			return;
		}
		@Pc(7) Class90_Sub2 local7 = (Class90_Sub2) arg1;
		@Pc(10) int[] local10 = local7.anIntArray67;
		@Pc(13) int[] local13 = local7.anIntArray68;
		@Pc(29) int local29;
		if (this.anInt542 * 639238427 < local10.length + arg3) {
			local29 = this.anInt542 * 639238427 - arg3;
		} else {
			local29 = local10.length;
		}
		@Pc(46) int local46;
		if (this.anInt541 * 9823353 > arg3) {
			local46 = this.anInt541 * 9823353 - arg3;
			arg3 = this.anInt541 * 9823353;
		} else {
			local46 = 0;
		}
		if (local29 - local46 <= 0) {
			return;
		}
		@Pc(66) int local66 = arg3 * 356365251 * this.anInt547;
		for (@Pc(68) int local68 = local46; local68 < local29; local68++) {
			@Pc(77) int local77 = arg2 + local10[local68];
			@Pc(81) int local81 = local13[local68];
			if (this.anInt553 * 1709859847 > local77) {
				local81 -= this.anInt553 * 1709859847 - local77;
				local77 = this.anInt553 * 1709859847;
			}
			if (this.anInt540 * -1807368365 < local77 + local81) {
				local81 = this.anInt540 * -1807368365 - local77;
			}
			local77 += local66;
			for (@Pc(123) int local123 = -local81; local123 < 0; local123++) {
				this.anIntArray39[local77++] = arg0;
			}
			local66 += this.anInt547 * 356365251;
		}
	}

	@OriginalMember(owner = "client!aeh", name = "cn", descriptor = "(ILclient!cd;II)V", line = 1571)
	@Override
	public void method20110(@OriginalArg(0) int arg0, @OriginalArg(1) Class90 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anIntArray39 == null) {
			return;
		}
		@Pc(7) Class90_Sub2 local7 = (Class90_Sub2) arg1;
		@Pc(10) int[] local10 = local7.anIntArray67;
		@Pc(13) int[] local13 = local7.anIntArray68;
		@Pc(29) int local29;
		if (this.anInt542 * 639238427 < local10.length + arg3) {
			local29 = this.anInt542 * 639238427 - arg3;
		} else {
			local29 = local10.length;
		}
		@Pc(46) int local46;
		if (this.anInt541 * 9823353 > arg3) {
			local46 = this.anInt541 * 9823353 - arg3;
			arg3 = this.anInt541 * 9823353;
		} else {
			local46 = 0;
		}
		if (local29 - local46 <= 0) {
			return;
		}
		@Pc(66) int local66 = arg3 * 356365251 * this.anInt547;
		for (@Pc(68) int local68 = local46; local68 < local29; local68++) {
			@Pc(77) int local77 = arg2 + local10[local68];
			@Pc(81) int local81 = local13[local68];
			if (this.anInt553 * 1709859847 > local77) {
				local81 -= this.anInt553 * 1709859847 - local77;
				local77 = this.anInt553 * 1709859847;
			}
			if (this.anInt540 * -1807368365 < local77 + local81) {
				local81 = this.anInt540 * -1807368365 - local77;
			}
			local77 += local66;
			for (@Pc(123) int local123 = -local81; local123 < 0; local123++) {
				this.anIntArray39[local77++] = arg0;
			}
			local66 += this.anInt547 * 356365251;
		}
	}

	@OriginalMember(owner = "client!aeh", name = "nx", descriptor = "(ILclient!cd;II)V", line = 1571)
	@Override
	public void method20338(@OriginalArg(0) int arg0, @OriginalArg(1) Class90 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anIntArray39 == null) {
			return;
		}
		@Pc(7) Class90_Sub2 local7 = (Class90_Sub2) arg1;
		@Pc(10) int[] local10 = local7.anIntArray67;
		@Pc(13) int[] local13 = local7.anIntArray68;
		@Pc(29) int local29;
		if (this.anInt542 * 639238427 < local10.length + arg3) {
			local29 = this.anInt542 * 639238427 - arg3;
		} else {
			local29 = local10.length;
		}
		@Pc(46) int local46;
		if (this.anInt541 * 9823353 > arg3) {
			local46 = this.anInt541 * 9823353 - arg3;
			arg3 = this.anInt541 * 9823353;
		} else {
			local46 = 0;
		}
		if (local29 - local46 <= 0) {
			return;
		}
		@Pc(66) int local66 = arg3 * 356365251 * this.anInt547;
		for (@Pc(68) int local68 = local46; local68 < local29; local68++) {
			@Pc(77) int local77 = arg2 + local10[local68];
			@Pc(81) int local81 = local13[local68];
			if (this.anInt553 * 1709859847 > local77) {
				local81 -= this.anInt553 * 1709859847 - local77;
				local77 = this.anInt553 * 1709859847;
			}
			if (this.anInt540 * -1807368365 < local77 + local81) {
				local81 = this.anInt540 * -1807368365 - local77;
			}
			local77 += local66;
			for (@Pc(123) int local123 = -local81; local123 < 0; local123++) {
				this.anIntArray39[local77++] = arg0;
			}
			local66 += this.anInt547 * 356365251;
		}
	}

	@OriginalMember(owner = "client!aeh", name = "jp", descriptor = "(Lclient!aar;[Lclient!dg;Z)Lclient!dj;", line = 1601)
	@Override
	public Class94 method20267(@OriginalArg(0) Class17 arg0, @OriginalArg(1) Class89[] arg1, @OriginalArg(2) boolean arg2) {
		@Pc(3) int[] local3 = new int[arg1.length];
		@Pc(7) int[] local7 = new int[arg1.length];
		@Pc(9) boolean local9 = false;
		@Pc(11) boolean local11 = false;
		for (@Pc(13) int local13 = 0; local13 < arg1.length; local13++) {
			local3[local13] = arg1[local13].method6682();
			local7[local13] = arg1[local13].method6683();
			if (arg1[local13].method6693()) {
				local9 = true;
			}
			if (arg1[local13].method6680()) {
				local11 = true;
			}
		}
		if (arg2) {
			if (local11) {
				if (local9) {
					return new Class94_Sub5(this, arg0, (Class89_Sub2[]) arg1, local3, local7);
				} else {
					return new Class94_Sub4(this, arg0, (Class89_Sub2[]) arg1, local3, local7);
				}
			} else if (local9) {
				return new Class94_Sub5(this, arg0, (Class89_Sub1[]) arg1, local3, local7);
			} else {
				return new Class94_Sub4(this, arg0, (Class89_Sub1[]) arg1, local3, local7);
			}
		} else if (!local11) {
			return new Class94_Sub1(this, arg0, (Class89_Sub1[]) arg1, local3, local7);
		} else if (local9) {
			throw new IllegalArgumentException("");
		} else {
			return new Class94_Sub6(this, arg0, (Class89_Sub2[]) arg1, local3, local7);
		}
	}

	@OriginalMember(owner = "client!aeh", name = "jx", descriptor = "(Lclient!aar;[Lclient!dg;Z)Lclient!dj;", line = 1601)
	@Override
	public Class94 method20256(@OriginalArg(0) Class17 arg0, @OriginalArg(1) Class89[] arg1, @OriginalArg(2) boolean arg2) {
		@Pc(3) int[] local3 = new int[arg1.length];
		@Pc(7) int[] local7 = new int[arg1.length];
		@Pc(9) boolean local9 = false;
		@Pc(11) boolean local11 = false;
		for (@Pc(13) int local13 = 0; local13 < arg1.length; local13++) {
			local3[local13] = arg1[local13].method6682();
			local7[local13] = arg1[local13].method6683();
			if (arg1[local13].method6693()) {
				local9 = true;
			}
			if (arg1[local13].method6680()) {
				local11 = true;
			}
		}
		if (arg2) {
			if (local11) {
				if (local9) {
					return new Class94_Sub5(this, arg0, (Class89_Sub2[]) arg1, local3, local7);
				} else {
					return new Class94_Sub4(this, arg0, (Class89_Sub2[]) arg1, local3, local7);
				}
			} else if (local9) {
				return new Class94_Sub5(this, arg0, (Class89_Sub1[]) arg1, local3, local7);
			} else {
				return new Class94_Sub4(this, arg0, (Class89_Sub1[]) arg1, local3, local7);
			}
		} else if (!local11) {
			return new Class94_Sub1(this, arg0, (Class89_Sub1[]) arg1, local3, local7);
		} else if (local9) {
			throw new IllegalArgumentException("");
		} else {
			return new Class94_Sub6(this, arg0, (Class89_Sub2[]) arg1, local3, local7);
		}
	}

	@OriginalMember(owner = "client!aeh", name = "cq", descriptor = "(Lclient!aar;[Lclient!dg;Z)Lclient!dj;", line = 1601)
	@Override
	public Class94 method20111(@OriginalArg(0) Class17 arg0, @OriginalArg(1) Class89[] arg1, @OriginalArg(2) boolean arg2) {
		@Pc(3) int[] local3 = new int[arg1.length];
		@Pc(7) int[] local7 = new int[arg1.length];
		@Pc(9) boolean local9 = false;
		@Pc(11) boolean local11 = false;
		for (@Pc(13) int local13 = 0; local13 < arg1.length; local13++) {
			local3[local13] = arg1[local13].method6682();
			local7[local13] = arg1[local13].method6683();
			if (arg1[local13].method6693()) {
				local9 = true;
			}
			if (arg1[local13].method6680()) {
				local11 = true;
			}
		}
		if (arg2) {
			if (local11) {
				if (local9) {
					return new Class94_Sub5(this, arg0, (Class89_Sub2[]) arg1, local3, local7);
				} else {
					return new Class94_Sub4(this, arg0, (Class89_Sub2[]) arg1, local3, local7);
				}
			} else if (local9) {
				return new Class94_Sub5(this, arg0, (Class89_Sub1[]) arg1, local3, local7);
			} else {
				return new Class94_Sub4(this, arg0, (Class89_Sub1[]) arg1, local3, local7);
			}
		} else if (!local11) {
			return new Class94_Sub1(this, arg0, (Class89_Sub1[]) arg1, local3, local7);
		} else if (local9) {
			throw new IllegalArgumentException("");
		} else {
			return new Class94_Sub6(this, arg0, (Class89_Sub2[]) arg1, local3, local7);
		}
	}

	@OriginalMember(owner = "client!aeh", name = "jh", descriptor = "(I)V", line = 1633)
	@Override
	public void method20257(@OriginalArg(0) int arg0) {
		Class84_Sub2.anInt585 = arg0;
		Class84_Sub2.anInt583 = arg0;
		if (this.anInt554 * 442227785 > 1) {
			throw new IllegalStateException();
		}
		this.method4882(this.anInt554 * 442227785);
		this.method4880(0);
	}

	@OriginalMember(owner = "client!aeh", name = "cd", descriptor = "(I)V", line = 1633)
	@Override
	public void method20114(@OriginalArg(0) int arg0) {
		Class84_Sub2.anInt585 = arg0;
		Class84_Sub2.anInt583 = arg0;
		if (this.anInt554 * 442227785 > 1) {
			throw new IllegalStateException();
		}
		this.method4882(this.anInt554 * 442227785);
		this.method4880(0);
	}

	@OriginalMember(owner = "client!aeh", name = "cj", descriptor = "(Lclient!dz;IIII)Lclient!dv;", line = 1640)
	@Override
	public Class84 method20115(@OriginalArg(0) Class216 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class84_Sub2(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!aeh", name = "jw", descriptor = "(Lclient!dz;IIII)Lclient!dv;", line = 1640)
	@Override
	public Class84 method20258(@OriginalArg(0) Class216 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class84_Sub2(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!aeh", name = "ce", descriptor = "(II)I", line = 1644)
	@Override
	public int method20116(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg0 | 0x20800;
		return local3 & arg1 ^ arg1;
	}

	@OriginalMember(owner = "client!aeh", name = "jy", descriptor = "(II)I", line = 1644)
	@Override
	public int method20235(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg0 | 0x20800;
		return local3 & arg1 ^ arg1;
	}

	@OriginalMember(owner = "client!aeh", name = "jb", descriptor = "(II)I", line = 1644)
	@Override
	public int method20259(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg0 | 0x20800;
		return local3 & arg1 ^ arg1;
	}

	@OriginalMember(owner = "client!aeh", name = "do", descriptor = "(II)I", line = 1649)
	@Override
	public int method20117(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!aeh", name = "ns", descriptor = "(II)I", line = 1649)
	@Override
	public int method20156(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!aeh", name = "dt", descriptor = "(II[[I[[IIII)Lclient!cj;", line = 1653)
	@Override
	public Class88 method20118(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		return new Class88_Sub3(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!aeh", name = "ja", descriptor = "(II[[I[[IIII)Lclient!cj;", line = 1653)
	@Override
	public Class88 method20273(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		return new Class88_Sub3(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!aeh", name = "nj", descriptor = "()Lclient!oi;", line = 1657)
	@Override
	public Class442 method20341() {
		@Pc(3) Class95 local3 = this.method4886(Thread.currentThread());
		return local3.aClass442_30;
	}

	@OriginalMember(owner = "client!aeh", name = "cy", descriptor = "()Lclient!oi;", line = 1657)
	@Override
	public Class442 method20282() {
		@Pc(3) Class95 local3 = this.method4886(Thread.currentThread());
		return local3.aClass442_30;
	}

	@OriginalMember(owner = "client!aeh", name = "nb", descriptor = "()Lclient!oi;", line = 1657)
	@Override
	public Class442 method20122() {
		@Pc(3) Class95 local3 = this.method4886(Thread.currentThread());
		return local3.aClass442_30;
	}

	@OriginalMember(owner = "client!aeh", name = "cs", descriptor = "()Lclient!ow;", line = 1662)
	@Override
	public Class455 method20370() {
		@Pc(3) Class95 local3 = this.method4886(Thread.currentThread());
		return local3.aClass455_11;
	}

	@OriginalMember(owner = "client!aeh", name = "jc", descriptor = "()Lclient!ow;", line = 1662)
	@Override
	public Class455 method20261() {
		@Pc(3) Class95 local3 = this.method4886(Thread.currentThread());
		return local3.aClass455_11;
	}

	@OriginalMember(owner = "client!aeh", name = "dp", descriptor = "()I", line = 1667)
	@Override
	public int method20129() {
		return 0;
	}

	@OriginalMember(owner = "client!aeh", name = "je", descriptor = "()I", line = 1667)
	@Override
	public int method20265() {
		return 0;
	}

	@OriginalMember(owner = "client!aeh", name = "jm", descriptor = "()I", line = 1667)
	@Override
	public int method20262() {
		return 0;
	}

	@OriginalMember(owner = "client!aeh", name = "jq", descriptor = "()I", line = 1667)
	@Override
	public int method20263() {
		return 0;
	}

	@OriginalMember(owner = "client!aeh", name = "ju", descriptor = "()I", line = 1667)
	@Override
	public int method20264() {
		return 0;
	}

	@OriginalMember(owner = "client!aeh", name = "jf", descriptor = "()I", line = 1667)
	@Override
	public int method20266() {
		return 0;
	}

	@OriginalMember(owner = "client!aeh", name = "de", descriptor = "(IIIIIF)Lclient!ajv;", line = 1671)
	@Override
	public Class77_Sub22 method20026(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return null;
	}

	@OriginalMember(owner = "client!aeh", name = "qw", descriptor = "(IIIIIF)Lclient!ajv;", line = 1671)
	@Override
	public Class77_Sub22 method20025(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return null;
	}

	@OriginalMember(owner = "client!aeh", name = "qs", descriptor = "(IIIIIF)Lclient!ajv;", line = 1671)
	@Override
	public Class77_Sub22 method20027(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return null;
	}

	@OriginalMember(owner = "client!aeh", name = "qf", descriptor = "(IIIIIF)Lclient!ajv;", line = 1671)
	@Override
	public Class77_Sub22 method20028(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return null;
	}

	@OriginalMember(owner = "client!aeh", name = "jj", descriptor = "(I[Lclient!ajv;)V", line = 1674)
	@Override
	public void method20367(@OriginalArg(0) int arg0, @OriginalArg(1) Class77_Sub22[] arg1) {
	}

	@OriginalMember(owner = "client!aeh", name = "du", descriptor = "(I[Lclient!ajv;)V", line = 1674)
	@Override
	public void method20365(@OriginalArg(0) int arg0, @OriginalArg(1) Class77_Sub22[] arg1) {
	}

	@OriginalMember(owner = "client!aeh", name = "jt", descriptor = "(I[Lclient!ajv;)V", line = 1674)
	@Override
	public void method20268(@OriginalArg(0) int arg0, @OriginalArg(1) Class77_Sub22[] arg1) {
	}

	@OriginalMember(owner = "client!aeh", name = "rx", descriptor = "(I)V", line = 1677)
	void method4880(@OriginalArg(0) int arg0) {
		this.aClass95Array1[arg0].method7033(Thread.currentThread());
	}

	@OriginalMember(owner = "client!aeh", name = "tj", descriptor = "(I)V", line = 1681)
	void method4881(@OriginalArg(0) int arg0) {
		this.anInt554 = arg0 * 258921977;
		this.aClass95Array1 = new Class95[this.anInt554 * 442227785];
		for (@Pc(13) int local13 = 0; local13 < this.anInt554 * 442227785; local13++) {
			this.aClass95Array1[local13] = new Class95(this);
		}
	}

	@OriginalMember(owner = "client!aeh", name = "rd", descriptor = "(I)V", line = 1681)
	void method4882(@OriginalArg(0) int arg0) {
		this.anInt554 = arg0 * 258921977;
		this.aClass95Array1 = new Class95[this.anInt554 * 442227785];
		for (@Pc(13) int local13 = 0; local13 < this.anInt554 * 442227785; local13++) {
			this.aClass95Array1[local13] = new Class95(this);
		}
	}

	@OriginalMember(owner = "client!aeh", name = "tv", descriptor = "(I)V", line = 1681)
	void method4883(@OriginalArg(0) int arg0) {
		this.anInt554 = arg0 * 258921977;
		this.aClass95Array1 = new Class95[this.anInt554 * 442227785];
		for (@Pc(13) int local13 = 0; local13 < this.anInt554 * 442227785; local13++) {
			this.aClass95Array1[local13] = new Class95(this);
		}
	}

	@OriginalMember(owner = "client!aeh", name = "tf", descriptor = "(I)V", line = 1681)
	void method4884(@OriginalArg(0) int arg0) {
		this.anInt554 = arg0 * 258921977;
		this.aClass95Array1 = new Class95[this.anInt554 * 442227785];
		for (@Pc(13) int local13 = 0; local13 < this.anInt554 * 442227785; local13++) {
			this.aClass95Array1[local13] = new Class95(this);
		}
	}

	@OriginalMember(owner = "client!aeh", name = "tz", descriptor = "(I)V", line = 1681)
	void method4885(@OriginalArg(0) int arg0) {
		this.anInt554 = arg0 * 258921977;
		this.aClass95Array1 = new Class95[this.anInt554 * 442227785];
		for (@Pc(13) int local13 = 0; local13 < this.anInt554 * 442227785; local13++) {
			this.aClass95Array1[local13] = new Class95(this);
		}
	}

	@OriginalMember(owner = "client!aeh", name = "rh", descriptor = "(Ljava/lang/Runnable;)Lclient!af;", line = 1689)
	Class95 method4886(@OriginalArg(0) Runnable arg0) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt554 * 442227785; local1++) {
			if (arg0 == this.aClass95Array1[local1].aRunnable1) {
				return this.aClass95Array1[local1];
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!aeh", name = "td", descriptor = "(Ljava/lang/Runnable;)Lclient!af;", line = 1689)
	Class95 method4887(@OriginalArg(0) Runnable arg0) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt554 * 442227785; local1++) {
			if (arg0 == this.aClass95Array1[local1].aRunnable1) {
				return this.aClass95Array1[local1];
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!aeh", name = "dq", descriptor = "(Lclient!dm;)V", line = 1696)
	@Override
	public void method20120(@OriginalArg(0) Class207 arg0) {
		this.method4889(this.anIntArray39 != null, this.aFloatArray15 != null, false, arg0);
	}

	@OriginalMember(owner = "client!aeh", name = "ji", descriptor = "(Lclient!dm;)V", line = 1696)
	@Override
	public void method20269(@OriginalArg(0) Class207 arg0) {
		this.method4889(this.anIntArray39 != null, this.aFloatArray15 != null, false, arg0);
	}

	@OriginalMember(owner = "client!aeh", name = "tc", descriptor = "(ZZZLclient!dm;)V", line = 1701)
	void method4888(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class207 arg3) {
		@Pc(3) Class95 local3 = this.method4886(Thread.currentThread());
		for (@Pc(9) Class131_Sub2_Sub1 local9 = (Class131_Sub2_Sub1) arg3.aClass696_1.method36456(); local9 != null; local9 = (Class131_Sub2_Sub1) arg3.aClass696_1.method36459()) {
			@Pc(16) int local16 = local9.anInt3125 >> 12;
			@Pc(21) int local21 = local9.anInt3128 >> 12;
			@Pc(26) int local26 = local9.anInt3129 >> 12;
			@Pc(59) float local59 = this.aClass442_18.aFloatArray109[14] + (float) local21 * this.aClass442_18.aFloatArray109[6] + this.aClass442_18.aFloatArray109[2] * (float) local16 + this.aClass442_18.aFloatArray109[10] * (float) local26;
			@Pc(92) float local92 = this.aClass442_18.aFloatArray109[15] + this.aClass442_18.aFloatArray109[3] * (float) local16 + (float) local21 * this.aClass442_18.aFloatArray109[7] + (float) local26 * this.aClass442_18.aFloatArray109[11];
			if (!(local59 < -local92)) {
				@Pc(108) float local108 = this.aFloat32 + this.aFloat29 * local59 / local92;
				if (!(local59 > local3.aFloat78)) {
					@Pc(147) float local147 = (float) local16 * this.aClass442_18.aFloatArray109[0] + (float) local21 * this.aClass442_18.aFloatArray109[4] + this.aClass442_18.aFloatArray109[8] * (float) local26 + this.aClass442_18.aFloatArray109[12];
					@Pc(180) float local180 = (float) local21 * this.aClass442_18.aFloatArray109[5] + this.aClass442_18.aFloatArray109[1] * (float) local16 + (float) local26 * this.aClass442_18.aFloatArray109[9] + this.aClass442_18.aFloatArray109[13];
					if (!(local147 < -local92) && !(local147 > local92) && !(local180 < -local92) && !(local180 > local92)) {
						@Pc(205) float local205 = (float) local9.anInt3130 / 4096.0F;
						@Pc(215) float local215 = local147 + this.aClass442_20.aFloatArray109[0] * local205;
						@Pc(225) float local225 = this.aClass442_20.aFloatArray109[3] * local205 + local92;
						@Pc(235) float local235 = this.aFloat30 * local147 / local92 + this.aFloat28;
						@Pc(245) float local245 = this.aFloat33 + local180 * this.aFloat31 / local92;
						@Pc(255) float local255 = this.aFloat28 + local215 * this.aFloat30 / local225;
						this.method4890(arg0, arg1, arg2, local9, (int) local235, (int) local245, local108, (int) (local255 < local235 ? local235 - local255 : local255 - local235));
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!aeh", name = "rf", descriptor = "(ZZZLclient!dm;)V", line = 1701)
	void method4889(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class207 arg3) {
		@Pc(3) Class95 local3 = this.method4886(Thread.currentThread());
		for (@Pc(9) Class131_Sub2_Sub1 local9 = (Class131_Sub2_Sub1) arg3.aClass696_1.method36456(); local9 != null; local9 = (Class131_Sub2_Sub1) arg3.aClass696_1.method36459()) {
			@Pc(16) int local16 = local9.anInt3125 >> 12;
			@Pc(21) int local21 = local9.anInt3128 >> 12;
			@Pc(26) int local26 = local9.anInt3129 >> 12;
			@Pc(59) float local59 = this.aClass442_18.aFloatArray109[14] + (float) local21 * this.aClass442_18.aFloatArray109[6] + this.aClass442_18.aFloatArray109[2] * (float) local16 + this.aClass442_18.aFloatArray109[10] * (float) local26;
			@Pc(92) float local92 = this.aClass442_18.aFloatArray109[15] + this.aClass442_18.aFloatArray109[3] * (float) local16 + (float) local21 * this.aClass442_18.aFloatArray109[7] + (float) local26 * this.aClass442_18.aFloatArray109[11];
			if (!(local59 < -local92)) {
				@Pc(108) float local108 = this.aFloat32 + this.aFloat29 * local59 / local92;
				if (!(local59 > local3.aFloat78)) {
					@Pc(147) float local147 = (float) local16 * this.aClass442_18.aFloatArray109[0] + (float) local21 * this.aClass442_18.aFloatArray109[4] + this.aClass442_18.aFloatArray109[8] * (float) local26 + this.aClass442_18.aFloatArray109[12];
					@Pc(180) float local180 = (float) local21 * this.aClass442_18.aFloatArray109[5] + this.aClass442_18.aFloatArray109[1] * (float) local16 + (float) local26 * this.aClass442_18.aFloatArray109[9] + this.aClass442_18.aFloatArray109[13];
					if (!(local147 < -local92) && !(local147 > local92) && !(local180 < -local92) && !(local180 > local92)) {
						@Pc(205) float local205 = (float) local9.anInt3130 / 4096.0F;
						@Pc(215) float local215 = local147 + this.aClass442_20.aFloatArray109[0] * local205;
						@Pc(225) float local225 = this.aClass442_20.aFloatArray109[3] * local205 + local92;
						@Pc(235) float local235 = this.aFloat30 * local147 / local92 + this.aFloat28;
						@Pc(245) float local245 = this.aFloat33 + local180 * this.aFloat31 / local92;
						@Pc(255) float local255 = this.aFloat28 + local215 * this.aFloat30 / local225;
						this.method4890(arg0, arg1, arg2, local9, (int) local235, (int) local245, local108, (int) (local255 < local235 ? local235 - local255 : local255 - local235));
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!aeh", name = "rw", descriptor = "(ZZZLclient!apl;IIFI)V", line = 1726)
	void method4890(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class131_Sub2_Sub1 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) float arg6, @OriginalArg(7) int arg7) {
		@Pc(2) int local2 = arg3.anInt3131;
		@Pc(8) int local8 = arg7 << 1;
		if (local2 == -1) {
			this.method4896(arg1, arg4, arg5, arg6, arg7, arg3.anInt3126, 1);
			return;
		}
		if (this.anInt556 * 768495671 != local2) {
			@Pc(35) Class83 local35 = (Class83) this.aClass232_8.method25835((long) local2);
			if (local35 == null) {
				@Pc(44) Class215 local44 = this.aClass209_9.method25584(local2);
				@Pc(48) int[] local48 = this.method4846(local2);
				if (local48 == null) {
					return;
				}
				@Pc(56) int local56 = local44.anInt3714 * 1264459495;
				local35 = this.method20010(local48, 0, local56, local56, local56);
				this.aClass232_8.method25844(local35, (long) local2);
			}
			this.anInt556 = local2 * 1860330887;
			this.aClass83_2 = local35;
		}
		local8++;
		((Class83_Sub1) this.aClass83_2).method18223(arg0, arg1, arg2, arg4 - arg7, arg5 - arg7, arg6, local8, local8, 0, arg3.anInt3126, 1, false);
	}

	@OriginalMember(owner = "client!aeh", name = "re", descriptor = "(ZZZIIFIISIII)V", line = 1753)
	void method4891(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) short arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		if (arg6 == 0 || arg7 == 0) {
			return;
		}
		if (arg8 != -1) {
			@Pc(14) Class215 local14 = this.aClass209_9.method25584(arg8);
			if (!local14.aBoolean641) {
				if (arg8 != this.anInt556 * 768495671) {
					@Pc(30) Class83 local30 = (Class83) this.aClass232_8.method25835((long) arg8);
					if (local30 == null) {
						@Pc(36) int[] local36 = this.method4846(arg8);
						if (local36 == null) {
							return;
						}
						@Pc(44) int local44 = local14.anInt3714 * 1264459495;
						local30 = this.method20010(local36, 0, local44, local44, local44);
						this.aClass232_8.method25844(local30, (long) arg8);
					}
					this.anInt556 = arg8 * 1860330887;
					this.aClass83_2 = local30;
				}
				((Class83_Sub1) this.aClass83_2).method18223(arg0, arg1, arg2, arg3 - arg6, arg4 - arg7, arg5, arg6 << 1, arg7 << 1, arg10, arg9, arg11, local14.aClass597_2 != Class597.aClass597_5);
				return;
			}
		}
		this.method4896(arg1, arg3, arg4, arg5, arg6, arg9, arg11);
	}

	@OriginalMember(owner = "client!aeh", name = "tk", descriptor = "(ZZZIIFIISIII)V", line = 1753)
	void method4892(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) short arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		if (arg6 == 0 || arg7 == 0) {
			return;
		}
		if (arg8 != -1) {
			@Pc(14) Class215 local14 = this.aClass209_9.method25584(arg8);
			if (!local14.aBoolean641) {
				if (arg8 != this.anInt556 * 768495671) {
					@Pc(30) Class83 local30 = (Class83) this.aClass232_8.method25835((long) arg8);
					if (local30 == null) {
						@Pc(36) int[] local36 = this.method4846(arg8);
						if (local36 == null) {
							return;
						}
						@Pc(44) int local44 = local14.anInt3714 * 1264459495;
						local30 = this.method20010(local36, 0, local44, local44, local44);
						this.aClass232_8.method25844(local30, (long) arg8);
					}
					this.anInt556 = arg8 * 1860330887;
					this.aClass83_2 = local30;
				}
				((Class83_Sub1) this.aClass83_2).method18223(arg0, arg1, arg2, arg3 - arg6, arg4 - arg7, arg5, arg6 << 1, arg7 << 1, arg10, arg9, arg11, local14.aClass597_2 != Class597.aClass597_5);
				return;
			}
		}
		this.method4896(arg1, arg3, arg4, arg5, arg6, arg9, arg11);
	}

	@OriginalMember(owner = "client!aeh", name = "tn", descriptor = "(ZZZIIFIISIII)V", line = 1753)
	void method4893(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) short arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		if (arg6 == 0 || arg7 == 0) {
			return;
		}
		if (arg8 != -1) {
			@Pc(14) Class215 local14 = this.aClass209_9.method25584(arg8);
			if (!local14.aBoolean641) {
				if (arg8 != this.anInt556 * 768495671) {
					@Pc(30) Class83 local30 = (Class83) this.aClass232_8.method25835((long) arg8);
					if (local30 == null) {
						@Pc(36) int[] local36 = this.method4846(arg8);
						if (local36 == null) {
							return;
						}
						@Pc(44) int local44 = local14.anInt3714 * 1264459495;
						local30 = this.method20010(local36, 0, local44, local44, local44);
						this.aClass232_8.method25844(local30, (long) arg8);
					}
					this.anInt556 = arg8 * 1860330887;
					this.aClass83_2 = local30;
				}
				((Class83_Sub1) this.aClass83_2).method18223(arg0, arg1, arg2, arg3 - arg6, arg4 - arg7, arg5, arg6 << 1, arg7 << 1, arg10, arg9, arg11, local14.aClass597_2 != Class597.aClass597_5);
				return;
			}
		}
		this.method4896(arg1, arg3, arg4, arg5, arg6, arg9, arg11);
	}

	@OriginalMember(owner = "client!aeh", name = "tm", descriptor = "(ZZZIIFIISIII)V", line = 1753)
	void method4894(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) short arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		if (arg6 == 0 || arg7 == 0) {
			return;
		}
		if (arg8 != -1) {
			@Pc(14) Class215 local14 = this.aClass209_9.method25584(arg8);
			if (!local14.aBoolean641) {
				if (arg8 != this.anInt556 * 768495671) {
					@Pc(30) Class83 local30 = (Class83) this.aClass232_8.method25835((long) arg8);
					if (local30 == null) {
						@Pc(36) int[] local36 = this.method4846(arg8);
						if (local36 == null) {
							return;
						}
						@Pc(44) int local44 = local14.anInt3714 * 1264459495;
						local30 = this.method20010(local36, 0, local44, local44, local44);
						this.aClass232_8.method25844(local30, (long) arg8);
					}
					this.anInt556 = arg8 * 1860330887;
					this.aClass83_2 = local30;
				}
				((Class83_Sub1) this.aClass83_2).method18223(arg0, arg1, arg2, arg3 - arg6, arg4 - arg7, arg5, arg6 << 1, arg7 << 1, arg10, arg9, arg11, local14.aClass597_2 != Class597.aClass597_5);
				return;
			}
		}
		this.method4896(arg1, arg3, arg4, arg5, arg6, arg9, arg11);
	}

	@OriginalMember(owner = "client!aeh", name = "ty", descriptor = "(ZIIFIII)V", line = 1778)
	void method4895(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (this.anIntArray39 == null) {
			return;
		}
		if (arg4 < 0) {
			arg4 = -arg4;
		}
		@Pc(12) int local12 = arg2 - arg4;
		if (local12 < this.anInt541 * 9823353) {
			local12 = this.anInt541 * 9823353;
		}
		@Pc(29) int local29 = arg2 + 1 + arg4;
		if (local29 > this.anInt542 * 639238427) {
			local29 = this.anInt542 * 639238427;
		}
		@Pc(42) int local42 = local12;
		@Pc(46) int local46 = arg4 * arg4;
		@Pc(48) int local48 = 0;
		@Pc(52) int local52 = arg2 - local12;
		@Pc(56) int local56 = local52 * local52;
		@Pc(60) int local60 = local56 - local52;
		if (arg2 > local29) {
			arg2 = local29;
		}
		@Pc(69) int local69 = arg5 >>> 24;
		@Pc(107) int local107;
		@Pc(122) int local122;
		@Pc(142) int local142;
		@Pc(144) int local144;
		if (arg6 == 0 || arg6 == 1 && local69 == 255) {
			while (local42 < arg2) {
				while (local60 <= local46 || local56 <= local46) {
					local56 += local48 + local48;
					local60 += local48++ + local48;
				}
				local107 = arg1 - local48 + 1;
				if (local107 < this.anInt553 * 1709859847) {
					local107 = this.anInt553 * 1709859847;
				}
				local122 = arg1 + local48;
				if (local122 > this.anInt540 * -1807368365) {
					local122 = this.anInt540 * -1807368365;
				}
				local142 = local42 * 356365251 * this.anInt547 + local107;
				for (local144 = local107; local144 < local122; local144++) {
					if (!arg0 || arg3 < this.aFloatArray15[local142]) {
						this.anIntArray39[local142] = arg5;
					}
					local142++;
				}
				local42++;
				local56 -= local52-- + local52;
				local60 -= local52 + local52;
			}
			local48 = arg4;
			local52 = local42 - arg2;
			local60 = local46 + local52 * local52;
			local56 = local60 - arg4;
			local60 -= local52;
			while (local42 < local29) {
				while (local60 > local46 && local56 > local46) {
					local60 -= local48-- + local48;
					local56 -= local48 + local48;
				}
				local107 = arg1 - local48;
				if (local107 < this.anInt553 * 1709859847) {
					local107 = this.anInt553 * 1709859847;
				}
				local122 = local48 + arg1;
				if (local122 > this.anInt540 * -1807368365 - 1) {
					local122 = this.anInt540 * -1807368365 - 1;
				}
				local142 = local42 * 356365251 * this.anInt547 + local107;
				for (local144 = local107; local144 <= local122; local144++) {
					if (!arg0 || arg3 < this.aFloatArray15[local142]) {
						this.anIntArray39[local142] = arg5;
					}
					local142++;
				}
				local42++;
				local60 += local52 + local52;
				local56 += local52++ + local52;
			}
			return;
		}
		@Pc(399) int local399;
		@Pc(416) int local416;
		if (arg6 == 1) {
			@Pc(329) int local329 = (local69 << 24) + (local69 * (arg5 & 0xFF00) >> 8 & 0xFF00) + (local69 * (arg5 & 0xFF00FF) >> 8 & 0xFF00FF);
			local107 = 256 - local69;
			while (local42 < arg2) {
				while (local60 <= local46 || local56 <= local46) {
					local56 += local48 + local48;
					local60 += local48++ + local48;
				}
				local122 = arg1 - local48 + 1;
				if (local122 < this.anInt553 * 1709859847) {
					local122 = this.anInt553 * 1709859847;
				}
				local142 = arg1 + local48;
				if (local142 > this.anInt540 * -1807368365) {
					local142 = this.anInt540 * -1807368365;
				}
				local144 = this.anInt547 * 356365251 * local42 + local122;
				for (local399 = local122; local399 < local142; local399++) {
					if (!arg0 || arg3 < this.aFloatArray15[local144]) {
						local416 = this.anIntArray39[local144];
						@Pc(436) int local436 = (local107 * (local416 & 0xFF00) >> 8 & 0xFF00) + (local107 * (local416 & 0xFF00FF) >> 8 & 0xFF00FF);
						this.anIntArray39[local144] = local329 + local436;
					}
					local144++;
				}
				local42++;
				local56 -= local52-- + local52;
				local60 -= local52 + local52;
			}
			local48 = arg4;
			local52 = -local52;
			local60 = local52 * local52 + local46;
			local56 = local60 - arg4;
			local60 -= local52;
			while (local42 < local29) {
				while (local60 > local46 && local56 > local46) {
					local60 -= local48-- + local48;
					local56 -= local48 + local48;
				}
				local122 = arg1 - local48;
				if (local122 < this.anInt553 * 1709859847) {
					local122 = this.anInt553 * 1709859847;
				}
				local142 = local48 + arg1;
				if (local142 > this.anInt540 * -1807368365 - 1) {
					local142 = this.anInt540 * -1807368365 - 1;
				}
				local144 = local122 + this.anInt547 * 356365251 * local42;
				for (local399 = local122; local399 <= local142; local399++) {
					if (!arg0 || arg3 < this.aFloatArray15[local144]) {
						local416 = this.anIntArray39[local144];
						local416 = ((local416 & 0xFF00FF) * local107 >> 8 & 0xFF00FF) + ((local416 & 0xFF00) * local107 >> 8 & 0xFF00);
						this.anIntArray39[local144] = local416 + local329;
					}
					local144++;
				}
				local42++;
				local60 += local52 + local52;
				local56 += local52++ + local52;
			}
		} else if (arg6 == 2) {
			@Pc(709) int local709;
			while (local42 < arg2) {
				while (local60 <= local46 || local56 <= local46) {
					local56 += local48 + local48;
					local60 += local48++ + local48;
				}
				local107 = arg1 - local48 + 1;
				if (local107 < this.anInt553 * 1709859847) {
					local107 = this.anInt553 * 1709859847;
				}
				local122 = local48 + arg1;
				if (local122 > this.anInt540 * -1807368365) {
					local122 = this.anInt540 * -1807368365;
				}
				local142 = local107 + this.anInt547 * 356365251 * local42;
				for (local144 = local107; local144 < local122; local144++) {
					if (!arg0 || arg3 < this.aFloatArray15[local142]) {
						local399 = this.anIntArray39[local142];
						local416 = arg5 + local399;
						local709 = (local399 & 0xFF00FF) + (arg5 & 0xFF00FF);
						local399 = (local709 & 0x1000100) + (local416 - local709 & 0x10000);
						this.anIntArray39[local142] = local416 - local399 | local399 - (local399 >>> 8);
					}
					local142++;
				}
				local42++;
				local56 -= local52-- + local52;
				local60 -= local52 + local52;
			}
			local48 = arg4;
			local52 = -local52;
			local60 = local46 + local52 * local52;
			local56 = local60 - arg4;
			local60 -= local52;
			while (local42 < local29) {
				while (local60 > local46 && local56 > local46) {
					local60 -= local48-- + local48;
					local56 -= local48 + local48;
				}
				local107 = arg1 - local48;
				if (local107 < this.anInt553 * 1709859847) {
					local107 = this.anInt553 * 1709859847;
				}
				local122 = local48 + arg1;
				if (local122 > this.anInt540 * -1807368365 - 1) {
					local122 = this.anInt540 * -1807368365 - 1;
				}
				local142 = local42 * 356365251 * this.anInt547 + local107;
				for (local144 = local107; local144 <= local122; local144++) {
					if (!arg0 || arg3 < this.aFloatArray15[local142]) {
						local399 = this.anIntArray39[local142];
						local416 = local399 + arg5;
						local709 = (arg5 & 0xFF00FF) + (local399 & 0xFF00FF);
						local399 = (local416 - local709 & 0x10000) + (local709 & 0x1000100);
						this.anIntArray39[local142] = local416 - local399 | local399 - (local399 >>> 8);
					}
					local142++;
				}
				local42++;
				local60 += local52 + local52;
				local56 += local52++ + local52;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!aeh", name = "sy", descriptor = "(ZIIFIII)V", line = 1778)
	void method4896(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (this.anIntArray39 == null) {
			return;
		}
		if (arg4 < 0) {
			arg4 = -arg4;
		}
		@Pc(12) int local12 = arg2 - arg4;
		if (local12 < this.anInt541 * 9823353) {
			local12 = this.anInt541 * 9823353;
		}
		@Pc(29) int local29 = arg2 + 1 + arg4;
		if (local29 > this.anInt542 * 639238427) {
			local29 = this.anInt542 * 639238427;
		}
		@Pc(42) int local42 = local12;
		@Pc(46) int local46 = arg4 * arg4;
		@Pc(48) int local48 = 0;
		@Pc(52) int local52 = arg2 - local12;
		@Pc(56) int local56 = local52 * local52;
		@Pc(60) int local60 = local56 - local52;
		if (arg2 > local29) {
			arg2 = local29;
		}
		@Pc(69) int local69 = arg5 >>> 24;
		@Pc(107) int local107;
		@Pc(122) int local122;
		@Pc(142) int local142;
		@Pc(144) int local144;
		if (arg6 == 0 || arg6 == 1 && local69 == 255) {
			while (local42 < arg2) {
				while (local60 <= local46 || local56 <= local46) {
					local56 += local48 + local48;
					local60 += local48++ + local48;
				}
				local107 = arg1 - local48 + 1;
				if (local107 < this.anInt553 * 1709859847) {
					local107 = this.anInt553 * 1709859847;
				}
				local122 = arg1 + local48;
				if (local122 > this.anInt540 * -1807368365) {
					local122 = this.anInt540 * -1807368365;
				}
				local142 = local42 * 356365251 * this.anInt547 + local107;
				for (local144 = local107; local144 < local122; local144++) {
					if (!arg0 || arg3 < this.aFloatArray15[local142]) {
						this.anIntArray39[local142] = arg5;
					}
					local142++;
				}
				local42++;
				local56 -= local52-- + local52;
				local60 -= local52 + local52;
			}
			local48 = arg4;
			local52 = local42 - arg2;
			local60 = local46 + local52 * local52;
			local56 = local60 - arg4;
			local60 -= local52;
			while (local42 < local29) {
				while (local60 > local46 && local56 > local46) {
					local60 -= local48-- + local48;
					local56 -= local48 + local48;
				}
				local107 = arg1 - local48;
				if (local107 < this.anInt553 * 1709859847) {
					local107 = this.anInt553 * 1709859847;
				}
				local122 = local48 + arg1;
				if (local122 > this.anInt540 * -1807368365 - 1) {
					local122 = this.anInt540 * -1807368365 - 1;
				}
				local142 = local42 * 356365251 * this.anInt547 + local107;
				for (local144 = local107; local144 <= local122; local144++) {
					if (!arg0 || arg3 < this.aFloatArray15[local142]) {
						this.anIntArray39[local142] = arg5;
					}
					local142++;
				}
				local42++;
				local60 += local52 + local52;
				local56 += local52++ + local52;
			}
			return;
		}
		@Pc(399) int local399;
		@Pc(416) int local416;
		if (arg6 == 1) {
			@Pc(329) int local329 = (local69 << 24) + (local69 * (arg5 & 0xFF00) >> 8 & 0xFF00) + (local69 * (arg5 & 0xFF00FF) >> 8 & 0xFF00FF);
			local107 = 256 - local69;
			while (local42 < arg2) {
				while (local60 <= local46 || local56 <= local46) {
					local56 += local48 + local48;
					local60 += local48++ + local48;
				}
				local122 = arg1 - local48 + 1;
				if (local122 < this.anInt553 * 1709859847) {
					local122 = this.anInt553 * 1709859847;
				}
				local142 = arg1 + local48;
				if (local142 > this.anInt540 * -1807368365) {
					local142 = this.anInt540 * -1807368365;
				}
				local144 = this.anInt547 * 356365251 * local42 + local122;
				for (local399 = local122; local399 < local142; local399++) {
					if (!arg0 || arg3 < this.aFloatArray15[local144]) {
						local416 = this.anIntArray39[local144];
						@Pc(436) int local436 = (local107 * (local416 & 0xFF00) >> 8 & 0xFF00) + (local107 * (local416 & 0xFF00FF) >> 8 & 0xFF00FF);
						this.anIntArray39[local144] = local329 + local436;
					}
					local144++;
				}
				local42++;
				local56 -= local52-- + local52;
				local60 -= local52 + local52;
			}
			local48 = arg4;
			local52 = -local52;
			local60 = local52 * local52 + local46;
			local56 = local60 - arg4;
			local60 -= local52;
			while (local42 < local29) {
				while (local60 > local46 && local56 > local46) {
					local60 -= local48-- + local48;
					local56 -= local48 + local48;
				}
				local122 = arg1 - local48;
				if (local122 < this.anInt553 * 1709859847) {
					local122 = this.anInt553 * 1709859847;
				}
				local142 = local48 + arg1;
				if (local142 > this.anInt540 * -1807368365 - 1) {
					local142 = this.anInt540 * -1807368365 - 1;
				}
				local144 = local122 + this.anInt547 * 356365251 * local42;
				for (local399 = local122; local399 <= local142; local399++) {
					if (!arg0 || arg3 < this.aFloatArray15[local144]) {
						local416 = this.anIntArray39[local144];
						local416 = ((local416 & 0xFF00FF) * local107 >> 8 & 0xFF00FF) + ((local416 & 0xFF00) * local107 >> 8 & 0xFF00);
						this.anIntArray39[local144] = local416 + local329;
					}
					local144++;
				}
				local42++;
				local60 += local52 + local52;
				local56 += local52++ + local52;
			}
		} else if (arg6 == 2) {
			@Pc(709) int local709;
			while (local42 < arg2) {
				while (local60 <= local46 || local56 <= local46) {
					local56 += local48 + local48;
					local60 += local48++ + local48;
				}
				local107 = arg1 - local48 + 1;
				if (local107 < this.anInt553 * 1709859847) {
					local107 = this.anInt553 * 1709859847;
				}
				local122 = local48 + arg1;
				if (local122 > this.anInt540 * -1807368365) {
					local122 = this.anInt540 * -1807368365;
				}
				local142 = local107 + this.anInt547 * 356365251 * local42;
				for (local144 = local107; local144 < local122; local144++) {
					if (!arg0 || arg3 < this.aFloatArray15[local142]) {
						local399 = this.anIntArray39[local142];
						local416 = arg5 + local399;
						local709 = (local399 & 0xFF00FF) + (arg5 & 0xFF00FF);
						local399 = (local709 & 0x1000100) + (local416 - local709 & 0x10000);
						this.anIntArray39[local142] = local416 - local399 | local399 - (local399 >>> 8);
					}
					local142++;
				}
				local42++;
				local56 -= local52-- + local52;
				local60 -= local52 + local52;
			}
			local48 = arg4;
			local52 = -local52;
			local60 = local46 + local52 * local52;
			local56 = local60 - arg4;
			local60 -= local52;
			while (local42 < local29) {
				while (local60 > local46 && local56 > local46) {
					local60 -= local48-- + local48;
					local56 -= local48 + local48;
				}
				local107 = arg1 - local48;
				if (local107 < this.anInt553 * 1709859847) {
					local107 = this.anInt553 * 1709859847;
				}
				local122 = local48 + arg1;
				if (local122 > this.anInt540 * -1807368365 - 1) {
					local122 = this.anInt540 * -1807368365 - 1;
				}
				local142 = local42 * 356365251 * this.anInt547 + local107;
				for (local144 = local107; local144 <= local122; local144++) {
					if (!arg0 || arg3 < this.aFloatArray15[local142]) {
						local399 = this.anIntArray39[local142];
						local416 = local399 + arg5;
						local709 = (arg5 & 0xFF00FF) + (local399 & 0xFF00FF);
						local399 = (local416 - local709 & 0x10000) + (local709 & 0x1000100);
						this.anIntArray39[local142] = local416 - local399 | local399 - (local399 >>> 8);
					}
					local142++;
				}
				local42++;
				local60 += local52 + local52;
				local56 += local52++ + local52;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!aeh", name = "te", descriptor = "(ZIIFIII)V", line = 1778)
	void method4897(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (this.anIntArray39 == null) {
			return;
		}
		if (arg4 < 0) {
			arg4 = -arg4;
		}
		@Pc(12) int local12 = arg2 - arg4;
		if (local12 < this.anInt541 * 9823353) {
			local12 = this.anInt541 * 9823353;
		}
		@Pc(29) int local29 = arg2 + 1 + arg4;
		if (local29 > this.anInt542 * 639238427) {
			local29 = this.anInt542 * 639238427;
		}
		@Pc(42) int local42 = local12;
		@Pc(46) int local46 = arg4 * arg4;
		@Pc(48) int local48 = 0;
		@Pc(52) int local52 = arg2 - local12;
		@Pc(56) int local56 = local52 * local52;
		@Pc(60) int local60 = local56 - local52;
		if (arg2 > local29) {
			arg2 = local29;
		}
		@Pc(69) int local69 = arg5 >>> 24;
		@Pc(107) int local107;
		@Pc(122) int local122;
		@Pc(142) int local142;
		@Pc(144) int local144;
		if (arg6 == 0 || arg6 == 1 && local69 == 255) {
			while (local42 < arg2) {
				while (local60 <= local46 || local56 <= local46) {
					local56 += local48 + local48;
					local60 += local48++ + local48;
				}
				local107 = arg1 - local48 + 1;
				if (local107 < this.anInt553 * 1709859847) {
					local107 = this.anInt553 * 1709859847;
				}
				local122 = arg1 + local48;
				if (local122 > this.anInt540 * -1807368365) {
					local122 = this.anInt540 * -1807368365;
				}
				local142 = local42 * 356365251 * this.anInt547 + local107;
				for (local144 = local107; local144 < local122; local144++) {
					if (!arg0 || arg3 < this.aFloatArray15[local142]) {
						this.anIntArray39[local142] = arg5;
					}
					local142++;
				}
				local42++;
				local56 -= local52-- + local52;
				local60 -= local52 + local52;
			}
			local48 = arg4;
			local52 = local42 - arg2;
			local60 = local46 + local52 * local52;
			local56 = local60 - arg4;
			local60 -= local52;
			while (local42 < local29) {
				while (local60 > local46 && local56 > local46) {
					local60 -= local48-- + local48;
					local56 -= local48 + local48;
				}
				local107 = arg1 - local48;
				if (local107 < this.anInt553 * 1709859847) {
					local107 = this.anInt553 * 1709859847;
				}
				local122 = local48 + arg1;
				if (local122 > this.anInt540 * -1807368365 - 1) {
					local122 = this.anInt540 * -1807368365 - 1;
				}
				local142 = local42 * 356365251 * this.anInt547 + local107;
				for (local144 = local107; local144 <= local122; local144++) {
					if (!arg0 || arg3 < this.aFloatArray15[local142]) {
						this.anIntArray39[local142] = arg5;
					}
					local142++;
				}
				local42++;
				local60 += local52 + local52;
				local56 += local52++ + local52;
			}
			return;
		}
		@Pc(399) int local399;
		@Pc(416) int local416;
		if (arg6 == 1) {
			@Pc(329) int local329 = (local69 << 24) + (local69 * (arg5 & 0xFF00) >> 8 & 0xFF00) + (local69 * (arg5 & 0xFF00FF) >> 8 & 0xFF00FF);
			local107 = 256 - local69;
			while (local42 < arg2) {
				while (local60 <= local46 || local56 <= local46) {
					local56 += local48 + local48;
					local60 += local48++ + local48;
				}
				local122 = arg1 - local48 + 1;
				if (local122 < this.anInt553 * 1709859847) {
					local122 = this.anInt553 * 1709859847;
				}
				local142 = arg1 + local48;
				if (local142 > this.anInt540 * -1807368365) {
					local142 = this.anInt540 * -1807368365;
				}
				local144 = this.anInt547 * 356365251 * local42 + local122;
				for (local399 = local122; local399 < local142; local399++) {
					if (!arg0 || arg3 < this.aFloatArray15[local144]) {
						local416 = this.anIntArray39[local144];
						@Pc(436) int local436 = (local107 * (local416 & 0xFF00) >> 8 & 0xFF00) + (local107 * (local416 & 0xFF00FF) >> 8 & 0xFF00FF);
						this.anIntArray39[local144] = local329 + local436;
					}
					local144++;
				}
				local42++;
				local56 -= local52-- + local52;
				local60 -= local52 + local52;
			}
			local48 = arg4;
			local52 = -local52;
			local60 = local52 * local52 + local46;
			local56 = local60 - arg4;
			local60 -= local52;
			while (local42 < local29) {
				while (local60 > local46 && local56 > local46) {
					local60 -= local48-- + local48;
					local56 -= local48 + local48;
				}
				local122 = arg1 - local48;
				if (local122 < this.anInt553 * 1709859847) {
					local122 = this.anInt553 * 1709859847;
				}
				local142 = local48 + arg1;
				if (local142 > this.anInt540 * -1807368365 - 1) {
					local142 = this.anInt540 * -1807368365 - 1;
				}
				local144 = local122 + this.anInt547 * 356365251 * local42;
				for (local399 = local122; local399 <= local142; local399++) {
					if (!arg0 || arg3 < this.aFloatArray15[local144]) {
						local416 = this.anIntArray39[local144];
						local416 = ((local416 & 0xFF00FF) * local107 >> 8 & 0xFF00FF) + ((local416 & 0xFF00) * local107 >> 8 & 0xFF00);
						this.anIntArray39[local144] = local416 + local329;
					}
					local144++;
				}
				local42++;
				local60 += local52 + local52;
				local56 += local52++ + local52;
			}
		} else if (arg6 == 2) {
			@Pc(709) int local709;
			while (local42 < arg2) {
				while (local60 <= local46 || local56 <= local46) {
					local56 += local48 + local48;
					local60 += local48++ + local48;
				}
				local107 = arg1 - local48 + 1;
				if (local107 < this.anInt553 * 1709859847) {
					local107 = this.anInt553 * 1709859847;
				}
				local122 = local48 + arg1;
				if (local122 > this.anInt540 * -1807368365) {
					local122 = this.anInt540 * -1807368365;
				}
				local142 = local107 + this.anInt547 * 356365251 * local42;
				for (local144 = local107; local144 < local122; local144++) {
					if (!arg0 || arg3 < this.aFloatArray15[local142]) {
						local399 = this.anIntArray39[local142];
						local416 = arg5 + local399;
						local709 = (local399 & 0xFF00FF) + (arg5 & 0xFF00FF);
						local399 = (local709 & 0x1000100) + (local416 - local709 & 0x10000);
						this.anIntArray39[local142] = local416 - local399 | local399 - (local399 >>> 8);
					}
					local142++;
				}
				local42++;
				local56 -= local52-- + local52;
				local60 -= local52 + local52;
			}
			local48 = arg4;
			local52 = -local52;
			local60 = local46 + local52 * local52;
			local56 = local60 - arg4;
			local60 -= local52;
			while (local42 < local29) {
				while (local60 > local46 && local56 > local46) {
					local60 -= local48-- + local48;
					local56 -= local48 + local48;
				}
				local107 = arg1 - local48;
				if (local107 < this.anInt553 * 1709859847) {
					local107 = this.anInt553 * 1709859847;
				}
				local122 = local48 + arg1;
				if (local122 > this.anInt540 * -1807368365 - 1) {
					local122 = this.anInt540 * -1807368365 - 1;
				}
				local142 = local42 * 356365251 * this.anInt547 + local107;
				for (local144 = local107; local144 <= local122; local144++) {
					if (!arg0 || arg3 < this.aFloatArray15[local142]) {
						local399 = this.anIntArray39[local142];
						local416 = local399 + arg5;
						local709 = (arg5 & 0xFF00FF) + (local399 & 0xFF00FF);
						local399 = (local416 - local709 & 0x10000) + (local709 & 0x1000100);
						this.anIntArray39[local142] = local416 - local399 | local399 - (local399 >>> 8);
					}
					local142++;
				}
				local42++;
				local60 += local52 + local52;
				local56 += local52++ + local52;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!aeh", name = "dn", descriptor = "(Lclient!ow;)V", line = 1947)
	@Override
	public void method20121(@OriginalArg(0) Class455 arg0) {
		this.aClass455_7 = arg0;
		this.method4901();
	}

	@OriginalMember(owner = "client!aeh", name = "kg", descriptor = "(Lclient!ow;)V", line = 1947)
	@Override
	public void method20270(@OriginalArg(0) Class455 arg0) {
		this.aClass455_7 = arg0;
		this.method4901();
	}

	@OriginalMember(owner = "client!aeh", name = "kq", descriptor = "(Lclient!ow;)V", line = 1947)
	@Override
	public void method20271(@OriginalArg(0) Class455 arg0) {
		this.aClass455_7 = arg0;
		this.method4901();
	}

	@OriginalMember(owner = "client!aeh", name = "kc", descriptor = "(Lclient!ow;)V", line = 1947)
	@Override
	public void method20272(@OriginalArg(0) Class455 arg0) {
		this.aClass455_7 = arg0;
		this.method4901();
	}

	@OriginalMember(owner = "client!aeh", name = "dv", descriptor = "()Lclient!ow;", line = 1952)
	@Override
	public Class455 method20294() {
		return new Class455(this.aClass455_7);
	}

	@OriginalMember(owner = "client!aeh", name = "ql", descriptor = "()Lclient!ow;", line = 1952)
	@Override
	public Class455 method20375() {
		return new Class455(this.aClass455_7);
	}

	@OriginalMember(owner = "client!aeh", name = "qz", descriptor = "()Lclient!ow;", line = 1952)
	@Override
	public Class455 method20061() {
		return new Class455(this.aClass455_7);
	}

	@OriginalMember(owner = "client!aeh", name = "dy", descriptor = "(Lclient!oi;)V", line = 1956)
	@Override
	public void method20123(@OriginalArg(0) Class442 arg0) {
		this.aClass442_20.method28954(arg0);
		this.method4901();
	}

	@OriginalMember(owner = "client!aeh", name = "kw", descriptor = "(Lclient!oi;)V", line = 1956)
	@Override
	public void method20163(@OriginalArg(0) Class442 arg0) {
		this.aClass442_20.method28954(arg0);
		this.method4901();
	}

	@OriginalMember(owner = "client!aeh", name = "km", descriptor = "(Lclient!oi;)V", line = 1956)
	@Override
	public void method20274(@OriginalArg(0) Class442 arg0) {
		this.aClass442_20.method28954(arg0);
		this.method4901();
	}

	@OriginalMember(owner = "client!aeh", name = "dm", descriptor = "()Lclient!oi;", line = 1961)
	@Override
	public Class442 method20124() {
		return new Class442(this.aClass442_20);
	}

	@OriginalMember(owner = "client!aeh", name = "kf", descriptor = "()Lclient!oi;", line = 1961)
	@Override
	public Class442 method20276() {
		return new Class442(this.aClass442_20);
	}

	@OriginalMember(owner = "client!aeh", name = "kh", descriptor = "()Lclient!oi;", line = 1961)
	@Override
	public Class442 method20278() {
		return new Class442(this.aClass442_20);
	}

	@OriginalMember(owner = "client!aeh", name = "kv", descriptor = "()Lclient!oi;", line = 1961)
	@Override
	public Class442 method20275() {
		return new Class442(this.aClass442_20);
	}

	@OriginalMember(owner = "client!aeh", name = "kx", descriptor = "()Lclient!oi;", line = 1961)
	@Override
	public Class442 method20279() {
		return new Class442(this.aClass442_20);
	}

	@OriginalMember(owner = "client!aeh", name = "kr", descriptor = "()Lclient!oi;", line = 1961)
	@Override
	public Class442 method20277() {
		return new Class442(this.aClass442_20);
	}

	@OriginalMember(owner = "client!aeh", name = "dz", descriptor = "(F)V", line = 1965)
	@Override
	public void method20255(@OriginalArg(0) float arg0) {
		this.anInt545 = (int) (arg0 * 65535.0F) * -178886367;
	}

	@OriginalMember(owner = "client!aeh", name = "kn", descriptor = "(F)V", line = 1965)
	@Override
	public void method20280(@OriginalArg(0) float arg0) {
		this.anInt545 = (int) (arg0 * 65535.0F) * -178886367;
	}

	@OriginalMember(owner = "client!aeh", name = "ko", descriptor = "(F)V", line = 1965)
	@Override
	public void method20378(@OriginalArg(0) float arg0) {
		this.anInt545 = (int) (arg0 * 65535.0F) * -178886367;
	}

	@OriginalMember(owner = "client!aeh", name = "ka", descriptor = "(F)V", line = 1965)
	@Override
	public void method20281(@OriginalArg(0) float arg0) {
		this.anInt545 = (int) (arg0 * 65535.0F) * -178886367;
	}

	@OriginalMember(owner = "client!aeh", name = "dw", descriptor = "(IFFFFF)V", line = 1969)
	@Override
	public void method20126(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		this.anInt555 = (int) (arg1 * 65535.0F) * -1003903109;
		this.anInt549 = (int) (arg2 * 65535.0F) * 1376715797;
		@Pc(30) float local30 = (float) Math.sqrt((double) (arg4 * arg4 + arg3 * arg3 + arg5 * arg5));
		this.anInt546 = (int) (arg3 * 65535.0F / local30) * 305590569;
		this.anInt543 = (int) (arg4 * 65535.0F / local30) * 632700789;
		this.anInt544 = (int) (arg5 * 65535.0F / local30) * -86524913;
	}

	@OriginalMember(owner = "client!aeh", name = "nr", descriptor = "(IFFFFF)V", line = 1969)
	@Override
	public void method20330(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		this.anInt555 = (int) (arg1 * 65535.0F) * -1003903109;
		this.anInt549 = (int) (arg2 * 65535.0F) * 1376715797;
		@Pc(30) float local30 = (float) Math.sqrt((double) (arg4 * arg4 + arg3 * arg3 + arg5 * arg5));
		this.anInt546 = (int) (arg3 * 65535.0F / local30) * 305590569;
		this.anInt543 = (int) (arg4 * 65535.0F / local30) * 632700789;
		this.anInt544 = (int) (arg5 * 65535.0F / local30) * -86524913;
	}

	@OriginalMember(owner = "client!aeh", name = "nw", descriptor = "(IFFFFF)V", line = 1969)
	@Override
	public void method20131(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		this.anInt555 = (int) (arg1 * 65535.0F) * -1003903109;
		this.anInt549 = (int) (arg2 * 65535.0F) * 1376715797;
		@Pc(30) float local30 = (float) Math.sqrt((double) (arg4 * arg4 + arg3 * arg3 + arg5 * arg5));
		this.anInt546 = (int) (arg3 * 65535.0F / local30) * 305590569;
		this.anInt543 = (int) (arg4 * 65535.0F / local30) * 632700789;
		this.anInt544 = (int) (arg5 * 65535.0F / local30) * -86524913;
	}

	@OriginalMember(owner = "client!aeh", name = "di", descriptor = "(I)V", line = 1977)
	@Override
	public void method20127(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!aeh", name = "kp", descriptor = "(I)V", line = 1977)
	@Override
	public void method20283(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!aeh", name = "kl", descriptor = "(I)V", line = 1977)
	@Override
	public void method20284(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!aeh", name = "kt", descriptor = "(III)V", line = 1980)
	@Override
	public void method20285(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.aClass95Array1.length; local1++) {
			@Pc(11) Class95 local11 = this.aClass95Array1[local1];
			local11.anInt789 = (arg0 & 0xFFFFFF) * -1382291633;
			@Pc(27) int local27 = local11.anInt789 * 1046269871 >>> 16 & 0xFF;
			if (local27 < 2) {
				local27 = 2;
			}
			@Pc(41) int local41 = local11.anInt789 * 1046269871 >> 8 & 0xFF;
			if (local41 < 2) {
				local41 = 2;
			}
			@Pc(53) int local53 = local11.anInt789 * 1046269871 & 0xFF;
			if (local53 < 2) {
				local53 = 2;
			}
			local11.anInt789 = (local27 << 16 | local41 << 8 | local53) * -1382291633;
			if (arg1 < 0) {
				local11.aBoolean161 = false;
			} else {
				local11.aBoolean161 = true;
			}
		}
	}

	@OriginalMember(owner = "client!aeh", name = "kz", descriptor = "(III)V", line = 1980)
	@Override
	public void method20137(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.aClass95Array1.length; local1++) {
			@Pc(11) Class95 local11 = this.aClass95Array1[local1];
			local11.anInt789 = (arg0 & 0xFFFFFF) * -1382291633;
			@Pc(27) int local27 = local11.anInt789 * 1046269871 >>> 16 & 0xFF;
			if (local27 < 2) {
				local27 = 2;
			}
			@Pc(41) int local41 = local11.anInt789 * 1046269871 >> 8 & 0xFF;
			if (local41 < 2) {
				local41 = 2;
			}
			@Pc(53) int local53 = local11.anInt789 * 1046269871 & 0xFF;
			if (local53 < 2) {
				local53 = 2;
			}
			local11.anInt789 = (local27 << 16 | local41 << 8 | local53) * -1382291633;
			if (arg1 < 0) {
				local11.aBoolean161 = false;
			} else {
				local11.aBoolean161 = true;
			}
		}
	}

	@OriginalMember(owner = "client!aeh", name = "dr", descriptor = "(III)V", line = 1980)
	@Override
	public void method20232(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.aClass95Array1.length; local1++) {
			@Pc(11) Class95 local11 = this.aClass95Array1[local1];
			local11.anInt789 = (arg0 & 0xFFFFFF) * -1382291633;
			@Pc(27) int local27 = local11.anInt789 * 1046269871 >>> 16 & 0xFF;
			if (local27 < 2) {
				local27 = 2;
			}
			@Pc(41) int local41 = local11.anInt789 * 1046269871 >> 8 & 0xFF;
			if (local41 < 2) {
				local41 = 2;
			}
			@Pc(53) int local53 = local11.anInt789 * 1046269871 & 0xFF;
			if (local53 < 2) {
				local53 = 2;
			}
			local11.anInt789 = (local27 << 16 | local41 << 8 | local53) * -1382291633;
			if (arg1 < 0) {
				local11.aBoolean161 = false;
			} else {
				local11.aBoolean161 = true;
			}
		}
	}

	@OriginalMember(owner = "client!aeh", name = "kj", descriptor = "(III)V", line = 1980)
	@Override
	public void method20352(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.aClass95Array1.length; local1++) {
			@Pc(11) Class95 local11 = this.aClass95Array1[local1];
			local11.anInt789 = (arg0 & 0xFFFFFF) * -1382291633;
			@Pc(27) int local27 = local11.anInt789 * 1046269871 >>> 16 & 0xFF;
			if (local27 < 2) {
				local27 = 2;
			}
			@Pc(41) int local41 = local11.anInt789 * 1046269871 >> 8 & 0xFF;
			if (local41 < 2) {
				local41 = 2;
			}
			@Pc(53) int local53 = local11.anInt789 * 1046269871 & 0xFF;
			if (local53 < 2) {
				local53 = 2;
			}
			local11.anInt789 = (local27 << 16 | local41 << 8 | local53) * -1382291633;
			if (arg1 < 0) {
				local11.aBoolean161 = false;
			} else {
				local11.aBoolean161 = true;
			}
		}
	}

	@OriginalMember(owner = "client!aeh", name = "ky", descriptor = "(III)V", line = 1980)
	@Override
	public void method20091(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.aClass95Array1.length; local1++) {
			@Pc(11) Class95 local11 = this.aClass95Array1[local1];
			local11.anInt789 = (arg0 & 0xFFFFFF) * -1382291633;
			@Pc(27) int local27 = local11.anInt789 * 1046269871 >>> 16 & 0xFF;
			if (local27 < 2) {
				local27 = 2;
			}
			@Pc(41) int local41 = local11.anInt789 * 1046269871 >> 8 & 0xFF;
			if (local41 < 2) {
				local41 = 2;
			}
			@Pc(53) int local53 = local11.anInt789 * 1046269871 & 0xFF;
			if (local53 < 2) {
				local53 = 2;
			}
			local11.anInt789 = (local27 << 16 | local41 << 8 | local53) * -1382291633;
			if (arg1 < 0) {
				local11.aBoolean161 = false;
			} else {
				local11.aBoolean161 = true;
			}
		}
	}

	@OriginalMember(owner = "client!aeh", name = "tr", descriptor = "()V", line = 1996)
	void method4898() {
		this.aClass442_19.method28969(this.aClass455_7);
		this.aClass442_18.method28954(this.aClass442_19);
		this.aClass442_18.method28965(this.aClass442_20);
		this.aClass442_18.method29028(this.aFloatArrayArray5[0]);
		this.aClass442_18.method29033(this.aFloatArrayArray5[1]);
		this.aClass442_18.method29018(this.aFloatArrayArray5[2]);
		this.aClass442_18.method29022(this.aFloatArrayArray5[3]);
		this.aClass442_18.method29023(this.aFloatArrayArray5[4]);
		this.aClass442_18.method29026(this.aFloatArrayArray5[5]);
		@Pc(66) float local66 = this.aClass442_20.method29016();
		@Pc(82) float local82 = this.aClass442_20.aFloatArray109[14] + this.aClass442_20.aFloatArray109[10] * (local66 - 255.0F);
		@Pc(96) float local96 = this.aClass442_20.aFloatArray109[14] + this.aClass442_20.aFloatArray109[10] * local66;
		@Pc(100) float local100 = local96 - local82;
		for (@Pc(102) int local102 = 0; local102 < this.anInt554 * 442227785; local102++) {
			@Pc(113) Class95 local113 = this.aClass95Array1[local102];
			local113.aFloat78 = local82;
			local113.aFloat79 = local100;
		}
	}

	@OriginalMember(owner = "client!aeh", name = "to", descriptor = "()V", line = 1996)
	void method4899() {
		this.aClass442_19.method28969(this.aClass455_7);
		this.aClass442_18.method28954(this.aClass442_19);
		this.aClass442_18.method28965(this.aClass442_20);
		this.aClass442_18.method29028(this.aFloatArrayArray5[0]);
		this.aClass442_18.method29033(this.aFloatArrayArray5[1]);
		this.aClass442_18.method29018(this.aFloatArrayArray5[2]);
		this.aClass442_18.method29022(this.aFloatArrayArray5[3]);
		this.aClass442_18.method29023(this.aFloatArrayArray5[4]);
		this.aClass442_18.method29026(this.aFloatArrayArray5[5]);
		@Pc(66) float local66 = this.aClass442_20.method29016();
		@Pc(82) float local82 = this.aClass442_20.aFloatArray109[14] + this.aClass442_20.aFloatArray109[10] * (local66 - 255.0F);
		@Pc(96) float local96 = this.aClass442_20.aFloatArray109[14] + this.aClass442_20.aFloatArray109[10] * local66;
		@Pc(100) float local100 = local96 - local82;
		for (@Pc(102) int local102 = 0; local102 < this.anInt554 * 442227785; local102++) {
			@Pc(113) Class95 local113 = this.aClass95Array1[local102];
			local113.aFloat78 = local82;
			local113.aFloat79 = local100;
		}
	}

	@OriginalMember(owner = "client!aeh", name = "tg", descriptor = "()V", line = 1996)
	void method4900() {
		this.aClass442_19.method28969(this.aClass455_7);
		this.aClass442_18.method28954(this.aClass442_19);
		this.aClass442_18.method28965(this.aClass442_20);
		this.aClass442_18.method29028(this.aFloatArrayArray5[0]);
		this.aClass442_18.method29033(this.aFloatArrayArray5[1]);
		this.aClass442_18.method29018(this.aFloatArrayArray5[2]);
		this.aClass442_18.method29022(this.aFloatArrayArray5[3]);
		this.aClass442_18.method29023(this.aFloatArrayArray5[4]);
		this.aClass442_18.method29026(this.aFloatArrayArray5[5]);
		@Pc(66) float local66 = this.aClass442_20.method29016();
		@Pc(82) float local82 = this.aClass442_20.aFloatArray109[14] + this.aClass442_20.aFloatArray109[10] * (local66 - 255.0F);
		@Pc(96) float local96 = this.aClass442_20.aFloatArray109[14] + this.aClass442_20.aFloatArray109[10] * local66;
		@Pc(100) float local100 = local96 - local82;
		for (@Pc(102) int local102 = 0; local102 < this.anInt554 * 442227785; local102++) {
			@Pc(113) Class95 local113 = this.aClass95Array1[local102];
			local113.aFloat78 = local82;
			local113.aFloat79 = local100;
		}
	}

	@OriginalMember(owner = "client!aeh", name = "si", descriptor = "()V", line = 1996)
	void method4901() {
		this.aClass442_19.method28969(this.aClass455_7);
		this.aClass442_18.method28954(this.aClass442_19);
		this.aClass442_18.method28965(this.aClass442_20);
		this.aClass442_18.method29028(this.aFloatArrayArray5[0]);
		this.aClass442_18.method29033(this.aFloatArrayArray5[1]);
		this.aClass442_18.method29018(this.aFloatArrayArray5[2]);
		this.aClass442_18.method29022(this.aFloatArrayArray5[3]);
		this.aClass442_18.method29023(this.aFloatArrayArray5[4]);
		this.aClass442_18.method29026(this.aFloatArrayArray5[5]);
		@Pc(66) float local66 = this.aClass442_20.method29016();
		@Pc(82) float local82 = this.aClass442_20.aFloatArray109[14] + this.aClass442_20.aFloatArray109[10] * (local66 - 255.0F);
		@Pc(96) float local96 = this.aClass442_20.aFloatArray109[14] + this.aClass442_20.aFloatArray109[10] * local66;
		@Pc(100) float local100 = local96 - local82;
		for (@Pc(102) int local102 = 0; local102 < this.anInt554 * 442227785; local102++) {
			@Pc(113) Class95 local113 = this.aClass95Array1[local102];
			local113.aFloat78 = local82;
			local113.aFloat79 = local100;
		}
	}

	@OriginalMember(owner = "client!aeh", name = "tu", descriptor = "()V", line = 1996)
	void method4902() {
		this.aClass442_19.method28969(this.aClass455_7);
		this.aClass442_18.method28954(this.aClass442_19);
		this.aClass442_18.method28965(this.aClass442_20);
		this.aClass442_18.method29028(this.aFloatArrayArray5[0]);
		this.aClass442_18.method29033(this.aFloatArrayArray5[1]);
		this.aClass442_18.method29018(this.aFloatArrayArray5[2]);
		this.aClass442_18.method29022(this.aFloatArrayArray5[3]);
		this.aClass442_18.method29023(this.aFloatArrayArray5[4]);
		this.aClass442_18.method29026(this.aFloatArrayArray5[5]);
		@Pc(66) float local66 = this.aClass442_20.method29016();
		@Pc(82) float local82 = this.aClass442_20.aFloatArray109[14] + this.aClass442_20.aFloatArray109[10] * (local66 - 255.0F);
		@Pc(96) float local96 = this.aClass442_20.aFloatArray109[14] + this.aClass442_20.aFloatArray109[10] * local66;
		@Pc(100) float local100 = local96 - local82;
		for (@Pc(102) int local102 = 0; local102 < this.anInt554 * 442227785; local102++) {
			@Pc(113) Class95 local113 = this.aClass95Array1[local102];
			local113.aFloat78 = local82;
			local113.aFloat79 = local100;
		}
	}

	@OriginalMember(owner = "client!aeh", name = "dk", descriptor = "(I)Lclient!da;", line = 2017)
	@Override
	public Class91 method20251(@OriginalArg(0) int arg0) {
		return null;
	}

	@OriginalMember(owner = "client!aeh", name = "kk", descriptor = "(I)Lclient!da;", line = 2017)
	@Override
	public Class91 method20297(@OriginalArg(0) int arg0) {
		return null;
	}

	@OriginalMember(owner = "client!aeh", name = "ds", descriptor = "(Lclient!da;Lclient!da;FLclient!da;)Lclient!da;", line = 2021)
	@Override
	public Class91 method20220(@OriginalArg(0) Class91 arg0, @OriginalArg(1) Class91 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class91 arg3) {
		return null;
	}

	@OriginalMember(owner = "client!aeh", name = "kd", descriptor = "(Lclient!da;Lclient!da;FLclient!da;)Lclient!da;", line = 2021)
	@Override
	public Class91 method20252(@OriginalArg(0) Class91 arg0, @OriginalArg(1) Class91 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class91 arg3) {
		return null;
	}

	@OriginalMember(owner = "client!aeh", name = "df", descriptor = "(Lclient!da;)V", line = 2024)
	@Override
	public void method20133(@OriginalArg(0) Class91 arg0) {
	}

	@OriginalMember(owner = "client!aeh", name = "ke", descriptor = "(Lclient!da;)V", line = 2024)
	@Override
	public void method20289(@OriginalArg(0) Class91 arg0) {
	}

	@OriginalMember(owner = "client!aeh", name = "db", descriptor = "(IIII)V", line = 2025)
	@Override
	public void method20134(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!aeh", name = "kb", descriptor = "(IIII)V", line = 2025)
	@Override
	public void method20106(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!aeh", name = "ki", descriptor = "(IIII)V", line = 2025)
	@Override
	public void method20293(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!aeh", name = "ks", descriptor = "(IIII)V", line = 2025)
	@Override
	public void method20292(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!aeh", name = "ku", descriptor = "(IIII)V", line = 2025)
	@Override
	public void method20290(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!aeh", name = "dx", descriptor = "(II)V", line = 2026)
	@Override
	public void method20135(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!aeh", name = "lo", descriptor = "(II)V", line = 2026)
	@Override
	public void method20374(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!aeh", name = "lb", descriptor = "(II)V", line = 2026)
	@Override
	public void method20295(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!aeh", name = "lz", descriptor = "(II)V", line = 2026)
	@Override
	public void method20157(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!aeh", name = "lk", descriptor = "(II)V", line = 2026)
	@Override
	public void method20082(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!aeh", name = "dc", descriptor = "()Z", line = 2029)
	@Override
	public boolean method20136() {
		return false;
	}

	@OriginalMember(owner = "client!aeh", name = "lw", descriptor = "()Z", line = 2029)
	@Override
	public boolean method20359() {
		return false;
	}

	@OriginalMember(owner = "client!aeh", name = "lu", descriptor = "()Z", line = 2029)
	@Override
	public boolean method20298() {
		return false;
	}

	@OriginalMember(owner = "client!aeh", name = "lf", descriptor = "()Z", line = 2029)
	@Override
	public boolean method20224() {
		return false;
	}

	@OriginalMember(owner = "client!aeh", name = "lm", descriptor = "()Z", line = 2029)
	@Override
	public boolean method20240() {
		return false;
	}

	@OriginalMember(owner = "client!aeh", name = "lh", descriptor = "()Z", line = 2033)
	@Override
	public boolean method20302() {
		return false;
	}

	@OriginalMember(owner = "client!aeh", name = "dl", descriptor = "()Z", line = 2033)
	@Override
	public boolean method20213() {
		return false;
	}

	@OriginalMember(owner = "client!aeh", name = "lp", descriptor = "()Z", line = 2033)
	@Override
	public boolean method20301() {
		return false;
	}

	@OriginalMember(owner = "client!aeh", name = "dg", descriptor = "(FFFFF)V", line = 2036)
	@Override
	public void method20340(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4) {
	}

	@OriginalMember(owner = "client!aeh", name = "ln", descriptor = "(FFFFF)V", line = 2036)
	@Override
	public void method20304(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4) {
	}

	@OriginalMember(owner = "client!aeh", name = "la", descriptor = "(FFFFF)V", line = 2036)
	@Override
	public void method20107(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4) {
	}

	@OriginalMember(owner = "client!aeh", name = "ls", descriptor = "(FFFFF)V", line = 2036)
	@Override
	public void method20306(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4) {
	}

	@OriginalMember(owner = "client!aeh", name = "lv", descriptor = "(FFFFF)V", line = 2036)
	@Override
	public void method20305(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4) {
	}

	@OriginalMember(owner = "client!aeh", name = "lg", descriptor = "([I)Lclient!dh;", line = 2039)
	@Override
	public Class85 method20196(@OriginalArg(0) int[] arg0) {
		return null;
	}

	@OriginalMember(owner = "client!aeh", name = "lq", descriptor = "([I)Lclient!dh;", line = 2039)
	@Override
	public Class85 method20307(@OriginalArg(0) int[] arg0) {
		return null;
	}

	@OriginalMember(owner = "client!aeh", name = "lx", descriptor = "([I)Lclient!dh;", line = 2039)
	@Override
	public Class85 method20308(@OriginalArg(0) int[] arg0) {
		return null;
	}

	@OriginalMember(owner = "client!aeh", name = "dd", descriptor = "([I)Lclient!dh;", line = 2039)
	@Override
	public Class85 method20351(@OriginalArg(0) int[] arg0) {
		return null;
	}

	@OriginalMember(owner = "client!aeh", name = "dj", descriptor = "()Z", line = 2043)
	@Override
	public boolean method20093() {
		return false;
	}

	@OriginalMember(owner = "client!aeh", name = "qx", descriptor = "()Z", line = 2043)
	@Override
	public boolean method20083() {
		return false;
	}

	@OriginalMember(owner = "client!aeh", name = "qe", descriptor = "()Z", line = 2043)
	@Override
	public boolean method20379() {
		return false;
	}

	@OriginalMember(owner = "client!aeh", name = "lc", descriptor = "(Lclient!dh;FLclient!dh;FLclient!dh;F)V", line = 2046)
	@Override
	public void method20309(@OriginalArg(0) Class85 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) Class85 arg2, @OriginalArg(3) float arg3, @OriginalArg(4) Class85 arg4, @OriginalArg(5) float arg5) {
	}

	@OriginalMember(owner = "client!aeh", name = "eh", descriptor = "(Lclient!dh;FLclient!dh;FLclient!dh;F)V", line = 2046)
	@Override
	public void method20139(@OriginalArg(0) Class85 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) Class85 arg2, @OriginalArg(3) float arg3, @OriginalArg(4) Class85 arg4, @OriginalArg(5) float arg5) {
	}

	@OriginalMember(owner = "client!aeh", name = "ej", descriptor = "()Z", line = 2049)
	@Override
	public boolean method20140() {
		return false;
	}

	@OriginalMember(owner = "client!aeh", name = "np", descriptor = "()Z", line = 2049)
	@Override
	public boolean method20349() {
		return false;
	}

	@OriginalMember(owner = "client!aeh", name = "ly", descriptor = "()V", line = 2052)
	@Override
	public void method20310() {
	}

	@OriginalMember(owner = "client!aeh", name = "ll", descriptor = "()V", line = 2052)
	@Override
	public void method20303() {
	}

	@OriginalMember(owner = "client!aeh", name = "eo", descriptor = "()V", line = 2052)
	@Override
	public void method20141() {
	}

	@OriginalMember(owner = "client!aeh", name = "le", descriptor = "()V", line = 2052)
	@Override
	public void method20364() {
	}

	@OriginalMember(owner = "client!aeh", name = "lt", descriptor = "()V", line = 2052)
	@Override
	public void method20311() {
	}

	@OriginalMember(owner = "client!aeh", name = "ep", descriptor = "()Z", line = 2055)
	@Override
	public boolean method20183() {
		return false;
	}

	@OriginalMember(owner = "client!aeh", name = "ld", descriptor = "()Z", line = 2055)
	@Override
	public boolean method20312() {
		return false;
	}

	@OriginalMember(owner = "client!aeh", name = "es", descriptor = "(FFFFFF)V", line = 2058)
	@Override
	void method20144(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
	}

	@OriginalMember(owner = "client!aeh", name = "lj", descriptor = "(FFFFFF)V", line = 2058)
	@Override
	void method20313(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
	}

	@OriginalMember(owner = "client!aeh", name = "ei", descriptor = "(ILclient!db;)V", line = 2061)
	@Override
	public void method20145(@OriginalArg(0) int arg0, @OriginalArg(1) Class202 arg1) {
		for (@Pc(1) int local1 = 0; local1 < this.aClass95Array1.length; local1++) {
			this.aClass95Array1[local1].anInt790 = this.aClass95Array1[local1].anInt789 * 1410985889;
			this.aClass95Array1[local1].anInt791 = arg0 * 995019623;
			this.aClass95Array1[local1].anInt789 = arg1.anInt3554 * 1215958923;
			this.aClass95Array1[local1].anInt792 = arg1.anInt3553 * -761479311;
			this.aClass95Array1[local1].aBoolean163 = true;
		}
	}

	@OriginalMember(owner = "client!aeh", name = "li", descriptor = "(ILclient!db;)V", line = 2061)
	@Override
	public void method20045(@OriginalArg(0) int arg0, @OriginalArg(1) Class202 arg1) {
		for (@Pc(1) int local1 = 0; local1 < this.aClass95Array1.length; local1++) {
			this.aClass95Array1[local1].anInt790 = this.aClass95Array1[local1].anInt789 * 1410985889;
			this.aClass95Array1[local1].anInt791 = arg0 * 995019623;
			this.aClass95Array1[local1].anInt789 = arg1.anInt3554 * 1215958923;
			this.aClass95Array1[local1].anInt792 = arg1.anInt3553 * -761479311;
			this.aClass95Array1[local1].aBoolean163 = true;
		}
	}

	@OriginalMember(owner = "client!aeh", name = "lr", descriptor = "(ILclient!db;)V", line = 2061)
	@Override
	public void method20314(@OriginalArg(0) int arg0, @OriginalArg(1) Class202 arg1) {
		for (@Pc(1) int local1 = 0; local1 < this.aClass95Array1.length; local1++) {
			this.aClass95Array1[local1].anInt790 = this.aClass95Array1[local1].anInt789 * 1410985889;
			this.aClass95Array1[local1].anInt791 = arg0 * 995019623;
			this.aClass95Array1[local1].anInt789 = arg1.anInt3554 * 1215958923;
			this.aClass95Array1[local1].anInt792 = arg1.anInt3553 * -761479311;
			this.aClass95Array1[local1].aBoolean163 = true;
		}
	}

	@OriginalMember(owner = "client!aeh", name = "ed", descriptor = "(ILclient!db;)V", line = 2071)
	@Override
	public void method20146(@OriginalArg(0) int arg0, @OriginalArg(1) Class202 arg1) {
		@Pc(3) Class95 local3 = this.method4886(Thread.currentThread());
		local3.anInt791 = arg0 * 995019623;
		local3.anInt789 = arg1.anInt3554 * 1215958923;
		local3.anInt792 = arg1.anInt3553 * -761479311;
	}

	@OriginalMember(owner = "client!aeh", name = "mh", descriptor = "(ILclient!db;)V", line = 2071)
	@Override
	public void method20316(@OriginalArg(0) int arg0, @OriginalArg(1) Class202 arg1) {
		@Pc(3) Class95 local3 = this.method4886(Thread.currentThread());
		local3.anInt791 = arg0 * 995019623;
		local3.anInt789 = arg1.anInt3554 * 1215958923;
		local3.anInt792 = arg1.anInt3553 * -761479311;
	}

	@OriginalMember(owner = "client!aeh", name = "mf", descriptor = "(ILclient!db;)V", line = 2071)
	@Override
	public void method20225(@OriginalArg(0) int arg0, @OriginalArg(1) Class202 arg1) {
		@Pc(3) Class95 local3 = this.method4886(Thread.currentThread());
		local3.anInt791 = arg0 * 995019623;
		local3.anInt789 = arg1.anInt3554 * 1215958923;
		local3.anInt792 = arg1.anInt3553 * -761479311;
	}

	@OriginalMember(owner = "client!aeh", name = "mx", descriptor = "(ILclient!db;)V", line = 2071)
	@Override
	public void method20317(@OriginalArg(0) int arg0, @OriginalArg(1) Class202 arg1) {
		@Pc(3) Class95 local3 = this.method4886(Thread.currentThread());
		local3.anInt791 = arg0 * 995019623;
		local3.anInt789 = arg1.anInt3554 * 1215958923;
		local3.anInt792 = arg1.anInt3553 * -761479311;
	}

	@OriginalMember(owner = "client!aeh", name = "ma", descriptor = "(ILclient!db;)V", line = 2071)
	@Override
	public void method20318(@OriginalArg(0) int arg0, @OriginalArg(1) Class202 arg1) {
		@Pc(3) Class95 local3 = this.method4886(Thread.currentThread());
		local3.anInt791 = arg0 * 995019623;
		local3.anInt789 = arg1.anInt3554 * 1215958923;
		local3.anInt792 = arg1.anInt3553 * -761479311;
	}

	@OriginalMember(owner = "client!aeh", name = "mu", descriptor = "(ILclient!db;)V", line = 2071)
	@Override
	public void method20335(@OriginalArg(0) int arg0, @OriginalArg(1) Class202 arg1) {
		@Pc(3) Class95 local3 = this.method4886(Thread.currentThread());
		local3.anInt791 = arg0 * 995019623;
		local3.anInt789 = arg1.anInt3554 * 1215958923;
		local3.anInt792 = arg1.anInt3553 * -761479311;
	}

	@OriginalMember(owner = "client!aeh", name = "ee", descriptor = "()V", line = 2078)
	@Override
	public void method20291() {
		for (@Pc(1) int local1 = 0; local1 < this.aClass95Array1.length; local1++) {
			this.aClass95Array1[local1].anInt789 = this.aClass95Array1[local1].anInt790 * 323990625;
			this.aClass95Array1[local1].aBoolean163 = false;
		}
	}

	@OriginalMember(owner = "client!aeh", name = "mq", descriptor = "()V", line = 2078)
	@Override
	public void method20321() {
		for (@Pc(1) int local1 = 0; local1 < this.aClass95Array1.length; local1++) {
			this.aClass95Array1[local1].anInt789 = this.aClass95Array1[local1].anInt790 * 323990625;
			this.aClass95Array1[local1].aBoolean163 = false;
		}
	}

	@OriginalMember(owner = "client!aeh", name = "mw", descriptor = "()V", line = 2078)
	@Override
	public void method20320() {
		for (@Pc(1) int local1 = 0; local1 < this.aClass95Array1.length; local1++) {
			this.aClass95Array1[local1].anInt789 = this.aClass95Array1[local1].anInt790 * 323990625;
			this.aClass95Array1[local1].aBoolean163 = false;
		}
	}

	@OriginalMember(owner = "client!aeh", name = "bo", descriptor = "(IIFIIFIIFIIII)V", line = 2085)
	@Override
	public void method20089(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) float arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		@Pc(7) boolean local7 = this.anIntArray39 != null;
		@Pc(15) boolean local15 = this.aFloatArray15 != null;
		if (!local7 && !local15) {
			return;
		}
		@Pc(24) Class95 local24 = this.method4886(Thread.currentThread());
		@Pc(27) Class163 local27 = local24.aClass163_2;
		local27.aBoolean559 = false;
		@Pc(37) int local37 = arg0 - this.anInt553 * 1709859847;
		@Pc(44) int local44 = arg3 - this.anInt553 * 1709859847;
		@Pc(51) int local51 = arg6 - this.anInt553 * 1709859847;
		@Pc(58) int local58 = arg1 - this.anInt541 * 9823353;
		@Pc(65) int local65 = arg4 - this.anInt541 * 9823353;
		@Pc(72) int local72 = arg7 - this.anInt541 * 9823353;
		local27.aBoolean558 = local37 < 0 || local37 > local27.anInt3270 || local44 < 0 || local44 > local27.anInt3270 || local51 < 0 || local51 > local27.anInt3270;
		@Pc(99) int local99 = arg9 >>> 24;
		if (arg12 == 0 || arg12 == 1 && local99 == 255) {
			local27.anInt3269 = 0;
			local27.aBoolean560 = false;
			local27.method24361(local7, local15, false, (float) local58, (float) local65, (float) local72, (float) local37, (float) local44, (float) local51, arg2, arg5, arg8, arg9, arg10, arg11);
		} else if (arg12 == 1) {
			local27.anInt3269 = 255 - local99;
			local27.aBoolean560 = false;
			local27.method24361(local7, local15, false, (float) local58, (float) local65, (float) local72, (float) local37, (float) local44, (float) local51, arg2, arg5, arg8, arg9, arg10, arg11);
		} else if (arg12 == 2) {
			local27.anInt3269 = 128;
			local27.aBoolean560 = true;
			local27.method24361(local7, local15, false, (float) local58, (float) local65, (float) local72, (float) local37, (float) local44, (float) local51, arg2, arg5, arg8, arg9, arg10, arg11);
		} else {
			throw new IllegalArgumentException();
		}
		local27.aBoolean559 = true;
	}

	@OriginalMember(owner = "client!aeh", name = "mm", descriptor = "(IIFIIFIIFIIII)V", line = 2085)
	@Override
	public void method20322(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) float arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		@Pc(7) boolean local7 = this.anIntArray39 != null;
		@Pc(15) boolean local15 = this.aFloatArray15 != null;
		if (!local7 && !local15) {
			return;
		}
		@Pc(24) Class95 local24 = this.method4886(Thread.currentThread());
		@Pc(27) Class163 local27 = local24.aClass163_2;
		local27.aBoolean559 = false;
		@Pc(37) int local37 = arg0 - this.anInt553 * 1709859847;
		@Pc(44) int local44 = arg3 - this.anInt553 * 1709859847;
		@Pc(51) int local51 = arg6 - this.anInt553 * 1709859847;
		@Pc(58) int local58 = arg1 - this.anInt541 * 9823353;
		@Pc(65) int local65 = arg4 - this.anInt541 * 9823353;
		@Pc(72) int local72 = arg7 - this.anInt541 * 9823353;
		local27.aBoolean558 = local37 < 0 || local37 > local27.anInt3270 || local44 < 0 || local44 > local27.anInt3270 || local51 < 0 || local51 > local27.anInt3270;
		@Pc(99) int local99 = arg9 >>> 24;
		if (arg12 == 0 || arg12 == 1 && local99 == 255) {
			local27.anInt3269 = 0;
			local27.aBoolean560 = false;
			local27.method24361(local7, local15, false, (float) local58, (float) local65, (float) local72, (float) local37, (float) local44, (float) local51, arg2, arg5, arg8, arg9, arg10, arg11);
		} else if (arg12 == 1) {
			local27.anInt3269 = 255 - local99;
			local27.aBoolean560 = false;
			local27.method24361(local7, local15, false, (float) local58, (float) local65, (float) local72, (float) local37, (float) local44, (float) local51, arg2, arg5, arg8, arg9, arg10, arg11);
		} else if (arg12 == 2) {
			local27.anInt3269 = 128;
			local27.aBoolean560 = true;
			local27.method24361(local7, local15, false, (float) local58, (float) local65, (float) local72, (float) local37, (float) local44, (float) local51, arg2, arg5, arg8, arg9, arg10, arg11);
		} else {
			throw new IllegalArgumentException();
		}
		local27.aBoolean559 = true;
	}

	@OriginalMember(owner = "client!aeh", name = "ex", descriptor = "(FFF[F)V", line = 2120)
	@Override
	public void method20148(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float[] arg3) {
		@Pc(29) float local29 = arg0 * this.aClass442_18.aFloatArray109[3] + this.aClass442_18.aFloatArray109[15] + arg1 * this.aClass442_18.aFloatArray109[7] + arg2 * this.aClass442_18.aFloatArray109[11];
		@Pc(59) float local59 = arg2 * this.aClass442_18.aFloatArray109[8] + arg0 * this.aClass442_18.aFloatArray109[0] + this.aClass442_18.aFloatArray109[12] + this.aClass442_18.aFloatArray109[4] * arg1;
		@Pc(89) float local89 = this.aClass442_18.aFloatArray109[5] * arg1 + arg0 * this.aClass442_18.aFloatArray109[1] + this.aClass442_18.aFloatArray109[13] + arg2 * this.aClass442_18.aFloatArray109[9];
		@Pc(119) float local119 = this.aClass442_19.aFloatArray109[10] * arg2 + arg1 * this.aClass442_19.aFloatArray109[6] + this.aClass442_19.aFloatArray109[2] * arg0 + this.aClass442_19.aFloatArray109[14];
		arg3[0] = local59 * this.aFloat30 / local29 + this.aFloat28;
		arg3[1] = this.aFloat31 * local89 / local29 + this.aFloat33;
		arg3[2] = local119;
	}

	@OriginalMember(owner = "client!aeh", name = "mk", descriptor = "(FFF[F)V", line = 2120)
	@Override
	public void method20323(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float[] arg3) {
		@Pc(29) float local29 = arg0 * this.aClass442_18.aFloatArray109[3] + this.aClass442_18.aFloatArray109[15] + arg1 * this.aClass442_18.aFloatArray109[7] + arg2 * this.aClass442_18.aFloatArray109[11];
		@Pc(59) float local59 = arg2 * this.aClass442_18.aFloatArray109[8] + arg0 * this.aClass442_18.aFloatArray109[0] + this.aClass442_18.aFloatArray109[12] + this.aClass442_18.aFloatArray109[4] * arg1;
		@Pc(89) float local89 = this.aClass442_18.aFloatArray109[5] * arg1 + arg0 * this.aClass442_18.aFloatArray109[1] + this.aClass442_18.aFloatArray109[13] + arg2 * this.aClass442_18.aFloatArray109[9];
		@Pc(119) float local119 = this.aClass442_19.aFloatArray109[10] * arg2 + arg1 * this.aClass442_19.aFloatArray109[6] + this.aClass442_19.aFloatArray109[2] * arg0 + this.aClass442_19.aFloatArray109[14];
		arg3[0] = local59 * this.aFloat30 / local29 + this.aFloat28;
		arg3[1] = this.aFloat31 * local89 / local29 + this.aFloat33;
		arg3[2] = local119;
	}

	@OriginalMember(owner = "client!aeh", name = "en", descriptor = "(FFF[F)V", line = 2130)
	@Override
	public void method20147(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float[] arg3) {
		@Pc(29) float local29 = this.aClass442_18.aFloatArray109[14] + this.aClass442_18.aFloatArray109[2] * arg0 + this.aClass442_18.aFloatArray109[6] * arg1 + this.aClass442_18.aFloatArray109[10] * arg2;
		@Pc(59) float local59 = arg1 * this.aClass442_18.aFloatArray109[7] + this.aClass442_18.aFloatArray109[15] + this.aClass442_18.aFloatArray109[3] * arg0 + arg2 * this.aClass442_18.aFloatArray109[11];
		if (local29 < -local59 || local29 > local59) {
			arg3[2] = Float.NaN;
			arg3[1] = Float.NaN;
			arg3[0] = Float.NaN;
			return;
		}
		@Pc(115) float local115 = this.aClass442_18.aFloatArray109[8] * arg2 + arg1 * this.aClass442_18.aFloatArray109[4] + this.aClass442_18.aFloatArray109[12] + this.aClass442_18.aFloatArray109[0] * arg0;
		if (local115 < -local59 || local115 > local59) {
			arg3[2] = Float.NaN;
			arg3[1] = Float.NaN;
			arg3[0] = Float.NaN;
			return;
		}
		@Pc(171) float local171 = this.aClass442_18.aFloatArray109[9] * arg2 + this.aClass442_18.aFloatArray109[5] * arg1 + this.aClass442_18.aFloatArray109[1] * arg0 + this.aClass442_18.aFloatArray109[13];
		if (local171 < -local59 || local171 > local59) {
			arg3[2] = Float.NaN;
			arg3[1] = Float.NaN;
			arg3[0] = Float.NaN;
		} else {
			@Pc(227) float local227 = this.aClass442_19.aFloatArray109[10] * arg2 + arg1 * this.aClass442_19.aFloatArray109[6] + this.aClass442_19.aFloatArray109[14] + this.aClass442_19.aFloatArray109[2] * arg0;
			arg3[0] = local115 * this.aFloat30 / local59 + this.aFloat28;
			arg3[1] = this.aFloat33 + this.aFloat31 * local171 / local59;
			arg3[2] = local227;
		}
	}

	@OriginalMember(owner = "client!aeh", name = "mo", descriptor = "(FFF[F)V", line = 2130)
	@Override
	public void method20143(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float[] arg3) {
		@Pc(29) float local29 = this.aClass442_18.aFloatArray109[14] + this.aClass442_18.aFloatArray109[2] * arg0 + this.aClass442_18.aFloatArray109[6] * arg1 + this.aClass442_18.aFloatArray109[10] * arg2;
		@Pc(59) float local59 = arg1 * this.aClass442_18.aFloatArray109[7] + this.aClass442_18.aFloatArray109[15] + this.aClass442_18.aFloatArray109[3] * arg0 + arg2 * this.aClass442_18.aFloatArray109[11];
		if (local29 < -local59 || local29 > local59) {
			arg3[2] = Float.NaN;
			arg3[1] = Float.NaN;
			arg3[0] = Float.NaN;
			return;
		}
		@Pc(115) float local115 = this.aClass442_18.aFloatArray109[8] * arg2 + arg1 * this.aClass442_18.aFloatArray109[4] + this.aClass442_18.aFloatArray109[12] + this.aClass442_18.aFloatArray109[0] * arg0;
		if (local115 < -local59 || local115 > local59) {
			arg3[2] = Float.NaN;
			arg3[1] = Float.NaN;
			arg3[0] = Float.NaN;
			return;
		}
		@Pc(171) float local171 = this.aClass442_18.aFloatArray109[9] * arg2 + this.aClass442_18.aFloatArray109[5] * arg1 + this.aClass442_18.aFloatArray109[1] * arg0 + this.aClass442_18.aFloatArray109[13];
		if (local171 < -local59 || local171 > local59) {
			arg3[2] = Float.NaN;
			arg3[1] = Float.NaN;
			arg3[0] = Float.NaN;
		} else {
			@Pc(227) float local227 = this.aClass442_19.aFloatArray109[10] * arg2 + arg1 * this.aClass442_19.aFloatArray109[6] + this.aClass442_19.aFloatArray109[14] + this.aClass442_19.aFloatArray109[2] * arg0;
			arg3[0] = local115 * this.aFloat30 / local59 + this.aFloat28;
			arg3[1] = this.aFloat33 + this.aFloat31 * local171 / local59;
			arg3[2] = local227;
		}
	}

	@OriginalMember(owner = "client!aeh", name = "my", descriptor = "(FFF[F)V", line = 2130)
	@Override
	public void method20324(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float[] arg3) {
		@Pc(29) float local29 = this.aClass442_18.aFloatArray109[14] + this.aClass442_18.aFloatArray109[2] * arg0 + this.aClass442_18.aFloatArray109[6] * arg1 + this.aClass442_18.aFloatArray109[10] * arg2;
		@Pc(59) float local59 = arg1 * this.aClass442_18.aFloatArray109[7] + this.aClass442_18.aFloatArray109[15] + this.aClass442_18.aFloatArray109[3] * arg0 + arg2 * this.aClass442_18.aFloatArray109[11];
		if (local29 < -local59 || local29 > local59) {
			arg3[2] = Float.NaN;
			arg3[1] = Float.NaN;
			arg3[0] = Float.NaN;
			return;
		}
		@Pc(115) float local115 = this.aClass442_18.aFloatArray109[8] * arg2 + arg1 * this.aClass442_18.aFloatArray109[4] + this.aClass442_18.aFloatArray109[12] + this.aClass442_18.aFloatArray109[0] * arg0;
		if (local115 < -local59 || local115 > local59) {
			arg3[2] = Float.NaN;
			arg3[1] = Float.NaN;
			arg3[0] = Float.NaN;
			return;
		}
		@Pc(171) float local171 = this.aClass442_18.aFloatArray109[9] * arg2 + this.aClass442_18.aFloatArray109[5] * arg1 + this.aClass442_18.aFloatArray109[1] * arg0 + this.aClass442_18.aFloatArray109[13];
		if (local171 < -local59 || local171 > local59) {
			arg3[2] = Float.NaN;
			arg3[1] = Float.NaN;
			arg3[0] = Float.NaN;
		} else {
			@Pc(227) float local227 = this.aClass442_19.aFloatArray109[10] * arg2 + arg1 * this.aClass442_19.aFloatArray109[6] + this.aClass442_19.aFloatArray109[14] + this.aClass442_19.aFloatArray109[2] * arg0;
			arg3[0] = local115 * this.aFloat30 / local59 + this.aFloat28;
			arg3[1] = this.aFloat33 + this.aFloat31 * local171 / local59;
			arg3[2] = local227;
		}
	}

	@OriginalMember(owner = "client!aeh", name = "ac", descriptor = "()Lclient!aeo;", line = 2165)
	@Override
	public Class92_Sub1 method20063() {
		return new Class92_Sub1_Sub3(this);
	}

	@OriginalMember(owner = "client!aeh", name = "mt", descriptor = "()Lclient!aeo;", line = 2165)
	@Override
	public Class92_Sub1 method20325() {
		return new Class92_Sub1_Sub3(this);
	}

	@OriginalMember(owner = "client!aeh", name = "mi", descriptor = "()Lclient!aeo;", line = 2165)
	@Override
	public Class92_Sub1 method20326() {
		return new Class92_Sub1_Sub3(this);
	}

	@OriginalMember(owner = "client!aeh", name = "sh", descriptor = "(II)Lclient!df;", line = 2169)
	Interface21 method4903(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return new Class158(arg0, arg1);
	}

	@OriginalMember(owner = "client!aeh", name = "tp", descriptor = "(II)Lclient!df;", line = 2169)
	Interface21 method4904(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return new Class158(arg0, arg1);
	}

	@OriginalMember(owner = "client!aeh", name = "av", descriptor = "(IILclient!dt;Lclient!dl;I)Lclient!df;", line = 2173)
	@Override
	public Interface21 method20376(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class212 arg2, @OriginalArg(3) Class206 arg3, @OriginalArg(4) int arg4) {
		return this.method4903(arg0, arg1);
	}

	@OriginalMember(owner = "client!aeh", name = "mj", descriptor = "(IILclient!dt;Lclient!dl;I)Lclient!df;", line = 2173)
	@Override
	public Interface21 method20327(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class212 arg2, @OriginalArg(3) Class206 arg3, @OriginalArg(4) int arg4) {
		return this.method4903(arg0, arg1);
	}

	@OriginalMember(owner = "client!aeh", name = "ml", descriptor = "(IILclient!dt;Lclient!dl;I)Lclient!df;", line = 2173)
	@Override
	public Interface21 method20073(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class212 arg2, @OriginalArg(3) Class206 arg3, @OriginalArg(4) int arg4) {
		return this.method4903(arg0, arg1);
	}

	@OriginalMember(owner = "client!aeh", name = "at", descriptor = "(II)Lclient!de;", line = 2177)
	@Override
	public Interface20 method20064(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return new Class173(arg0, arg1);
	}

	@OriginalMember(owner = "client!aeh", name = "mr", descriptor = "(II)Lclient!de;", line = 2177)
	@Override
	public Interface20 method20328(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return new Class173(arg0, arg1);
	}

	@OriginalMember(owner = "client!aeh", name = "mv", descriptor = "(II)Lclient!de;", line = 2177)
	@Override
	public Interface20 method20329(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return new Class173(arg0, arg1);
	}

	@OriginalMember(owner = "client!aeh", name = "mb", descriptor = "(II)Lclient!de;", line = 2177)
	@Override
	public Interface20 method20356(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return new Class173(arg0, arg1);
	}

	@OriginalMember(owner = "client!aeh", name = "mg", descriptor = "(III)Lclient!de;", line = 2181)
	@Override
	public Interface20 method20363(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return new Class173(arg0, arg1);
	}

	@OriginalMember(owner = "client!aeh", name = "me", descriptor = "(III)Lclient!de;", line = 2181)
	@Override
	public Interface20 method20357(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return new Class173(arg0, arg1);
	}

	@OriginalMember(owner = "client!aeh", name = "ae", descriptor = "(III)Lclient!de;", line = 2181)
	@Override
	public Interface20 method20065(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return new Class173(arg0, arg1);
	}
}
