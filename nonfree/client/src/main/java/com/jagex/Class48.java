package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ju")
public abstract class Class48 {

	@OriginalMember(owner = "client!ju", name = "ll", descriptor = "I")
	public static int anInt1088;

	@OriginalMember(owner = "client!ju", name = "<init>", descriptor = "()V", line = 9)
	Class48() {
	}

	@OriginalMember(owner = "client!ju", name = "p", descriptor = "(I)[Lclient!kp;", line = 19)
	public static Class284[] method9534() {
		return new Class284[] { Class284.aClass284_2, Class284.aClass284_3, Class284.aClass284_4, Class284.aClass284_5, Class284.aClass284_1, Class284.aClass284_6 };
	}

	@OriginalMember(owner = "client!ju", name = "s", descriptor = "(II)V", line = 316)
	public static void method9536(@OriginalArg(0) int arg0) {
		if (-1 != arg0 && !Class16.aBooleanArray3[arg0]) {
			Class504.aClass359_93.method26684(arg0);
			Class178.aClass186Array1[arg0] = null;
		}
	}

	@OriginalMember(owner = "client!ju", name = "al", descriptor = "(Lclient!vs;I)V", line = 4065)
	static final void method9535(@OriginalArg(0) Class536 arg0) {
		arg0.anInt5315 -= 790013775;
	}

	@OriginalMember(owner = "client!ju", name = "x", descriptor = "(Lclient!nu;B)Lclient!on;")
	public abstract Class371 method9510(@OriginalArg(0) Class357 arg0);

	@OriginalMember(owner = "client!ju", name = "p", descriptor = "(B)V")
	public abstract void method9511();

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(IILclient!kl;Lclient!kx;IFB)Ljava/lang/Object;")
	public abstract Object method9512(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class280 arg2, @OriginalArg(3) Class289 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!ju", name = "r", descriptor = "(Ljava/lang/Object;)V")
	public abstract void method9513(@OriginalArg(0) Object arg0);

	@OriginalMember(owner = "client!ju", name = "q", descriptor = "(Lclient!nu;)Lclient!on;")
	public abstract Class371 method9514(@OriginalArg(0) Class357 arg0);

	@OriginalMember(owner = "client!ju", name = "h", descriptor = "(Ljava/lang/Object;I)I")
	public abstract int method9515(@OriginalArg(0) Object arg0);

	@OriginalMember(owner = "client!ju", name = "g", descriptor = "(Ljava/lang/Object;S)V")
	public abstract void method9516(@OriginalArg(0) Object arg0);

	@OriginalMember(owner = "client!ju", name = "j", descriptor = "(Ljava/lang/Object;)I")
	public abstract int method9517(@OriginalArg(0) Object arg0);

	@OriginalMember(owner = "client!ju", name = "u", descriptor = "(I)Lclient!js;")
	public abstract Class264 method9518();

	@OriginalMember(owner = "client!ju", name = "y", descriptor = "(I)V")
	public abstract void method9519();

	@OriginalMember(owner = "client!ju", name = "o", descriptor = "()V")
	public abstract void method9520();

	@OriginalMember(owner = "client!ju", name = "c", descriptor = "()V")
	public abstract void method9521();

	@OriginalMember(owner = "client!ju", name = "z", descriptor = "()V")
	public abstract void method9522();

	@OriginalMember(owner = "client!ju", name = "s", descriptor = "(Lclient!kf;I)Ljava/lang/Object;")
	abstract Object method9523(@OriginalArg(0) Class275 arg0);

	@OriginalMember(owner = "client!ju", name = "n", descriptor = "(IILclient!kl;Lclient!kx;IF)Ljava/lang/Object;")
	public abstract Object method9524(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class280 arg2, @OriginalArg(3) Class289 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!ju", name = "e", descriptor = "(Ljava/lang/Object;)V")
	public abstract void method9525(@OriginalArg(0) Object arg0);

	@OriginalMember(owner = "client!ju", name = "l", descriptor = "(Ljava/lang/Object;[BIIB)V")
	public abstract void method9526(@OriginalArg(0) Object arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ju", name = "d", descriptor = "(Ljava/lang/Object;[BII)V")
	public abstract void method9527(@OriginalArg(0) Object arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ju", name = "b", descriptor = "()V")
	public abstract void method9528();

	@OriginalMember(owner = "client!ju", name = "m", descriptor = "(Lclient!nu;)Lclient!on;")
	public abstract Class371 method9529(@OriginalArg(0) Class357 arg0);

	@OriginalMember(owner = "client!ju", name = "v", descriptor = "(Lclient!nu;)Lclient!on;")
	public abstract Class371 method9530(@OriginalArg(0) Class357 arg0);

	@OriginalMember(owner = "client!ju", name = "t", descriptor = "()Lclient!js;")
	public abstract Class264 method9531();

	@OriginalMember(owner = "client!ju", name = "w", descriptor = "()Lclient!js;")
	public abstract Class264 method9532();

	@OriginalMember(owner = "client!ju", name = "i", descriptor = "(Lclient!kf;)Ljava/lang/Object;")
	abstract Object method9533(@OriginalArg(0) Class275 arg0);
}
