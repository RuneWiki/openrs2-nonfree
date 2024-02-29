package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lj")
public abstract class Class117 {

	@OriginalMember(owner = "client!lj", name = "k", descriptor = "Ljava/lang/String;")
	static String aString44;

	@OriginalMember(owner = "client!lj", name = "<init>", descriptor = "()V", line = 9)
	Class117() {
	}

	@OriginalMember(owner = "client!lj", name = "y", descriptor = "(Z[BI)V", line = 76)
	public static void method10869(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte[] arg1) {
		if (Class77_Sub8.aClass77_Sub39_9 == null) {
			Class77_Sub8.aClass77_Sub39_9 = new Class77_Sub39(20000);
		}
		Class77_Sub8.aClass77_Sub39_9.method22452(arg1, 0, arg1.length);
		if (!arg0) {
			return;
		}
		Class7.method66(Class77_Sub8.aClass77_Sub39_9.aByteArray53);
		Class8.aClass145_Sub1Array1 = new Class145_Sub1[Class544.anInt5212 * 1699576543];
		@Pc(27) int local27 = 0;
		for (@Pc(31) int local31 = Class616.anInt5593 * 206492647; local31 <= Class616.anInt5594 * -1664594981; local31++) {
			@Pc(40) Class145_Sub1 local40 = Class527.method30680(local31);
			if (local40 != null) {
				Class8.aClass145_Sub1Array1[local27++] = local40;
			}
		}
		Class8.aBoolean3 = false;
		Class8.aLong2 = Class280.method26667() * -7774518681047063557L;
		Class77_Sub8.aClass77_Sub39_9 = null;
	}

	@OriginalMember(owner = "client!lj", name = "bz", descriptor = "(Lclient!yf;I)V", line = 4714)
	static final void method10870(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		@Pc(16) Class277 local16 = Class155.method23628(local12);
		Class355.method27962(local16, arg0);
	}

	@OriginalMember(owner = "client!lj", name = "gh", descriptor = "(Lclient!yf;I)V", line = 5768)
	static final void method10871(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		@Pc(16) Class277 local16 = Class155.method23628(local12);
		@Pc(22) Class273 local22 = Class35_Sub11.aClass273Array1[local12 >> 16];
		Class77_Sub19.method13488(local16, local22, false, 2, arg0);
	}

	@OriginalMember(owner = "client!lj", name = "c", descriptor = "(IILclient!ma;Lclient!mf;IFI)Ljava/lang/Object;")
	public abstract Object method10872(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class393 arg2, @OriginalArg(3) Class397 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!lj", name = "z", descriptor = "(Ljava/lang/Object;)I")
	public abstract int method10873(@OriginalArg(0) Object arg0);

	@OriginalMember(owner = "client!lj", name = "ao", descriptor = "()Lclient!ll;")
	public abstract Class379 method10874();

	@OriginalMember(owner = "client!lj", name = "t", descriptor = "(Lclient!mh;I)Ljava/lang/Object;")
	abstract Object method10875(@OriginalArg(0) Class399 arg0);

	@OriginalMember(owner = "client!lj", name = "l", descriptor = "(Ljava/lang/Object;[BIIB)V")
	public abstract void method10876(@OriginalArg(0) Object arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!lj", name = "y", descriptor = "(Ljava/lang/Object;I)I")
	public abstract int method10877(@OriginalArg(0) Object arg0);

	@OriginalMember(owner = "client!lj", name = "w", descriptor = "(Lclient!qy;I)Lclient!qe;")
	public abstract Class485 method10878(@OriginalArg(0) Class501 arg0);

	@OriginalMember(owner = "client!lj", name = "p", descriptor = "(I)V")
	public abstract void method10879();

	@OriginalMember(owner = "client!lj", name = "q", descriptor = "(B)Lclient!ll;")
	public abstract Class379 method10880();

	@OriginalMember(owner = "client!lj", name = "x", descriptor = "(I)V")
	public abstract void method10881();

	@OriginalMember(owner = "client!lj", name = "i", descriptor = "(IILclient!ma;Lclient!mf;IF)Ljava/lang/Object;")
	public abstract Object method10882(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class393 arg2, @OriginalArg(3) Class397 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!lj", name = "m", descriptor = "(Lclient!mh;)Ljava/lang/Object;")
	abstract Object method10883(@OriginalArg(0) Class399 arg0);

	@OriginalMember(owner = "client!lj", name = "v", descriptor = "(Ljava/lang/Object;I)V")
	public abstract void method10884(@OriginalArg(0) Object arg0);

	@OriginalMember(owner = "client!lj", name = "d", descriptor = "()V")
	public abstract void method10885();

	@OriginalMember(owner = "client!lj", name = "j", descriptor = "(IILclient!ma;Lclient!mf;IF)Ljava/lang/Object;")
	public abstract Object method10886(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class393 arg2, @OriginalArg(3) Class397 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!lj", name = "n", descriptor = "(Lclient!qy;)Lclient!qe;")
	public abstract Class485 method10887(@OriginalArg(0) Class501 arg0);

	@OriginalMember(owner = "client!lj", name = "k", descriptor = "(IILclient!ma;Lclient!mf;IF)Ljava/lang/Object;")
	public abstract Object method10888(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class393 arg2, @OriginalArg(3) Class397 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!lj", name = "u", descriptor = "(Ljava/lang/Object;)V")
	public abstract void method10889(@OriginalArg(0) Object arg0);

	@OriginalMember(owner = "client!lj", name = "e", descriptor = "(Ljava/lang/Object;[BII)V")
	public abstract void method10890(@OriginalArg(0) Object arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!lj", name = "f", descriptor = "(Ljava/lang/Object;[BII)V")
	public abstract void method10891(@OriginalArg(0) Object arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!lj", name = "o", descriptor = "(Lclient!qy;)Lclient!qe;")
	public abstract Class485 method10892(@OriginalArg(0) Class501 arg0);

	@OriginalMember(owner = "client!lj", name = "b", descriptor = "(Lclient!qy;)Lclient!qe;")
	public abstract Class485 method10893(@OriginalArg(0) Class501 arg0);

	@OriginalMember(owner = "client!lj", name = "r", descriptor = "(Ljava/lang/Object;)I")
	public abstract int method10894(@OriginalArg(0) Object arg0);

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(Lclient!qy;)Lclient!qe;")
	public abstract Class485 method10895(@OriginalArg(0) Class501 arg0);

	@OriginalMember(owner = "client!lj", name = "g", descriptor = "(Ljava/lang/Object;)I")
	public abstract int method10896(@OriginalArg(0) Object arg0);

	@OriginalMember(owner = "client!lj", name = "h", descriptor = "(Lclient!mh;)Ljava/lang/Object;")
	abstract Object method10897(@OriginalArg(0) Class399 arg0);

	@OriginalMember(owner = "client!lj", name = "aj", descriptor = "()V")
	public abstract void method10898();

	@OriginalMember(owner = "client!lj", name = "ai", descriptor = "()V")
	public abstract void method10899();

	@OriginalMember(owner = "client!lj", name = "ag", descriptor = "()V")
	public abstract void method10900();

	@OriginalMember(owner = "client!lj", name = "al", descriptor = "()V")
	public abstract void method10901();

	@OriginalMember(owner = "client!lj", name = "s", descriptor = "()V")
	public abstract void method10902();
}
