package com.jagex;

import java.applet.Applet;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aol")
public class Class32_Sub10 extends Class32 {

	@OriginalMember(owner = "client!aol", name = "i", descriptor = "Ljava/applet/Applet;")
	public static Applet anApplet2;

	@OriginalMember(owner = "client!aol", name = "e", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Z", line = 11)
	public static final boolean method17005(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3) {
		if (arg0 == null || arg2 == null) {
			return false;
		} else if (arg0.startsWith("#") || arg2.startsWith("#")) {
			return arg0.equals(arg2);
		} else {
			return arg1.equals(arg3);
		}
	}

	@OriginalMember(owner = "client!aol", name = "<init>", descriptor = "(Lclient!zd;Lclient!zt;Lclient!py;Lclient!py;)V", line = 13)
	public Class32_Sub10(@OriginalArg(0) Class702 arg0, @OriginalArg(1) Class717 arg1, @OriginalArg(2) Class497 arg2, @OriginalArg(3) Class497 arg3) {
		super(arg0, arg1, arg2, Class667.aClass667_97, 64, new Class156_Sub1(arg3));
	}

	@OriginalMember(owner = "client!aol", name = "q", descriptor = "()V", line = 17)
	@Override
	public void method17813() {
		super.method17807();
		((Class156) this.anInterface4_25).method14189();
	}

	@OriginalMember(owner = "client!aol", name = "y", descriptor = "()V", line = 17)
	@Override
	public void method17812() {
		super.method17807();
		((Class156) this.anInterface4_25).method14189();
	}

	@OriginalMember(owner = "client!aol", name = "x", descriptor = "()V", line = 17)
	@Override
	public void method17814() {
		super.method17807();
		((Class156) this.anInterface4_25).method14189();
	}

	@OriginalMember(owner = "client!aol", name = "b", descriptor = "()V", line = 17)
	@Override
	public void method17806() {
		super.method17807();
		((Class156) this.anInterface4_25).method14189();
	}

	@OriginalMember(owner = "client!aol", name = "h", descriptor = "()V", line = 17)
	@Override
	public void method17815() {
		super.method17807();
		((Class156) this.anInterface4_25).method14189();
	}

	@OriginalMember(owner = "client!aol", name = "r", descriptor = "(I)V", line = 17)
	@Override
	public void method17807() {
		super.method17807();
		((Class156) this.anInterface4_25).method14189();
	}

	@OriginalMember(owner = "client!aol", name = "s", descriptor = "()V", line = 17)
	@Override
	public void method17810() {
		super.method17807();
		((Class156) this.anInterface4_25).method14189();
	}

	@OriginalMember(owner = "client!aol", name = "v", descriptor = "(II)V", line = 22)
	@Override
	public void method17808(@OriginalArg(0) int arg0) {
		super.method17808(arg0);
		((Class156) this.anInterface4_25).method14195(arg0);
	}

	@OriginalMember(owner = "client!aol", name = "g", descriptor = "(I)V", line = 22)
	@Override
	public void method17817(@OriginalArg(0) int arg0) {
		super.method17808(arg0);
		((Class156) this.anInterface4_25).method14195(arg0);
	}

	@OriginalMember(owner = "client!aol", name = "a", descriptor = "(I)V", line = 22)
	@Override
	public void method17825(@OriginalArg(0) int arg0) {
		super.method17808(arg0);
		((Class156) this.anInterface4_25).method14195(arg0);
	}

	@OriginalMember(owner = "client!aol", name = "j", descriptor = "(I)V", line = 22)
	@Override
	public void method17819(@OriginalArg(0) int arg0) {
		super.method17808(arg0);
		((Class156) this.anInterface4_25).method14195(arg0);
	}

	@OriginalMember(owner = "client!aol", name = "i", descriptor = "(I)V", line = 22)
	@Override
	public void method17818(@OriginalArg(0) int arg0) {
		super.method17808(arg0);
		((Class156) this.anInterface4_25).method14195(arg0);
	}

	@OriginalMember(owner = "client!aol", name = "t", descriptor = "()V", line = 27)
	@Override
	public void method17820() {
		super.method17811();
		((Class156) this.anInterface4_25).method14191();
	}

	@OriginalMember(owner = "client!aol", name = "o", descriptor = "(I)V", line = 27)
	@Override
	public void method17811() {
		super.method17811();
		((Class156) this.anInterface4_25).method14191();
	}
}
