package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kl")
public abstract class Class124 {

	@OriginalMember(owner = "client!kl", name = "fb", descriptor = "Lclient!py;")
	public static Class497 aClass497_93;

	@OriginalMember(owner = "client!kl", name = "he", descriptor = "Lclient!aoz;")
	public static Class32_Sub21 aClass32_Sub21_7;

	@OriginalMember(owner = "client!kl", name = "e", descriptor = "Lclient!je;")
	final Class123 aClass123_13;

	@OriginalMember(owner = "client!kl", name = "<init>", descriptor = "(Lclient!je;)V", line = 13)
	Class124(@OriginalArg(0) Class123 arg0) {
		this.aClass123_13 = arg0;
	}

	@OriginalMember(owner = "client!kl", name = "b", descriptor = "(Lclient!ase;I)V", line = 879)
	static void method21430(@OriginalArg(0) Class93_Sub41_Sub2 arg0) {
		@Pc(8) boolean local8 = arg0.method22413() == 1;
		if (!local8) {
			return;
		}
		@Pc(18) int local18 = arg0.method22664() << 24;
		@Pc(26) int local26 = local18 | arg0.method22664() << 16;
		@Pc(34) int local34 = local26 | arg0.method22664() << 8;
		@Pc(40) int local40 = local34 | arg0.method22664();
		Class266.aClass306_1.method26817(Class413.aLong272 * 1983505324986122333L, local40);
	}

	@OriginalMember(owner = "client!kl", name = "yz", descriptor = "(Lclient!yf;B)V", line = 9296)
	static final void method21425(@OriginalArg(0) Class681 arg0) {
		arg0.anInt5891 -= -1915563430;
		@Pc(13) int local13 = arg0.anIntArray519[arg0.anInt5891 * -1497248091];
		@Pc(23) int local23 = arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 1];
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = Class493.method30014(local13, local23, true, false);
	}

	@OriginalMember(owner = "client!kl", name = "adj", descriptor = "(Lclient!yf;I)V", line = 10173)
	static final void method21426(@OriginalArg(0) Class681 arg0) {
		arg0.anInt5891 -= -1915563430;
		@Pc(13) int local13 = arg0.anIntArray519[arg0.anInt5891 * -1497248091];
		@Pc(23) int local23 = arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 1];
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = client.aClass531ArrayArray1[local23][local13].anInt5236 * -705055355;
	}

	@OriginalMember(owner = "client!kl", name = "anj", descriptor = "(Lclient!yf;I)V", line = 12325)
	static final void method21427(@OriginalArg(0) Class681 arg0) {
		@Pc(13) Class93_Sub30 local13 = (Class93_Sub30) arg0.anObjectArray45[(arg0.anInt5888 -= 957530791) * 587908375];
		if (Class65.aClass123_Sub1_2.method8986() != Class338.aClass338_6) {
			throw new RuntimeException();
		}
		@Pc(27) Class25_Sub2 local27 = (Class25_Sub2) Class65.aClass123_Sub1_2.method9040();
		local27.method16018(local13);
		client.aBoolean619 = true;
	}

	@OriginalMember(owner = "client!kl", name = "aqr", descriptor = "(Lclient!yf;I)V", line = 12835)
	static final void method21428(@OriginalArg(0) Class681 arg0) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = 0;
	}

	@OriginalMember(owner = "client!kl", name = "bec", descriptor = "(Lclient!yf;I)V", line = 14843)
	static final void method21429(@OriginalArg(0) Class681 arg0) {
		arg0.anInt5891 -= -725861497;
		@Pc(13) int local13 = arg0.anIntArray519[arg0.anInt5891 * -1497248091];
		@Pc(23) int local23 = arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 1];
		@Pc(33) int local33 = arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 2];
		@Pc(43) Integer local43 = (Integer) client.aClass270_1.method26278(local13).method26387(local23, local33);
		if (local43 == null) {
			arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = 0;
		} else {
			arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = local43;
		}
	}

	@OriginalMember(owner = "client!kl", name = "i", descriptor = "(Lclient!ju;II)V")
	public abstract void method21400(@OriginalArg(0) Class368 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!kl", name = "n", descriptor = "(I)Z")
	public abstract boolean method21401();

	@OriginalMember(owner = "client!kl", name = "m", descriptor = "(B)Lclient!ox;")
	public abstract Class472 method21402();

	@OriginalMember(owner = "client!kl", name = "d", descriptor = "()[D")
	public abstract double[] method21403();

	@OriginalMember(owner = "client!kl", name = "f", descriptor = "(B)Lclient!akt;")
	public abstract Class93_Sub30 method21404();

	@OriginalMember(owner = "client!kl", name = "w", descriptor = "(I)F")
	public abstract float method21405();

	@OriginalMember(owner = "client!kl", name = "l", descriptor = "(Lclient!ju;IIB)V")
	public abstract void method21406(@OriginalArg(0) Class368 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!kl", name = "u", descriptor = "(Lclient!alw;I)V")
	public abstract void method21407(@OriginalArg(0) Class93_Sub41 arg0);

	@OriginalMember(owner = "client!kl", name = "z", descriptor = "()Z")
	public abstract boolean method21408();

	@OriginalMember(owner = "client!kl", name = "p", descriptor = "()Z")
	public abstract boolean method21409();

	@OriginalMember(owner = "client!kl", name = "o", descriptor = "()Lclient!akt;")
	public abstract Class93_Sub30 method21410();

	@OriginalMember(owner = "client!kl", name = "c", descriptor = "()Lclient!akt;")
	public abstract Class93_Sub30 method21411();

	@OriginalMember(owner = "client!kl", name = "v", descriptor = "()Lclient!akt;")
	public abstract Class93_Sub30 method21412();

	@OriginalMember(owner = "client!kl", name = "k", descriptor = "(I)[D")
	public abstract double[] method21413();

	@OriginalMember(owner = "client!kl", name = "h", descriptor = "(F[[[ILclient!qx;II)V")
	public abstract void method21414(@OriginalArg(0) float arg0, @OriginalArg(1) int[][][] arg1, @OriginalArg(2) Class520 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!kl", name = "s", descriptor = "()F")
	public abstract float method21415();

	@OriginalMember(owner = "client!kl", name = "y", descriptor = "()F")
	public abstract float method21416();

	@OriginalMember(owner = "client!kl", name = "q", descriptor = "(Lclient!alw;)V")
	public abstract void method21417(@OriginalArg(0) Class93_Sub41 arg0);

	@OriginalMember(owner = "client!kl", name = "x", descriptor = "(Lclient!alw;)V")
	public abstract void method21418(@OriginalArg(0) Class93_Sub41 arg0);

	@OriginalMember(owner = "client!kl", name = "b", descriptor = "(F[[[ILclient!qx;II)V")
	public abstract void method21419(@OriginalArg(0) float arg0, @OriginalArg(1) int[][][] arg1, @OriginalArg(2) Class520 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!kl", name = "r", descriptor = "()Lclient!akt;")
	public abstract Class93_Sub30 method21420();

	@OriginalMember(owner = "client!kl", name = "e", descriptor = "(F[[[ILclient!qx;IIB)V")
	public abstract void method21421(@OriginalArg(0) float arg0, @OriginalArg(1) int[][][] arg1, @OriginalArg(2) Class520 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(F[[[ILclient!qx;II)V")
	public abstract void method21422(@OriginalArg(0) float arg0, @OriginalArg(1) int[][][] arg1, @OriginalArg(2) Class520 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!kl", name = "g", descriptor = "()Lclient!ox;")
	public abstract Class472 method21423();

	@OriginalMember(owner = "client!kl", name = "j", descriptor = "(Lclient!ju;II)V")
	public abstract void method21424(@OriginalArg(0) Class368 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);
}
