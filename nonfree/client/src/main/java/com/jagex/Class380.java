package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ki")
public class Class380 implements Interface33 {

	@OriginalMember(owner = "client!ki", name = "ou", descriptor = "I")
	public static int anInt4623;

	@OriginalMember(owner = "client!ki", name = "k", descriptor = "Lclient!eu;")
	Class106 aClass106_12;

	@OriginalMember(owner = "client!ki", name = "e", descriptor = "Lclient!lv;")
	final Class407 aClass407_1;

	@OriginalMember(owner = "client!ki", name = "n", descriptor = "Lclient!py;")
	final Class497 aClass497_110;

	@OriginalMember(owner = "client!ki", name = "m", descriptor = "Lclient!py;")
	final Class497 aClass497_109;

	@OriginalMember(owner = "client!ki", name = "<init>", descriptor = "(Lclient!py;Lclient!py;Lclient!lv;)V", line = 15)
	Class380(@OriginalArg(0) Class497 arg0, @OriginalArg(1) Class497 arg1, @OriginalArg(2) Class407 arg2) {
		this.aClass407_1 = arg2;
		this.aClass497_110 = arg0;
		this.aClass497_109 = arg1;
	}

	@OriginalMember(owner = "client!ki", name = "e", descriptor = "(I)V", line = 22)
	@Override
	public void method28280() {
		@Pc(10) Class5 local10 = Class691.method36594(this.aClass497_109, this.aClass407_1.anInt4696 * 1186513455, Class157.aClass462_2);
		this.aClass106_12 = Class694.aClass104_14.method20506(local10, Class203.method24650(this.aClass497_110, this.aClass407_1.anInt4696 * 1186513455), true);
	}

	@OriginalMember(owner = "client!ki", name = "w", descriptor = "()V", line = 22)
	@Override
	public void method28283() {
		@Pc(10) Class5 local10 = Class691.method36594(this.aClass497_109, this.aClass407_1.anInt4696 * 1186513455, Class157.aClass462_2);
		this.aClass106_12 = Class694.aClass104_14.method20506(local10, Class203.method24650(this.aClass497_110, this.aClass407_1.anInt4696 * 1186513455), true);
	}

	@OriginalMember(owner = "client!ki", name = "l", descriptor = "()V", line = 22)
	@Override
	public void method28284() {
		@Pc(10) Class5 local10 = Class691.method36594(this.aClass497_109, this.aClass407_1.anInt4696 * 1186513455, Class157.aClass462_2);
		this.aClass106_12 = Class694.aClass104_14.method20506(local10, Class203.method24650(this.aClass497_110, this.aClass407_1.anInt4696 * 1186513455), true);
	}

	@OriginalMember(owner = "client!ki", name = "n", descriptor = "(ZI)V", line = 27)
	@Override
	public void method28285(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			@Pc(21) int local21 = this.aClass407_1.aClass390_14.method28273(this.aClass407_1.anInt4694 * -1489497161, client.anInt3511 * 2040043391) + this.aClass407_1.anInt4690 * -1430649519;
			@Pc(41) int local41 = this.aClass407_1.aClass392_14.method28290(this.aClass407_1.anInt4692 * -1599928051, client.anInt3512 * -817449061) + this.aClass407_1.anInt4691 * 1380832809;
			this.aClass106_12.method7563(this.aClass407_1.aString198, local21, local41, this.aClass407_1.anInt4694 * -1489497161, this.aClass407_1.anInt4692 * -1599928051, this.aClass407_1.anInt4697 * 603161807, this.aClass407_1.anInt4698 * -1071278391, this.aClass407_1.anInt4695 * -1283910243, this.aClass407_1.anInt4693 * -142218921, this.aClass407_1.anInt4689 * -689304573, null, null, null, 0, 0);
		}
	}

	@OriginalMember(owner = "client!ki", name = "f", descriptor = "(Z)V", line = 27)
	@Override
	public void method28282(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			@Pc(21) int local21 = this.aClass407_1.aClass390_14.method28273(this.aClass407_1.anInt4694 * -1489497161, client.anInt3511 * 2040043391) + this.aClass407_1.anInt4690 * -1430649519;
			@Pc(41) int local41 = this.aClass407_1.aClass392_14.method28290(this.aClass407_1.anInt4692 * -1599928051, client.anInt3512 * -817449061) + this.aClass407_1.anInt4691 * 1380832809;
			this.aClass106_12.method7563(this.aClass407_1.aString198, local21, local41, this.aClass407_1.anInt4694 * -1489497161, this.aClass407_1.anInt4692 * -1599928051, this.aClass407_1.anInt4697 * 603161807, this.aClass407_1.anInt4698 * -1071278391, this.aClass407_1.anInt4695 * -1283910243, this.aClass407_1.anInt4693 * -142218921, this.aClass407_1.anInt4689 * -689304573, null, null, null, 0, 0);
		}
	}

	@OriginalMember(owner = "client!ki", name = "k", descriptor = "(Z)V", line = 27)
	@Override
	public void method28281(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			@Pc(21) int local21 = this.aClass407_1.aClass390_14.method28273(this.aClass407_1.anInt4694 * -1489497161, client.anInt3511 * 2040043391) + this.aClass407_1.anInt4690 * -1430649519;
			@Pc(41) int local41 = this.aClass407_1.aClass392_14.method28290(this.aClass407_1.anInt4692 * -1599928051, client.anInt3512 * -817449061) + this.aClass407_1.anInt4691 * 1380832809;
			this.aClass106_12.method7563(this.aClass407_1.aString198, local21, local41, this.aClass407_1.anInt4694 * -1489497161, this.aClass407_1.anInt4692 * -1599928051, this.aClass407_1.anInt4697 * 603161807, this.aClass407_1.anInt4698 * -1071278391, this.aClass407_1.anInt4695 * -1283910243, this.aClass407_1.anInt4693 * -142218921, this.aClass407_1.anInt4689 * -689304573, null, null, null, 0, 0);
		}
	}

	@OriginalMember(owner = "client!ki", name = "m", descriptor = "(I)Z", line = 35)
	@Override
	public boolean method28279() {
		@Pc(1) boolean local1 = true;
		if (!this.aClass497_110.method30054(this.aClass407_1.anInt4696 * 1186513455)) {
			local1 = false;
		}
		if (!this.aClass497_109.method30054(this.aClass407_1.anInt4696 * 1186513455)) {
			local1 = false;
		}
		return local1;
	}

	@OriginalMember(owner = "client!ki", name = "u", descriptor = "()Z", line = 35)
	@Override
	public boolean method28278() {
		@Pc(1) boolean local1 = true;
		if (!this.aClass497_110.method30054(this.aClass407_1.anInt4696 * 1186513455)) {
			local1 = false;
		}
		if (!this.aClass497_109.method30054(this.aClass407_1.anInt4696 * 1186513455)) {
			local1 = false;
		}
		return local1;
	}

	@OriginalMember(owner = "client!ki", name = "s", descriptor = "(Lclient!hq;IIIZLclient!yf;I)V", line = 408)
	static void method28117(@OriginalArg(0) Class320 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class681 arg5) {
		if (arg2 == 0) {
			throw new RuntimeException();
		}
		@Pc(10) Class312 local10 = arg0.aClass312Array3[arg1];
		if (local10.aClass312Array2 == null) {
			local10.aClass312Array2 = new Class312[arg3 + 1];
			local10.aClass312Array1 = local10.aClass312Array2;
		}
		if (local10.aClass312Array2.length <= arg3) {
			@Pc(39) Class312[] local39;
			if (local10.aClass312Array1 == local10.aClass312Array2) {
				local39 = new Class312[arg3 + 1];
				for (@Pc(41) int local41 = 0; local41 < local10.aClass312Array2.length; local41++) {
					local39[local41] = local10.aClass312Array2[local41];
				}
				local10.aClass312Array2 = local10.aClass312Array1 = local39;
			} else {
				local39 = new Class312[arg3 + 1];
				@Pc(72) Class312[] local72 = new Class312[arg3 + 1];
				for (@Pc(74) int local74 = 0; local74 < local10.aClass312Array2.length; local74++) {
					local39[local74] = local10.aClass312Array2[local74];
					local72[local74] = local10.aClass312Array1[local74];
				}
				local10.aClass312Array2 = local39;
				local10.aClass312Array1 = local72;
			}
		}
		if (arg3 > 0 && local10.aClass312Array2[arg3 - 1] == null) {
			throw new RuntimeException("" + (arg3 - 1));
		}
		@Pc(128) Class312 local128 = new Class312();
		local128.anInt3971 = arg2 * 1608521137;
		local128.anInt3985 = (local128.anInt3953 = local10.anInt3953) * 1172877961;
		local128.anInt3970 = arg3 * -1970231653;
		local10.aClass312Array2[arg3] = local128;
		if (local10.aClass312Array1 != local10.aClass312Array2) {
			local10.aClass312Array1[arg3] = local128;
		}
		@Pc(169) Class677 local169;
		if (arg4) {
			local169 = arg5.aClass677_2;
		} else {
			local169 = arg5.aClass677_1;
		}
		local169.aClass320_4 = arg0;
		local169.aClass312_13 = local128;
		Class354.method27696(local10);
	}

	@OriginalMember(owner = "client!ki", name = "ah", descriptor = "(B)V", line = 905)
	public static void method28120() {
		for (@Pc(4) Class93_Sub1_Sub8 local4 = (Class93_Sub1_Sub8) Class454.aClass18_16.method246(); local4 != null; local4 = (Class93_Sub1_Sub8) Class454.aClass18_16.method253()) {
			if (local4.anInt3013 * -2109043087 > 1) {
				local4.anInt3013 = 0;
				Class454.aClass240_85.method25830(local4, ((Class93_Sub1_Sub7) local4.aClass18_10.aClass93_Sub1_4.aClass93_Sub1_68).aLong155 * 7070093341456026777L);
				local4.aClass18_10.method245();
			}
		}
		Class454.anInt5039 = 0;
		Class454.anInt5042 = 0;
		Class454.aClass22_55.method406();
		Class454.aClass16_34.method219();
		Class454.aClass18_16.method245();
		Class454.aBoolean773 = false;
	}

	@OriginalMember(owner = "client!ki", name = "i", descriptor = "(IIIII)I", line = 1608)
	static final int method28116(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(11) int local11 = 65536 - Class464.anIntArray452[arg2 * 8192 / arg3] >> 1;
		return ((65536 - local11) * arg0 >> 16) + (local11 * arg1 >> 16);
	}

	@OriginalMember(owner = "client!ki", name = "agq", descriptor = "(Lclient!yf;I)V", line = 10752)
	static final void method28118(@OriginalArg(0) Class681 arg0) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = ((Class47) Class277.aClass32_Sub12_1.method18261(local12)).anInt153 * 497223015;
	}

	@OriginalMember(owner = "client!ki", name = "aht", descriptor = "(Lclient!yf;I)V", line = 11023)
	static final void method28119(@OriginalArg(0) Class681 arg0) {
		@Pc(13) String local13 = (String) arg0.anObjectArray45[(arg0.anInt5888 -= 957530791) * 587908375];
		if (client.anInt3514 * 2055688893 == 0 && (client.aBoolean621 && !client.aBoolean633 || client.aBoolean638)) {
			return;
		}
		@Pc(28) String local28 = local13.toLowerCase();
		@Pc(30) byte local30 = 0;
		if (local28.startsWith(Class74.aClass74_158.method1259(Class717.aClass717_15))) {
			local30 = 0;
			local13 = local13.substring(Class74.aClass74_158.method1259(Class717.aClass717_15).length());
		} else if (local28.startsWith(Class74.aClass74_142.method1259(Class717.aClass717_15))) {
			local30 = 1;
			local13 = local13.substring(Class74.aClass74_142.method1259(Class717.aClass717_15).length());
		} else if (local28.startsWith(Class74.aClass74_49.method1259(Class717.aClass717_15))) {
			local30 = 2;
			local13 = local13.substring(Class74.aClass74_49.method1259(Class717.aClass717_15).length());
		} else if (local28.startsWith(Class74.aClass74_161.method1259(Class717.aClass717_15))) {
			local30 = 3;
			local13 = local13.substring(Class74.aClass74_161.method1259(Class717.aClass717_15).length());
		} else if (local28.startsWith(Class74.aClass74_162.method1259(Class717.aClass717_15))) {
			local30 = 4;
			local13 = local13.substring(Class74.aClass74_162.method1259(Class717.aClass717_15).length());
		} else if (local28.startsWith(Class74.aClass74_163.method1259(Class717.aClass717_15))) {
			local30 = 5;
			local13 = local13.substring(Class74.aClass74_163.method1259(Class717.aClass717_15).length());
		} else if (local28.startsWith(Class74.aClass74_164.method1259(Class717.aClass717_15))) {
			local30 = 6;
			local13 = local13.substring(Class74.aClass74_164.method1259(Class717.aClass717_15).length());
		} else if (local28.startsWith(Class74.aClass74_165.method1259(Class717.aClass717_15))) {
			local30 = 7;
			local13 = local13.substring(Class74.aClass74_165.method1259(Class717.aClass717_15).length());
		} else if (local28.startsWith(Class74.aClass74_47.method1259(Class717.aClass717_15))) {
			local30 = 8;
			local13 = local13.substring(Class74.aClass74_47.method1259(Class717.aClass717_15).length());
		} else if (local28.startsWith(Class74.aClass74_86.method1259(Class717.aClass717_15))) {
			local30 = 9;
			local13 = local13.substring(Class74.aClass74_86.method1259(Class717.aClass717_15).length());
		} else if (local28.startsWith(Class74.aClass74_168.method1259(Class717.aClass717_15))) {
			local30 = 10;
			local13 = local13.substring(Class74.aClass74_168.method1259(Class717.aClass717_15).length());
		} else if (local28.startsWith(Class74.aClass74_20.method1259(Class717.aClass717_15))) {
			local30 = 11;
			local13 = local13.substring(Class74.aClass74_20.method1259(Class717.aClass717_15).length());
		} else if (Class717.aClass717_15 != Class106.aClass717_8) {
			if (local28.startsWith(Class74.aClass74_158.method1259(Class106.aClass717_8))) {
				local30 = 0;
				local13 = local13.substring(Class74.aClass74_158.method1259(Class106.aClass717_8).length());
			} else if (local28.startsWith(Class74.aClass74_142.method1259(Class106.aClass717_8))) {
				local30 = 1;
				local13 = local13.substring(Class74.aClass74_142.method1259(Class106.aClass717_8).length());
			} else if (local28.startsWith(Class74.aClass74_49.method1259(Class106.aClass717_8))) {
				local30 = 2;
				local13 = local13.substring(Class74.aClass74_49.method1259(Class106.aClass717_8).length());
			} else if (local28.startsWith(Class74.aClass74_161.method1259(Class106.aClass717_8))) {
				local30 = 3;
				local13 = local13.substring(Class74.aClass74_161.method1259(Class106.aClass717_8).length());
			} else if (local28.startsWith(Class74.aClass74_162.method1259(Class106.aClass717_8))) {
				local30 = 4;
				local13 = local13.substring(Class74.aClass74_162.method1259(Class106.aClass717_8).length());
			} else if (local28.startsWith(Class74.aClass74_163.method1259(Class106.aClass717_8))) {
				local30 = 5;
				local13 = local13.substring(Class74.aClass74_163.method1259(Class106.aClass717_8).length());
			} else if (local28.startsWith(Class74.aClass74_164.method1259(Class106.aClass717_8))) {
				local30 = 6;
				local13 = local13.substring(Class74.aClass74_164.method1259(Class106.aClass717_8).length());
			} else if (local28.startsWith(Class74.aClass74_165.method1259(Class106.aClass717_8))) {
				local30 = 7;
				local13 = local13.substring(Class74.aClass74_165.method1259(Class106.aClass717_8).length());
			} else if (local28.startsWith(Class74.aClass74_47.method1259(Class106.aClass717_8))) {
				local30 = 8;
				local13 = local13.substring(Class74.aClass74_47.method1259(Class106.aClass717_8).length());
			} else if (local28.startsWith(Class74.aClass74_86.method1259(Class106.aClass717_8))) {
				local30 = 9;
				local13 = local13.substring(Class74.aClass74_86.method1259(Class106.aClass717_8).length());
			} else if (local28.startsWith(Class74.aClass74_168.method1259(Class106.aClass717_8))) {
				local30 = 10;
				local13 = local13.substring(Class74.aClass74_168.method1259(Class106.aClass717_8).length());
			} else if (local28.startsWith(Class74.aClass74_20.method1259(Class106.aClass717_8))) {
				local30 = 11;
				local13 = local13.substring(Class74.aClass74_20.method1259(Class106.aClass717_8).length());
			}
		}
		local28 = local13.toLowerCase();
		@Pc(469) byte local469 = 0;
		if (local28.startsWith(Class74.aClass74_170.method1259(Class717.aClass717_15))) {
			local469 = 1;
			local13 = local13.substring(Class74.aClass74_170.method1259(Class717.aClass717_15).length());
		} else if (local28.startsWith(Class74.aClass74_171.method1259(Class717.aClass717_15))) {
			local469 = 2;
			local13 = local13.substring(Class74.aClass74_171.method1259(Class717.aClass717_15).length());
		} else if (local28.startsWith(Class74.aClass74_172.method1259(Class717.aClass717_15))) {
			local469 = 3;
			local13 = local13.substring(Class74.aClass74_172.method1259(Class717.aClass717_15).length());
		} else if (local28.startsWith(Class74.aClass74_70.method1259(Class717.aClass717_15))) {
			local469 = 4;
			local13 = local13.substring(Class74.aClass74_70.method1259(Class717.aClass717_15).length());
		} else if (local28.startsWith(Class74.aClass74_174.method1259(Class717.aClass717_15))) {
			local469 = 5;
			local13 = local13.substring(Class74.aClass74_174.method1259(Class717.aClass717_15).length());
		} else if (Class106.aClass717_8 != Class717.aClass717_15) {
			if (local28.startsWith(Class74.aClass74_170.method1259(Class106.aClass717_8))) {
				local469 = 1;
				local13 = local13.substring(Class74.aClass74_170.method1259(Class106.aClass717_8).length());
			} else if (local28.startsWith(Class74.aClass74_171.method1259(Class106.aClass717_8))) {
				local469 = 2;
				local13 = local13.substring(Class74.aClass74_171.method1259(Class106.aClass717_8).length());
			} else if (local28.startsWith(Class74.aClass74_172.method1259(Class106.aClass717_8))) {
				local469 = 3;
				local13 = local13.substring(Class74.aClass74_172.method1259(Class106.aClass717_8).length());
			} else if (local28.startsWith(Class74.aClass74_70.method1259(Class106.aClass717_8))) {
				local469 = 4;
				local13 = local13.substring(Class74.aClass74_70.method1259(Class106.aClass717_8).length());
			} else if (local28.startsWith(Class74.aClass74_174.method1259(Class106.aClass717_8))) {
				local469 = 5;
				local13 = local13.substring(Class74.aClass74_174.method1259(Class106.aClass717_8).length());
			}
		}
		@Pc(654) Class175 local654 = Class330.method27372();
		@Pc(660) Class93_Sub22 local660 = Class102.method2592(Class446.aClass446_97, local654.aClass24_2);
		local660.aClass93_Sub41_Sub2_1.method22510(0);
		@Pc(671) int local671 = local660.aClass93_Sub41_Sub2_1.anInt3070 * 212851357;
		local660.aClass93_Sub41_Sub2_1.method22510(local30);
		local660.aClass93_Sub41_Sub2_1.method22510(local469);
		Class284.method26484(local660.aClass93_Sub41_Sub2_1, local13);
		local660.aClass93_Sub41_Sub2_1.method22537(local660.aClass93_Sub41_Sub2_1.anInt3070 * 212851357 - local671);
		local654.method24351(local660);
	}

	@OriginalMember(owner = "client!ki", name = "app", descriptor = "(Lclient!yf;B)V", line = 12740)
	static final void method28121(@OriginalArg(0) Class681 arg0) {
		Class111.method6796();
	}
}
