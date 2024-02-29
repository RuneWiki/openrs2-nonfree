package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ew")
public class Class236 implements Interface12, Interface6 {

	@OriginalMember(owner = "client!ew", name = "aa", descriptor = "I")
	static int anInt3778;

	@OriginalMember(owner = "client!ew", name = "p", descriptor = "[Z")
	public boolean[] aBooleanArray20;

	@OriginalMember(owner = "client!ew", name = "<init>", descriptor = "()V", line = 11)
	Class236() {
	}

	@OriginalMember(owner = "client!ew", name = "p", descriptor = "(Lclient!akv;B)V", line = 15)
	@Override
	public void method36031(@OriginalArg(0) Class77_Sub39 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22478();
			if (local3 == 0) {
				return;
			}
			this.method25907(arg0, local3);
		}
	}

	@OriginalMember(owner = "client!ew", name = "v", descriptor = "(Lclient!akv;)V", line = 15)
	@Override
	public void method36032(@OriginalArg(0) Class77_Sub39 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22478();
			if (local3 == 0) {
				return;
			}
			this.method25907(arg0, local3);
		}
	}

	@OriginalMember(owner = "client!ew", name = "l", descriptor = "(Lclient!akv;)V", line = 15)
	@Override
	public void method36030(@OriginalArg(0) Class77_Sub39 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22478();
			if (local3 == 0) {
				return;
			}
			this.method25907(arg0, local3);
		}
	}

	@OriginalMember(owner = "client!ew", name = "y", descriptor = "(Lclient!akv;)V", line = 15)
	@Override
	public void method36033(@OriginalArg(0) Class77_Sub39 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22478();
			if (local3 == 0) {
				return;
			}
			this.method25907(arg0, local3);
		}
	}

	@OriginalMember(owner = "client!ew", name = "q", descriptor = "(Lclient!akv;II)V", line = 22)
	void method25907(@OriginalArg(0) Class77_Sub39 arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10;
		@Pc(12) int local12;
		if (arg1 == 2) {
			this.aBooleanArray20 = new boolean[400];
			local10 = arg0.method22537();
			for (local12 = 0; local12 < local10; local12++) {
				this.aBooleanArray20[arg0.method22537()] = true;
			}
		} else if (arg1 == 3) {
			arg0.method22478();
			local10 = arg0.method22537();
			for (local12 = 0; local12 < local10; local12++) {
				arg0.method22537();
				arg0.method22478();
			}
		}
	}

	@OriginalMember(owner = "client!ew", name = "d", descriptor = "(Lclient!akv;I)V", line = 22)
	void method25908(@OriginalArg(0) Class77_Sub39 arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10;
		@Pc(12) int local12;
		if (arg1 == 2) {
			this.aBooleanArray20 = new boolean[400];
			local10 = arg0.method22537();
			for (local12 = 0; local12 < local10; local12++) {
				this.aBooleanArray20[arg0.method22537()] = true;
			}
		} else if (arg1 == 3) {
			arg0.method22478();
			local10 = arg0.method22537();
			for (local12 = 0; local12 < local10; local12++) {
				arg0.method22537();
				arg0.method22478();
			}
		}
	}

	@OriginalMember(owner = "client!ew", name = "s", descriptor = "(Lclient!akv;I)V", line = 22)
	void method25909(@OriginalArg(0) Class77_Sub39 arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10;
		@Pc(12) int local12;
		if (arg1 == 2) {
			this.aBooleanArray20 = new boolean[400];
			local10 = arg0.method22537();
			for (local12 = 0; local12 < local10; local12++) {
				this.aBooleanArray20[arg0.method22537()] = true;
			}
		} else if (arg1 == 3) {
			arg0.method22478();
			local10 = arg0.method22537();
			for (local12 = 0; local12 < local10; local12++) {
				arg0.method22537();
				arg0.method22478();
			}
		}
	}

	@OriginalMember(owner = "client!ew", name = "r", descriptor = "(Lclient!akv;I)V", line = 22)
	void method25910(@OriginalArg(0) Class77_Sub39 arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10;
		@Pc(12) int local12;
		if (arg1 == 2) {
			this.aBooleanArray20 = new boolean[400];
			local10 = arg0.method22537();
			for (local12 = 0; local12 < local10; local12++) {
				this.aBooleanArray20[arg0.method22537()] = true;
			}
		} else if (arg1 == 3) {
			arg0.method22478();
			local10 = arg0.method22537();
			for (local12 = 0; local12 < local10; local12++) {
				arg0.method22537();
				arg0.method22478();
			}
		}
	}

	@OriginalMember(owner = "client!ew", name = "t", descriptor = "()V", line = 38)
	@Override
	public void method36036() {
	}

	@OriginalMember(owner = "client!ew", name = "c", descriptor = "(I)V", line = 38)
	@Override
	public void method36034() {
	}

	@OriginalMember(owner = "client!ew", name = "w", descriptor = "()V", line = 38)
	@Override
	public void method36035() {
	}

	@OriginalMember(owner = "client!ew", name = "x", descriptor = "(II)V", line = 39)
	@Override
	public void method32874(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!ew", name = "g", descriptor = "(I)V", line = 39)
	@Override
	public void method32873(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!ew", name = "z", descriptor = "(I)V", line = 39)
	@Override
	public void method32872(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!ew", name = "p", descriptor = "(IB)Z", line = 58)
	public static boolean method25911(@OriginalArg(0) int arg0) {
		if (arg0 != Class230.anInt3759 * 1689023681 || Class661.aClass231_4 == null) {
			Class93_Sub1.method6436();
			Class661.aClass231_4 = Class231.aClass231_2;
			Class230.anInt3759 = arg0 * 2070289217;
		}
		@Pc(38) int local38;
		if (Class231.aClass231_2 == Class661.aClass231_4) {
			@Pc(22) byte[] local22 = client.aClass478_88.method29745(arg0);
			if (local22 == null) {
				return false;
			}
			@Pc(31) Class77_Sub39 local31 = new Class77_Sub39(local22);
			Class367.method28145(local31);
			local38 = local31.method22478();
			@Pc(40) int local40;
			for (local40 = 0; local40 < local38; local40++) {
				Class230.aClass695_49.method36383(new Class77_Sub18(local31));
			}
			local40 = local31.method22537();
			Class230.aClass233Array1 = new Class233[local40];
			@Pc(61) int local61;
			for (local61 = 0; local61 < local40; local61++) {
				Class230.aClass233Array1[local61] = new Class233(local31);
			}
			local61 = local31.method22537();
			Class589.aClass222Array1 = new Class222[local61];
			@Pc(82) int local82;
			for (local82 = 0; local82 < local61; local82++) {
				Class589.aClass222Array1[local82] = new Class222(local31, local82);
			}
			local82 = local31.method22537();
			Class128_Sub1.aClass225Array1 = new Class225[local82];
			@Pc(104) int local104;
			for (local104 = 0; local104 < local82; local104++) {
				Class128_Sub1.aClass225Array1[local104] = new Class225(local31);
			}
			local104 = local31.method22537();
			Class372.aClass237Array1 = new Class237[local104];
			@Pc(125) int local125;
			for (local125 = 0; local125 < local104; local125++) {
				Class372.aClass237Array1[local125] = new Class237(local31);
			}
			local125 = local31.method22537();
			Class695.aClass96Array1 = new Class96[local125];
			for (@Pc(146) int local146 = 0; local146 < local125; local146++) {
				Class695.aClass96Array1[local146] = Class340.method27735(local31);
			}
			Class661.aClass231_4 = Class231.aClass231_3;
		}
		if (Class231.aClass231_3 == Class661.aClass231_4) {
			@Pc(164) boolean local164 = true;
			@Pc(166) Class222[] local166 = Class589.aClass222Array1;
			for (local38 = 0; local38 < local166.length; local38++) {
				@Pc(176) Class222 local176 = local166[local38];
				if (!local176.method25760()) {
					local164 = false;
				}
			}
			@Pc(186) Class96[] local186 = Class695.aClass96Array1;
			for (local38 = 0; local38 < local186.length; local38++) {
				@Pc(196) Class96 local196 = local186[local38];
				if (!local196.method19903()) {
					local164 = false;
				}
			}
			@Pc(206) Class225[] local206 = Class128_Sub1.aClass225Array1;
			for (local38 = 0; local38 < local206.length; local38++) {
				@Pc(216) Class225 local216 = local206[local38];
				if (!local216.method25785()) {
					local164 = false;
				}
			}
			if (!local164) {
				return false;
			}
			Class661.aClass231_4 = Class231.aClass231_1;
		}
		return true;
	}

	@OriginalMember(owner = "client!ew", name = "kg", descriptor = "(Lclient!gm;III)V", line = 10101)
	public static void method25912(@OriginalArg(0) Class277 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == null) {
			return;
		}
		if (arg0.anObjectArray26 != null) {
			@Pc(10) Class77_Sub41 local10 = new Class77_Sub41();
			local10.aClass277_2 = arg0;
			local10.anObjectArray4 = arg0.anObjectArray26;
			Class72.method1019(local10);
		}
		client.aBoolean619 = true;
		Class173.anInt3295 = arg0.anInt3863 * 1469618665;
		client.anInt3475 = arg0.anInt3927 * -655517151;
		Class96_Sub15.anInt893 = arg1 * -70261683;
		Class121_Sub1.anInt1207 = arg2 * -723679001;
		client.anInt3452 = arg0.anInt3936 * 1580813437;
		Class130.anInt1407 = arg0.anInt3918 * -1519552379;
		client.anInt3472 = arg0.anInt3877 * 426243863;
		Class461.method29531(arg0);
	}
}
