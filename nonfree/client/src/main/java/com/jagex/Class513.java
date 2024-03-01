package com.jagex;

import java.math.BigInteger;
import java.util.Iterator;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qp")
public class Class513 {

	@OriginalMember(owner = "client!qp", name = "e", descriptor = "[Lclient!ps;")
	Class491[] aClass491Array1;

	@OriginalMember(owner = "client!qp", name = "<init>", descriptor = "(Lclient!alw;Ljava/math/BigInteger;Ljava/math/BigInteger;)V", line = 133)
	Class513(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) BigInteger arg1, @OriginalArg(2) BigInteger arg2) {
		arg0.anInt3070 = 1361799817;
		@Pc(8) int local8 = arg0.method22413();
		arg0.anInt3070 += local8 * 313960592;
		@Pc(26) byte[] local26 = new byte[arg0.aByteArray58.length - arg0.anInt3070 * 212851357];
		arg0.method22430(local26, 0, local26.length);
		@Pc(40) byte[] local40;
		if (arg1 == null || arg2 == null) {
			local40 = local26;
		} else {
			@Pc(46) BigInteger local46 = new BigInteger(local26);
			@Pc(51) BigInteger local51 = local46.modPow(arg1, arg2);
			local40 = local51.toByteArray();
		}
		if (local40.length != 65) {
			throw new RuntimeException();
		}
		@Pc(77) byte[] local77 = Class53_Sub1.method14953(arg0.aByteArray58, 5, arg0.anInt3070 * 212851357 - local26.length - 5);
		@Pc(79) int local79;
		for (local79 = 0; local79 < 64; local79++) {
			if (local77[local79] != local40[local79 + 1]) {
				throw new RuntimeException();
			}
		}
		this.aClass491Array1 = new Class491[local8];
		for (local79 = 0; local79 < local8; local79++) {
			arg0.anInt3070 = local79 * 313960592 + -83827138;
			@Pc(117) int local117 = arg0.method22419();
			@Pc(121) int local121 = arg0.method22419();
			@Pc(125) int local125 = arg0.method22419();
			@Pc(129) int local129 = arg0.method22419();
			@Pc(132) byte[] local132 = new byte[64];
			arg0.method22430(local132, 0, 64);
			this.aClass491Array1[local79] = new Class491(local117, local125, local121, local129, local132);
		}
	}

	@OriginalMember(owner = "client!qp", name = "lc", descriptor = "(Lclient!hf;IIILclient!yf;S)V", line = 6987)
	static final void method30263(@OriginalArg(0) Class312 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class681 arg4) {
		if (arg0.anIntArray373 == null) {
			throw new RuntimeException();
		}
		arg0.anIntArray373[arg1] = arg2;
		arg0.anIntArray375[arg1] = arg3;
	}

	@OriginalMember(owner = "client!qp", name = "ik", descriptor = "(II)V", line = 9500)
	static final void method30265(@OriginalArg(0) int arg0) {
		client.anInt3458 = 0;
		client.anInt3472 = 0;
		client.anInt3445 += 538413373;
		Class579.method31371();
		Class279.method26447(arg0);
		Class466.method29328();
		@Pc(16) boolean local16 = false;
		@Pc(18) int local18;
		@Pc(27) int local27;
		for (local18 = 0; local18 < client.anInt3458 * 1235627729; local18++) {
			local27 = client.anIntArray307[local18];
			@Pc(33) Class93_Sub15 local33 = (Class93_Sub15) client.aClass16_18.method215((long) local27);
			@Pc(37) Class132_Sub1_Sub1_Sub1_Sub1 local37 = (Class132_Sub1_Sub1_Sub1_Sub1) local33.anObject5;
			if (local37.anInt2786 * -1429700591 != client.anInt3445 * -1933011435) {
				if (Class454.aBoolean773 && Class568.method31298(local27)) {
					Class436.method28811();
				}
				if (local37.aClass336_1.method27432()) {
					Class665.method32895(local37);
				}
				local37.method18589(null);
				local33.method23969();
				local16 = true;
			}
		}
		if (local16) {
			local18 = client.anInt3488 * -1814159537;
			client.anInt3488 = client.aClass16_18.method218() * 436180911;
			local27 = 0;
			@Pc(89) Iterator local89 = client.aClass16_18.iterator();
			while (local89.hasNext()) {
				@Pc(96) Class93_Sub15 local96 = (Class93_Sub15) local89.next();
				client.aClass93_Sub15Array1[local27++] = local96;
			}
			for (@Pc(106) int local106 = client.anInt3488 * -1814159537; local106 < local18; local106++) {
				client.aClass93_Sub15Array1[local106] = null;
			}
			@Pc(119) Class342 local119 = Class65.aClass123_Sub1_2.method9023();
			if (Class342.aClass342_3 == local119) {
				@Pc(127) Class124_Sub1 local127 = (Class124_Sub1) Class65.aClass123_Sub1_2.method8952();
				local127.method9159();
			}
			@Pc(134) Class338 local134 = Class65.aClass123_Sub1_2.method8986();
			if (local134 == Class338.aClass338_4) {
				@Pc(142) Class25_Sub5 local142 = (Class25_Sub5) Class65.aClass123_Sub1_2.method9040();
				local142.method16472();
			}
		}
		if (client.aClass175_2.anInt3301 * 2010044839 != client.aClass175_2.aClass93_Sub41_Sub2_2.anInt3070 * 212851357) {
			throw new RuntimeException(client.aClass175_2.aClass93_Sub41_Sub2_2.anInt3070 * 212851357 + " " + client.aClass175_2.anInt3301 * 2010044839);
		}
		for (local18 = 0; local18 < client.anInt3540 * 568731113; local18++) {
			if (client.aClass16_18.method215((long) client.anIntArray323[local18]) == null) {
				throw new RuntimeException(local18 + " " + client.anInt3540 * 568731113);
			}
		}
		if (client.anInt3488 * -1814159537 - client.anInt3540 * 568731113 != 0) {
			throw new RuntimeException("" + (client.anInt3488 * -1814159537 - client.anInt3540 * 568731113));
		}
		for (local18 = 0; local18 < client.anInt3488 * -1814159537; local18++) {
			if (((Class132_Sub1_Sub1_Sub1) client.aClass93_Sub15Array1[local18].anObject5).anInt2786 * -1429700591 != client.anInt3445 * -1933011435) {
				throw new RuntimeException("" + ((Class132_Sub1_Sub1_Sub1) client.aClass93_Sub15Array1[local18].anObject5).anInt2768 * -1688488127);
			}
		}
	}

	@OriginalMember(owner = "client!qp", name = "ado", descriptor = "(Lclient!yf;B)V", line = 10134)
	static final void method30264(@OriginalArg(0) Class681 arg0) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = Class637.aClass113_1 == null ? 0 : 1;
	}
}
