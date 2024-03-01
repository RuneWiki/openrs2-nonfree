package com.jagex;

import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!xv")
public class Class588 {

	@OriginalMember(owner = "client!xv", name = "<init>", descriptor = "()V", line = 8)
	Class588() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!xv", name = "p", descriptor = "(Ljava/applet/Applet;Ljava/lang/String;I)V", line = 13)
	public static void method33289(@OriginalArg(0) Applet arg0, @OriginalArg(1) String arg1) throws Throwable {
		JSObject.getWindow(arg0).eval(arg1);
	}

	@OriginalMember(owner = "client!xv", name = "h", descriptor = "(Ljava/applet/Applet;Ljava/lang/String;)V", line = 13)
	public static void method33292(@OriginalArg(0) Applet arg0, @OriginalArg(1) String arg1) throws Throwable {
		JSObject.getWindow(arg0).eval(arg1);
	}

	@OriginalMember(owner = "client!xv", name = "l", descriptor = "(Ljava/applet/Applet;Ljava/lang/String;)V", line = 13)
	public static void method33296(@OriginalArg(0) Applet arg0, @OriginalArg(1) String arg1) throws Throwable {
		JSObject.getWindow(arg0).eval(arg1);
	}

	@OriginalMember(owner = "client!xv", name = "x", descriptor = "(Ljava/applet/Applet;Ljava/lang/String;)Ljava/lang/Object;", line = 17)
	public static Object method33288(@OriginalArg(0) Applet arg0, @OriginalArg(1) String arg1) throws Throwable {
		return JSObject.getWindow(arg0).call(arg1, (Object[]) null);
	}

	@OriginalMember(owner = "client!xv", name = "a", descriptor = "(Ljava/applet/Applet;Ljava/lang/String;B)Ljava/lang/Object;", line = 17)
	public static Object method33291(@OriginalArg(0) Applet arg0, @OriginalArg(1) String arg1) throws Throwable {
		return JSObject.getWindow(arg0).call(arg1, (Object[]) null);
	}

	@OriginalMember(owner = "client!xv", name = "s", descriptor = "(Ljava/applet/Applet;Ljava/lang/String;)Ljava/lang/Object;", line = 17)
	public static Object method33294(@OriginalArg(0) Applet arg0, @OriginalArg(1) String arg1) throws Throwable {
		return JSObject.getWindow(arg0).call(arg1, (Object[]) null);
	}

	@OriginalMember(owner = "client!xv", name = "u", descriptor = "(Ljava/applet/Applet;Ljava/lang/String;)Ljava/lang/Object;", line = 17)
	public static Object method33295(@OriginalArg(0) Applet arg0, @OriginalArg(1) String arg1) throws Throwable {
		return JSObject.getWindow(arg0).call(arg1, (Object[]) null);
	}

	@OriginalMember(owner = "client!xv", name = "g", descriptor = "(Ljava/applet/Applet;Ljava/lang/String;[Ljava/lang/Object;I)Ljava/lang/Object;", line = 21)
	public static Object method33290(@OriginalArg(0) Applet arg0, @OriginalArg(1) String arg1, @OriginalArg(2) Object[] arg2) throws Throwable {
		return JSObject.getWindow(arg0).call(arg1, arg2);
	}

	@OriginalMember(owner = "client!xv", name = "y", descriptor = "(Ljava/applet/Applet;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", line = 21)
	public static Object method33293(@OriginalArg(0) Applet arg0, @OriginalArg(1) String arg1, @OriginalArg(2) Object[] arg2) throws Throwable {
		return JSObject.getWindow(arg0).call(arg1, arg2);
	}
}
