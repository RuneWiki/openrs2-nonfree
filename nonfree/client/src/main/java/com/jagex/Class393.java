package com.jagex;

import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ma")
public class Class393 {

	@OriginalMember(owner = "client!ma", name = "p", descriptor = "Lclient!ma;")
	public static final Class393 aClass393_3 = new Class393(8);

	@OriginalMember(owner = "client!ma", name = "c", descriptor = "Lclient!ma;")
	public static final Class393 aClass393_2 = new Class393(16);

	@OriginalMember(owner = "client!ma", name = "v", descriptor = "Lclient!ma;")
	public static final Class393 aClass393_5 = new Class393(8);

	@OriginalMember(owner = "client!ma", name = "l", descriptor = "Lclient!ma;")
	public static final Class393 aClass393_4 = new Class393(16);

	@OriginalMember(owner = "client!ma", name = "y", descriptor = "Lclient!ma;")
	static final Class393 aClass393_6 = new Class393(32);

	@OriginalMember(owner = "client!ma", name = "w", descriptor = "I")
	public final int anInt4593;

	@OriginalMember(owner = "client!ma", name = "p", descriptor = "(Lclient!akv;I)Lclient!mw;", line = 33)
	public static Class409 method28388(@OriginalArg(0) Class77_Sub39 arg0) {
		@Pc(3) int local3 = arg0.method22478();
		@Pc(10) Class410 local10 = Class683.method36094()[arg0.method22478()];
		@Pc(17) Class402 local17 = Class700.method36485()[arg0.method22478()];
		@Pc(21) int local21 = arg0.method22487();
		@Pc(25) int local25 = arg0.method22487();
		@Pc(29) int local29 = arg0.method22483();
		@Pc(33) int local33 = arg0.method22483();
		@Pc(37) int local37 = arg0.method22500();
		@Pc(41) int local41 = arg0.method22500();
		@Pc(45) int local45 = arg0.method22500();
		@Pc(54) boolean local54 = arg0.method22478() == 1;
		return new Class409(local3, local10, local17, local21, local25, local29, local33, local37, local41, local45, local54);
	}

	@OriginalMember(owner = "client!ma", name = "<init>", descriptor = "(I)V", line = 43)
	Class393(@OriginalArg(0) int arg0) {
		this.anInt4593 = arg0 * 1711651991;
	}

	@OriginalMember(owner = "client!ma", name = "c", descriptor = "(JLjava/lang/String;I)I", line = 66)
	public static final int method28389(@OriginalArg(0) long arg0, @OriginalArg(1) String arg1) {
		@Pc(3) Random local3 = new Random();
		@Pc(8) Class77_Sub39 local8 = new Class77_Sub39(128);
		@Pc(13) Class77_Sub39 local13 = new Class77_Sub39(128);
		@Pc(16) int[] local16 = new int[] { local3.nextInt(), local3.nextInt(), (int) (arg0 >> 32), (int) arg0 };
		local8.method22403(10);
		@Pc(44) int local44;
		for (local44 = 0; local44 < 4; local44++) {
			local8.method22417(local3.nextInt());
		}
		local8.method22417(local16[0]);
		local8.method22417(local16[1]);
		local8.method22428(arg0);
		local8.method22428(0L);
		for (local44 = 0; local44 < 4; local44++) {
			local8.method22417(local3.nextInt());
		}
		local8.method22572(Class659.aBigInteger7, Class659.aBigInteger8);
		local13.method22403(10);
		for (local44 = 0; local44 < 3; local44++) {
			local13.method22417(local3.nextInt());
		}
		local13.method22428(local3.nextLong());
		local13.method22427(local3.nextLong());
		Class644.method32825(local13);
		local13.method22428(local3.nextLong());
		local13.method22572(Class659.aBigInteger7, Class659.aBigInteger8);
		local44 = Class664.method33107(arg1);
		if (local44 % 8 != 0) {
			local44 += 8 - local44 % 8;
		}
		@Pc(147) Class77_Sub39 local147 = new Class77_Sub39(local44);
		local147.method22440(arg1);
		local147.anInt3089 = local44 * -1387468933;
		local147.method22559(local16);
		@Pc(180) Class77_Sub39 local180 = new Class77_Sub39(local13.anInt3089 * 31645619 + local8.anInt3089 * 31645619 + 5 + local147.anInt3089 * 31645619);
		local180.method22403(2);
		local180.method22403(local8.anInt3089 * 31645619);
		local180.method22452(local8.aByteArray53, 0, local8.anInt3089 * 31645619);
		local180.method22403(local13.anInt3089 * 31645619);
		local180.method22452(local13.aByteArray53, 0, local13.anInt3089 * 31645619);
		local180.method22408(local147.anInt3089 * 31645619);
		local180.method22452(local147.aByteArray53, 0, local147.anInt3089 * 31645619);
		@Pc(240) String local240 = Class498.method30185(local180.aByteArray53);
		try {
			@Pc(255) URL local255 = new URL(Class246.method26128("services", false) + "m=accountappeal/login.ws");
			@Pc(258) URLConnection local258 = local255.openConnection();
			local258.setDoInput(true);
			local258.setDoOutput(true);
			local258.setConnectTimeout(5000);
			@Pc(273) OutputStreamWriter local273 = new OutputStreamWriter(local258.getOutputStream());
			local273.write("data2=" + Class283.method26700(local240) + "&dest=" + Class283.method26700("passwordchoice.ws"));
			local273.flush();
			@Pc(296) InputStream local296 = local258.getInputStream();
			local180 = new Class77_Sub39(new byte[1000]);
			do {
				@Pc(317) int local317 = local296.read(local180.aByteArray53, local180.anInt3089 * 31645619, 1000 - local180.anInt3089 * 31645619);
				if (local317 == -1) {
					local273.close();
					local296.close();
					@Pc(348) String local348 = new String(local180.aByteArray53);
					if (local348.startsWith("OFFLINE")) {
						return 4;
					} else if (local348.startsWith("WRONG")) {
						return 7;
					} else if (local348.startsWith("RELOAD")) {
						return 3;
					} else if (local348.startsWith("Not permitted for social network accounts.")) {
						return 6;
					} else {
						local180.method22561(local16);
						while (local180.anInt3089 * 31645619 > 0 && local180.aByteArray53[local180.anInt3089 * 31645619 - 1] == 0) {
							local180.anInt3089 -= -1387468933;
						}
						local348 = new String(local180.aByteArray53, 0, local180.anInt3089 * 31645619);
						if (Class661.method33083(local348)) {
							Class474.method29663(local348, true, client.aBoolean591);
							return 2;
						} else {
							return 5;
						}
					}
				}
				local180.anInt3089 += local317 * -1387468933;
			} while (local180.anInt3089 * 31645619 < 1000);
			return 5;
		} catch (@Pc(424) Throwable local424) {
			local424.printStackTrace();
			return 5;
		}
	}

	@OriginalMember(owner = "client!ma", name = "li", descriptor = "(Lclient!yf;B)V", line = 6710)
	static final void method28390(@OriginalArg(0) Class665 arg0) {
		@Pc(8) Class662 local8 = arg0.aBoolean857 ? arg0.aClass662_1 : arg0.aClass662_2;
		@Pc(11) Class277 local11 = local8.aClass277_12;
		@Pc(14) Class273 local14 = local8.aClass273_4;
		Class104_Sub1_Sub2_Sub1.method11349(local11, local14, arg0);
	}

	@OriginalMember(owner = "client!ma", name = "vs", descriptor = "(Lclient!yf;I)V", line = 8445)
	static final void method28391(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = client.aBoolean613 ? 1 : 0;
	}

	@OriginalMember(owner = "client!ma", name = "abu", descriptor = "(Lclient!yf;I)V", line = 9387)
	static final void method28392(@OriginalArg(0) Class665 arg0) {
		arg0.anInt5784 -= 617999126;
		@Pc(13) int local13 = arg0.anIntArray536[arg0.anInt5784 * 2088438307];
		@Pc(23) int local23 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 1];
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = client.aClass497ArrayArray1[local23][local13].method30170();
	}
}
