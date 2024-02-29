package com.jagex;

import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ach")
public class Class57 {

	@OriginalMember(owner = "client!ach", name = "p", descriptor = "Ljava/util/zip/Inflater;")
	Inflater anInflater1;

	@OriginalMember(owner = "client!ach", name = "<init>", descriptor = "()V", line = 10)
	public Class57() {
		this(-1, 1000000, 1000000);
	}

	@OriginalMember(owner = "client!ach", name = "<init>", descriptor = "(III)V", line = 13)
	Class57(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!ach", name = "y", descriptor = "([B)[B", line = 16)
	public byte[] method856(@OriginalArg(0) byte[] arg0) {
		@Pc(4) Class77_Sub39 local4 = new Class77_Sub39(arg0);
		local4.anInt3089 = (arg0.length - 4) * -1387468933;
		@Pc(16) int local16 = local4.method22504();
		@Pc(19) byte[] local19 = new byte[local16];
		local4.anInt3089 = 0;
		this.method861(local4, local19);
		return local19;
	}

	@OriginalMember(owner = "client!ach", name = "l", descriptor = "([B)[B", line = 16)
	public byte[] method857(@OriginalArg(0) byte[] arg0) {
		@Pc(4) Class77_Sub39 local4 = new Class77_Sub39(arg0);
		local4.anInt3089 = (arg0.length - 4) * -1387468933;
		@Pc(16) int local16 = local4.method22504();
		@Pc(19) byte[] local19 = new byte[local16];
		local4.anInt3089 = 0;
		this.method861(local4, local19);
		return local19;
	}

	@OriginalMember(owner = "client!ach", name = "p", descriptor = "([BI)[B", line = 16)
	public byte[] method858(@OriginalArg(0) byte[] arg0) {
		@Pc(4) Class77_Sub39 local4 = new Class77_Sub39(arg0);
		local4.anInt3089 = (arg0.length - 4) * -1387468933;
		@Pc(16) int local16 = local4.method22504();
		@Pc(19) byte[] local19 = new byte[local16];
		local4.anInt3089 = 0;
		this.method861(local4, local19);
		return local19;
	}

	@OriginalMember(owner = "client!ach", name = "v", descriptor = "([B)[B", line = 16)
	public byte[] method859(@OriginalArg(0) byte[] arg0) {
		@Pc(4) Class77_Sub39 local4 = new Class77_Sub39(arg0);
		local4.anInt3089 = (arg0.length - 4) * -1387468933;
		@Pc(16) int local16 = local4.method22504();
		@Pc(19) byte[] local19 = new byte[local16];
		local4.anInt3089 = 0;
		this.method861(local4, local19);
		return local19;
	}

	@OriginalMember(owner = "client!ach", name = "w", descriptor = "([B)[B", line = 16)
	public byte[] method860(@OriginalArg(0) byte[] arg0) {
		@Pc(4) Class77_Sub39 local4 = new Class77_Sub39(arg0);
		local4.anInt3089 = (arg0.length - 4) * -1387468933;
		@Pc(16) int local16 = local4.method22504();
		@Pc(19) byte[] local19 = new byte[local16];
		local4.anInt3089 = 0;
		this.method861(local4, local19);
		return local19;
	}

	@OriginalMember(owner = "client!ach", name = "c", descriptor = "(Lclient!akv;[BI)V", line = 26)
	public void method861(@OriginalArg(0) Class77_Sub39 arg0, @OriginalArg(1) byte[] arg1) {
		if (arg0.aByteArray53[arg0.anInt3089 * 31645619] != 31 || arg0.aByteArray53[arg0.anInt3089 * 31645619 + 1] != -117) {
			throw new RuntimeException("");
		}
		if (this.anInflater1 == null) {
			this.anInflater1 = new Inflater(true);
		}
		try {
			this.anInflater1.setInput(arg0.aByteArray53, arg0.anInt3089 * 31645619 + 10, arg0.aByteArray53.length - (arg0.anInt3089 * 31645619 + 8 + 10));
			this.anInflater1.inflate(arg1);
		} catch (@Pc(64) Exception local64) {
			this.anInflater1.reset();
			throw new RuntimeException("");
		}
		this.anInflater1.reset();
	}

	@OriginalMember(owner = "client!ach", name = "cv", descriptor = "(Lclient!gm;Lclient!gh;Lclient!yf;B)V", line = 4940)
	static final void method862(@OriginalArg(0) Class277 arg0, @OriginalArg(1) Class273 arg1, @OriginalArg(2) Class665 arg2) {
		arg0.anInt3883 = arg2.anIntArray536[(arg2.anInt5784 -= 308999563) * 2088438307] * -1996628585;
		Class461.method29531(arg0);
		if (arg0.anInt3927 * 1365669833 == -1 && !arg1.aBoolean662) {
			Class77_Sub19.method13486(arg0.anInt3863 * -1278450723);
		}
	}

	@OriginalMember(owner = "client!ach", name = "ku", descriptor = "(I)V", line = 10946)
	static final void method863() {
		if (client.anInt3459 * -993629849 == -1) {
			return;
		}
		@Pc(9) int local9 = Class60.aClass138_1.method14234();
		@Pc(13) int local13 = Class60.aClass138_1.method14225();
		@Pc(18) Class77_Sub42 local18 = (Class77_Sub42) client.aClass695_44.method36395();
		if (local18 != null) {
			local9 = local18.method22716();
			local13 = local18.method22717();
		}
		if (client.aClass277_4 != null && Class58.aClass277_1 == client.aClass277_8) {
			client.aBoolean604 = true;
			client.anInt3484 = 0;
			client.anInt3445 = 0;
			client.anInt3486 = Class149_Sub4.anInt2368 * 1772500323;
			client.anInt3490 = Class19.anInt108 * 1038288957;
		}
		Class618.method32389(null, client.anInt3459 * -993629849, 0, 0, Class149_Sub4.anInt2368 * 1771907305, Class19.anInt108 * -1091172141, 0, 0, local9, local13);
		if (Class267.aClass277_10 != null) {
			Class686.method36285(local9, local13);
		}
	}

	@OriginalMember(owner = "client!ach", name = "mk", descriptor = "(Ljava/lang/String;B)V", line = 12181)
	public static final void method864(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return;
		}
		@Pc(8) String local8 = Class471.method29622(arg0, Class33.aClass53_11);
		if (local8 == null) {
			return;
		}
		for (@Pc(14) int local14 = 0; local14 < client.anInt3529 * -1979292205; local14++) {
			@Pc(23) Class162 local23 = client.aClass162Array1[local14];
			@Pc(26) String local26 = local23.aString131;
			@Pc(31) String local31 = Class471.method29622(local26, Class33.aClass53_11);
			if (Class476.method29694(arg0, local8, local26, local31)) {
				client.anInt3529 -= 1605909083;
				for (@Pc(44) int local44 = local14; local44 < client.anInt3529 * -1979292205; local44++) {
					client.aClass162Array1[local44] = client.aClass162Array1[local44 + 1];
				}
				client.anInt3499 = client.anInt3413 * -664271315;
				@Pc(66) Class82 local66 = Class230.method25826();
				@Pc(72) Class77_Sub20 local72 = Class365.method28132(Class414.aClass414_91, local66.aClass16_1);
				local72.aClass77_Sub39_Sub1_2.method22403(Class664.method33107(arg0));
				local72.aClass77_Sub39_Sub1_2.method22440(arg0);
				local66.method2004(local72);
				break;
			}
		}
	}
}
