package com.jagex;

import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bw")
public class Class181 {

	@OriginalMember(owner = "client!bw", name = "p", descriptor = "I")
	static final int anInt3314 = 35633;

	@OriginalMember(owner = "client!bw", name = "c", descriptor = "I")
	static final int anInt3316 = 35632;

	@OriginalMember(owner = "client!bw", name = "v", descriptor = "[I")
	static final int[] anIntArray312 = new int[2];

	@OriginalMember(owner = "client!bw", name = "l", descriptor = "Lclient!aeq;")
	final Class86_Sub3 aClass86_Sub3_41;

	@OriginalMember(owner = "client!bw", name = "y", descriptor = "I")
	final int anInt3315;

	@OriginalMember(owner = "client!bw", name = "p", descriptor = "(Lclient!aeq;ILjava/lang/String;)Lclient!bw;", line = 14)
	static Class181 method24564(@OriginalArg(0) Class86_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2) {
		@Pc(2) int local2 = OpenGL.glCreateShader(arg1);
		OpenGL.glShaderSource(local2, arg2);
		OpenGL.glCompileShader(local2);
		OpenGL.glGetShaderiv(local2, 35713, anIntArray312, 0);
		if (anIntArray312[0] == 0) {
			@Pc(18) boolean local18 = false;
			if (anIntArray312[0] == 0) {
				local18 = true;
				System.out.println("");
			}
			OpenGL.glGetShaderiv(local2, 35716, anIntArray312, 1);
			if (anIntArray312[1] > 1) {
				@Pc(42) byte[] local42 = new byte[anIntArray312[1]];
				OpenGL.glGetShaderInfoLog(local2, anIntArray312[1], anIntArray312, 0, local42, 0);
				System.out.println(new String(local42));
			}
			if (local18) {
				OpenGL.glDeleteShader(local2);
				return null;
			}
		}
		return new Class181(arg0, local2, arg1);
	}

	@OriginalMember(owner = "client!bw", name = "c", descriptor = "(Lclient!aeq;ILjava/lang/String;)Lclient!bw;", line = 14)
	static Class181 method24565(@OriginalArg(0) Class86_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2) {
		@Pc(2) int local2 = OpenGL.glCreateShader(arg1);
		OpenGL.glShaderSource(local2, arg2);
		OpenGL.glCompileShader(local2);
		OpenGL.glGetShaderiv(local2, 35713, anIntArray312, 0);
		if (anIntArray312[0] == 0) {
			@Pc(18) boolean local18 = false;
			if (anIntArray312[0] == 0) {
				local18 = true;
				System.out.println("");
			}
			OpenGL.glGetShaderiv(local2, 35716, anIntArray312, 1);
			if (anIntArray312[1] > 1) {
				@Pc(42) byte[] local42 = new byte[anIntArray312[1]];
				OpenGL.glGetShaderInfoLog(local2, anIntArray312[1], anIntArray312, 0, local42, 0);
				System.out.println(new String(local42));
			}
			if (local18) {
				OpenGL.glDeleteShader(local2);
				return null;
			}
		}
		return new Class181(arg0, local2, arg1);
	}

	@OriginalMember(owner = "client!bw", name = "v", descriptor = "(Lclient!aeq;ILjava/lang/String;)Lclient!bw;", line = 14)
	static Class181 method24566(@OriginalArg(0) Class86_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2) {
		@Pc(2) int local2 = OpenGL.glCreateShader(arg1);
		OpenGL.glShaderSource(local2, arg2);
		OpenGL.glCompileShader(local2);
		OpenGL.glGetShaderiv(local2, 35713, anIntArray312, 0);
		if (anIntArray312[0] == 0) {
			@Pc(18) boolean local18 = false;
			if (anIntArray312[0] == 0) {
				local18 = true;
				System.out.println("");
			}
			OpenGL.glGetShaderiv(local2, 35716, anIntArray312, 1);
			if (anIntArray312[1] > 1) {
				@Pc(42) byte[] local42 = new byte[anIntArray312[1]];
				OpenGL.glGetShaderInfoLog(local2, anIntArray312[1], anIntArray312, 0, local42, 0);
				System.out.println(new String(local42));
			}
			if (local18) {
				OpenGL.glDeleteShader(local2);
				return null;
			}
		}
		return new Class181(arg0, local2, arg1);
	}

	@OriginalMember(owner = "client!bw", name = "l", descriptor = "(Lclient!aeq;ILjava/lang/String;)Lclient!bw;", line = 14)
	static Class181 method24567(@OriginalArg(0) Class86_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2) {
		@Pc(2) int local2 = OpenGL.glCreateShader(arg1);
		OpenGL.glShaderSource(local2, arg2);
		OpenGL.glCompileShader(local2);
		OpenGL.glGetShaderiv(local2, 35713, anIntArray312, 0);
		if (anIntArray312[0] == 0) {
			@Pc(18) boolean local18 = false;
			if (anIntArray312[0] == 0) {
				local18 = true;
				System.out.println("");
			}
			OpenGL.glGetShaderiv(local2, 35716, anIntArray312, 1);
			if (anIntArray312[1] > 1) {
				@Pc(42) byte[] local42 = new byte[anIntArray312[1]];
				OpenGL.glGetShaderInfoLog(local2, anIntArray312[1], anIntArray312, 0, local42, 0);
				System.out.println(new String(local42));
			}
			if (local18) {
				OpenGL.glDeleteShader(local2);
				return null;
			}
		}
		return new Class181(arg0, local2, arg1);
	}

	@OriginalMember(owner = "client!bw", name = "y", descriptor = "(Lclient!aeq;ILjava/lang/String;)Lclient!bw;", line = 14)
	static Class181 method24568(@OriginalArg(0) Class86_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2) {
		@Pc(2) int local2 = OpenGL.glCreateShader(arg1);
		OpenGL.glShaderSource(local2, arg2);
		OpenGL.glCompileShader(local2);
		OpenGL.glGetShaderiv(local2, 35713, anIntArray312, 0);
		if (anIntArray312[0] == 0) {
			@Pc(18) boolean local18 = false;
			if (anIntArray312[0] == 0) {
				local18 = true;
				System.out.println("");
			}
			OpenGL.glGetShaderiv(local2, 35716, anIntArray312, 1);
			if (anIntArray312[1] > 1) {
				@Pc(42) byte[] local42 = new byte[anIntArray312[1]];
				OpenGL.glGetShaderInfoLog(local2, anIntArray312[1], anIntArray312, 0, local42, 0);
				System.out.println(new String(local42));
			}
			if (local18) {
				OpenGL.glDeleteShader(local2);
				return null;
			}
		}
		return new Class181(arg0, local2, arg1);
	}

	@OriginalMember(owner = "client!bw", name = "<init>", descriptor = "(Lclient!aeq;II)V", line = 38)
	Class181(@OriginalArg(0) Class86_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass86_Sub3_41 = arg0;
		this.anInt3315 = arg1;
	}

	@OriginalMember(owner = "client!bw", name = "hp", descriptor = "()V", line = 44)
	void method24569() throws Throwable {
		this.aClass86_Sub3_41.method6281((long) this.anInt3315);
		super.finalize();
	}

	@OriginalMember(owner = "client!bw", name = "finalize", descriptor = "()V", line = 44)
	@Override
	void finalize() throws Throwable {
		this.aClass86_Sub3_41.method6281((long) this.anInt3315);
		super.finalize();
	}

	@OriginalMember(owner = "client!bw", name = "hd", descriptor = "()V", line = 44)
	void method24570() throws Throwable {
		this.aClass86_Sub3_41.method6281((long) this.anInt3315);
		super.finalize();
	}

	@OriginalMember(owner = "client!bw", name = "hc", descriptor = "()V", line = 44)
	void method24571() throws Throwable {
		this.aClass86_Sub3_41.method6281((long) this.anInt3315);
		super.finalize();
	}
}
