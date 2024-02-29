package com.jagex;

import jaggl.OpenGL;
import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rc")
public class Class506 {

	@OriginalMember(owner = "client!rc", name = "<init>", descriptor = "()V", line = 14)
	Class506() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!rc", name = "p", descriptor = "(Ljava/awt/Canvas;Lclient!dp;Lclient!eo;Lclient!md;Lclient!mp;Lclient!mn;Lclient!pw;I)Lclient!dx;", line = 20)
	public static Class86 method30262(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Class209 arg1, @OriginalArg(2) Interface24 arg2, @OriginalArg(3) Interface44 arg3, @OriginalArg(4) Interface47 arg4, @OriginalArg(5) Interface45 arg5, @OriginalArg(6) Class478 arg6, @OriginalArg(7) int arg7) {
		try {
			Class86_Sub1.method20411();
			Class155.method23614().method30921("jaggl");
			Class487.method29986(arg0);
			@Pc(12) OpenGL local12 = new OpenGL();
			@Pc(22) long local22 = local12.init(arg0, 8, 8, 8, 24, 0, arg7);
			if (local22 == 0L) {
				throw new RuntimeException("");
			}
			@Pc(45) Class86_Sub1_Sub2 local45 = new Class86_Sub1_Sub2(local12, arg0, local22, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
			local45.method20412();
			return local45;
		} catch (@Pc(53) Throwable local53) {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!rc", name = "c", descriptor = "(Ljava/awt/Canvas;Lclient!dp;Lclient!eo;Lclient!md;Lclient!mp;Lclient!mn;Lclient!pw;I)Lclient!dx;", line = 20)
	public static Class86 method30263(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Class209 arg1, @OriginalArg(2) Interface24 arg2, @OriginalArg(3) Interface44 arg3, @OriginalArg(4) Interface47 arg4, @OriginalArg(5) Interface45 arg5, @OriginalArg(6) Class478 arg6, @OriginalArg(7) int arg7) {
		try {
			Class86_Sub1.method20411();
			Class155.method23614().method30921("jaggl");
			Class487.method29986(arg0);
			@Pc(12) OpenGL local12 = new OpenGL();
			@Pc(22) long local22 = local12.init(arg0, 8, 8, 8, 24, 0, arg7);
			if (local22 == 0L) {
				throw new RuntimeException("");
			}
			@Pc(45) Class86_Sub1_Sub2 local45 = new Class86_Sub1_Sub2(local12, arg0, local22, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
			local45.method20412();
			return local45;
		} catch (@Pc(53) Throwable local53) {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!rc", name = "v", descriptor = "(Ljava/awt/Canvas;Lclient!dp;Lclient!eo;Lclient!md;Lclient!mp;Lclient!mn;Lclient!pw;I)Lclient!dx;", line = 20)
	public static Class86 method30264(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Class209 arg1, @OriginalArg(2) Interface24 arg2, @OriginalArg(3) Interface44 arg3, @OriginalArg(4) Interface47 arg4, @OriginalArg(5) Interface45 arg5, @OriginalArg(6) Class478 arg6, @OriginalArg(7) int arg7) {
		try {
			Class86_Sub1.method20411();
			Class155.method23614().method30921("jaggl");
			Class487.method29986(arg0);
			@Pc(12) OpenGL local12 = new OpenGL();
			@Pc(22) long local22 = local12.init(arg0, 8, 8, 8, 24, 0, arg7);
			if (local22 == 0L) {
				throw new RuntimeException("");
			}
			@Pc(45) Class86_Sub1_Sub2 local45 = new Class86_Sub1_Sub2(local12, arg0, local22, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
			local45.method20412();
			return local45;
		} catch (@Pc(53) Throwable local53) {
			throw new RuntimeException("");
		}
	}
}
