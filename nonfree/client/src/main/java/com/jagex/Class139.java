package com.jagex;

import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ta")
public abstract class Class139 {

	@OriginalMember(owner = "client!ta", name = "<init>", descriptor = "()V", line = 7)
	Class139() {
	}

	@OriginalMember(owner = "client!ta", name = "f", descriptor = "(Ljava/net/Socket;I)Lclient!ta;", line = 10)
	public static Class139 method14331(@OriginalArg(0) Socket arg0, @OriginalArg(1) int arg1) throws IOException {
		return new Class139_Sub1(arg0, arg1);
	}

	@OriginalMember(owner = "client!ta", name = "o", descriptor = "(Ljava/net/Socket;I)Lclient!ta;", line = 10)
	public static Class139 method14332(@OriginalArg(0) Socket arg0, @OriginalArg(1) int arg1) throws IOException {
		return new Class139_Sub1(arg0, arg1);
	}

	@OriginalMember(owner = "client!ta", name = "df", descriptor = "(Lclient!dx;IIIII)V", line = 664)
	static final void method14333(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		arg0.method20151(arg1, arg2, arg3 + arg1, arg4 + arg2);
		arg0.method19986(arg1, arg2, arg3, arg4, -16777216);
		if (Class136_Sub1.anInt1702 * -1857977261 < 100) {
			return;
		}
		@Pc(29) float local29 = (float) Class136_Sub1.anInt1677 / (float) Class136_Sub1.anInt1676;
		@Pc(31) int local31 = arg3;
		@Pc(33) int local33 = arg4;
		if (local29 < 1.0F) {
			local33 = (int) (local29 * (float) arg3);
		} else {
			local31 = (int) ((float) arg4 / local29);
		}
		@Pc(58) int local58 = arg1 + (arg3 - local31) / 2;
		@Pc(66) int local66 = arg2 + (arg4 - local33) / 2;
		if (Class233.aClass83_24 == null || Class233.aClass83_24.method18169() != local31 || Class233.aClass83_24.method18171() != local33) {
			Class136_Sub1.aClass232_24 = Class136_Sub1.aClass232_26;
			Class136_Sub1.method13941(Class136_Sub1.anInt1674, Class136_Sub1.anInt1675 + Class136_Sub1.anInt1677, Class136_Sub1.anInt1676 + Class136_Sub1.anInt1674, Class136_Sub1.anInt1675, local58, local66, local31 + local58, local33 + local66);
			Class136_Sub1.method13944(arg0, false, false, client.aBoolean613, true);
			arg0.method20012();
			Class233.aClass83_24 = arg0.method20105(local58, local66, local31, local33, true);
		}
		Class233.aClass83_24.method18123(local58, local66);
		@Pc(123) int local123 = Class551.anInt5221 * -87431073 * local31 / Class136_Sub1.anInt1676;
		@Pc(131) int local131 = Class566.anInt5341 * 114918783 * local33 / Class136_Sub1.anInt1677;
		@Pc(141) int local141 = local58 + local31 * Class657.anInt5768 * 313632999 / Class136_Sub1.anInt1676;
		@Pc(155) int local155 = local33 + local66 - local33 * -1356415839 * Class115.anInt2917 / Class136_Sub1.anInt1677 - local131;
		@Pc(157) int local157 = -1996554240;
		if (client.aClass670_4 == Class670.aClass670_6) {
			local157 = -1996488705;
		}
		arg0.method20088(local141, local155, local123, local131, local157, 1);
		arg0.method20087(local141, local155, local123, local131, local157, 0);
		for (@Pc(183) Class77_Sub30 local183 = (Class77_Sub30) Class136_Sub1.aClass695_23.method36395(); local183 != null; local183 = (Class77_Sub30) Class136_Sub1.aClass695_23.method36406()) {
			@Pc(194) Class302 local194 = (Class302) Class136_Sub1.aClass35_Sub10_2.method18319(local183.anInt1635 * 1592054281);
			if (Class260.method26251(local194)) {
				@Pc(208) Class1 local208 = (Class1) Class136_Sub1.aHashMap5.get(local183.anInt1635 * 1592054281);
				if (local208 == null) {
					local208 = (Class1) Class136_Sub1.aHashMap4.get(local194.anInt4027 * -15128681);
				}
				if (local208 != null) {
					@Pc(245) int local245;
					if (local208.anInt1 * -959968621 > Class136_Sub1.anInt1708 * 2135626771 / 2) {
						local245 = (Class136_Sub1.anInt1708 * -876019987 - local208.anInt1 * 21137517) / (Class136_Sub1.anInt1708 * 2135626771);
					} else {
						local245 = local208.anInt1 * 21137517 / (Class136_Sub1.anInt1708 * 2135626771);
					}
					@Pc(266) int local266 = local58 + local31 * local183.anInt1638 * 1412374331 / Class136_Sub1.anInt1676;
					@Pc(279) int local279 = local33 * (Class136_Sub1.anInt1677 - local183.anInt1636 * -958626707) / Class136_Sub1.anInt1677 + local66;
					arg0.method19986(local266 - 2, local279 - 2, 4, 4, local245 << 24 | 0xFFFF00);
				}
			}
		}
		Class136_Sub1.aClass232_26.method25847(5);
	}

	@OriginalMember(owner = "client!ta", name = "lk", descriptor = "(Ljava/lang/String;Lclient!yf;I)[I", line = 6545)
	static final int[] method14334(@OriginalArg(0) String arg0, @OriginalArg(1) Class665 arg1) {
		@Pc(1) int[] local1 = null;
		if (arg0.length() > 0 && arg0.charAt(arg0.length() - 1) == 'Y') {
			@Pc(25) int local25 = arg1.anIntArray536[(arg1.anInt5784 -= 308999563) * 2088438307];
			if (local25 > 0) {
				local1 = new int[local25];
				while (local25-- > 0) {
					local1[local25] = arg1.anIntArray536[(arg1.anInt5784 -= 308999563) * 2088438307];
				}
			}
		}
		return local1;
	}

	@OriginalMember(owner = "client!ta", name = "aoo", descriptor = "(Lclient!yf;I)V", line = 12092)
	static final void method14335(@OriginalArg(0) Class665 arg0) {
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub24_1, arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307]);
		Class667.method33150();
		client.aBoolean593 = false;
	}

	@OriginalMember(owner = "client!ta", name = "asf", descriptor = "(Lclient!yf;I)V", line = 12687)
	static final void method14336(@OriginalArg(0) Class665 arg0) {
		@Pc(2) Class145_Sub1 local2 = Class504.method24848();
		if (local2 != null) {
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = local2.anInt2068 * 539448607;
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = local2.anInt2063 * -1395637313;
			arg0.anObjectArray45[(arg0.anInt5781 += 1460193483) * 1485266147 - 1] = local2.aString61;
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = local2.method15085();
			arg0.anObjectArray45[(arg0.anInt5781 += 1460193483) * 1485266147 - 1] = local2.method15087();
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = local2.anInt2059 * 2098404975;
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = local2.anInt2066 * -663639827;
			arg0.anObjectArray45[(arg0.anInt5781 += 1460193483) * 1485266147 - 1] = local2.aString60;
			return;
		}
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = -1;
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = 0;
		arg0.anObjectArray45[(arg0.anInt5781 += 1460193483) * 1485266147 - 1] = "";
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = 0;
		arg0.anObjectArray45[(arg0.anInt5781 += 1460193483) * 1485266147 - 1] = "";
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = 0;
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = 0;
		arg0.anObjectArray45[(arg0.anInt5781 += 1460193483) * 1485266147 - 1] = "";
	}

	@OriginalMember(owner = "client!ta", name = "awh", descriptor = "(Lclient!yf;I)V", line = 13297)
	static final void method14337(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		if (Class284.aClass86_9.method20296()) {
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = Class35_Sub6.aClass77_Sub35_45.aClass143_Sub19_1.method16264(local12);
		} else {
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = 3;
		}
	}

	@OriginalMember(owner = "client!ta", name = "x", descriptor = "([BII)I")
	public abstract int method14338(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException;

	@OriginalMember(owner = "client!ta", name = "l", descriptor = "([BIIB)I")
	public abstract int method14339(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException;

	@OriginalMember(owner = "client!ta", name = "v", descriptor = "(I)I")
	public abstract int method14340() throws IOException;

	@OriginalMember(owner = "client!ta", name = "y", descriptor = "([BIII)V")
	public abstract void method14341(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException;

	@OriginalMember(owner = "client!ta", name = "u", descriptor = "()V")
	public abstract void method14342();

	@OriginalMember(owner = "client!ta", name = "t", descriptor = "(B)V")
	public abstract void method14343();

	@OriginalMember(owner = "client!ta", name = "e", descriptor = "()V")
	public abstract void method14344();

	@OriginalMember(owner = "client!ta", name = "w", descriptor = "(I)V")
	public abstract void method14345();

	@OriginalMember(owner = "client!ta", name = "d", descriptor = "([BII)I")
	public abstract int method14346(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException;

	@OriginalMember(owner = "client!ta", name = "c", descriptor = "(IB)Z")
	public abstract boolean method14347(@OriginalArg(0) int arg0) throws IOException;

	@OriginalMember(owner = "client!ta", name = "r", descriptor = "([BII)V")
	public abstract void method14348(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException;

	@OriginalMember(owner = "client!ta", name = "g", descriptor = "()V")
	public abstract void method14349();

	@OriginalMember(owner = "client!ta", name = "z", descriptor = "()V")
	public abstract void method14350();

	@OriginalMember(owner = "client!ta", name = "j", descriptor = "()V")
	public abstract void method14351();

	@OriginalMember(owner = "client!ta", name = "i", descriptor = "()V")
	public abstract void method14352();

	@OriginalMember(owner = "client!ta", name = "k", descriptor = "()V")
	public abstract void method14353();

	@OriginalMember(owner = "client!ta", name = "s", descriptor = "([BII)I")
	public abstract int method14354(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException;

	@OriginalMember(owner = "client!ta", name = "q", descriptor = "(I)Z")
	public abstract boolean method14355(@OriginalArg(0) int arg0) throws IOException;

	@OriginalMember(owner = "client!ta", name = "b", descriptor = "()I")
	public abstract int method14356() throws IOException;
}
