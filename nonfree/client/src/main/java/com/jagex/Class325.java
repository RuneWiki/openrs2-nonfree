package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mm")
public class Class325 implements Interface61 {

	@OriginalMember(owner = "client!mm", name = "g", descriptor = "Lclient!aml;")
	static Class3_Sub1_Sub7 aClass3_Sub1_Sub7_4;

	@OriginalMember(owner = "client!mm", name = "df", descriptor = "Lclient!di;")
	public static Interface11 anInterface11_9;

	@OriginalMember(owner = "client!mm", name = "x", descriptor = "I")
	static int anInt4566;

	@OriginalMember(owner = "client!mm", name = "n", descriptor = "Lclient!yx;")
	static Class611 aClass611_9;

	@OriginalMember(owner = "client!mm", name = "p", descriptor = "Lclient!ny;")
	final Class359 aClass359_59;

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "Ljava/lang/String;")
	final String aString205;

	@OriginalMember(owner = "client!mm", name = "<init>", descriptor = "(Lclient!ny;Ljava/lang/String;)V", line = 11)
	Class325(@OriginalArg(0) Class359 arg0, @OriginalArg(1) String arg1) {
		this.aClass359_59 = arg0;
		this.aString205 = arg1;
	}

	@OriginalMember(owner = "client!mm", name = "p", descriptor = "(I)I", line = 17)
	@Override
	public int method26162() {
		return this.aClass359_59.method26694(this.aString205) ? 100 : this.aClass359_59.method26689(this.aString205);
	}

	@OriginalMember(owner = "client!mm", name = "g", descriptor = "()I", line = 17)
	@Override
	public int method26158() {
		return this.aClass359_59.method26694(this.aString205) ? 100 : this.aClass359_59.method26689(this.aString205);
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(S)Lclient!yn;", line = 22)
	@Override
	public Class604 method26159() {
		return Class604.aClass604_1;
	}

	@OriginalMember(owner = "client!mm", name = "l", descriptor = "()Lclient!yn;", line = 22)
	@Override
	public Class604 method26161() {
		return Class604.aClass604_1;
	}

	@OriginalMember(owner = "client!mm", name = "h", descriptor = "()Lclient!yn;", line = 22)
	@Override
	public Class604 method26160() {
		return Class604.aClass604_1;
	}

	@OriginalMember(owner = "client!mm", name = "h", descriptor = "(Ljava/lang/String;I)Ljava/lang/Class;", line = 214)
	static Class method26005(@OriginalArg(0) String arg0) throws ClassNotFoundException {
		if (arg0.equals("B")) {
			return Byte.TYPE;
		} else if (arg0.equals("I")) {
			return Integer.TYPE;
		} else if (arg0.equals("S")) {
			return Short.TYPE;
		} else if (arg0.equals("J")) {
			return Long.TYPE;
		} else if (arg0.equals("Z")) {
			return Boolean.TYPE;
		} else if (arg0.equals("F")) {
			return Float.TYPE;
		} else if (arg0.equals("D")) {
			return Double.TYPE;
		} else if (arg0.equals("C")) {
			return Character.TYPE;
		} else if (arg0.equals("void")) {
			return Void.TYPE;
		} else {
			return Class.forName(arg0);
		}
	}

	@OriginalMember(owner = "client!mm", name = "aef", descriptor = "(Lclient!vs;I)V", line = 9632)
	static final void method26006(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		arg0.anObjectArray42[(arg0.anInt5315 += 790013775) * 996806575 - 1] = Class13_Sub23.aClass343_1.method26476(local12).aString115;
	}
}
