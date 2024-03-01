package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ahd")
public class Class124_Sub1 extends Class124 {

	@OriginalMember(owner = "client!ahd", name = "n", descriptor = "Lclient!jn;")
	Interface29 anInterface29_1;

	@OriginalMember(owner = "client!ahd", name = "f", descriptor = "Z")
	boolean aBoolean183;

	@OriginalMember(owner = "client!ahd", name = "l", descriptor = "I")
	int anInt1016;

	@OriginalMember(owner = "client!ahd", name = "m", descriptor = "Lclient!ox;")
	final Class472 aClass472_14 = new Class472();

	@OriginalMember(owner = "client!ahd", name = "k", descriptor = "Lclient!ov;")
	public final Class471 aClass471_1 = new Class471();

	@OriginalMember(owner = "client!ahd", name = "w", descriptor = "I")
	int anInt1017 = 1269037352;

	@OriginalMember(owner = "client!ahd", name = "u", descriptor = "Lclient!ox;")
	final Class472 aClass472_15 = new Class472(Float.NaN, Float.NaN, Float.NaN);

	@OriginalMember(owner = "client!ahd", name = "z", descriptor = "Lclient!ox;")
	final Class472 aClass472_16 = new Class472(Float.NaN, Float.NaN, Float.NaN);

	@OriginalMember(owner = "client!ahd", name = "p", descriptor = "Lclient!ox;")
	final Class472 aClass472_17 = new Class472();

	@OriginalMember(owner = "client!ahd", name = "d", descriptor = "Lclient!ov;")
	final Class471 aClass471_2 = new Class471();

	@OriginalMember(owner = "client!ahd", name = "<init>", descriptor = "(Lclient!je;)V", line = 28)
	public Class124_Sub1(@OriginalArg(0) Class123 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ahd", name = "t", descriptor = "(Lclient!jn;Lclient!ox;Lclient!ov;ZI[[[ILclient!qx;III)V", line = 32)
	public void method9158(@OriginalArg(0) Interface29 arg0, @OriginalArg(1) Class472 arg1, @OriginalArg(2) Class471 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][][] arg5, @OriginalArg(6) Class520 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		this.anInterface29_1 = arg0;
		this.aClass472_14.method29538(arg1);
		this.aClass471_1.method29464(arg2);
		this.aBoolean183 = arg3;
		this.anInt1017 = arg4 * 822388973;
		this.anInt1016 = this.anInterface29_1.method19938().anInt1609 * -157762799;
		this.method9161(arg5, arg6, arg7, arg8);
	}

	@OriginalMember(owner = "client!ahd", name = "am", descriptor = "(Lclient!jn;Lclient!ox;Lclient!ov;ZI[[[ILclient!qx;II)V", line = 32)
	public void method9165(@OriginalArg(0) Interface29 arg0, @OriginalArg(1) Class472 arg1, @OriginalArg(2) Class471 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][][] arg5, @OriginalArg(6) Class520 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		this.anInterface29_1 = arg0;
		this.aClass472_14.method29538(arg1);
		this.aClass471_1.method29464(arg2);
		this.aBoolean183 = arg3;
		this.anInt1017 = arg4 * 822388973;
		this.anInt1016 = this.anInterface29_1.method19938().anInt1609 * -157762799;
		this.method9161(arg5, arg6, arg7, arg8);
	}

	@OriginalMember(owner = "client!ahd", name = "ad", descriptor = "(Lclient!jn;Lclient!ox;Lclient!ov;ZI[[[ILclient!qx;II)V", line = 32)
	public void method9173(@OriginalArg(0) Interface29 arg0, @OriginalArg(1) Class472 arg1, @OriginalArg(2) Class471 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][][] arg5, @OriginalArg(6) Class520 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		this.anInterface29_1 = arg0;
		this.aClass472_14.method29538(arg1);
		this.aClass471_1.method29464(arg2);
		this.aBoolean183 = arg3;
		this.anInt1017 = arg4 * 822388973;
		this.anInt1016 = this.anInterface29_1.method19938().anInt1609 * -157762799;
		this.method9161(arg5, arg6, arg7, arg8);
	}

	@OriginalMember(owner = "client!ahd", name = "ae", descriptor = "(B)V", line = 42)
	public void method9159() {
		if (this.anInterface29_1 != null) {
			this.anInterface29_1 = this.aClass123_13.method8940().method36705(this.anInterface29_1.method19946(), this.anInterface29_1.method19941());
		}
	}

	@OriginalMember(owner = "client!ahd", name = "ap", descriptor = "()V", line = 42)
	public void method9164() {
		if (this.anInterface29_1 != null) {
			this.anInterface29_1 = this.aClass123_13.method8940().method36705(this.anInterface29_1.method19946(), this.anInterface29_1.method19941());
		}
	}

	@OriginalMember(owner = "client!ahd", name = "au", descriptor = "()V", line = 42)
	public void method9174() {
		if (this.anInterface29_1 != null) {
			this.anInterface29_1 = this.aClass123_13.method8940().method36705(this.anInterface29_1.method19946(), this.anInterface29_1.method19941());
		}
	}

	@OriginalMember(owner = "client!ahd", name = "ar", descriptor = "()V", line = 42)
	public void method9177() {
		if (this.anInterface29_1 != null) {
			this.anInterface29_1 = this.aClass123_13.method8940().method36705(this.anInterface29_1.method19946(), this.anInterface29_1.method19941());
		}
	}

	@OriginalMember(owner = "client!ahd", name = "e", descriptor = "([BIIB)I", line = 45)
	static int method9189(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(1) int local1 = -1;
		for (@Pc(3) int local3 = arg1; local3 < arg2; local3++) {
			local1 = local1 >>> 8 ^ Class93_Sub41.anIntArray262[(local1 ^ arg0[local3]) & 0xFF];
		}
		return ~local1;
	}

	@OriginalMember(owner = "client!ahd", name = "b", descriptor = "(F[[[ILclient!qx;II)V", line = 48)
	@Override
	public void method21419(@OriginalArg(0) float arg0, @OriginalArg(1) int[][][] arg1, @OriginalArg(2) Class520 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (this.anInterface29_1 == null) {
			return;
		}
		this.method9161(arg1, arg2, arg3, arg4);
		@Pc(14) Class471 local14 = this.method9160();
		this.aClass471_2.method29480(local14, this.aClass123_13.method8967());
		if (Float.isNaN(this.aClass471_2.aFloat314)) {
			this.aClass471_2.method29464(local14);
		}
		local14.method29459();
		this.aClass472_16.method29538(this.anInterface29_1.method19938().method13870());
		this.aClass123_13.method9050(true, arg0, this.aClass472_15, this.aClass123_13.method8964(), this.aClass472_16, this.aClass472_17);
	}

	@OriginalMember(owner = "client!ahd", name = "e", descriptor = "(F[[[ILclient!qx;IIB)V", line = 48)
	@Override
	public void method21421(@OriginalArg(0) float arg0, @OriginalArg(1) int[][][] arg1, @OriginalArg(2) Class520 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (this.anInterface29_1 == null) {
			return;
		}
		this.method9161(arg1, arg2, arg3, arg4);
		@Pc(14) Class471 local14 = this.method9160();
		this.aClass471_2.method29480(local14, this.aClass123_13.method8967());
		if (Float.isNaN(this.aClass471_2.aFloat314)) {
			this.aClass471_2.method29464(local14);
		}
		local14.method29459();
		this.aClass472_16.method29538(this.anInterface29_1.method19938().method13870());
		this.aClass123_13.method9050(true, arg0, this.aClass472_15, this.aClass123_13.method8964(), this.aClass472_16, this.aClass472_17);
	}

	@OriginalMember(owner = "client!ahd", name = "h", descriptor = "(F[[[ILclient!qx;II)V", line = 48)
	@Override
	public void method21414(@OriginalArg(0) float arg0, @OriginalArg(1) int[][][] arg1, @OriginalArg(2) Class520 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (this.anInterface29_1 == null) {
			return;
		}
		this.method9161(arg1, arg2, arg3, arg4);
		@Pc(14) Class471 local14 = this.method9160();
		this.aClass471_2.method29480(local14, this.aClass123_13.method8967());
		if (Float.isNaN(this.aClass471_2.aFloat314)) {
			this.aClass471_2.method29464(local14);
		}
		local14.method29459();
		this.aClass472_16.method29538(this.anInterface29_1.method19938().method13870());
		this.aClass123_13.method9050(true, arg0, this.aClass472_15, this.aClass123_13.method8964(), this.aClass472_16, this.aClass472_17);
	}

	@OriginalMember(owner = "client!ahd", name = "a", descriptor = "(F[[[ILclient!qx;II)V", line = 48)
	@Override
	public void method21422(@OriginalArg(0) float arg0, @OriginalArg(1) int[][][] arg1, @OriginalArg(2) Class520 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (this.anInterface29_1 == null) {
			return;
		}
		this.method9161(arg1, arg2, arg3, arg4);
		@Pc(14) Class471 local14 = this.method9160();
		this.aClass471_2.method29480(local14, this.aClass123_13.method8967());
		if (Float.isNaN(this.aClass471_2.aFloat314)) {
			this.aClass471_2.method29464(local14);
		}
		local14.method29459();
		this.aClass472_16.method29538(this.anInterface29_1.method19938().method13870());
		this.aClass123_13.method9050(true, arg0, this.aClass472_15, this.aClass123_13.method8964(), this.aClass472_16, this.aClass472_17);
	}

	@OriginalMember(owner = "client!ahd", name = "f", descriptor = "(B)V", line = 59)
	static void method9193() {
		Class173.aClass240_64.method25837();
	}

	@OriginalMember(owner = "client!ahd", name = "ag", descriptor = "(B)Lclient!ov;", line = 61)
	Class471 method9160() {
		@Pc(3) Class471 local3 = Class471.method29495(this.aClass471_1);
		if (this.aBoolean183) {
			@Pc(11) Class472 local11 = this.anInterface29_1.method19937();
			if (local11.method29565() < (float) (this.anInt1017 * -1044384539)) {
				local11 = Class472.method29529(0.0F, 0.0F, 1.0F);
				@Pc(30) Class471 local30 = this.anInterface29_1.method19939();
				local11.method29572(local30);
			}
			local11.aFloat318 = 0.0F;
			@Pc(45) float local45 = (float) Math.atan2((double) local11.aFloat317, (double) local11.aFloat319);
			local11.method29532();
			@Pc(51) Class471 local51 = new Class471();
			local51.method29466(0.0F, 1.0F, 0.0F, local45);
			local3.method29476(local51);
		}
		return local3;
	}

	@OriginalMember(owner = "client!ahd", name = "ax", descriptor = "()Lclient!ov;", line = 61)
	Class471 method9172() {
		@Pc(3) Class471 local3 = Class471.method29495(this.aClass471_1);
		if (this.aBoolean183) {
			@Pc(11) Class472 local11 = this.anInterface29_1.method19937();
			if (local11.method29565() < (float) (this.anInt1017 * -1044384539)) {
				local11 = Class472.method29529(0.0F, 0.0F, 1.0F);
				@Pc(30) Class471 local30 = this.anInterface29_1.method19939();
				local11.method29572(local30);
			}
			local11.aFloat318 = 0.0F;
			@Pc(45) float local45 = (float) Math.atan2((double) local11.aFloat317, (double) local11.aFloat319);
			local11.method29532();
			@Pc(51) Class471 local51 = new Class471();
			local51.method29466(0.0F, 1.0F, 0.0F, local45);
			local3.method29476(local51);
		}
		return local3;
	}

	@OriginalMember(owner = "client!ahd", name = "aq", descriptor = "()Lclient!ov;", line = 61)
	Class471 method9176() {
		@Pc(3) Class471 local3 = Class471.method29495(this.aClass471_1);
		if (this.aBoolean183) {
			@Pc(11) Class472 local11 = this.anInterface29_1.method19937();
			if (local11.method29565() < (float) (this.anInt1017 * -1044384539)) {
				local11 = Class472.method29529(0.0F, 0.0F, 1.0F);
				@Pc(30) Class471 local30 = this.anInterface29_1.method19939();
				local11.method29572(local30);
			}
			local11.aFloat318 = 0.0F;
			@Pc(45) float local45 = (float) Math.atan2((double) local11.aFloat317, (double) local11.aFloat319);
			local11.method29532();
			@Pc(51) Class471 local51 = new Class471();
			local51.method29466(0.0F, 1.0F, 0.0F, local45);
			local3.method29476(local51);
		}
		return local3;
	}

	@OriginalMember(owner = "client!ahd", name = "ah", descriptor = "([[[ILclient!qx;IIB)V", line = 80)
	void method9161(@OriginalArg(0) int[][][] arg0, @OriginalArg(1) Class520 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.method21401() || !this.aClass123_13.method8973() && !this.aClass123_13.method8974()) {
			return;
		}
		@Pc(18) Class93_Sub30 local18 = this.anInterface29_1.method19938();
		this.anInt1016 = local18.anInt1609 * -157762799;
		@Pc(29) int local29 = this.anInt1016 * 526766745;
		@Pc(31) boolean local31 = true;
		if (this.anInt1016 * 526766745 == 3) {
			local31 = false;
		} else if (arg1 != null && arg1.method30330(local18.anInt1610 * -427776677 - arg2 >> 9, local18.anInt1612 * 671628745 - arg3 >> 9)) {
			local29 = this.anInt1016 * 526766745 + 1;
			local31 = false;
		}
		if (!this.aClass123_13.method8974() || arg0 == null) {
			return;
		}
		@Pc(88) float local88 = this.method9162(arg0, arg1, arg2, arg3, local29, local31);
		if (Float.isNaN(local88)) {
			return;
		}
		if (local88 <= 0.0F) {
			return;
		}
		@Pc(98) float local98 = 3.1415927F;
		@Pc(103) Class472 local103 = Class472.method29529(0.0F, 0.0F, 1.0F);
		local103.method29572(this.aClass471_1);
		@Pc(114) Class472 local114 = Class472.method29529(local103.aFloat317, 0.0F, local103.aFloat319);
		local114.method29559();
		@Pc(120) float local120 = Class472.method29549(local103, local114);
		for (@Pc(122) int local122 = 0; local122 < 10; local122++) {
			@Pc(133) float local133 = (local98 + local120) / 2.0F - local120;
			@Pc(135) float local135 = local133;
			if (local88 > 0.0F) {
				local135 = local133 * -1.0F;
			}
			@Pc(148) Class472 local148 = Class472.method29529(1.0F, 0.0F, 0.0F);
			local148.method29572(this.aClass471_1);
			@Pc(154) Class471 local154 = Class471.method29521();
			local154.method29465(local148, local135);
			this.aClass471_1.method29476(local154);
			this.aClass471_1.method29499();
			local148.method29532();
			local154.method29459();
			local88 = this.method9162(arg0, arg1, arg2, arg3, local29, local31);
			if (Float.isNaN(local88)) {
				return;
			}
			if (local88 > 0.0F) {
				local120 += local133;
			} else {
				local98 -= local133;
			}
		}
	}

	@OriginalMember(owner = "client!ahd", name = "av", descriptor = "([[[ILclient!qx;II)V", line = 80)
	void method9170(@OriginalArg(0) int[][][] arg0, @OriginalArg(1) Class520 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.method21401() || !this.aClass123_13.method8973() && !this.aClass123_13.method8974()) {
			return;
		}
		@Pc(18) Class93_Sub30 local18 = this.anInterface29_1.method19938();
		this.anInt1016 = local18.anInt1609 * -157762799;
		@Pc(29) int local29 = this.anInt1016 * 526766745;
		@Pc(31) boolean local31 = true;
		if (this.anInt1016 * 526766745 == 3) {
			local31 = false;
		} else if (arg1 != null && arg1.method30330(local18.anInt1610 * -427776677 - arg2 >> 9, local18.anInt1612 * 671628745 - arg3 >> 9)) {
			local29 = this.anInt1016 * 526766745 + 1;
			local31 = false;
		}
		if (!this.aClass123_13.method8974() || arg0 == null) {
			return;
		}
		@Pc(88) float local88 = this.method9162(arg0, arg1, arg2, arg3, local29, local31);
		if (Float.isNaN(local88)) {
			return;
		}
		if (local88 <= 0.0F) {
			return;
		}
		@Pc(98) float local98 = 3.1415927F;
		@Pc(103) Class472 local103 = Class472.method29529(0.0F, 0.0F, 1.0F);
		local103.method29572(this.aClass471_1);
		@Pc(114) Class472 local114 = Class472.method29529(local103.aFloat317, 0.0F, local103.aFloat319);
		local114.method29559();
		@Pc(120) float local120 = Class472.method29549(local103, local114);
		for (@Pc(122) int local122 = 0; local122 < 10; local122++) {
			@Pc(133) float local133 = (local98 + local120) / 2.0F - local120;
			@Pc(135) float local135 = local133;
			if (local88 > 0.0F) {
				local135 = local133 * -1.0F;
			}
			@Pc(148) Class472 local148 = Class472.method29529(1.0F, 0.0F, 0.0F);
			local148.method29572(this.aClass471_1);
			@Pc(154) Class471 local154 = Class471.method29521();
			local154.method29465(local148, local135);
			this.aClass471_1.method29476(local154);
			this.aClass471_1.method29499();
			local148.method29532();
			local154.method29459();
			local88 = this.method9162(arg0, arg1, arg2, arg3, local29, local31);
			if (Float.isNaN(local88)) {
				return;
			}
			if (local88 > 0.0F) {
				local120 += local133;
			} else {
				local98 -= local133;
			}
		}
	}

	@OriginalMember(owner = "client!ahd", name = "ao", descriptor = "([[[ILclient!qx;II)V", line = 80)
	void method9179(@OriginalArg(0) int[][][] arg0, @OriginalArg(1) Class520 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.method21401() || !this.aClass123_13.method8973() && !this.aClass123_13.method8974()) {
			return;
		}
		@Pc(18) Class93_Sub30 local18 = this.anInterface29_1.method19938();
		this.anInt1016 = local18.anInt1609 * -157762799;
		@Pc(29) int local29 = this.anInt1016 * 526766745;
		@Pc(31) boolean local31 = true;
		if (this.anInt1016 * 526766745 == 3) {
			local31 = false;
		} else if (arg1 != null && arg1.method30330(local18.anInt1610 * -427776677 - arg2 >> 9, local18.anInt1612 * 671628745 - arg3 >> 9)) {
			local29 = this.anInt1016 * 526766745 + 1;
			local31 = false;
		}
		if (!this.aClass123_13.method8974() || arg0 == null) {
			return;
		}
		@Pc(88) float local88 = this.method9162(arg0, arg1, arg2, arg3, local29, local31);
		if (Float.isNaN(local88)) {
			return;
		}
		if (local88 <= 0.0F) {
			return;
		}
		@Pc(98) float local98 = 3.1415927F;
		@Pc(103) Class472 local103 = Class472.method29529(0.0F, 0.0F, 1.0F);
		local103.method29572(this.aClass471_1);
		@Pc(114) Class472 local114 = Class472.method29529(local103.aFloat317, 0.0F, local103.aFloat319);
		local114.method29559();
		@Pc(120) float local120 = Class472.method29549(local103, local114);
		for (@Pc(122) int local122 = 0; local122 < 10; local122++) {
			@Pc(133) float local133 = (local98 + local120) / 2.0F - local120;
			@Pc(135) float local135 = local133;
			if (local88 > 0.0F) {
				local135 = local133 * -1.0F;
			}
			@Pc(148) Class472 local148 = Class472.method29529(1.0F, 0.0F, 0.0F);
			local148.method29572(this.aClass471_1);
			@Pc(154) Class471 local154 = Class471.method29521();
			local154.method29465(local148, local135);
			this.aClass471_1.method29476(local154);
			this.aClass471_1.method29499();
			local148.method29532();
			local154.method29459();
			local88 = this.method9162(arg0, arg1, arg2, arg3, local29, local31);
			if (Float.isNaN(local88)) {
				return;
			}
			if (local88 > 0.0F) {
				local120 += local133;
			} else {
				local98 -= local133;
			}
		}
	}

	@OriginalMember(owner = "client!ahd", name = "aj", descriptor = "([[[ILclient!qx;II)V", line = 80)
	void method9180(@OriginalArg(0) int[][][] arg0, @OriginalArg(1) Class520 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.method21401() || !this.aClass123_13.method8973() && !this.aClass123_13.method8974()) {
			return;
		}
		@Pc(18) Class93_Sub30 local18 = this.anInterface29_1.method19938();
		this.anInt1016 = local18.anInt1609 * -157762799;
		@Pc(29) int local29 = this.anInt1016 * 526766745;
		@Pc(31) boolean local31 = true;
		if (this.anInt1016 * 526766745 == 3) {
			local31 = false;
		} else if (arg1 != null && arg1.method30330(local18.anInt1610 * -427776677 - arg2 >> 9, local18.anInt1612 * 671628745 - arg3 >> 9)) {
			local29 = this.anInt1016 * 526766745 + 1;
			local31 = false;
		}
		if (!this.aClass123_13.method8974() || arg0 == null) {
			return;
		}
		@Pc(88) float local88 = this.method9162(arg0, arg1, arg2, arg3, local29, local31);
		if (Float.isNaN(local88)) {
			return;
		}
		if (local88 <= 0.0F) {
			return;
		}
		@Pc(98) float local98 = 3.1415927F;
		@Pc(103) Class472 local103 = Class472.method29529(0.0F, 0.0F, 1.0F);
		local103.method29572(this.aClass471_1);
		@Pc(114) Class472 local114 = Class472.method29529(local103.aFloat317, 0.0F, local103.aFloat319);
		local114.method29559();
		@Pc(120) float local120 = Class472.method29549(local103, local114);
		for (@Pc(122) int local122 = 0; local122 < 10; local122++) {
			@Pc(133) float local133 = (local98 + local120) / 2.0F - local120;
			@Pc(135) float local135 = local133;
			if (local88 > 0.0F) {
				local135 = local133 * -1.0F;
			}
			@Pc(148) Class472 local148 = Class472.method29529(1.0F, 0.0F, 0.0F);
			local148.method29572(this.aClass471_1);
			@Pc(154) Class471 local154 = Class471.method29521();
			local154.method29465(local148, local135);
			this.aClass471_1.method29476(local154);
			this.aClass471_1.method29499();
			local148.method29532();
			local154.method29459();
			local88 = this.method9162(arg0, arg1, arg2, arg3, local29, local31);
			if (Float.isNaN(local88)) {
				return;
			}
			if (local88 > 0.0F) {
				local120 += local133;
			} else {
				local98 -= local133;
			}
		}
	}

	@OriginalMember(owner = "client!ahd", name = "ay", descriptor = "([[[ILclient!qx;II)V", line = 80)
	void method9181(@OriginalArg(0) int[][][] arg0, @OriginalArg(1) Class520 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.method21401() || !this.aClass123_13.method8973() && !this.aClass123_13.method8974()) {
			return;
		}
		@Pc(18) Class93_Sub30 local18 = this.anInterface29_1.method19938();
		this.anInt1016 = local18.anInt1609 * -157762799;
		@Pc(29) int local29 = this.anInt1016 * 526766745;
		@Pc(31) boolean local31 = true;
		if (this.anInt1016 * 526766745 == 3) {
			local31 = false;
		} else if (arg1 != null && arg1.method30330(local18.anInt1610 * -427776677 - arg2 >> 9, local18.anInt1612 * 671628745 - arg3 >> 9)) {
			local29 = this.anInt1016 * 526766745 + 1;
			local31 = false;
		}
		if (!this.aClass123_13.method8974() || arg0 == null) {
			return;
		}
		@Pc(88) float local88 = this.method9162(arg0, arg1, arg2, arg3, local29, local31);
		if (Float.isNaN(local88)) {
			return;
		}
		if (local88 <= 0.0F) {
			return;
		}
		@Pc(98) float local98 = 3.1415927F;
		@Pc(103) Class472 local103 = Class472.method29529(0.0F, 0.0F, 1.0F);
		local103.method29572(this.aClass471_1);
		@Pc(114) Class472 local114 = Class472.method29529(local103.aFloat317, 0.0F, local103.aFloat319);
		local114.method29559();
		@Pc(120) float local120 = Class472.method29549(local103, local114);
		for (@Pc(122) int local122 = 0; local122 < 10; local122++) {
			@Pc(133) float local133 = (local98 + local120) / 2.0F - local120;
			@Pc(135) float local135 = local133;
			if (local88 > 0.0F) {
				local135 = local133 * -1.0F;
			}
			@Pc(148) Class472 local148 = Class472.method29529(1.0F, 0.0F, 0.0F);
			local148.method29572(this.aClass471_1);
			@Pc(154) Class471 local154 = Class471.method29521();
			local154.method29465(local148, local135);
			this.aClass471_1.method29476(local154);
			this.aClass471_1.method29499();
			local148.method29532();
			local154.method29459();
			local88 = this.method9162(arg0, arg1, arg2, arg3, local29, local31);
			if (Float.isNaN(local88)) {
				return;
			}
			if (local88 > 0.0F) {
				local120 += local133;
			} else {
				local98 -= local133;
			}
		}
	}

	@OriginalMember(owner = "client!ahd", name = "al", descriptor = "([[[ILclient!qx;IIIZI)F", line = 129)
	float method9162(@OriginalArg(0) int[][][] arg0, @OriginalArg(1) Class520 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		@Pc(3) Class471 local3 = this.method9160();
		@Pc(8) Class472 local8 = this.method9171(local3);
		local3.method29459();
		@Pc(18) int local18 = (int) local8.aFloat317 - arg2 >> 9;
		@Pc(26) int local26 = (int) local8.aFloat319 - arg3 >> 9;
		if (local18 < 0 || local26 < 0 || local18 + 1 >= arg0[0].length || local26 + 1 >= arg0[0][0].length) {
			local8.method29532();
			return Float.NaN;
		}
		@Pc(50) int local50 = arg4;
		if (arg5 && arg1.method30330(local18, local26)) {
			local50 = arg4 + 1;
		}
		@Pc(68) long local68 = (long) local8.aFloat317 % 512L;
		@Pc(74) long local74 = (long) local8.aFloat319 % 512L;
		@Pc(91) long local91 = (512L - local68) * (long) arg0[local50][local18][local26] * (512L - local74);
		@Pc(110) long local110 = local91 + (512L - local74) * (long) arg0[local50][local18 + 1][local26] * local68;
		@Pc(129) long local129 = local110 + (long) arg0[local50][local18][local26 + 1] * (512L - local68) * local74;
		@Pc(148) long local148 = local129 + local74 * (long) arg0[local50][local18 + 1][local26 + 1] * local68;
		@Pc(152) long local152 = local148 / 262144L;
		@Pc(156) long local156 = local152 - 1024L;
		@Pc(163) float local163 = (float) -local156 - local8.aFloat318;
		local8.method29532();
		return local163;
	}

	@OriginalMember(owner = "client!ahd", name = "ab", descriptor = "([[[ILclient!qx;IIIZ)F", line = 129)
	float method9182(@OriginalArg(0) int[][][] arg0, @OriginalArg(1) Class520 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		@Pc(3) Class471 local3 = this.method9160();
		@Pc(8) Class472 local8 = this.method9171(local3);
		local3.method29459();
		@Pc(18) int local18 = (int) local8.aFloat317 - arg2 >> 9;
		@Pc(26) int local26 = (int) local8.aFloat319 - arg3 >> 9;
		if (local18 < 0 || local26 < 0 || local18 + 1 >= arg0[0].length || local26 + 1 >= arg0[0][0].length) {
			local8.method29532();
			return Float.NaN;
		}
		@Pc(50) int local50 = arg4;
		if (arg5 && arg1.method30330(local18, local26)) {
			local50 = arg4 + 1;
		}
		@Pc(68) long local68 = (long) local8.aFloat317 % 512L;
		@Pc(74) long local74 = (long) local8.aFloat319 % 512L;
		@Pc(91) long local91 = (512L - local68) * (long) arg0[local50][local18][local26] * (512L - local74);
		@Pc(110) long local110 = local91 + (512L - local74) * (long) arg0[local50][local18 + 1][local26] * local68;
		@Pc(129) long local129 = local110 + (long) arg0[local50][local18][local26 + 1] * (512L - local68) * local74;
		@Pc(148) long local148 = local129 + local74 * (long) arg0[local50][local18 + 1][local26 + 1] * local68;
		@Pc(152) long local152 = local148 / 262144L;
		@Pc(156) long local156 = local152 - 1024L;
		@Pc(163) float local163 = (float) -local156 - local8.aFloat318;
		local8.method29532();
		return local163;
	}

	@OriginalMember(owner = "client!ahd", name = "az", descriptor = "([[[ILclient!qx;IIIZ)F", line = 129)
	float method9183(@OriginalArg(0) int[][][] arg0, @OriginalArg(1) Class520 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		@Pc(3) Class471 local3 = this.method9160();
		@Pc(8) Class472 local8 = this.method9171(local3);
		local3.method29459();
		@Pc(18) int local18 = (int) local8.aFloat317 - arg2 >> 9;
		@Pc(26) int local26 = (int) local8.aFloat319 - arg3 >> 9;
		if (local18 < 0 || local26 < 0 || local18 + 1 >= arg0[0].length || local26 + 1 >= arg0[0][0].length) {
			local8.method29532();
			return Float.NaN;
		}
		@Pc(50) int local50 = arg4;
		if (arg5 && arg1.method30330(local18, local26)) {
			local50 = arg4 + 1;
		}
		@Pc(68) long local68 = (long) local8.aFloat317 % 512L;
		@Pc(74) long local74 = (long) local8.aFloat319 % 512L;
		@Pc(91) long local91 = (512L - local68) * (long) arg0[local50][local18][local26] * (512L - local74);
		@Pc(110) long local110 = local91 + (512L - local74) * (long) arg0[local50][local18 + 1][local26] * local68;
		@Pc(129) long local129 = local110 + (long) arg0[local50][local18][local26 + 1] * (512L - local68) * local74;
		@Pc(148) long local148 = local129 + local74 * (long) arg0[local50][local18 + 1][local26 + 1] * local68;
		@Pc(152) long local152 = local148 / 262144L;
		@Pc(156) long local156 = local152 - 1024L;
		@Pc(163) float local163 = (float) -local156 - local8.aFloat318;
		local8.method29532();
		return local163;
	}

	@OriginalMember(owner = "client!ahd", name = "ac", descriptor = "(Lclient!ov;I)Lclient!ox;", line = 158)
	Class472 method9171(@OriginalArg(0) Class471 arg0) {
		@Pc(3) Class472 local3 = Class472.method29530(this.aClass472_14);
		local3.method29572(arg0);
		@Pc(11) Class472 local11 = Class472.method29545(this.aClass472_16, local3);
		local3.method29532();
		return local11;
	}

	@OriginalMember(owner = "client!ahd", name = "aa", descriptor = "(Lclient!ov;)Lclient!ox;", line = 158)
	Class472 method9184(@OriginalArg(0) Class471 arg0) {
		@Pc(3) Class472 local3 = Class472.method29530(this.aClass472_14);
		local3.method29572(arg0);
		@Pc(11) Class472 local11 = Class472.method29545(this.aClass472_16, local3);
		local3.method29532();
		return local11;
	}

	@OriginalMember(owner = "client!ahd", name = "z", descriptor = "()Z", line = 166)
	@Override
	public boolean method21408() {
		return !Float.isNaN(this.aClass472_15.aFloat317);
	}

	@OriginalMember(owner = "client!ahd", name = "p", descriptor = "()Z", line = 166)
	@Override
	public boolean method21409() {
		return !Float.isNaN(this.aClass472_15.aFloat317);
	}

	@OriginalMember(owner = "client!ahd", name = "n", descriptor = "(I)Z", line = 166)
	@Override
	public boolean method21401() {
		return !Float.isNaN(this.aClass472_15.aFloat317);
	}

	@OriginalMember(owner = "client!ahd", name = "m", descriptor = "(B)Lclient!ox;", line = 170)
	@Override
	public Class472 method21402() {
		@Pc(3) Class472 local3 = Class472.method29530(this.aClass472_14);
		local3.method29572(this.aClass471_2);
		@Pc(12) Class472 local12 = Class472.method29545(this.aClass472_15, local3);
		local3.method29532();
		return local12;
	}

	@OriginalMember(owner = "client!ahd", name = "g", descriptor = "()Lclient!ox;", line = 170)
	@Override
	public Class472 method21423() {
		@Pc(3) Class472 local3 = Class472.method29530(this.aClass472_14);
		local3.method29572(this.aClass471_2);
		@Pc(12) Class472 local12 = Class472.method29545(this.aClass472_15, local3);
		local3.method29532();
		return local12;
	}

	@OriginalMember(owner = "client!ahd", name = "k", descriptor = "(I)[D", line = 178)
	@Override
	public double[] method21413() {
		@Pc(2) double[] local2 = new double[3];
		@Pc(6) Class472 local6 = this.method21402();
		local2[0] = local6.aFloat317;
		local2[1] = local6.aFloat318;
		local2[2] = local6.aFloat319;
		return local2;
	}

	@OriginalMember(owner = "client!ahd", name = "d", descriptor = "()[D", line = 178)
	@Override
	public double[] method21403() {
		@Pc(2) double[] local2 = new double[3];
		@Pc(6) Class472 local6 = this.method21402();
		local2[0] = local6.aFloat317;
		local2[1] = local6.aFloat318;
		local2[2] = local6.aFloat319;
		return local2;
	}

	@OriginalMember(owner = "client!ahd", name = "c", descriptor = "()Lclient!akt;", line = 187)
	@Override
	public Class93_Sub30 method21411() {
		@Pc(3) Class472 local3 = this.method21402();
		@Pc(20) Class93_Sub30 local20 = new Class93_Sub30(this.anInt1016 * 526766745, (int) local3.aFloat317, (int) local3.aFloat318, (int) local3.aFloat319);
		local3.method29532();
		return local20;
	}

	@OriginalMember(owner = "client!ahd", name = "v", descriptor = "()Lclient!akt;", line = 187)
	@Override
	public Class93_Sub30 method21412() {
		@Pc(3) Class472 local3 = this.method21402();
		@Pc(20) Class93_Sub30 local20 = new Class93_Sub30(this.anInt1016 * 526766745, (int) local3.aFloat317, (int) local3.aFloat318, (int) local3.aFloat319);
		local3.method29532();
		return local20;
	}

	@OriginalMember(owner = "client!ahd", name = "o", descriptor = "()Lclient!akt;", line = 187)
	@Override
	public Class93_Sub30 method21410() {
		@Pc(3) Class472 local3 = this.method21402();
		@Pc(20) Class93_Sub30 local20 = new Class93_Sub30(this.anInt1016 * 526766745, (int) local3.aFloat317, (int) local3.aFloat318, (int) local3.aFloat319);
		local3.method29532();
		return local20;
	}

	@OriginalMember(owner = "client!ahd", name = "f", descriptor = "(B)Lclient!akt;", line = 187)
	@Override
	public Class93_Sub30 method21404() {
		@Pc(3) Class472 local3 = this.method21402();
		@Pc(20) Class93_Sub30 local20 = new Class93_Sub30(this.anInt1016 * 526766745, (int) local3.aFloat317, (int) local3.aFloat318, (int) local3.aFloat319);
		local3.method29532();
		return local20;
	}

	@OriginalMember(owner = "client!ahd", name = "r", descriptor = "()Lclient!akt;", line = 187)
	@Override
	public Class93_Sub30 method21420() {
		@Pc(3) Class472 local3 = this.method21402();
		@Pc(20) Class93_Sub30 local20 = new Class93_Sub30(this.anInt1016 * 526766745, (int) local3.aFloat317, (int) local3.aFloat318, (int) local3.aFloat319);
		local3.method29532();
		return local20;
	}

	@OriginalMember(owner = "client!ahd", name = "af", descriptor = "()Lclient!ox;", line = 194)
	public Class472 method9163() {
		return this.aClass472_15;
	}

	@OriginalMember(owner = "client!ahd", name = "ai", descriptor = "(I)Lclient!ox;", line = 194)
	public Class472 method9166() {
		return this.aClass472_15;
	}

	@OriginalMember(owner = "client!ahd", name = "an", descriptor = "()Lclient!ox;", line = 194)
	public Class472 method9175() {
		return this.aClass472_15;
	}

	@OriginalMember(owner = "client!ahd", name = "ak", descriptor = "()Lclient!ox;", line = 194)
	public Class472 method9185() {
		return this.aClass472_15;
	}

	@OriginalMember(owner = "client!ahd", name = "aw", descriptor = "(I)Lclient!ox;", line = 198)
	public Class472 method9167() {
		return this.aClass472_14;
	}

	@OriginalMember(owner = "client!ahd", name = "as", descriptor = "(B)F", line = 202)
	public float method9168() {
		return Class110_Sub15.method20152(this.aClass471_1);
	}

	@OriginalMember(owner = "client!ahd", name = "bf", descriptor = "()F", line = 202)
	public float method9178() {
		return Class110_Sub15.method20152(this.aClass471_1);
	}

	@OriginalMember(owner = "client!ahd", name = "bl", descriptor = "()F", line = 202)
	public float method9186() {
		return Class110_Sub15.method20152(this.aClass471_1);
	}

	@OriginalMember(owner = "client!ahd", name = "at", descriptor = "(I)F", line = 206)
	public float method9169() {
		return Class332.method27394(this.aClass471_1);
	}

	@OriginalMember(owner = "client!ahd", name = "bk", descriptor = "()F", line = 206)
	public float method9187() {
		return Class332.method27394(this.aClass471_1);
	}

	@OriginalMember(owner = "client!ahd", name = "w", descriptor = "(I)F", line = 210)
	@Override
	public float method21405() {
		return 0.0F;
	}

	@OriginalMember(owner = "client!ahd", name = "s", descriptor = "()F", line = 210)
	@Override
	public float method21415() {
		return 0.0F;
	}

	@OriginalMember(owner = "client!ahd", name = "y", descriptor = "()F", line = 210)
	@Override
	public float method21416() {
		return 0.0F;
	}

	@OriginalMember(owner = "client!ahd", name = "l", descriptor = "(Lclient!ju;IIB)V", line = 214)
	@Override
	public void method21406(@OriginalArg(0) Class368 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) Class472 local3 = this.method21402();
		arg0.anInt4586 = ((int) local3.aFloat317 - arg1) * -255666073;
		arg0.anInt4587 = (int) -local3.aFloat318 * -543294551;
		arg0.anInt4588 = ((int) local3.aFloat319 - arg2) * -513444905;
		local3.method29532();
	}

	@OriginalMember(owner = "client!ahd", name = "j", descriptor = "(Lclient!ju;II)V", line = 214)
	@Override
	public void method21424(@OriginalArg(0) Class368 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) Class472 local3 = this.method21402();
		arg0.anInt4586 = ((int) local3.aFloat317 - arg1) * -255666073;
		arg0.anInt4587 = (int) -local3.aFloat318 * -543294551;
		arg0.anInt4588 = ((int) local3.aFloat319 - arg2) * -513444905;
		local3.method29532();
	}

	@OriginalMember(owner = "client!ahd", name = "i", descriptor = "(Lclient!ju;II)V", line = 214)
	@Override
	public void method21400(@OriginalArg(0) Class368 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) Class472 local3 = this.method21402();
		arg0.anInt4586 = ((int) local3.aFloat317 - arg1) * -255666073;
		arg0.anInt4587 = (int) -local3.aFloat318 * -543294551;
		arg0.anInt4588 = ((int) local3.aFloat319 - arg2) * -513444905;
		local3.method29532();
	}

	@OriginalMember(owner = "client!ahd", name = "q", descriptor = "(Lclient!alw;)V", line = 222)
	@Override
	public void method21417(@OriginalArg(0) Class93_Sub41 arg0) {
		@Pc(5) Class363 local5 = Class90.method1601(arg0.method22413());
		@Pc(9) int local9 = arg0.method22415();
		this.aClass472_14.method29536(arg0);
		this.aClass471_1.method29462(arg0);
		if (arg0.method22413() == 1) {
			this.aBoolean183 = true;
		} else {
			this.aBoolean183 = false;
		}
		this.anInt1017 = arg0.method22415() * 822388973;
		this.anInterface29_1 = this.aClass123_13.method8940().method36705(local5, local9);
	}

	@OriginalMember(owner = "client!ahd", name = "x", descriptor = "(Lclient!alw;)V", line = 222)
	@Override
	public void method21418(@OriginalArg(0) Class93_Sub41 arg0) {
		@Pc(5) Class363 local5 = Class90.method1601(arg0.method22413());
		@Pc(9) int local9 = arg0.method22415();
		this.aClass472_14.method29536(arg0);
		this.aClass471_1.method29462(arg0);
		if (arg0.method22413() == 1) {
			this.aBoolean183 = true;
		} else {
			this.aBoolean183 = false;
		}
		this.anInt1017 = arg0.method22415() * 822388973;
		this.anInterface29_1 = this.aClass123_13.method8940().method36705(local5, local9);
	}

	@OriginalMember(owner = "client!ahd", name = "u", descriptor = "(Lclient!alw;I)V", line = 222)
	@Override
	public void method21407(@OriginalArg(0) Class93_Sub41 arg0) {
		@Pc(5) Class363 local5 = Class90.method1601(arg0.method22413());
		@Pc(9) int local9 = arg0.method22415();
		this.aClass472_14.method29536(arg0);
		this.aClass471_1.method29462(arg0);
		if (arg0.method22413() == 1) {
			this.aBoolean183 = true;
		} else {
			this.aBoolean183 = false;
		}
		this.anInt1017 = arg0.method22415() * 822388973;
		this.anInterface29_1 = this.aClass123_13.method8940().method36705(local5, local9);
	}

	@OriginalMember(owner = "client!ahd", name = "a", descriptor = "(Lclient!yf;B)V", line = 4834)
	static final void method9192(@OriginalArg(0) Class681 arg0) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = arg0.anIntArray520[arg0.anInt5889 * -709694321];
	}

	@OriginalMember(owner = "client!ahd", name = "jp", descriptor = "(Lclient!hf;Lclient!hq;Lclient!yf;I)V", line = 6727)
	static final void method9190(@OriginalArg(0) Class312 arg0, @OriginalArg(1) Class320 arg1, @OriginalArg(2) Class681 arg2) {
		arg0.aString166 = (String) arg2.anObjectArray45[(arg2.anInt5888 -= 957530791) * 587908375];
	}

	@OriginalMember(owner = "client!ahd", name = "xo", descriptor = "(Lclient!yf;I)V", line = 9215)
	static final void method9191(@OriginalArg(0) Class681 arg0) {
		arg0.anInt5891 -= -1915563430;
		@Pc(13) int local13 = arg0.anIntArray519[arg0.anInt5891 * -1497248091];
		@Pc(23) int local23 = arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 1];
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = Class14.method193(local13, local23, true);
	}

	@OriginalMember(owner = "client!ahd", name = "aes", descriptor = "(Lclient!yf;I)V", line = 10281)
	static final void method9188(@OriginalArg(0) Class681 arg0) {
		arg0.anInt5891 -= -1915563430;
		@Pc(13) int local13 = arg0.anIntArray519[arg0.anInt5891 * -1497248091];
		@Pc(23) int local23 = arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 1];
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = (local13 & 0x1 << local23) == 0 ? 0 : 1;
	}
}
