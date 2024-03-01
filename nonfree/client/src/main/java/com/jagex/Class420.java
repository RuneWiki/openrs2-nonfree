package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mj")
public class Class420 {

	@OriginalMember(owner = "client!mj", name = "n", descriptor = "Lclient!mj;")
	Class420 aClass420_1;

	@OriginalMember(owner = "client!mj", name = "m", descriptor = "Lclient!ma;")
	Interface39 anInterface39_1;

	@OriginalMember(owner = "client!mj", name = "e", descriptor = "F")
	float aFloat290;

	@OriginalMember(owner = "client!mj", name = "k", descriptor = "F")
	float aFloat287;

	@OriginalMember(owner = "client!mj", name = "w", descriptor = "F")
	float aFloat288;

	@OriginalMember(owner = "client!mj", name = "f", descriptor = "F")
	float aFloat289;

	@OriginalMember(owner = "client!mj", name = "l", descriptor = "J")
	long aLong273;

	@OriginalMember(owner = "client!mj", name = "u", descriptor = "J")
	long aLong274;

	@OriginalMember(owner = "client!mj", name = "e", descriptor = "(I)[Lclient!ql;", line = 14)
	public static Class509[] method28744() {
		return new Class509[] { Class509.aClass509_1, Class509.aClass509_3, Class509.aClass509_2 };
	}

	@OriginalMember(owner = "client!mj", name = "<init>", descriptor = "(IFLjava/lang/Object;Lclient!mb;Lclient!ma;Lclient!mj;)V", line = 15)
	Class420(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) Object arg2, @OriginalArg(3) Class412 arg3, @OriginalArg(4) Interface39 arg4, @OriginalArg(5) Class420 arg5) {
		this.aClass420_1 = arg5;
		this.anInterface39_1 = arg4;
		this.aFloat290 = 1.0F;
		this.aFloat287 = arg1;
		this.aFloat288 = -1.0F;
		this.aFloat289 = -1.0F;
		this.aLong273 = -4369100113735516591L;
		this.aLong274 = 8177889579898841287L;
	}

	@OriginalMember(owner = "client!mj", name = "e", descriptor = "(I)F", line = 27)
	float method28725() {
		return this.aFloat287;
	}

	@OriginalMember(owner = "client!mj", name = "n", descriptor = "(I)F", line = 31)
	public float method28718() {
		@Pc(1) float local1 = 1.0F;
		for (@Pc(3) Class420 local3 = this; local3 != null; local3 = local3.method28723()) {
			local1 *= local3.method28725();
		}
		return local1;
	}

	@OriginalMember(owner = "client!mj", name = "z", descriptor = "()F", line = 31)
	public float method28722() {
		@Pc(1) float local1 = 1.0F;
		for (@Pc(3) Class420 local3 = this; local3 != null; local3 = local3.method28723()) {
			local1 *= local3.method28725();
		}
		return local1;
	}

	@OriginalMember(owner = "client!mj", name = "u", descriptor = "()F", line = 31)
	public float method28733() {
		@Pc(1) float local1 = 1.0F;
		for (@Pc(3) Class420 local3 = this; local3 != null; local3 = local3.method28723()) {
			local1 *= local3.method28725();
		}
		return local1;
	}

	@OriginalMember(owner = "client!mj", name = "m", descriptor = "(I)V", line = 41)
	void method28719() {
		if (this.anInterface39_1 != null) {
			@Pc(7) float local7 = this.anInterface39_1.method26345();
			if (local7 != this.aFloat290 && this.aFloat289 < 0.0F) {
				this.aFloat288 = this.aFloat290;
				this.aFloat289 = local7;
				this.aLong273 = Class305.method26796() * 4369100113735516591L;
				this.aLong274 = this.aLong273 * -3919147337030305897L + -6132218746663857596L;
			}
		}
		if (this.aFloat289 >= 0.0F) {
			@Pc(46) long local46 = Class305.method26796();
			if (local46 > this.aLong274 * -8234214018386827511L) {
				this.aFloat290 = this.aFloat289;
				this.aFloat289 = -1.0F;
			} else {
				@Pc(67) float local67 = this.aFloat289 - this.aFloat288;
				@Pc(77) long local77 = this.aLong274 * -8234214018386827511L - this.aLong273 * -7055091242193193649L;
				@Pc(82) float local82 = local67 / (float) local77;
				this.aFloat290 = this.aFloat288 + local82 * (float) (local46 - this.aLong273 * -7055091242193193649L);
				if (this.aFloat289 == this.aFloat290) {
					this.aFloat289 = -1.0F;
				}
			}
		}
		this.aFloat290 = Math.min(1.0F, Math.max(this.aFloat290, 0.0F));
	}

	@OriginalMember(owner = "client!mj", name = "p", descriptor = "()V", line = 41)
	void method28726() {
		if (this.anInterface39_1 != null) {
			@Pc(7) float local7 = this.anInterface39_1.method26345();
			if (local7 != this.aFloat290 && this.aFloat289 < 0.0F) {
				this.aFloat288 = this.aFloat290;
				this.aFloat289 = local7;
				this.aLong273 = Class305.method26796() * 4369100113735516591L;
				this.aLong274 = this.aLong273 * -3919147337030305897L + -6132218746663857596L;
			}
		}
		if (this.aFloat289 >= 0.0F) {
			@Pc(46) long local46 = Class305.method26796();
			if (local46 > this.aLong274 * -8234214018386827511L) {
				this.aFloat290 = this.aFloat289;
				this.aFloat289 = -1.0F;
			} else {
				@Pc(67) float local67 = this.aFloat289 - this.aFloat288;
				@Pc(77) long local77 = this.aLong274 * -8234214018386827511L - this.aLong273 * -7055091242193193649L;
				@Pc(82) float local82 = local67 / (float) local77;
				this.aFloat290 = this.aFloat288 + local82 * (float) (local46 - this.aLong273 * -7055091242193193649L);
				if (this.aFloat289 == this.aFloat290) {
					this.aFloat289 = -1.0F;
				}
			}
		}
		this.aFloat290 = Math.min(1.0F, Math.max(this.aFloat290, 0.0F));
	}

	@OriginalMember(owner = "client!mj", name = "d", descriptor = "()V", line = 41)
	void method28727() {
		if (this.anInterface39_1 != null) {
			@Pc(7) float local7 = this.anInterface39_1.method26345();
			if (local7 != this.aFloat290 && this.aFloat289 < 0.0F) {
				this.aFloat288 = this.aFloat290;
				this.aFloat289 = local7;
				this.aLong273 = Class305.method26796() * 4369100113735516591L;
				this.aLong274 = this.aLong273 * -3919147337030305897L + -6132218746663857596L;
			}
		}
		if (this.aFloat289 >= 0.0F) {
			@Pc(46) long local46 = Class305.method26796();
			if (local46 > this.aLong274 * -8234214018386827511L) {
				this.aFloat290 = this.aFloat289;
				this.aFloat289 = -1.0F;
			} else {
				@Pc(67) float local67 = this.aFloat289 - this.aFloat288;
				@Pc(77) long local77 = this.aLong274 * -8234214018386827511L - this.aLong273 * -7055091242193193649L;
				@Pc(82) float local82 = local67 / (float) local77;
				this.aFloat290 = this.aFloat288 + local82 * (float) (local46 - this.aLong273 * -7055091242193193649L);
				if (this.aFloat289 == this.aFloat290) {
					this.aFloat289 = -1.0F;
				}
			}
		}
		this.aFloat290 = Math.min(1.0F, Math.max(this.aFloat290, 0.0F));
	}

	@OriginalMember(owner = "client!mj", name = "k", descriptor = "(B)F", line = 70)
	public float method28720() {
		@Pc(2) float local2 = this.aFloat290;
		for (@Pc(5) Class420 local5 = this.aClass420_1; local5 != null; local5 = local5.method28723()) {
			local2 *= local5.method28721();
		}
		return Math.min(Math.max(local2, 0.0F), 1.0F);
	}

	@OriginalMember(owner = "client!mj", name = "c", descriptor = "()F", line = 70)
	public float method28728() {
		@Pc(2) float local2 = this.aFloat290;
		for (@Pc(5) Class420 local5 = this.aClass420_1; local5 != null; local5 = local5.method28723()) {
			local2 *= local5.method28721();
		}
		return Math.min(Math.max(local2, 0.0F), 1.0F);
	}

	@OriginalMember(owner = "client!mj", name = "r", descriptor = "()F", line = 70)
	public float method28729() {
		@Pc(2) float local2 = this.aFloat290;
		for (@Pc(5) Class420 local5 = this.aClass420_1; local5 != null; local5 = local5.method28723()) {
			local2 *= local5.method28721();
		}
		return Math.min(Math.max(local2, 0.0F), 1.0F);
	}

	@OriginalMember(owner = "client!mj", name = "v", descriptor = "()F", line = 70)
	public float method28730() {
		@Pc(2) float local2 = this.aFloat290;
		for (@Pc(5) Class420 local5 = this.aClass420_1; local5 != null; local5 = local5.method28723()) {
			local2 *= local5.method28721();
		}
		return Math.min(Math.max(local2, 0.0F), 1.0F);
	}

	@OriginalMember(owner = "client!mj", name = "o", descriptor = "()F", line = 70)
	public float method28731() {
		@Pc(2) float local2 = this.aFloat290;
		for (@Pc(5) Class420 local5 = this.aClass420_1; local5 != null; local5 = local5.method28723()) {
			local2 *= local5.method28721();
		}
		return Math.min(Math.max(local2, 0.0F), 1.0F);
	}

	@OriginalMember(owner = "client!mj", name = "f", descriptor = "(I)F", line = 81)
	public float method28721() {
		return this.aFloat290;
	}

	@OriginalMember(owner = "client!mj", name = "s", descriptor = "()F", line = 81)
	public float method28724() {
		return this.aFloat290;
	}

	@OriginalMember(owner = "client!mj", name = "w", descriptor = "(FI)V", line = 85)
	public void method28716(@OriginalArg(0) float arg0) {
		if (this.anInterface39_1 == null) {
			this.aFloat289 = arg0;
			this.aFloat288 = this.aFloat290;
			this.aLong273 = Class305.method26796() * 4369100113735516591L;
			this.aLong274 = this.aLong273 * -3919147337030305897L + -6132218746663857596L;
		}
	}

	@OriginalMember(owner = "client!mj", name = "q", descriptor = "(F)V", line = 85)
	public void method28717(@OriginalArg(0) float arg0) {
		if (this.anInterface39_1 == null) {
			this.aFloat289 = arg0;
			this.aFloat288 = this.aFloat290;
			this.aLong273 = Class305.method26796() * 4369100113735516591L;
			this.aLong274 = this.aLong273 * -3919147337030305897L + -6132218746663857596L;
		}
	}

	@OriginalMember(owner = "client!mj", name = "y", descriptor = "(F)V", line = 85)
	public void method28732(@OriginalArg(0) float arg0) {
		if (this.anInterface39_1 == null) {
			this.aFloat289 = arg0;
			this.aFloat288 = this.aFloat290;
			this.aLong273 = Class305.method26796() * 4369100113735516591L;
			this.aLong274 = this.aLong273 * -3919147337030305897L + -6132218746663857596L;
		}
	}

	@OriginalMember(owner = "client!mj", name = "x", descriptor = "(F)V", line = 85)
	public void method28737(@OriginalArg(0) float arg0) {
		if (this.anInterface39_1 == null) {
			this.aFloat289 = arg0;
			this.aFloat288 = this.aFloat290;
			this.aLong273 = Class305.method26796() * 4369100113735516591L;
			this.aLong274 = this.aLong273 * -3919147337030305897L + -6132218746663857596L;
		}
	}

	@OriginalMember(owner = "client!mj", name = "l", descriptor = "(I)Lclient!mj;", line = 94)
	public Class420 method28723() {
		return this.aClass420_1;
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "()Lclient!mj;", line = 94)
	public Class420 method28734() {
		return this.aClass420_1;
	}

	@OriginalMember(owner = "client!mj", name = "b", descriptor = "()Lclient!mj;", line = 94)
	public Class420 method28735() {
		return this.aClass420_1;
	}

	@OriginalMember(owner = "client!mj", name = "h", descriptor = "()Lclient!mj;", line = 94)
	public Class420 method28736() {
		return this.aClass420_1;
	}

	@OriginalMember(owner = "client!mj", name = "y", descriptor = "(Lclient!arn;I)V", line = 521)
	static void method28743(@OriginalArg(0) Class93_Sub1_Sub8 arg0) {
		@Pc(1) boolean local1 = false;
		arg0.method23976();
		for (@Pc(9) Class93_Sub1_Sub8 local9 = (Class93_Sub1_Sub8) Class454.aClass18_16.method246(); local9 != null; local9 = (Class93_Sub1_Sub8) Class454.aClass18_16.method253()) {
			if (Class19_Sub3.method17555(arg0.method21719(), local9.method21719())) {
				Class658.method32790(arg0, local9);
				local1 = true;
				break;
			}
		}
		if (!local1) {
			Class454.aClass18_16.method268(arg0);
		}
	}

	@OriginalMember(owner = "client!mj", name = "cr", descriptor = "(Lclient!hf;Lclient!hq;Lclient!yf;I)V", line = 5401)
	static final void method28738(@OriginalArg(0) Class312 arg0, @OriginalArg(1) Class320 arg1, @OriginalArg(2) Class681 arg2) {
		arg0.anInt3993 = arg2.anIntArray519[(arg2.anInt5891 -= 1189701933) * -1497248091] * -999742057;
		Class354.method27696(arg0);
		if (arg0.anInt3970 * 532402067 == -1 && !arg1.aBoolean708) {
			Class39.method770(arg0.anInt3953 * -1549590237);
		}
	}

	@OriginalMember(owner = "client!mj", name = "kz", descriptor = "(Lclient!hf;Lclient!hq;Lclient!yf;B)V", line = 6745)
	static final void method28739(@OriginalArg(0) Class312 arg0, @OriginalArg(1) Class320 arg1, @OriginalArg(2) Class681 arg2) {
		arg0.aStringArray23 = null;
	}

	@OriginalMember(owner = "client!mj", name = "ti", descriptor = "(Lclient!hf;IIFIIIIIIB)V", line = 8386)
	static void method28740(@OriginalArg(0) Class312 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (arg0.aClass331_2 == null) {
			@Pc(11) Class336 local11 = (Class336) Class162.aClass32_Sub3_2.method18261(arg0.anInt4037 * 371778301);
			arg0.aClass331_2 = new Class331(local11, true);
		}
		arg0.aClass331_2.aLong259 = Class388.method28249() * 6591543353939106377L;
		arg0.aClass331_2.method27374(arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9);
	}

	@OriginalMember(owner = "client!mj", name = "jr", descriptor = "(Lclient!hf;B)V", line = 10185)
	static void method28745(@OriginalArg(0) Class312 arg0) {
		if (!client.aBoolean625) {
			return;
		}
		if (arg0.anObjectArray7 != null) {
			@Pc(14) Class312 local14 = Class124_Sub2.method9308(Class148.anInt1394 * -278883695, client.anInt3523 * 1573685689);
			if (local14 != null) {
				@Pc(21) Class93_Sub39 local21 = new Class93_Sub39();
				local21.aClass312_1 = arg0;
				local21.aClass312_2 = local14;
				local21.anObjectArray4 = arg0.anObjectArray7;
				Class211.method25429(local21);
			}
		}
		@Pc(40) Class93_Sub22 local40 = Class102.method2592(Class446.aClass446_60, client.aClass175_2.aClass24_2);
		local40.aClass93_Sub41_Sub2_1.method22465(arg0.anInt3953 * -1549590237);
		local40.aClass93_Sub41_Sub2_1.method22454(arg0.anInt4045 * 307668159);
		local40.aClass93_Sub41_Sub2_1.method22458(client.anInt3524 * -239149331);
		local40.aClass93_Sub41_Sub2_1.method22458(arg0.anInt3970 * 532402067);
		local40.aClass93_Sub41_Sub2_1.method22458(client.anInt3523 * 1573685689);
		local40.aClass93_Sub41_Sub2_1.method22465(Class148.anInt1394 * -278883695);
		client.aClass175_2.method24351(local40);
	}

	@OriginalMember(owner = "client!mj", name = "ahs", descriptor = "(Lclient!yf;I)V", line = 11015)
	static final void method28741(@OriginalArg(0) Class681 arg0) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		@Pc(15) Class175 local15 = Class330.method27372();
		@Pc(21) Class93_Sub22 local21 = Class102.method2592(Class446.aClass446_46, local15.aClass24_2);
		local21.aClass93_Sub41_Sub2_1.method22510(local12);
		local15.method24351(local21);
	}

	@OriginalMember(owner = "client!mj", name = "amf", descriptor = "(Lclient!yf;I)V", line = 12075)
	static final void method28742(@OriginalArg(0) Class681 arg0) {
		Class454.anInt5056 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091] * -1137573677;
	}

	@OriginalMember(owner = "client!mj", name = "avy", descriptor = "(Lclient!yf;I)V", line = 13493)
	static final void method28746(@OriginalArg(0) Class681 arg0) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = 0;
	}
}
