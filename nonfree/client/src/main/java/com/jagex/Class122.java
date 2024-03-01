package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kz")
public abstract class Class122 implements Interface33 {

	@OriginalMember(owner = "client!kz", name = "k", descriptor = "Lclient!eu;")
	Class106 aClass106_8;

	@OriginalMember(owner = "client!kz", name = "f", descriptor = "I")
	int anInt2827;

	@OriginalMember(owner = "client!kz", name = "w", descriptor = "J")
	long aLong131;

	@OriginalMember(owner = "client!kz", name = "e", descriptor = "Lclient!py;")
	final Class497 aClass497_90;

	@OriginalMember(owner = "client!kz", name = "n", descriptor = "Lclient!py;")
	final Class497 aClass497_89;

	@OriginalMember(owner = "client!kz", name = "m", descriptor = "Lclient!kp;")
	final Class125 aClass125_5;

	@OriginalMember(owner = "client!kz", name = "<init>", descriptor = "(Lclient!py;Lclient!py;Lclient!kp;)V", line = 19)
	Class122(@OriginalArg(0) Class497 arg0, @OriginalArg(1) Class497 arg1, @OriginalArg(2) Class125 arg2) {
		this.aClass497_90 = arg0;
		this.aClass497_89 = arg1;
		this.aClass125_5 = arg2;
	}

	@OriginalMember(owner = "client!kz", name = "n", descriptor = "(ZI)V", line = 26)
	@Override
	public void method28285(@OriginalArg(0) boolean arg0) {
		@Pc(19) int local19 = this.aClass125_5.aClass390_7.method28273(this.aClass125_5.anInt2983 * 1135283731, client.anInt3511 * 2040043391) + this.aClass125_5.anInt2981 * 483768335;
		@Pc(39) int local39 = this.aClass125_5.aClass392_7.method28290(this.aClass125_5.anInt2980 * -1017655207, client.anInt3512 * -817449061) + this.aClass125_5.anInt2982 * 2099407685;
		this.method20211(arg0, local19, local39);
		this.method20212(arg0, local19, local39);
		@Pc(55) String local55 = Class653.aClass357_1.method27738();
		if (Class305.method26796() - this.aLong131 * -4000576377463988303L > 10000L) {
			local55 = local55 + " (" + Class653.aClass357_1.method27741().anInt4590 * -909097621 + ")";
		}
		this.aClass106_8.method7526(local55, this.aClass125_5.anInt2983 * 1135283731 / 2 + local19, this.aClass125_5.anInt2985 * -1946839755 + local39 + this.aClass125_5.anInt2980 * -1017655207 / 2 + 4, this.aClass125_5.anInt2984 * 291173831, -1);
	}

	@OriginalMember(owner = "client!kz", name = "k", descriptor = "(Z)V", line = 26)
	@Override
	public void method28281(@OriginalArg(0) boolean arg0) {
		@Pc(19) int local19 = this.aClass125_5.aClass390_7.method28273(this.aClass125_5.anInt2983 * 1135283731, client.anInt3511 * 2040043391) + this.aClass125_5.anInt2981 * 483768335;
		@Pc(39) int local39 = this.aClass125_5.aClass392_7.method28290(this.aClass125_5.anInt2980 * -1017655207, client.anInt3512 * -817449061) + this.aClass125_5.anInt2982 * 2099407685;
		this.method20211(arg0, local19, local39);
		this.method20212(arg0, local19, local39);
		@Pc(55) String local55 = Class653.aClass357_1.method27738();
		if (Class305.method26796() - this.aLong131 * -4000576377463988303L > 10000L) {
			local55 = local55 + " (" + Class653.aClass357_1.method27741().anInt4590 * -909097621 + ")";
		}
		this.aClass106_8.method7526(local55, this.aClass125_5.anInt2983 * 1135283731 / 2 + local19, this.aClass125_5.anInt2985 * -1946839755 + local39 + this.aClass125_5.anInt2980 * -1017655207 / 2 + 4, this.aClass125_5.anInt2984 * 291173831, -1);
	}

	@OriginalMember(owner = "client!kz", name = "f", descriptor = "(Z)V", line = 26)
	@Override
	public void method28282(@OriginalArg(0) boolean arg0) {
		@Pc(19) int local19 = this.aClass125_5.aClass390_7.method28273(this.aClass125_5.anInt2983 * 1135283731, client.anInt3511 * 2040043391) + this.aClass125_5.anInt2981 * 483768335;
		@Pc(39) int local39 = this.aClass125_5.aClass392_7.method28290(this.aClass125_5.anInt2980 * -1017655207, client.anInt3512 * -817449061) + this.aClass125_5.anInt2982 * 2099407685;
		this.method20211(arg0, local19, local39);
		this.method20212(arg0, local19, local39);
		@Pc(55) String local55 = Class653.aClass357_1.method27738();
		if (Class305.method26796() - this.aLong131 * -4000576377463988303L > 10000L) {
			local55 = local55 + " (" + Class653.aClass357_1.method27741().anInt4590 * -909097621 + ")";
		}
		this.aClass106_8.method7526(local55, this.aClass125_5.anInt2983 * 1135283731 / 2 + local19, this.aClass125_5.anInt2985 * -1946839755 + local39 + this.aClass125_5.anInt2980 * -1017655207 / 2 + 4, this.aClass125_5.anInt2984 * 291173831, -1);
	}

	@OriginalMember(owner = "client!kz", name = "w", descriptor = "()V", line = 36)
	@Override
	public void method28283() {
		@Pc(10) Class5 local10 = Class691.method36594(this.aClass497_89, this.aClass125_5.anInt2986 * -1726029297, Class157.aClass462_2);
		this.aClass106_8 = Class694.aClass104_14.method20506(local10, Class203.method24650(this.aClass497_90, this.aClass125_5.anInt2986 * -1726029297), true);
	}

	@OriginalMember(owner = "client!kz", name = "e", descriptor = "(I)V", line = 36)
	@Override
	public void method28280() {
		@Pc(10) Class5 local10 = Class691.method36594(this.aClass497_89, this.aClass125_5.anInt2986 * -1726029297, Class157.aClass462_2);
		this.aClass106_8 = Class694.aClass104_14.method20506(local10, Class203.method24650(this.aClass497_90, this.aClass125_5.anInt2986 * -1726029297), true);
	}

	@OriginalMember(owner = "client!kz", name = "l", descriptor = "()V", line = 36)
	@Override
	public void method28284() {
		@Pc(10) Class5 local10 = Class691.method36594(this.aClass497_89, this.aClass125_5.anInt2986 * -1726029297, Class157.aClass462_2);
		this.aClass106_8 = Class694.aClass104_14.method20506(local10, Class203.method24650(this.aClass497_90, this.aClass125_5.anInt2986 * -1726029297), true);
	}

	@OriginalMember(owner = "client!kz", name = "m", descriptor = "(I)Z", line = 41)
	@Override
	public boolean method28279() {
		@Pc(1) boolean local1 = true;
		if (!this.aClass497_90.method30054(this.aClass125_5.anInt2986 * -1726029297)) {
			local1 = false;
		}
		if (!this.aClass497_89.method30054(this.aClass125_5.anInt2986 * -1726029297)) {
			local1 = false;
		}
		return local1;
	}

	@OriginalMember(owner = "client!kz", name = "u", descriptor = "()Z", line = 41)
	@Override
	public boolean method28278() {
		@Pc(1) boolean local1 = true;
		if (!this.aClass497_90.method30054(this.aClass125_5.anInt2986 * -1726029297)) {
			local1 = false;
		}
		if (!this.aClass497_89.method30054(this.aClass125_5.anInt2986 * -1726029297)) {
			local1 = false;
		}
		return local1;
	}

	@OriginalMember(owner = "client!kz", name = "d", descriptor = "(B)I", line = 51)
	int method20213() {
		@Pc(3) int local3 = Class653.aClass357_1.method27737();
		@Pc(7) int local7 = local3 * 100;
		if (local3 == this.anInt2827 * 466791593 && local3 != 0) {
			@Pc(20) int local20 = Class653.aClass357_1.method27760();
			if (local20 > local3) {
				@Pc(32) long local32 = this.aLong131 * -4000576377463988303L - Class653.aClass357_1.method27758();
				if (local32 > 0L) {
					@Pc(48) long local48 = local32 * 10000L / (long) local3 * (long) (local20 - local3);
					@Pc(58) long local58 = (Class305.method26796() - this.aLong131 * -4000576377463988303L) * 10000L;
					if (local58 < local48) {
						local7 = (int) ((long) (local3 * 100) + (long) (local20 - local3) * 100L * local58 / local48);
					} else {
						local7 = local20 * 100;
					}
				}
			}
		} else {
			this.anInt2827 = local3 * -1466255463;
			this.aLong131 = Class305.method26796() * 4433505070836107601L;
		}
		return local7;
	}

	@OriginalMember(owner = "client!kz", name = "r", descriptor = "()I", line = 51)
	int method20215() {
		@Pc(3) int local3 = Class653.aClass357_1.method27737();
		@Pc(7) int local7 = local3 * 100;
		if (local3 == this.anInt2827 * 466791593 && local3 != 0) {
			@Pc(20) int local20 = Class653.aClass357_1.method27760();
			if (local20 > local3) {
				@Pc(32) long local32 = this.aLong131 * -4000576377463988303L - Class653.aClass357_1.method27758();
				if (local32 > 0L) {
					@Pc(48) long local48 = local32 * 10000L / (long) local3 * (long) (local20 - local3);
					@Pc(58) long local58 = (Class305.method26796() - this.aLong131 * -4000576377463988303L) * 10000L;
					if (local58 < local48) {
						local7 = (int) ((long) (local3 * 100) + (long) (local20 - local3) * 100L * local58 / local48);
					} else {
						local7 = local20 * 100;
					}
				}
			}
		} else {
			this.anInt2827 = local3 * -1466255463;
			this.aLong131 = Class305.method26796() * 4433505070836107601L;
		}
		return local7;
	}

	@OriginalMember(owner = "client!kz", name = "afq", descriptor = "(Lclient!yf;I)V", line = 10463)
	static final void method20218(@OriginalArg(0) Class681 arg0) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = Class685.anIntArray522[local12 & 0xFFFF];
	}

	@OriginalMember(owner = "client!kz", name = "ajg", descriptor = "(Lclient!yf;I)V", line = 11424)
	static final void method20219(@OriginalArg(0) Class681 arg0) {
	}

	@OriginalMember(owner = "client!kz", name = "bfm", descriptor = "(Lclient!yf;I)V", line = 15145)
	static final void method20220(@OriginalArg(0) Class681 arg0) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = client.aClass67_15.method36920();
	}

	@OriginalMember(owner = "client!kz", name = "z", descriptor = "(ZIIS)V")
	abstract void method20211(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!kz", name = "p", descriptor = "(ZIII)V")
	abstract void method20212(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!kz", name = "c", descriptor = "(ZII)V")
	abstract void method20214(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!kz", name = "v", descriptor = "(ZII)V")
	abstract void method20216(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!kz", name = "o", descriptor = "(ZII)V")
	abstract void method20217(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);
}
