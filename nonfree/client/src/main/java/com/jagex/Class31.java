package com.jagex;

import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!abf")
public class Class31 {

	@OriginalMember(owner = "client!abf", name = "<init>", descriptor = "()V", line = 8)
	Class31() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!abf", name = "p", descriptor = "(Ljava/applet/Applet;Ljava/lang/String;B)V", line = 13)
	public static void method516(@OriginalArg(0) Applet arg0, @OriginalArg(1) String arg1) throws Throwable {
		JSObject.getWindow(arg0).eval(arg1);
	}

	@OriginalMember(owner = "client!abf", name = "y", descriptor = "(Ljava/applet/Applet;Ljava/lang/String;)V", line = 13)
	public static void method517(@OriginalArg(0) Applet arg0, @OriginalArg(1) String arg1) throws Throwable {
		JSObject.getWindow(arg0).eval(arg1);
	}

	@OriginalMember(owner = "client!abf", name = "l", descriptor = "(Ljava/applet/Applet;Ljava/lang/String;)V", line = 13)
	public static void method518(@OriginalArg(0) Applet arg0, @OriginalArg(1) String arg1) throws Throwable {
		JSObject.getWindow(arg0).eval(arg1);
	}

	@OriginalMember(owner = "client!abf", name = "c", descriptor = "(Ljava/applet/Applet;Ljava/lang/String;I)Ljava/lang/Object;", line = 17)
	public static Object method519(@OriginalArg(0) Applet arg0, @OriginalArg(1) String arg1) throws Throwable {
		return JSObject.getWindow(arg0).call(arg1, (Object[]) null);
	}

	@OriginalMember(owner = "client!abf", name = "t", descriptor = "(Ljava/applet/Applet;Ljava/lang/String;)Ljava/lang/Object;", line = 17)
	public static Object method520(@OriginalArg(0) Applet arg0, @OriginalArg(1) String arg1) throws Throwable {
		return JSObject.getWindow(arg0).call(arg1, (Object[]) null);
	}

	@OriginalMember(owner = "client!abf", name = "w", descriptor = "(Ljava/applet/Applet;Ljava/lang/String;)Ljava/lang/Object;", line = 17)
	public static Object method521(@OriginalArg(0) Applet arg0, @OriginalArg(1) String arg1) throws Throwable {
		return JSObject.getWindow(arg0).call(arg1, (Object[]) null);
	}

	@OriginalMember(owner = "client!abf", name = "v", descriptor = "(Ljava/applet/Applet;Ljava/lang/String;[Ljava/lang/Object;I)Ljava/lang/Object;", line = 21)
	public static Object method522(@OriginalArg(0) Applet arg0, @OriginalArg(1) String arg1, @OriginalArg(2) Object[] arg2) throws Throwable {
		return JSObject.getWindow(arg0).call(arg1, arg2);
	}

	@OriginalMember(owner = "client!abf", name = "x", descriptor = "(Ljava/applet/Applet;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", line = 21)
	public static Object method523(@OriginalArg(0) Applet arg0, @OriginalArg(1) String arg1, @OriginalArg(2) Object[] arg2) throws Throwable {
		return JSObject.getWindow(arg0).call(arg1, arg2);
	}

	@OriginalMember(owner = "client!abf", name = "q", descriptor = "(Ljava/applet/Applet;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", line = 21)
	public static Object method524(@OriginalArg(0) Applet arg0, @OriginalArg(1) String arg1, @OriginalArg(2) Object[] arg2) throws Throwable {
		return JSObject.getWindow(arg0).call(arg1, arg2);
	}

	@OriginalMember(owner = "client!abf", name = "d", descriptor = "(Ljava/applet/Applet;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", line = 21)
	public static Object method525(@OriginalArg(0) Applet arg0, @OriginalArg(1) String arg1, @OriginalArg(2) Object[] arg2) throws Throwable {
		return JSObject.getWindow(arg0).call(arg1, arg2);
	}
}
