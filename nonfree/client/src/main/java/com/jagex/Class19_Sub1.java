package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!abj")
public abstract class Class19_Sub1 extends Class19 {

	@OriginalMember(owner = "client!abj", name = "p", descriptor = "I")
	protected static final int anInt2842 = 4;

	@OriginalMember(owner = "client!abj", name = "at", descriptor = "Lclient!co;")
	static Class6 aClass6_23;

	@OriginalMember(owner = "client!abj", name = "cg", descriptor = "Lclient!fo;")
	public static Class178 aClass178_8;

	@OriginalMember(owner = "client!abj", name = "f", descriptor = "[Lclient!co;")
	public static Class6[] aClass6Array10;

	@OriginalMember(owner = "client!abj", name = "<init>", descriptor = "()V", line = 6)
	Class19_Sub1() {
	}

	@OriginalMember(owner = "client!abj", name = "fk", descriptor = "(I)V", line = 2305)
	static void method20892() {
		@Pc(1) int local1 = 0;
		if (Class510.aClass3_Sub45_37 != null) {
			local1 = Class510.aClass3_Sub45_37.aClass60_Sub8_1.method13313();
		}
		@Pc(22) int local22;
		@Pc(33) int local33;
		if (local1 == 2) {
			local22 = client.anInt3026 * -2098608041 > 800 ? 800 : client.anInt3026 * -2098608041;
			local33 = Class613.anInt5546 * -457495395 > 600 ? 600 : Class613.anInt5546 * -457495395;
			Class128.anInt3317 = local22 * 1955991213;
			client.anInt3022 = (client.anInt3026 * -2098608041 - local22) / 2 * 1964245899;
			Class575.anInt5428 = local33 * -1314402953;
			client.anInt3024 = 0;
		} else if (local1 == 1) {
			local22 = client.anInt3026 * -2098608041 > 1024 ? 1024 : client.anInt3026 * -2098608041;
			local33 = Class613.anInt5546 * -457495395 > 768 ? 768 : Class613.anInt5546 * -457495395;
			Class128.anInt3317 = local22 * 1955991213;
			client.anInt3022 = (client.anInt3026 * -2098608041 - local22) / 2 * 1964245899;
			Class575.anInt5428 = local33 * -1314402953;
			client.anInt3024 = 0;
		} else {
			Class128.anInt3317 = client.anInt3026 * 267068619;
			client.anInt3022 = 0;
			Class575.anInt5428 = Class613.anInt5546 * -584681989;
			client.anInt3024 = 0;
		}
	}

	@OriginalMember(owner = "client!abj", name = "m", descriptor = "(Lclient!dr;)V")
	public abstract void method20880(@OriginalArg(0) Interface13 arg0);

	@OriginalMember(owner = "client!abj", name = "k", descriptor = "(ILclient!da;)V")
	public abstract void method20881(@OriginalArg(0) int arg0, @OriginalArg(1) Interface10 arg1);

	@OriginalMember(owner = "client!abj", name = "v", descriptor = "(ILclient!da;)V")
	public abstract void method20882(@OriginalArg(0) int arg0, @OriginalArg(1) Interface10 arg1);

	@OriginalMember(owner = "client!abj", name = "t", descriptor = "()Z")
	public abstract boolean method20883();

	@OriginalMember(owner = "client!abj", name = "w", descriptor = "(IIIIIIZZ)V")
	public abstract void method20884(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) boolean arg7);

	@OriginalMember(owner = "client!abj", name = "aa", descriptor = "(IIIIIIZZ)V")
	public abstract void method20885(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) boolean arg7);

	@OriginalMember(owner = "client!abj", name = "f", descriptor = "(ILclient!da;)V")
	public abstract void method20886(@OriginalArg(0) int arg0, @OriginalArg(1) Interface10 arg1);

	@OriginalMember(owner = "client!abj", name = "o", descriptor = "(ILclient!da;)V")
	public abstract void method20887(@OriginalArg(0) int arg0, @OriginalArg(1) Interface10 arg1);

	@OriginalMember(owner = "client!abj", name = "at", descriptor = "(Lclient!dr;)V")
	public abstract void method20888(@OriginalArg(0) Interface13 arg0);

	@OriginalMember(owner = "client!abj", name = "af", descriptor = "()Z")
	public abstract boolean method20889();

	@OriginalMember(owner = "client!abj", name = "ak", descriptor = "(IIIIIIZZ)V")
	public abstract void method20890(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) boolean arg7);

	@OriginalMember(owner = "client!abj", name = "i", descriptor = "(ILclient!da;)V")
	public abstract void method20891(@OriginalArg(0) int arg0, @OriginalArg(1) Interface10 arg1);
}
