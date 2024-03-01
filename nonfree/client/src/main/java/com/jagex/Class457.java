package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sj")
public class Class457 {

	@OriginalMember(owner = "client!sj", name = "x", descriptor = "I")
	public static final int anInt5063 = 256;

	@OriginalMember(owner = "client!sj", name = "c", descriptor = "I")
	int anInt5064;

	@OriginalMember(owner = "client!sj", name = "s", descriptor = "Lclient!ew;")
	Class161 aClass161_48 = new Class161(256);

	@OriginalMember(owner = "client!sj", name = "u", descriptor = "Lclient!ew;")
	final Class161 aClass161_45 = new Class161(500);

	@OriginalMember(owner = "client!sj", name = "y", descriptor = "Lclient!ew;")
	final Class161 aClass161_46 = new Class161(30);

	@OriginalMember(owner = "client!sj", name = "b", descriptor = "Lclient!ew;")
	final Class161 aClass161_47 = new Class161(50);

	@OriginalMember(owner = "client!sj", name = "j", descriptor = "[Lclient!dy;")
	Class138[] aClass138Array1 = new Class138[4];

	@OriginalMember(owner = "client!sj", name = "n", descriptor = "Lclient!xi;")
	Class576 aClass576_1 = new Class576(null, null);

	@OriginalMember(owner = "client!sj", name = "p", descriptor = "Lclient!vz;")
	final Class543 aClass543_3;

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "Lclient!vk;")
	final Class530 aClass530_1;

	@OriginalMember(owner = "client!sj", name = "g", descriptor = "Z")
	boolean aBoolean777;

	@OriginalMember(owner = "client!sj", name = "l", descriptor = "Lclient!ny;")
	final Class359 aClass359_80;

	@OriginalMember(owner = "client!sj", name = "h", descriptor = "Lclient!ny;")
	final Class359 aClass359_81;

	@OriginalMember(owner = "client!sj", name = "z", descriptor = "[Ljava/lang/String;")
	final String[] aStringArray17;

	@OriginalMember(owner = "client!sj", name = "p", descriptor = "(Lclient!ny;IIB)Lclient!yx;", line = 17)
	public static Class611 method28517(@OriginalArg(0) Class359 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method26713(arg1, arg2);
		return local5 == null ? null : new Class611(local5);
	}

	@OriginalMember(owner = "client!sj", name = "<init>", descriptor = "(Lclient!vz;Lclient!vk;ZLclient!ny;Lclient!ny;)V", line = 31)
	public Class457(@OriginalArg(0) Class543 arg0, @OriginalArg(1) Class530 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class359 arg3, @OriginalArg(4) Class359 arg4) {
		this.aClass543_3 = arg0;
		this.aClass530_1 = arg1;
		this.aBoolean777 = arg2;
		this.aClass359_80 = arg3;
		this.aClass359_81 = arg4;
		if (this.aClass359_80 != null) {
			@Pc(61) int local61 = this.aClass359_80.method26683() - 1;
			Class185.aClass185_12.method23905();
			this.aClass359_80.method26682(local61);
		}
		if (Class543.aClass543_4 == this.aClass543_3) {
			this.aStringArray17 = new String[] { null, null, null, null, null, Class601.aClass601_132.method33512(this.aClass530_1) };
		} else {
			this.aStringArray17 = new String[] { null, null, null, null, null, null };
		}
	}

	@OriginalMember(owner = "client!sj", name = "p", descriptor = "(IB)Lclient!su;", line = 49)
	public Class467 method28510(@OriginalArg(0) int arg0) {
		@Pc(3) Class161 local3 = this.aClass161_48;
		@Pc(11) Class467 local11;
		synchronized (this.aClass161_48) {
			local11 = (Class467) this.aClass161_48.method23219((long) arg0);
		}
		if (local11 != null) {
			return local11;
		}
		@Pc(28) Class359 local28 = this.aClass359_80;
		@Pc(42) byte[] local42;
		synchronized (this.aClass359_80) {
			local42 = this.aClass359_80.method26713(Class185.aClass185_12.method23906(arg0), Class185.aClass185_12.method23908(arg0));
		}
		local11 = new Class467();
		local11.anInt5092 = arg0 * -811849093;
		local11.aClass457_10 = this;
		local11.aStringArray18 = (String[]) this.aStringArray17.clone();
		if (local42 != null) {
			local11.method28674(new Class3_Sub41(local42));
		}
		local11.method28676();
		if (local11.aBoolean792) {
			local11.anInt5081 = 0;
		}
		if (!this.aBoolean777 && local11.aBoolean790) {
			local11.aStringArray18 = null;
			local11.anIntArray467 = null;
		}
		@Pc(104) Class161 local104 = this.aClass161_48;
		synchronized (this.aClass161_48) {
			this.aClass161_48.method23222(local11, (long) arg0);
			return local11;
		}
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(ZB)V", line = 77)
	public void method28490(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean777 != arg0) {
			this.aBoolean777 = arg0;
			this.method28493();
		}
	}

	@OriginalMember(owner = "client!sj", name = "y", descriptor = "(Z)V", line = 77)
	public void method28497(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean777 != arg0) {
			this.aBoolean777 = arg0;
			this.method28493();
		}
	}

	@OriginalMember(owner = "client!sj", name = "u", descriptor = "(Z)V", line = 77)
	public void method28500(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean777 != arg0) {
			this.aBoolean777 = arg0;
			this.method28493();
		}
	}

	@OriginalMember(owner = "client!sj", name = "g", descriptor = "(IB)V", line = 83)
	public void method28491(@OriginalArg(0) int arg0) {
		this.anInt5064 = arg0 * -335389399;
		@Pc(8) Class161 local8 = this.aClass161_45;
		synchronized (this.aClass161_45) {
			this.aClass161_45.method23224();
		}
		local8 = this.aClass161_46;
		synchronized (this.aClass161_46) {
			this.aClass161_46.method23224();
		}
		local8 = this.aClass161_47;
		synchronized (this.aClass161_47) {
			this.aClass161_47.method23224();
		}
	}

	@OriginalMember(owner = "client!sj", name = "b", descriptor = "(I)V", line = 83)
	public void method28496(@OriginalArg(0) int arg0) {
		this.anInt5064 = arg0 * -335389399;
		@Pc(8) Class161 local8 = this.aClass161_45;
		synchronized (this.aClass161_45) {
			this.aClass161_45.method23224();
		}
		local8 = this.aClass161_46;
		synchronized (this.aClass161_46) {
			this.aClass161_46.method23224();
		}
		local8 = this.aClass161_47;
		synchronized (this.aClass161_47) {
			this.aClass161_47.method23224();
		}
	}

	@OriginalMember(owner = "client!sj", name = "n", descriptor = "(I)V", line = 96)
	public void method28489(@OriginalArg(0) int arg0) {
		this.aClass161_48 = new Class161(arg0);
	}

	@OriginalMember(owner = "client!sj", name = "l", descriptor = "(II)V", line = 96)
	public void method28492(@OriginalArg(0) int arg0) {
		this.aClass161_48 = new Class161(arg0);
	}

	@OriginalMember(owner = "client!sj", name = "c", descriptor = "(I)V", line = 96)
	public void method28499(@OriginalArg(0) int arg0) {
		this.aClass161_48 = new Class161(arg0);
	}

	@OriginalMember(owner = "client!sj", name = "j", descriptor = "(I)V", line = 96)
	public void method28501(@OriginalArg(0) int arg0) {
		this.aClass161_48 = new Class161(arg0);
	}

	@OriginalMember(owner = "client!sj", name = "z", descriptor = "(I)V", line = 96)
	public void method28502(@OriginalArg(0) int arg0) {
		this.aClass161_48 = new Class161(arg0);
	}

	@OriginalMember(owner = "client!sj", name = "e", descriptor = "(I)V", line = 96)
	public void method28507(@OriginalArg(0) int arg0) {
		this.aClass161_48 = new Class161(arg0);
	}

	@OriginalMember(owner = "client!sj", name = "h", descriptor = "(I)V", line = 100)
	public void method28493() {
		@Pc(3) Class161 local3 = this.aClass161_48;
		synchronized (this.aClass161_48) {
			this.aClass161_48.method23224();
		}
		local3 = this.aClass161_45;
		synchronized (this.aClass161_45) {
			this.aClass161_45.method23224();
		}
		local3 = this.aClass161_46;
		synchronized (this.aClass161_46) {
			this.aClass161_46.method23224();
		}
		local3 = this.aClass161_47;
		synchronized (this.aClass161_47) {
			this.aClass161_47.method23224();
		}
		this.aClass138Array1 = new Class138[4];
		this.aClass576_1 = new Class576(null, null);
	}

	@OriginalMember(owner = "client!sj", name = "r", descriptor = "()V", line = 100)
	public void method28503() {
		@Pc(3) Class161 local3 = this.aClass161_48;
		synchronized (this.aClass161_48) {
			this.aClass161_48.method23224();
		}
		local3 = this.aClass161_45;
		synchronized (this.aClass161_45) {
			this.aClass161_45.method23224();
		}
		local3 = this.aClass161_46;
		synchronized (this.aClass161_46) {
			this.aClass161_46.method23224();
		}
		local3 = this.aClass161_47;
		synchronized (this.aClass161_47) {
			this.aClass161_47.method23224();
		}
		this.aClass138Array1 = new Class138[4];
		this.aClass576_1 = new Class576(null, null);
	}

	@OriginalMember(owner = "client!sj", name = "x", descriptor = "(II)V", line = 117)
	public void method28494(@OriginalArg(0) int arg0) {
		@Pc(3) Class161 local3 = this.aClass161_48;
		synchronized (this.aClass161_48) {
			this.aClass161_48.method23240(arg0);
		}
		local3 = this.aClass161_45;
		synchronized (this.aClass161_45) {
			this.aClass161_45.method23240(arg0);
		}
		local3 = this.aClass161_46;
		synchronized (this.aClass161_46) {
			this.aClass161_46.method23240(arg0);
		}
		local3 = this.aClass161_47;
		synchronized (this.aClass161_47) {
			this.aClass161_47.method23240(arg0);
		}
	}

	@OriginalMember(owner = "client!sj", name = "d", descriptor = "(I)V", line = 117)
	public void method28504(@OriginalArg(0) int arg0) {
		@Pc(3) Class161 local3 = this.aClass161_48;
		synchronized (this.aClass161_48) {
			this.aClass161_48.method23240(arg0);
		}
		local3 = this.aClass161_45;
		synchronized (this.aClass161_45) {
			this.aClass161_45.method23240(arg0);
		}
		local3 = this.aClass161_46;
		synchronized (this.aClass161_46) {
			this.aClass161_46.method23240(arg0);
		}
		local3 = this.aClass161_47;
		synchronized (this.aClass161_47) {
			this.aClass161_47.method23240(arg0);
		}
	}

	@OriginalMember(owner = "client!sj", name = "q", descriptor = "(I)V", line = 117)
	public void method28505(@OriginalArg(0) int arg0) {
		@Pc(3) Class161 local3 = this.aClass161_48;
		synchronized (this.aClass161_48) {
			this.aClass161_48.method23240(arg0);
		}
		local3 = this.aClass161_45;
		synchronized (this.aClass161_45) {
			this.aClass161_45.method23240(arg0);
		}
		local3 = this.aClass161_46;
		synchronized (this.aClass161_46) {
			this.aClass161_46.method23240(arg0);
		}
		local3 = this.aClass161_47;
		synchronized (this.aClass161_47) {
			this.aClass161_47.method23240(arg0);
		}
	}

	@OriginalMember(owner = "client!sj", name = "o", descriptor = "()V", line = 132)
	public void method28488() {
		@Pc(3) Class161 local3 = this.aClass161_48;
		synchronized (this.aClass161_48) {
			this.aClass161_48.method23245();
		}
		local3 = this.aClass161_45;
		synchronized (this.aClass161_45) {
			this.aClass161_45.method23245();
		}
		local3 = this.aClass161_46;
		synchronized (this.aClass161_46) {
			this.aClass161_46.method23245();
		}
		local3 = this.aClass161_47;
		synchronized (this.aClass161_47) {
			this.aClass161_47.method23245();
		}
	}

	@OriginalMember(owner = "client!sj", name = "s", descriptor = "(I)V", line = 132)
	public void method28495() {
		@Pc(3) Class161 local3 = this.aClass161_48;
		synchronized (this.aClass161_48) {
			this.aClass161_48.method23245();
		}
		local3 = this.aClass161_45;
		synchronized (this.aClass161_45) {
			this.aClass161_45.method23245();
		}
		local3 = this.aClass161_46;
		synchronized (this.aClass161_46) {
			this.aClass161_46.method23245();
		}
		local3 = this.aClass161_47;
		synchronized (this.aClass161_47) {
			this.aClass161_47.method23245();
		}
	}

	@OriginalMember(owner = "client!sj", name = "m", descriptor = "()V", line = 132)
	public void method28498() {
		@Pc(3) Class161 local3 = this.aClass161_48;
		synchronized (this.aClass161_48) {
			this.aClass161_48.method23245();
		}
		local3 = this.aClass161_45;
		synchronized (this.aClass161_45) {
			this.aClass161_45.method23245();
		}
		local3 = this.aClass161_46;
		synchronized (this.aClass161_46) {
			this.aClass161_46.method23245();
		}
		local3 = this.aClass161_47;
		synchronized (this.aClass161_47) {
			this.aClass161_47.method23245();
		}
	}

	@OriginalMember(owner = "client!sj", name = "v", descriptor = "()V", line = 132)
	public void method28506() {
		@Pc(3) Class161 local3 = this.aClass161_48;
		synchronized (this.aClass161_48) {
			this.aClass161_48.method23245();
		}
		local3 = this.aClass161_45;
		synchronized (this.aClass161_45) {
			this.aClass161_45.method23245();
		}
		local3 = this.aClass161_46;
		synchronized (this.aClass161_46) {
			this.aClass161_46.method23245();
		}
		local3 = this.aClass161_47;
		synchronized (this.aClass161_47) {
			this.aClass161_47.method23245();
		}
	}

	@OriginalMember(owner = "client!sj", name = "t", descriptor = "()V", line = 132)
	public void method28508() {
		@Pc(3) Class161 local3 = this.aClass161_48;
		synchronized (this.aClass161_48) {
			this.aClass161_48.method23245();
		}
		local3 = this.aClass161_45;
		synchronized (this.aClass161_45) {
			this.aClass161_45.method23245();
		}
		local3 = this.aClass161_46;
		synchronized (this.aClass161_46) {
			this.aClass161_46.method23245();
		}
		local3 = this.aClass161_47;
		synchronized (this.aClass161_47) {
			this.aClass161_47.method23245();
		}
	}

	@OriginalMember(owner = "client!sj", name = "w", descriptor = "()V", line = 132)
	public void method28509() {
		@Pc(3) Class161 local3 = this.aClass161_48;
		synchronized (this.aClass161_48) {
			this.aClass161_48.method23245();
		}
		local3 = this.aClass161_45;
		synchronized (this.aClass161_45) {
			this.aClass161_45.method23245();
		}
		local3 = this.aClass161_46;
		synchronized (this.aClass161_46) {
			this.aClass161_46.method23245();
		}
		local3 = this.aClass161_47;
		synchronized (this.aClass161_47) {
			this.aClass161_47.method23245();
		}
	}

	@OriginalMember(owner = "client!sj", name = "b", descriptor = "(I)I", line = 450)
	public static int method28511() {
		@Pc(2) Class161 local2 = Class488.aClass161_55;
		synchronized (Class488.aClass161_55) {
			return Class488.aClass161_55.method23254();
		}
	}

	@OriginalMember(owner = "client!sj", name = "dm", descriptor = "(I)I", line = 769)
	public static int method28516() {
		if ((double) Class58_Sub1.aFloat148 == 3.0D) {
			return 37;
		} else if ((double) Class58_Sub1.aFloat148 == 4.0D) {
			return 50;
		} else if ((double) Class58_Sub1.aFloat148 == 6.0D) {
			return 75;
		} else if ((double) Class58_Sub1.aFloat148 == 8.0D) {
			return 100;
		} else {
			return 200;
		}
	}

	@OriginalMember(owner = "client!sj", name = "fc", descriptor = "(B)V", line = 2394)
	public static void method28515() {
		@Pc(1) int local1 = 0;
		if (Class510.aClass3_Sub45_37.aClass60_Sub2_1.method12689() == 1) {
			local1 |= 0x1;
			local1 |= 0x10;
			local1 |= 0x20;
			local1 |= 0x2;
			local1 |= 0x4;
		}
		if (Class510.aClass3_Sub45_37.aClass60_Sub6_1.method12966() == 0) {
			local1 |= 0x40;
		}
		Class379.method27271(local1);
		client.aClass370_1.method26954().method28491(local1);
		Class30_Sub1.aClass379_1.method27250().method26954().method28491(local1);
		Class44_Sub3.aClass596_1.method33439(local1);
		Class498.aClass579_1.method33204(local1);
		Class19.aClass523_14.method29829(local1);
		Class510.method29576(local1);
		Class356.method26646(local1);
		Class209.method24242(local1);
		Class495.method29328(local1);
		Class461.method28597(local1);
		client.aClass370_1.method26968();
	}

	@OriginalMember(owner = "client!sj", name = "nx", descriptor = "(Lclient!fo;Lclient!fw;Lclient!vs;B)V", line = 6511)
	static final void method28512(@OriginalArg(0) Class178 arg0, @OriginalArg(1) Class186 arg1, @OriginalArg(2) Class536 arg2) {
		@Pc(13) String local13 = (String) arg2.anObjectArray42[(arg2.anInt5315 -= 790013775) * 996806575];
		if (Class201.method24159(local13, arg2) != null) {
			local13 = local13.substring(0, local13.length() - 1);
		}
		arg0.anObjectArray28 = Class484.method29109(local13, arg2);
		arg0.aBoolean644 = true;
	}

	@OriginalMember(owner = "client!sj", name = "adp", descriptor = "(Lclient!vs;I)V", line = 9351)
	static final void method28513(@OriginalArg(0) Class536 arg0) {
		arg0.anInt5319 -= 624249098;
		@Pc(13) int local13 = arg0.anIntArray496[arg0.anInt5319 * 960738381];
		@Pc(23) int local23 = arg0.anIntArray496[arg0.anInt5319 * 960738381 + 1];
		@Pc(28) Class3_Sub1_Sub18 local28 = Class98.method21817(local13, local23);
		if (local28 != null) {
			arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = local28.anInt2704 * 178210753;
			arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = local28.anInt2705 * 1545437003;
			arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = local28.anInt2703 * 66614355;
			arg0.anObjectArray42[(arg0.anInt5315 += 790013775) * 996806575 - 1] = local28.aString117 == null ? "" : local28.aString117;
			arg0.anObjectArray42[(arg0.anInt5315 += 790013775) * 996806575 - 1] = local28.aString118 == null ? "" : local28.aString118;
			arg0.anObjectArray42[(arg0.anInt5315 += 790013775) * 996806575 - 1] = local28.aString119 == null ? "" : local28.aString119;
			arg0.anObjectArray42[(arg0.anInt5315 += 790013775) * 996806575 - 1] = local28.aString120 == null ? "" : local28.aString120;
			arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = local28.anInt2706 * -1879981837;
			arg0.anObjectArray42[(arg0.anInt5315 += 790013775) * 996806575 - 1] = local28.aString116 == null ? "" : local28.aString116;
			return;
		}
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = -1;
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = 0;
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = 0;
		arg0.anObjectArray42[(arg0.anInt5315 += 790013775) * 996806575 - 1] = "";
		arg0.anObjectArray42[(arg0.anInt5315 += 790013775) * 996806575 - 1] = "";
		arg0.anObjectArray42[(arg0.anInt5315 += 790013775) * 996806575 - 1] = "";
		arg0.anObjectArray42[(arg0.anInt5315 += 790013775) * 996806575 - 1] = "";
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = 0;
		arg0.anObjectArray42[(arg0.anInt5315 += 790013775) * 996806575 - 1] = "";
	}

	@OriginalMember(owner = "client!sj", name = "afd", descriptor = "(Lclient!vs;I)V", line = 9840)
	static final void method28514(@OriginalArg(0) Class536 arg0) {
		if (Class217.aClass65_1.method13145(86)) {
			arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = 1;
		} else {
			arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = 0;
		}
	}
}
