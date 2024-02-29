package com.jagex;

import java.util.Iterator;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ahh")
public class Class118_Sub2 extends Class118 {

	@OriginalMember(owner = "client!ahh", name = "d", descriptor = "I")
	public final int anInt1164;

	@OriginalMember(owner = "client!ahh", name = "s", descriptor = "I")
	public final int anInt1163;

	@OriginalMember(owner = "client!ahh", name = "<init>", descriptor = "(Lclient!my;Lclient!mk;IIIIIIIIII)V", line = 10)
	Class118_Sub2(@OriginalArg(0) Class410 arg0, @OriginalArg(1) Class402 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		this.anInt1164 = arg10 * 2062495249;
		this.anInt1163 = arg11 * -1242598389;
	}

	@OriginalMember(owner = "client!ahh", name = "r", descriptor = "(Lclient!akv;)Lclient!mq;", line = 16)
	public static Class118 method10261(@OriginalArg(0) Class77_Sub39 arg0) {
		@Pc(3) Class118 local3 = Class35_Sub19.method17775(arg0);
		@Pc(7) int local7 = arg0.method22500();
		@Pc(11) int local11 = arg0.method22500();
		@Pc(15) int local15 = arg0.method22549();
		return new Class118_Sub2(local3.aClass410_8, local3.aClass402_8, local3.anInt2926 * -2127596367, local3.anInt2920 * -1055236307, local3.anInt2922 * -1607607997, local3.anInt2923 * -228886179, local3.anInt2924 * -81046249, local3.anInt2925 * -120853723, local3.anInt2921 * 1210620409, local7, local11, local15);
	}

	@OriginalMember(owner = "client!ahh", name = "d", descriptor = "(Lclient!akv;)Lclient!mq;", line = 16)
	public static Class118 method10262(@OriginalArg(0) Class77_Sub39 arg0) {
		@Pc(3) Class118 local3 = Class35_Sub19.method17775(arg0);
		@Pc(7) int local7 = arg0.method22500();
		@Pc(11) int local11 = arg0.method22500();
		@Pc(15) int local15 = arg0.method22549();
		return new Class118_Sub2(local3.aClass410_8, local3.aClass402_8, local3.anInt2926 * -2127596367, local3.anInt2920 * -1055236307, local3.anInt2922 * -1607607997, local3.anInt2923 * -228886179, local3.anInt2924 * -81046249, local3.anInt2925 * -120853723, local3.anInt2921 * 1210620409, local7, local11, local15);
	}

	@OriginalMember(owner = "client!ahh", name = "s", descriptor = "(Lclient!akv;)Lclient!mq;", line = 16)
	public static Class118 method10263(@OriginalArg(0) Class77_Sub39 arg0) {
		@Pc(3) Class118 local3 = Class35_Sub19.method17775(arg0);
		@Pc(7) int local7 = arg0.method22500();
		@Pc(11) int local11 = arg0.method22500();
		@Pc(15) int local15 = arg0.method22549();
		return new Class118_Sub2(local3.aClass410_8, local3.aClass402_8, local3.anInt2926 * -2127596367, local3.anInt2920 * -1055236307, local3.anInt2922 * -1607607997, local3.anInt2923 * -228886179, local3.anInt2924 * -81046249, local3.anInt2925 * -120853723, local3.anInt2921 * 1210620409, local7, local11, local15);
	}

	@OriginalMember(owner = "client!ahh", name = "x", descriptor = "(Lclient!akv;)Lclient!mq;", line = 16)
	public static Class118 method10264(@OriginalArg(0) Class77_Sub39 arg0) {
		@Pc(3) Class118 local3 = Class35_Sub19.method17775(arg0);
		@Pc(7) int local7 = arg0.method22500();
		@Pc(11) int local11 = arg0.method22500();
		@Pc(15) int local15 = arg0.method22549();
		return new Class118_Sub2(local3.aClass410_8, local3.aClass402_8, local3.anInt2926 * -2127596367, local3.anInt2920 * -1055236307, local3.anInt2922 * -1607607997, local3.anInt2923 * -228886179, local3.anInt2924 * -81046249, local3.anInt2925 * -120853723, local3.anInt2921 * 1210620409, local7, local11, local15);
	}

	@OriginalMember(owner = "client!ahh", name = "y", descriptor = "()Lclient!mt;", line = 24)
	@Override
	public Class406 method28559() {
		return Class406.aClass406_3;
	}

	@OriginalMember(owner = "client!ahh", name = "c", descriptor = "(I)Lclient!mt;", line = 24)
	@Override
	public Class406 method28557() {
		return Class406.aClass406_3;
	}

	@OriginalMember(owner = "client!ahh", name = "l", descriptor = "()Lclient!mt;", line = 24)
	@Override
	public Class406 method28558() {
		return Class406.aClass406_3;
	}

	@OriginalMember(owner = "client!ahh", name = "w", descriptor = "()Lclient!mt;", line = 24)
	@Override
	public Class406 method28560() {
		return Class406.aClass406_3;
	}

	@OriginalMember(owner = "client!ahh", name = "l", descriptor = "(Lclient!akv;II)Ljava/lang/String;", line = 31)
	static String method10265(@OriginalArg(0) Class77_Sub39 arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(3) int local3 = arg0.method22537();
			if (local3 > arg1) {
				local3 = arg1;
			}
			@Pc(11) byte[] local11 = new byte[local3];
			arg0.anInt3089 += Class310.aClass298_1.method27060(arg0.aByteArray53, arg0.anInt3089 * 31645619, local11, 0, local3) * -1387468933;
			return Class386.method28347(local11, 0, local3);
		} catch (@Pc(39) Exception local39) {
			return "Cabbage";
		}
	}

	@OriginalMember(owner = "client!ahh", name = "jc", descriptor = "(II)V", line = 9470)
	static final void method10266(@OriginalArg(0) int arg0) {
		client.anInt3412 = 0;
		client.anInt3410 = 0;
		client.anInt3411 += 1875053687;
		Class477.method29711();
		Class470.method29618(arg0);
		Class474.method29678();
		@Pc(16) boolean local16 = false;
		@Pc(18) int local18;
		@Pc(27) int local27;
		for (local18 = 0; local18 < client.anInt3412 * 289244867; local18++) {
			local27 = client.anIntArray318[local18];
			@Pc(33) Class77_Sub6 local33 = (Class77_Sub6) client.aClass12_22.method173((long) local27);
			@Pc(37) Class104_Sub1_Sub1_Sub1_Sub1 local37 = (Class104_Sub1_Sub1_Sub1_Sub1) local33.anObject5;
			if (local37.anInt2894 * 1438017593 != client.anInt3411 * 1237749063) {
				if (Class683.aBoolean861 && Class419.method28686(local27)) {
					Class35_Sub17.method17430();
				}
				if (local37.aClass333_1.method27652()) {
					Class689.method36313(local37);
				}
				local37.method19810(null);
				local33.method24063();
				local16 = true;
			}
		}
		if (local16) {
			local18 = client.anInt3438 * 759971875;
			client.anInt3438 = client.aClass12_22.method183() * 1085173643;
			local27 = 0;
			@Pc(89) Iterator local89 = client.aClass12_22.iterator();
			while (local89.hasNext()) {
				@Pc(96) Class77_Sub6 local96 = (Class77_Sub6) local89.next();
				client.aClass77_Sub6Array1[local27++] = local96;
			}
			for (@Pc(106) int local106 = client.anInt3438 * 759971875; local106 < local18; local106++) {
				client.aClass77_Sub6Array1[local106] = null;
			}
			@Pc(119) Class331 local119 = Class597.aClass107_Sub1_2.method8880();
			if (local119 == Class331.aClass331_4) {
				@Pc(127) Class115_Sub1 local127 = (Class115_Sub1) Class597.aClass107_Sub1_2.method8871();
				local127.method9836();
			}
			@Pc(134) Class321 local134 = Class597.aClass107_Sub1_2.method8879();
			if (local134 == Class321.aClass321_4) {
				@Pc(142) Class149_Sub4 local142 = (Class149_Sub4) Class597.aClass107_Sub1_2.method8873();
				local142.method16843();
			}
		}
		if (client.aClass82_2.aClass77_Sub39_Sub1_1.anInt3089 * 31645619 != client.aClass82_2.anInt327 * -1013636781) {
			throw new RuntimeException(client.aClass82_2.aClass77_Sub39_Sub1_1.anInt3089 * 31645619 + " " + client.aClass82_2.anInt327 * -1013636781);
		}
		for (local18 = 0; local18 < client.anInt3527 * -1125820437; local18++) {
			if (client.aClass12_22.method173((long) client.anIntArray317[local18]) == null) {
				throw new RuntimeException(local18 + " " + client.anInt3527 * -1125820437);
			}
		}
		if (client.anInt3438 * 759971875 - client.anInt3527 * -1125820437 != 0) {
			throw new RuntimeException("" + (client.anInt3438 * 759971875 - client.anInt3527 * -1125820437));
		}
		for (local18 = 0; local18 < client.anInt3438 * 759971875; local18++) {
			if (client.anInt3411 * 1237749063 != ((Class104_Sub1_Sub1_Sub1) client.aClass77_Sub6Array1[local18].anObject5).anInt2894 * 1438017593) {
				throw new RuntimeException("" + ((Class104_Sub1_Sub1_Sub1) client.aClass77_Sub6Array1[local18].anObject5).anInt2867 * 1126388985);
			}
		}
	}
}
