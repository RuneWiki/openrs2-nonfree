package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ff")
public class Class245 implements Interface27 {

	@OriginalMember(owner = "client!ff", name = "q", descriptor = "I")
	static int anInt3798;

	// $FF: synthetic field
	@OriginalMember(owner = "client!ff", name = "this$0", descriptor = "Lclient!fc;")
	final Class242 this$0;

	@OriginalMember(owner = "client!ff", name = "p", descriptor = "I")
	final int anInt3799;

	@OriginalMember(owner = "client!ff", name = "c", descriptor = "Z")
	final boolean aBoolean654;

	@OriginalMember(owner = "client!ff", name = "c", descriptor = "([[[Lclient!ty;I)V", line = 23)
	static void method26120(@OriginalArg(0) Class567[][][] arg0) {
		for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
			@Pc(9) Class567[][] local9 = arg0[local1];
			for (@Pc(11) int local11 = 0; local11 < local9.length; local11++) {
				for (@Pc(17) int local17 = 0; local17 < local9[local11].length; local17++) {
					@Pc(29) Class567 local29 = local9[local11][local17];
					if (local29 != null) {
						if (local29.aClass104_Sub1_Sub4_1 instanceof Interface61) {
							((Interface61) local29.aClass104_Sub1_Sub4_1).method13059();
						}
						if (local29.aClass104_Sub1_Sub3_1 instanceof Interface61) {
							((Interface61) local29.aClass104_Sub1_Sub3_1).method13059();
						}
						if (local29.aClass104_Sub1_Sub3_2 instanceof Interface61) {
							((Interface61) local29.aClass104_Sub1_Sub3_2).method13059();
						}
						if (local29.aClass104_Sub1_Sub2_2 instanceof Interface61) {
							((Interface61) local29.aClass104_Sub1_Sub2_2).method13059();
						}
						if (local29.aClass104_Sub1_Sub2_1 instanceof Interface61) {
							((Interface61) local29.aClass104_Sub1_Sub2_1).method13059();
						}
						for (@Pc(81) Class559 local81 = local29.aClass559_3; local81 != null; local81 = local81.aClass559_1) {
							@Pc(87) Class104_Sub1_Sub1 local87 = local81.aClass104_Sub1_Sub1_1;
							if (local87 instanceof Interface61) {
								((Interface61) local87).method13059();
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ff", name = "w", descriptor = "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILclient!ne;B)V", line = 42)
	public static void method26121(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3, @OriginalArg(4) String arg4, @OriginalArg(5) String arg5, @OriginalArg(6) String arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class416 arg8) {
		@Pc(5) Class300 local5 = (Class300) Class304.aMap17.get(arg0);
		if (local5 == null) {
			local5 = new Class300();
			Class304.aMap17.put(arg0, local5);
		}
		@Pc(30) Class77_Sub1_Sub14 local30 = local5.method27102(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		Class304.aClass12_31.method184(local30, (long) (local30.anInt3043 * -759944081));
		Class304.aClass691_14.method36326(local30);
		client.anInt3392 = client.anInt3413 * -910438199;
	}

	@OriginalMember(owner = "client!ff", name = "<init>", descriptor = "(Lclient!fc;Lclient!akv;)V", line = 232)
	Class245(@OriginalArg(0) Class242 arg0, @OriginalArg(1) Class77_Sub39 arg1) {
		this.this$0 = arg0;
		this.anInt3799 = arg1.method22483() * 1761662661;
		this.aBoolean654 = arg1.method22478() == 1;
	}

	@OriginalMember(owner = "client!ff", name = "p", descriptor = "(Lclient!fd;I)V", line = 238)
	@Override
	public void method26978(@OriginalArg(0) Class243 arg0) {
		arg0.method26085(this.anInt3799 * -72206323, this.aBoolean654);
		arg0.method26054(this.anInt3799 * -72206323).method25991();
	}

	@OriginalMember(owner = "client!ff", name = "c", descriptor = "(Lclient!fd;)V", line = 238)
	@Override
	public void method26977(@OriginalArg(0) Class243 arg0) {
		arg0.method26085(this.anInt3799 * -72206323, this.aBoolean654);
		arg0.method26054(this.anInt3799 * -72206323).method25991();
	}

	@OriginalMember(owner = "client!ff", name = "v", descriptor = "(Lclient!fd;)V", line = 238)
	@Override
	public void method26979(@OriginalArg(0) Class243 arg0) {
		arg0.method26085(this.anInt3799 * -72206323, this.aBoolean654);
		arg0.method26054(this.anInt3799 * -72206323).method25991();
	}

	@OriginalMember(owner = "client!ff", name = "ho", descriptor = "(B)V", line = 4351)
	static final void method26122() {
		Class586.method31730(Class284.aClass86_9, (long) client.anInt3414);
		if (client.anInt3459 * -993629849 != -1) {
			Class238.method25924(client.anInt3459 * -993629849);
		}
		@Pc(15) int local15;
		for (local15 = 0; local15 < client.anInt3494 * 1372795039; local15++) {
			client.aBooleanArray19[local15] = client.aBooleanArray17[local15];
			client.aBooleanArray17[local15] = false;
		}
		client.anInt3512 = client.anInt3414 * 200492421;
		if (client.anInt3459 * -993629849 != -1) {
			client.anInt3494 = 0;
			Class646.method32840();
		}
		Class284.aClass86_9.method20299();
		Class77_Sub25.method13635(Class284.aClass86_9);
		local15 = Class156.method24262();
		if (local15 == -1) {
			local15 = client.anInt3472 * 846725895;
		}
		if (local15 == -1) {
			local15 = client.anInt3396 * 965081907;
		}
		Class560.method31287(local15);
		client.anInt3418 = 0;
	}
}
