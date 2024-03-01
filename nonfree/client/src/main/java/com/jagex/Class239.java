package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ea")
public final class Class239 {

	@OriginalMember(owner = "client!ea", name = "e", descriptor = "I")
	static final int anInt3824 = 25;

	@OriginalMember(owner = "client!ea", name = "ak", descriptor = "I")
	public static int anInt3825;

	@OriginalMember(owner = "client!ea", name = "gs", descriptor = "Lclient!uf;")
	static Class593 aClass593_4;

	@OriginalMember(owner = "client!ea", name = "l", descriptor = "[I")
	int[] anIntArray351;

	@OriginalMember(owner = "client!ea", name = "k", descriptor = "Z")
	public boolean aBoolean662 = false;

	@OriginalMember(owner = "client!ea", name = "f", descriptor = "Lclient!aqc;")
	Class132_Sub1_Sub1_Sub1_Sub1 aClass132_Sub1_Sub1_Sub1_Sub1_2 = null;

	@OriginalMember(owner = "client!ea", name = "w", descriptor = "Lclient!aqk;")
	Class132_Sub1_Sub1_Sub1_Sub2 aClass132_Sub1_Sub1_Sub1_Sub2_2 = null;

	@OriginalMember(owner = "client!ea", name = "n", descriptor = "I")
	final int anInt3822;

	@OriginalMember(owner = "client!ea", name = "m", descriptor = "I")
	public final int anInt3823;

	@OriginalMember(owner = "client!ea", name = "<init>", descriptor = "(Lclient!alw;I)V", line = 21)
	Class239(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1) {
		this.anInt3822 = arg1 * -2003746383;
		@Pc(19) int local19 = arg0.method22413();
		switch(local19) {
			case 0:
				this.anInt3823 = arg0.method22436() * 1774798603;
				break;
			case 1:
				this.anInt3823 = -1774798603;
				break;
			default:
				this.anInt3823 = -1774798603;
		}
		arg0.method22427();
	}

	@OriginalMember(owner = "client!ea", name = "e", descriptor = "(IIIII)V", line = 39)
	void method25804(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.aBoolean662) {
			this.aBoolean662 = true;
			if (this.anInt3823 * -376320861 >= 0) {
				this.aClass132_Sub1_Sub1_Sub1_Sub1_2 = new Class132_Sub1_Sub1_Sub1_Sub1(client.aClass532_1.method30459(), 25);
				this.aClass132_Sub1_Sub1_Sub1_Sub1_2.anInt2768 = this.anInt3822 * 718421009;
				this.aClass132_Sub1_Sub1_Sub1_Sub1_2.anInt2786 = client.anInt3485 * 632844529;
				this.aClass132_Sub1_Sub1_Sub1_Sub1_2.method18589((Class336) Class162.aClass32_Sub3_2.method18261(this.anInt3823 * -376320861));
				this.aClass132_Sub1_Sub1_Sub1_Sub1_2.method19961(this.aClass132_Sub1_Sub1_Sub1_Sub1_2.aClass336_1.anInt4154 * 447008399);
				this.aClass132_Sub1_Sub1_Sub1_Sub1_2.anInt2788 = (this.aClass132_Sub1_Sub1_Sub1_Sub1_2.aClass336_1.anInt4165 * 295553787 << 3) * 723489705;
				this.aClass132_Sub1_Sub1_Sub1_Sub1_2.anInt2766 = ((Class249.anInt3840 += -1432082549) * -1421948893 - 1) * 1501413983;
			} else {
				this.aClass132_Sub1_Sub1_Sub1_Sub2_2 = new Class132_Sub1_Sub1_Sub1_Sub2(client.aClass532_1.method30459(), 25);
				this.aClass132_Sub1_Sub1_Sub1_Sub2_2.method20066(Class36.aClass93_Sub41_1);
				this.aClass132_Sub1_Sub1_Sub1_Sub2_2.anInt2768 = this.anInt3822 * 718421009;
				this.aClass132_Sub1_Sub1_Sub1_Sub2_2.anInt2786 = client.anInt3485 * 632844529;
				this.aClass132_Sub1_Sub1_Sub1_Sub2_2.anInt2766 = ((Class249.anInt3840 += -1432082549) * -1421948893 - 1) * 1501413983;
			}
		}
		if (this.anInt3823 * -376320861 >= 0) {
			this.aClass132_Sub1_Sub1_Sub1_Sub1_2.method18592(arg2, arg0, arg1, true, this.aClass132_Sub1_Sub1_Sub1_Sub1_2.method19997());
			this.aClass132_Sub1_Sub1_Sub1_Sub1_2.method19952(arg3, true);
		} else {
			this.aClass132_Sub1_Sub1_Sub1_Sub2_2.aByte100 = this.aClass132_Sub1_Sub1_Sub1_Sub2_2.aByte99 = (byte) arg2;
			this.aClass132_Sub1_Sub1_Sub1_Sub2_2.method20055(arg0, arg1);
			this.aClass132_Sub1_Sub1_Sub1_Sub2_2.method19952(arg3, true);
		}
	}

	@OriginalMember(owner = "client!ea", name = "l", descriptor = "(IIII)V", line = 39)
	void method25810(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.aBoolean662) {
			this.aBoolean662 = true;
			if (this.anInt3823 * -376320861 >= 0) {
				this.aClass132_Sub1_Sub1_Sub1_Sub1_2 = new Class132_Sub1_Sub1_Sub1_Sub1(client.aClass532_1.method30459(), 25);
				this.aClass132_Sub1_Sub1_Sub1_Sub1_2.anInt2768 = this.anInt3822 * 718421009;
				this.aClass132_Sub1_Sub1_Sub1_Sub1_2.anInt2786 = client.anInt3485 * 632844529;
				this.aClass132_Sub1_Sub1_Sub1_Sub1_2.method18589((Class336) Class162.aClass32_Sub3_2.method18261(this.anInt3823 * -376320861));
				this.aClass132_Sub1_Sub1_Sub1_Sub1_2.method19961(this.aClass132_Sub1_Sub1_Sub1_Sub1_2.aClass336_1.anInt4154 * 447008399);
				this.aClass132_Sub1_Sub1_Sub1_Sub1_2.anInt2788 = (this.aClass132_Sub1_Sub1_Sub1_Sub1_2.aClass336_1.anInt4165 * 295553787 << 3) * 723489705;
				this.aClass132_Sub1_Sub1_Sub1_Sub1_2.anInt2766 = ((Class249.anInt3840 += -1432082549) * -1421948893 - 1) * 1501413983;
			} else {
				this.aClass132_Sub1_Sub1_Sub1_Sub2_2 = new Class132_Sub1_Sub1_Sub1_Sub2(client.aClass532_1.method30459(), 25);
				this.aClass132_Sub1_Sub1_Sub1_Sub2_2.method20066(Class36.aClass93_Sub41_1);
				this.aClass132_Sub1_Sub1_Sub1_Sub2_2.anInt2768 = this.anInt3822 * 718421009;
				this.aClass132_Sub1_Sub1_Sub1_Sub2_2.anInt2786 = client.anInt3485 * 632844529;
				this.aClass132_Sub1_Sub1_Sub1_Sub2_2.anInt2766 = ((Class249.anInt3840 += -1432082549) * -1421948893 - 1) * 1501413983;
			}
		}
		if (this.anInt3823 * -376320861 >= 0) {
			this.aClass132_Sub1_Sub1_Sub1_Sub1_2.method18592(arg2, arg0, arg1, true, this.aClass132_Sub1_Sub1_Sub1_Sub1_2.method19997());
			this.aClass132_Sub1_Sub1_Sub1_Sub1_2.method19952(arg3, true);
		} else {
			this.aClass132_Sub1_Sub1_Sub1_Sub2_2.aByte100 = this.aClass132_Sub1_Sub1_Sub1_Sub2_2.aByte99 = (byte) arg2;
			this.aClass132_Sub1_Sub1_Sub1_Sub2_2.method20055(arg0, arg1);
			this.aClass132_Sub1_Sub1_Sub1_Sub2_2.method19952(arg3, true);
		}
	}

	@OriginalMember(owner = "client!ea", name = "w", descriptor = "(IIII)V", line = 39)
	void method25812(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.aBoolean662) {
			this.aBoolean662 = true;
			if (this.anInt3823 * -376320861 >= 0) {
				this.aClass132_Sub1_Sub1_Sub1_Sub1_2 = new Class132_Sub1_Sub1_Sub1_Sub1(client.aClass532_1.method30459(), 25);
				this.aClass132_Sub1_Sub1_Sub1_Sub1_2.anInt2768 = this.anInt3822 * 718421009;
				this.aClass132_Sub1_Sub1_Sub1_Sub1_2.anInt2786 = client.anInt3485 * 632844529;
				this.aClass132_Sub1_Sub1_Sub1_Sub1_2.method18589((Class336) Class162.aClass32_Sub3_2.method18261(this.anInt3823 * -376320861));
				this.aClass132_Sub1_Sub1_Sub1_Sub1_2.method19961(this.aClass132_Sub1_Sub1_Sub1_Sub1_2.aClass336_1.anInt4154 * 447008399);
				this.aClass132_Sub1_Sub1_Sub1_Sub1_2.anInt2788 = (this.aClass132_Sub1_Sub1_Sub1_Sub1_2.aClass336_1.anInt4165 * 295553787 << 3) * 723489705;
				this.aClass132_Sub1_Sub1_Sub1_Sub1_2.anInt2766 = ((Class249.anInt3840 += -1432082549) * -1421948893 - 1) * 1501413983;
			} else {
				this.aClass132_Sub1_Sub1_Sub1_Sub2_2 = new Class132_Sub1_Sub1_Sub1_Sub2(client.aClass532_1.method30459(), 25);
				this.aClass132_Sub1_Sub1_Sub1_Sub2_2.method20066(Class36.aClass93_Sub41_1);
				this.aClass132_Sub1_Sub1_Sub1_Sub2_2.anInt2768 = this.anInt3822 * 718421009;
				this.aClass132_Sub1_Sub1_Sub1_Sub2_2.anInt2786 = client.anInt3485 * 632844529;
				this.aClass132_Sub1_Sub1_Sub1_Sub2_2.anInt2766 = ((Class249.anInt3840 += -1432082549) * -1421948893 - 1) * 1501413983;
			}
		}
		if (this.anInt3823 * -376320861 >= 0) {
			this.aClass132_Sub1_Sub1_Sub1_Sub1_2.method18592(arg2, arg0, arg1, true, this.aClass132_Sub1_Sub1_Sub1_Sub1_2.method19997());
			this.aClass132_Sub1_Sub1_Sub1_Sub1_2.method19952(arg3, true);
		} else {
			this.aClass132_Sub1_Sub1_Sub1_Sub2_2.aByte100 = this.aClass132_Sub1_Sub1_Sub1_Sub2_2.aByte99 = (byte) arg2;
			this.aClass132_Sub1_Sub1_Sub1_Sub2_2.method20055(arg0, arg1);
			this.aClass132_Sub1_Sub1_Sub1_Sub2_2.method19952(arg3, true);
		}
	}

	@OriginalMember(owner = "client!ea", name = "n", descriptor = "(B)V", line = 70)
	void method25805() {
		this.aClass132_Sub1_Sub1_Sub1_Sub1_2 = null;
		this.aClass132_Sub1_Sub1_Sub1_Sub2_2 = null;
		this.aBoolean662 = false;
	}

	@OriginalMember(owner = "client!ea", name = "u", descriptor = "()V", line = 70)
	void method25811() {
		this.aClass132_Sub1_Sub1_Sub1_Sub1_2 = null;
		this.aClass132_Sub1_Sub1_Sub1_Sub2_2 = null;
		this.aBoolean662 = false;
	}

	@OriginalMember(owner = "client!ea", name = "m", descriptor = "(IIII)V", line = 76)
	void method25803(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass132_Sub1_Sub1_Sub1_Sub1_2 == null) {
			this.aClass132_Sub1_Sub1_Sub1_Sub2_2.aByte100 = this.aClass132_Sub1_Sub1_Sub1_Sub2_2.aByte99 = (byte) arg0;
			this.aClass132_Sub1_Sub1_Sub1_Sub2_2.method20055(arg1, arg2);
		} else {
			this.aClass132_Sub1_Sub1_Sub1_Sub1_2.method18592(arg0, arg1, arg2, true, this.aClass132_Sub1_Sub1_Sub1_Sub1_2.method19997());
		}
	}

	@OriginalMember(owner = "client!ea", name = "p", descriptor = "(III)V", line = 76)
	void method25806(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass132_Sub1_Sub1_Sub1_Sub1_2 == null) {
			this.aClass132_Sub1_Sub1_Sub1_Sub2_2.aByte100 = this.aClass132_Sub1_Sub1_Sub1_Sub2_2.aByte99 = (byte) arg0;
			this.aClass132_Sub1_Sub1_Sub1_Sub2_2.method20055(arg1, arg2);
		} else {
			this.aClass132_Sub1_Sub1_Sub1_Sub1_2.method18592(arg0, arg1, arg2, true, this.aClass132_Sub1_Sub1_Sub1_Sub1_2.method19997());
		}
	}

	@OriginalMember(owner = "client!ea", name = "z", descriptor = "(III)V", line = 76)
	void method25813(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass132_Sub1_Sub1_Sub1_Sub1_2 == null) {
			this.aClass132_Sub1_Sub1_Sub1_Sub2_2.aByte100 = this.aClass132_Sub1_Sub1_Sub1_Sub2_2.aByte99 = (byte) arg0;
			this.aClass132_Sub1_Sub1_Sub1_Sub2_2.method20055(arg1, arg2);
		} else {
			this.aClass132_Sub1_Sub1_Sub1_Sub1_2.method18592(arg0, arg1, arg2, true, this.aClass132_Sub1_Sub1_Sub1_Sub1_2.method19997());
		}
	}

	@OriginalMember(owner = "client!ea", name = "d", descriptor = "(III)V", line = 76)
	void method25814(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass132_Sub1_Sub1_Sub1_Sub1_2 == null) {
			this.aClass132_Sub1_Sub1_Sub1_Sub2_2.aByte100 = this.aClass132_Sub1_Sub1_Sub1_Sub2_2.aByte99 = (byte) arg0;
			this.aClass132_Sub1_Sub1_Sub1_Sub2_2.method20055(arg1, arg2);
		} else {
			this.aClass132_Sub1_Sub1_Sub1_Sub1_2.method18592(arg0, arg1, arg2, true, this.aClass132_Sub1_Sub1_Sub1_Sub1_2.method19997());
		}
	}

	@OriginalMember(owner = "client!ea", name = "c", descriptor = "(III)V", line = 76)
	void method25815(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass132_Sub1_Sub1_Sub1_Sub1_2 == null) {
			this.aClass132_Sub1_Sub1_Sub1_Sub2_2.aByte100 = this.aClass132_Sub1_Sub1_Sub1_Sub2_2.aByte99 = (byte) arg0;
			this.aClass132_Sub1_Sub1_Sub1_Sub2_2.method20055(arg1, arg2);
		} else {
			this.aClass132_Sub1_Sub1_Sub1_Sub1_2.method18592(arg0, arg1, arg2, true, this.aClass132_Sub1_Sub1_Sub1_Sub1_2.method19997());
		}
	}

	@OriginalMember(owner = "client!ea", name = "k", descriptor = "(I)Lclient!ahm;", line = 84)
	public Class132_Sub1_Sub1_Sub1 method25807() {
		return this.aClass132_Sub1_Sub1_Sub1_Sub1_2 == null ? this.aClass132_Sub1_Sub1_Sub1_Sub2_2 : this.aClass132_Sub1_Sub1_Sub1_Sub1_2;
	}

	@OriginalMember(owner = "client!ea", name = "r", descriptor = "()Lclient!ahm;", line = 84)
	public Class132_Sub1_Sub1_Sub1 method25816() {
		return this.aClass132_Sub1_Sub1_Sub1_Sub1_2 == null ? this.aClass132_Sub1_Sub1_Sub1_Sub2_2 : this.aClass132_Sub1_Sub1_Sub1_Sub1_2;
	}

	@OriginalMember(owner = "client!ea", name = "v", descriptor = "()Lclient!ahm;", line = 84)
	public Class132_Sub1_Sub1_Sub1 method25817() {
		return this.aClass132_Sub1_Sub1_Sub1_Sub1_2 == null ? this.aClass132_Sub1_Sub1_Sub1_Sub2_2 : this.aClass132_Sub1_Sub1_Sub1_Sub1_2;
	}

	@OriginalMember(owner = "client!ea", name = "f", descriptor = "(I)Z", line = 89)
	boolean method25808() {
		if (this.anInt3823 * -376320861 < 0) {
			return true;
		}
		@Pc(13) Class336 local13 = (Class336) Class162.aClass32_Sub3_2.method18261(this.anInt3823 * -376320861);
		@Pc(17) boolean local17 = local13.method27421();
		if (this.anIntArray351 == null) {
			@Pc(29) Class622 local29 = (Class622) Class166_Sub6.aClass32_Sub5_1.method18261(local13.anInt4180 * 1511832251);
			this.anIntArray351 = local29.method32132();
		}
		@Pc(37) int[] local37 = this.anIntArray351;
		for (@Pc(39) int local39 = 0; local39 < local37.length; local39++) {
			@Pc(47) int local47 = local37[local39];
			local17 &= ((Class263) Class32.aClass32_Sub17_23.method18261(local47)).method26194();
		}
		return local17;
	}

	@OriginalMember(owner = "client!ea", name = "o", descriptor = "()Z", line = 89)
	boolean method25809() {
		if (this.anInt3823 * -376320861 < 0) {
			return true;
		}
		@Pc(13) Class336 local13 = (Class336) Class162.aClass32_Sub3_2.method18261(this.anInt3823 * -376320861);
		@Pc(17) boolean local17 = local13.method27421();
		if (this.anIntArray351 == null) {
			@Pc(29) Class622 local29 = (Class622) Class166_Sub6.aClass32_Sub5_1.method18261(local13.anInt4180 * 1511832251);
			this.anIntArray351 = local29.method32132();
		}
		@Pc(37) int[] local37 = this.anIntArray351;
		for (@Pc(39) int local39 = 0; local39 < local37.length; local39++) {
			@Pc(47) int local47 = local37[local39];
			local17 &= ((Class263) Class32.aClass32_Sub17_23.method18261(local47)).method26194();
		}
		return local17;
	}

	@OriginalMember(owner = "client!ea", name = "c", descriptor = "(II)V", line = 122)
	public static void method25823(@OriginalArg(0) int arg0) {
		@Pc(4) Class93_Sub1_Sub11 local4 = Class371.method28006(8, (long) arg0);
		local4.method21865();
	}

	@OriginalMember(owner = "client!ea", name = "s", descriptor = "(CI)Z", line = 190)
	public static boolean method25820(@OriginalArg(0) char arg0) {
		return arg0 >= '0' && arg0 <= '9' || arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}

	@OriginalMember(owner = "client!ea", name = "ai", descriptor = "(ILjava/lang/String;B)V", line = 207)
	static void method25824(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		@Pc(4) Class93_Sub1_Sub11 local4 = Class371.method28006(3, (long) arg0);
		local4.method21801();
		local4.aString103 = arg1;
	}

	@OriginalMember(owner = "client!ea", name = "ap", descriptor = "(Lclient!yf;B)V", line = 4959)
	static final void method25818(@OriginalArg(0) Class681 arg0) {
		@Pc(7) int local7 = arg0.anIntArray520[arg0.anInt5889 * -709694321];
		arg0.anInt5888 -= local7 * 957530791;
		@Pc(25) String local25 = Class589.method31682(arg0.anObjectArray45, arg0.anInt5888 * 587908375, local7);
		arg0.anObjectArray45[(arg0.anInt5888 += 957530791) * 587908375 - 1] = local25;
	}

	@OriginalMember(owner = "client!ea", name = "ci", descriptor = "(Lclient!yf;I)V", line = 5327)
	static final void method25819(@OriginalArg(0) Class681 arg0) {
		@Pc(8) Class677 local8 = arg0.aBoolean875 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		@Pc(14) Class320 local14 = local8.aClass320_4;
		Class368.method27966(local11, local14, arg0);
	}

	@OriginalMember(owner = "client!ea", name = "mm", descriptor = "(Lclient!yf;B)V", line = 7323)
	static final void method25821(@OriginalArg(0) Class681 arg0) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		@Pc(16) Class312 local16 = Class659.method32805(local12);
		@Pc(22) Class320 local22 = Class166_Sub1.aClass320Array1[local12 >> 16];
		Class220.method25544(local16, local22, arg0);
	}

	@OriginalMember(owner = "client!ea", name = "afb", descriptor = "(Lclient!yf;B)V", line = 10524)
	static final void method25825(@OriginalArg(0) Class681 arg0) {
		@Pc(13) String local13 = (String) arg0.anObjectArray45[(arg0.anInt5888 -= 957530791) * 587908375];
		arg0.anInt5891 -= -1915563430;
		@Pc(27) int local27 = arg0.anIntArray519[arg0.anInt5891 * -1497248091];
		@Pc(37) int local37 = arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 1];
		@Pc(43) Class5 local43 = Class157.aClass462_2.method29241(client.anInterface50_1, local37);
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = local43.method42(local13, local27, Class110_Sub14.aClass100Array4);
	}

	@OriginalMember(owner = "client!ea", name = "apf", descriptor = "(Lclient!yf;I)V", line = 12762)
	static final void method25822(@OriginalArg(0) Class681 arg0) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = Class411.anInt4757 * 873638739;
	}
}
