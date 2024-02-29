package com.jagex;

import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!apb")
public class Class91_Sub1_Sub1 extends Class91_Sub1 {

	@OriginalMember(owner = "client!apb", name = "v", descriptor = "[I")
	static final int[] anIntArray234 = new int[4];

	@OriginalMember(owner = "client!apb", name = "l", descriptor = "[I")
	static final int[] anIntArray235 = new int[4];

	@OriginalMember(owner = "client!apb", name = "p", descriptor = "Lclient!aeq;")
	final Class86_Sub3 aClass86_Sub3_34;

	@OriginalMember(owner = "client!apb", name = "c", descriptor = "Lclient!adf;")
	Class78_Sub1 aClass78_Sub1_1;

	@OriginalMember(owner = "client!apb", name = "<init>", descriptor = "(Lclient!aeq;I)V", line = 13)
	Class91_Sub1_Sub1(@OriginalArg(0) Class86_Sub3 arg0, @OriginalArg(1) int arg1) {
		this.aClass86_Sub3_34 = arg0;
		this.aClass78_Sub1_1 = new Class78_Sub1(arg0, Class212.aClass212_18, Class206.aClass206_23, arg1);
	}

	@OriginalMember(owner = "client!apb", name = "x", descriptor = "()I", line = 19)
	int method18363() {
		return this.aClass78_Sub1_1.anInt254;
	}

	@OriginalMember(owner = "client!apb", name = "q", descriptor = "()I", line = 19)
	int method18364() {
		return this.aClass78_Sub1_1.anInt254;
	}

	@OriginalMember(owner = "client!apb", name = "w", descriptor = "()I", line = 19)
	int method18365() {
		return this.aClass78_Sub1_1.anInt254;
	}

	@OriginalMember(owner = "client!apb", name = "d", descriptor = "()I", line = 19)
	int method18366() {
		return this.aClass78_Sub1_1.anInt254;
	}

	@OriginalMember(owner = "client!apb", name = "s", descriptor = "()I", line = 19)
	int method18367() {
		return this.aClass78_Sub1_1.anInt254;
	}

	@OriginalMember(owner = "client!apb", name = "p", descriptor = "()Lclient!adf;", line = 23)
	@Override
	Class78_Sub1 method18428() {
		return this.aClass78_Sub1_1;
	}

	@OriginalMember(owner = "client!apb", name = "l", descriptor = "()Lclient!adf;", line = 23)
	@Override
	Class78_Sub1 method18431() {
		return this.aClass78_Sub1_1;
	}

	@OriginalMember(owner = "client!apb", name = "y", descriptor = "()Lclient!adf;", line = 23)
	@Override
	Class78_Sub1 method18430() {
		return this.aClass78_Sub1_1;
	}

	@OriginalMember(owner = "client!apb", name = "c", descriptor = "()Lclient!adf;", line = 23)
	@Override
	Class78_Sub1 method18429() {
		return this.aClass78_Sub1_1;
	}

	@OriginalMember(owner = "client!apb", name = "v", descriptor = "()Lclient!adf;", line = 23)
	@Override
	Class78_Sub1 method18427() {
		return this.aClass78_Sub1_1;
	}

	@OriginalMember(owner = "client!apb", name = "z", descriptor = "(Lclient!adf;Lclient!adf;F)Z", line = 27)
	boolean method18368(@OriginalArg(0) Class78_Sub1 arg0, @OriginalArg(1) Class78_Sub1 arg1, @OriginalArg(2) float arg2) {
		@Pc(1) boolean local1 = true;
		@Pc(5) Class92_Sub1_Sub1 local5 = this.aClass86_Sub3_34.aClass92_Sub1_Sub1_1;
		this.aClass86_Sub3_34.method20142(anIntArray234);
		this.aClass86_Sub3_34.method20299();
		this.aClass86_Sub3_34.method20080(anIntArray235);
		this.aClass86_Sub3_34.method6087();
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glViewport(0, 0, this.aClass78_Sub1_1.anInt254, this.aClass78_Sub1_1.anInt254);
		this.aClass86_Sub3_34.method6229(false);
		this.aClass86_Sub3_34.method6233(false);
		this.aClass86_Sub3_34.method6239(false);
		this.aClass86_Sub3_34.method6241(false);
		this.aClass86_Sub3_34.method6180(-2);
		this.aClass86_Sub3_34.method6190(1);
		this.aClass86_Sub3_34.method6220(0.0F, 0.0F, 0.0F, arg2);
		this.aClass86_Sub3_34.method6207(34165, 34165);
		this.aClass86_Sub3_34.method6195(arg1);
		this.aClass86_Sub3_34.method6190(0);
		this.aClass86_Sub3_34.method6198(1);
		this.aClass86_Sub3_34.method6195(arg0);
		this.aClass86_Sub3_34.method19968(local5);
		for (@Pc(100) int local100 = 0; local100 < 6; local100++) {
			@Pc(107) int local107 = local100 + 34069;
			local5.method23513(0, this.aClass78_Sub1_1.method1385(local107, 0));
			local5.method17580(0);
			if (!local5.method23514()) {
				local1 = false;
				break;
			}
			OpenGL.glBegin(7);
			switch(local107) {
				case 34069:
					OpenGL.glTexCoord3i(65535, 65534, 65534);
					OpenGL.glMultiTexCoord3i(33985, 65535, 65534, 65534);
					OpenGL.glVertex2f(0.0F, 0.0F);
					OpenGL.glTexCoord3i(65535, 65534, -65534);
					OpenGL.glMultiTexCoord3i(33985, 65535, 65534, -65534);
					OpenGL.glVertex2f(1.0F, 0.0F);
					OpenGL.glTexCoord3i(65535, -65534, -65534);
					OpenGL.glMultiTexCoord3i(33985, 65535, -65534, -65534);
					OpenGL.glVertex2f(1.0F, 1.0F);
					OpenGL.glTexCoord3i(65535, -65534, 65534);
					OpenGL.glMultiTexCoord3i(33985, 65535, -65534, 65534);
					OpenGL.glVertex2f(0.0F, 1.0F);
					break;
				case 34070:
					OpenGL.glTexCoord3i(-65535, 65534, -65534);
					OpenGL.glMultiTexCoord3i(33985, -65535, 65534, -65534);
					OpenGL.glVertex2f(0.0F, 0.0F);
					OpenGL.glTexCoord3i(-65535, 65534, 65534);
					OpenGL.glMultiTexCoord3i(33985, -65535, 65534, 65534);
					OpenGL.glVertex2f(1.0F, 0.0F);
					OpenGL.glTexCoord3i(-65535, -65534, 65534);
					OpenGL.glMultiTexCoord3i(33985, -65535, -65534, 65534);
					OpenGL.glVertex2f(1.0F, 1.0F);
					OpenGL.glTexCoord3i(-65535, -65534, -65534);
					OpenGL.glMultiTexCoord3i(33985, -65535, -65534, -65534);
					OpenGL.glVertex2f(0.0F, 1.0F);
					break;
				case 34071:
					OpenGL.glTexCoord3i(-65534, 65535, -65534);
					OpenGL.glMultiTexCoord3i(33985, -65534, 65535, -65534);
					OpenGL.glVertex2f(0.0F, 0.0F);
					OpenGL.glTexCoord3i(65534, 65535, -65534);
					OpenGL.glMultiTexCoord3i(33985, 65534, 65535, -65534);
					OpenGL.glVertex2f(1.0F, 0.0F);
					OpenGL.glTexCoord3i(65534, 65535, 65534);
					OpenGL.glMultiTexCoord3i(33985, 65534, 65535, 65534);
					OpenGL.glVertex2f(1.0F, 1.0F);
					OpenGL.glTexCoord3i(-65534, 65535, 65534);
					OpenGL.glMultiTexCoord3i(33985, -65534, 65535, 65534);
					OpenGL.glVertex2f(0.0F, 1.0F);
					break;
				case 34072:
					OpenGL.glTexCoord3i(-65534, -65535, 65534);
					OpenGL.glMultiTexCoord3i(33985, -65534, -65535, 65534);
					OpenGL.glVertex2f(0.0F, 0.0F);
					OpenGL.glTexCoord3i(65534, -65535, 65534);
					OpenGL.glMultiTexCoord3i(33985, 65534, -65535, 65534);
					OpenGL.glVertex2f(1.0F, 0.0F);
					OpenGL.glTexCoord3i(65534, -65535, -65534);
					OpenGL.glMultiTexCoord3i(33985, 65534, -65535, -65534);
					OpenGL.glVertex2f(1.0F, 1.0F);
					OpenGL.glTexCoord3i(-65534, -65535, -65534);
					OpenGL.glMultiTexCoord3i(33985, -65534, -65535, -65534);
					OpenGL.glVertex2f(0.0F, 1.0F);
					break;
				case 34073:
					OpenGL.glTexCoord3i(-65534, 65534, 65535);
					OpenGL.glMultiTexCoord3i(33985, -65534, 65534, 65535);
					OpenGL.glVertex2f(0.0F, 0.0F);
					OpenGL.glTexCoord3i(65534, 65534, 65535);
					OpenGL.glMultiTexCoord3i(33985, 65534, 65534, 65535);
					OpenGL.glVertex2f(1.0F, 0.0F);
					OpenGL.glTexCoord3i(65534, -65534, 65535);
					OpenGL.glMultiTexCoord3i(33985, 65534, -65534, 65535);
					OpenGL.glVertex2f(1.0F, 1.0F);
					OpenGL.glTexCoord3i(-65534, -65534, 65535);
					OpenGL.glMultiTexCoord3i(33985, -65534, -65534, 65535);
					OpenGL.glVertex2f(0.0F, 1.0F);
					break;
				case 34074:
					OpenGL.glTexCoord3i(65534, 65534, -65535);
					OpenGL.glMultiTexCoord3i(33985, 65534, 65534, -65535);
					OpenGL.glVertex2f(0.0F, 0.0F);
					OpenGL.glTexCoord3i(-65534, 65534, -65535);
					OpenGL.glMultiTexCoord3i(33985, -65534, 65534, -65535);
					OpenGL.glVertex2f(1.0F, 0.0F);
					OpenGL.glTexCoord3i(-65534, -65534, -65535);
					OpenGL.glMultiTexCoord3i(33985, -65534, -65534, -65535);
					OpenGL.glVertex2f(1.0F, 1.0F);
					OpenGL.glTexCoord3i(65534, -65534, -65535);
					OpenGL.glMultiTexCoord3i(33985, 65534, -65534, -65535);
					OpenGL.glVertex2f(0.0F, 1.0F);
			}
			OpenGL.glEnd();
		}
		local5.method23513(0, null);
		this.aClass86_Sub3_34.method19972(local5);
		this.aClass86_Sub3_34.method6190(1);
		this.aClass86_Sub3_34.method6195(null);
		this.aClass86_Sub3_34.method6207(8448, 8448);
		this.aClass86_Sub3_34.method6190(0);
		this.aClass86_Sub3_34.method6195(null);
		this.aClass86_Sub3_34.method20151(anIntArray234[0], anIntArray234[1], anIntArray234[2], anIntArray234[3]);
		this.aClass86_Sub3_34.method20104(anIntArray235[0], anIntArray235[1], anIntArray235[2], anIntArray235[3]);
		if (local1 && !this.aClass86_Sub3_34.aBoolean129) {
			this.aClass78_Sub1_1.method17459();
		}
		return local1;
	}

	@OriginalMember(owner = "client!apb", name = "t", descriptor = "(Lclient!adf;Lclient!adf;F)Z", line = 27)
	boolean method18369(@OriginalArg(0) Class78_Sub1 arg0, @OriginalArg(1) Class78_Sub1 arg1, @OriginalArg(2) float arg2) {
		@Pc(1) boolean local1 = true;
		@Pc(5) Class92_Sub1_Sub1 local5 = this.aClass86_Sub3_34.aClass92_Sub1_Sub1_1;
		this.aClass86_Sub3_34.method20142(anIntArray234);
		this.aClass86_Sub3_34.method20299();
		this.aClass86_Sub3_34.method20080(anIntArray235);
		this.aClass86_Sub3_34.method6087();
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glViewport(0, 0, this.aClass78_Sub1_1.anInt254, this.aClass78_Sub1_1.anInt254);
		this.aClass86_Sub3_34.method6229(false);
		this.aClass86_Sub3_34.method6233(false);
		this.aClass86_Sub3_34.method6239(false);
		this.aClass86_Sub3_34.method6241(false);
		this.aClass86_Sub3_34.method6180(-2);
		this.aClass86_Sub3_34.method6190(1);
		this.aClass86_Sub3_34.method6220(0.0F, 0.0F, 0.0F, arg2);
		this.aClass86_Sub3_34.method6207(34165, 34165);
		this.aClass86_Sub3_34.method6195(arg1);
		this.aClass86_Sub3_34.method6190(0);
		this.aClass86_Sub3_34.method6198(1);
		this.aClass86_Sub3_34.method6195(arg0);
		this.aClass86_Sub3_34.method19968(local5);
		for (@Pc(100) int local100 = 0; local100 < 6; local100++) {
			@Pc(107) int local107 = local100 + 34069;
			local5.method23513(0, this.aClass78_Sub1_1.method1385(local107, 0));
			local5.method17580(0);
			if (!local5.method23514()) {
				local1 = false;
				break;
			}
			OpenGL.glBegin(7);
			switch(local107) {
				case 34069:
					OpenGL.glTexCoord3i(65535, 65534, 65534);
					OpenGL.glMultiTexCoord3i(33985, 65535, 65534, 65534);
					OpenGL.glVertex2f(0.0F, 0.0F);
					OpenGL.glTexCoord3i(65535, 65534, -65534);
					OpenGL.glMultiTexCoord3i(33985, 65535, 65534, -65534);
					OpenGL.glVertex2f(1.0F, 0.0F);
					OpenGL.glTexCoord3i(65535, -65534, -65534);
					OpenGL.glMultiTexCoord3i(33985, 65535, -65534, -65534);
					OpenGL.glVertex2f(1.0F, 1.0F);
					OpenGL.glTexCoord3i(65535, -65534, 65534);
					OpenGL.glMultiTexCoord3i(33985, 65535, -65534, 65534);
					OpenGL.glVertex2f(0.0F, 1.0F);
					break;
				case 34070:
					OpenGL.glTexCoord3i(-65535, 65534, -65534);
					OpenGL.glMultiTexCoord3i(33985, -65535, 65534, -65534);
					OpenGL.glVertex2f(0.0F, 0.0F);
					OpenGL.glTexCoord3i(-65535, 65534, 65534);
					OpenGL.glMultiTexCoord3i(33985, -65535, 65534, 65534);
					OpenGL.glVertex2f(1.0F, 0.0F);
					OpenGL.glTexCoord3i(-65535, -65534, 65534);
					OpenGL.glMultiTexCoord3i(33985, -65535, -65534, 65534);
					OpenGL.glVertex2f(1.0F, 1.0F);
					OpenGL.glTexCoord3i(-65535, -65534, -65534);
					OpenGL.glMultiTexCoord3i(33985, -65535, -65534, -65534);
					OpenGL.glVertex2f(0.0F, 1.0F);
					break;
				case 34071:
					OpenGL.glTexCoord3i(-65534, 65535, -65534);
					OpenGL.glMultiTexCoord3i(33985, -65534, 65535, -65534);
					OpenGL.glVertex2f(0.0F, 0.0F);
					OpenGL.glTexCoord3i(65534, 65535, -65534);
					OpenGL.glMultiTexCoord3i(33985, 65534, 65535, -65534);
					OpenGL.glVertex2f(1.0F, 0.0F);
					OpenGL.glTexCoord3i(65534, 65535, 65534);
					OpenGL.glMultiTexCoord3i(33985, 65534, 65535, 65534);
					OpenGL.glVertex2f(1.0F, 1.0F);
					OpenGL.glTexCoord3i(-65534, 65535, 65534);
					OpenGL.glMultiTexCoord3i(33985, -65534, 65535, 65534);
					OpenGL.glVertex2f(0.0F, 1.0F);
					break;
				case 34072:
					OpenGL.glTexCoord3i(-65534, -65535, 65534);
					OpenGL.glMultiTexCoord3i(33985, -65534, -65535, 65534);
					OpenGL.glVertex2f(0.0F, 0.0F);
					OpenGL.glTexCoord3i(65534, -65535, 65534);
					OpenGL.glMultiTexCoord3i(33985, 65534, -65535, 65534);
					OpenGL.glVertex2f(1.0F, 0.0F);
					OpenGL.glTexCoord3i(65534, -65535, -65534);
					OpenGL.glMultiTexCoord3i(33985, 65534, -65535, -65534);
					OpenGL.glVertex2f(1.0F, 1.0F);
					OpenGL.glTexCoord3i(-65534, -65535, -65534);
					OpenGL.glMultiTexCoord3i(33985, -65534, -65535, -65534);
					OpenGL.glVertex2f(0.0F, 1.0F);
					break;
				case 34073:
					OpenGL.glTexCoord3i(-65534, 65534, 65535);
					OpenGL.glMultiTexCoord3i(33985, -65534, 65534, 65535);
					OpenGL.glVertex2f(0.0F, 0.0F);
					OpenGL.glTexCoord3i(65534, 65534, 65535);
					OpenGL.glMultiTexCoord3i(33985, 65534, 65534, 65535);
					OpenGL.glVertex2f(1.0F, 0.0F);
					OpenGL.glTexCoord3i(65534, -65534, 65535);
					OpenGL.glMultiTexCoord3i(33985, 65534, -65534, 65535);
					OpenGL.glVertex2f(1.0F, 1.0F);
					OpenGL.glTexCoord3i(-65534, -65534, 65535);
					OpenGL.glMultiTexCoord3i(33985, -65534, -65534, 65535);
					OpenGL.glVertex2f(0.0F, 1.0F);
					break;
				case 34074:
					OpenGL.glTexCoord3i(65534, 65534, -65535);
					OpenGL.glMultiTexCoord3i(33985, 65534, 65534, -65535);
					OpenGL.glVertex2f(0.0F, 0.0F);
					OpenGL.glTexCoord3i(-65534, 65534, -65535);
					OpenGL.glMultiTexCoord3i(33985, -65534, 65534, -65535);
					OpenGL.glVertex2f(1.0F, 0.0F);
					OpenGL.glTexCoord3i(-65534, -65534, -65535);
					OpenGL.glMultiTexCoord3i(33985, -65534, -65534, -65535);
					OpenGL.glVertex2f(1.0F, 1.0F);
					OpenGL.glTexCoord3i(65534, -65534, -65535);
					OpenGL.glMultiTexCoord3i(33985, 65534, -65534, -65535);
					OpenGL.glVertex2f(0.0F, 1.0F);
			}
			OpenGL.glEnd();
		}
		local5.method23513(0, null);
		this.aClass86_Sub3_34.method19972(local5);
		this.aClass86_Sub3_34.method6190(1);
		this.aClass86_Sub3_34.method6195(null);
		this.aClass86_Sub3_34.method6207(8448, 8448);
		this.aClass86_Sub3_34.method6190(0);
		this.aClass86_Sub3_34.method6195(null);
		this.aClass86_Sub3_34.method20151(anIntArray234[0], anIntArray234[1], anIntArray234[2], anIntArray234[3]);
		this.aClass86_Sub3_34.method20104(anIntArray235[0], anIntArray235[1], anIntArray235[2], anIntArray235[3]);
		if (local1 && !this.aClass86_Sub3_34.aBoolean129) {
			this.aClass78_Sub1_1.method17459();
		}
		return local1;
	}

	@OriginalMember(owner = "client!apb", name = "r", descriptor = "(Lclient!adf;Lclient!adf;F)Z", line = 27)
	boolean method18370(@OriginalArg(0) Class78_Sub1 arg0, @OriginalArg(1) Class78_Sub1 arg1, @OriginalArg(2) float arg2) {
		@Pc(1) boolean local1 = true;
		@Pc(5) Class92_Sub1_Sub1 local5 = this.aClass86_Sub3_34.aClass92_Sub1_Sub1_1;
		this.aClass86_Sub3_34.method20142(anIntArray234);
		this.aClass86_Sub3_34.method20299();
		this.aClass86_Sub3_34.method20080(anIntArray235);
		this.aClass86_Sub3_34.method6087();
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glViewport(0, 0, this.aClass78_Sub1_1.anInt254, this.aClass78_Sub1_1.anInt254);
		this.aClass86_Sub3_34.method6229(false);
		this.aClass86_Sub3_34.method6233(false);
		this.aClass86_Sub3_34.method6239(false);
		this.aClass86_Sub3_34.method6241(false);
		this.aClass86_Sub3_34.method6180(-2);
		this.aClass86_Sub3_34.method6190(1);
		this.aClass86_Sub3_34.method6220(0.0F, 0.0F, 0.0F, arg2);
		this.aClass86_Sub3_34.method6207(34165, 34165);
		this.aClass86_Sub3_34.method6195(arg1);
		this.aClass86_Sub3_34.method6190(0);
		this.aClass86_Sub3_34.method6198(1);
		this.aClass86_Sub3_34.method6195(arg0);
		this.aClass86_Sub3_34.method19968(local5);
		for (@Pc(100) int local100 = 0; local100 < 6; local100++) {
			@Pc(107) int local107 = local100 + 34069;
			local5.method23513(0, this.aClass78_Sub1_1.method1385(local107, 0));
			local5.method17580(0);
			if (!local5.method23514()) {
				local1 = false;
				break;
			}
			OpenGL.glBegin(7);
			switch(local107) {
				case 34069:
					OpenGL.glTexCoord3i(65535, 65534, 65534);
					OpenGL.glMultiTexCoord3i(33985, 65535, 65534, 65534);
					OpenGL.glVertex2f(0.0F, 0.0F);
					OpenGL.glTexCoord3i(65535, 65534, -65534);
					OpenGL.glMultiTexCoord3i(33985, 65535, 65534, -65534);
					OpenGL.glVertex2f(1.0F, 0.0F);
					OpenGL.glTexCoord3i(65535, -65534, -65534);
					OpenGL.glMultiTexCoord3i(33985, 65535, -65534, -65534);
					OpenGL.glVertex2f(1.0F, 1.0F);
					OpenGL.glTexCoord3i(65535, -65534, 65534);
					OpenGL.glMultiTexCoord3i(33985, 65535, -65534, 65534);
					OpenGL.glVertex2f(0.0F, 1.0F);
					break;
				case 34070:
					OpenGL.glTexCoord3i(-65535, 65534, -65534);
					OpenGL.glMultiTexCoord3i(33985, -65535, 65534, -65534);
					OpenGL.glVertex2f(0.0F, 0.0F);
					OpenGL.glTexCoord3i(-65535, 65534, 65534);
					OpenGL.glMultiTexCoord3i(33985, -65535, 65534, 65534);
					OpenGL.glVertex2f(1.0F, 0.0F);
					OpenGL.glTexCoord3i(-65535, -65534, 65534);
					OpenGL.glMultiTexCoord3i(33985, -65535, -65534, 65534);
					OpenGL.glVertex2f(1.0F, 1.0F);
					OpenGL.glTexCoord3i(-65535, -65534, -65534);
					OpenGL.glMultiTexCoord3i(33985, -65535, -65534, -65534);
					OpenGL.glVertex2f(0.0F, 1.0F);
					break;
				case 34071:
					OpenGL.glTexCoord3i(-65534, 65535, -65534);
					OpenGL.glMultiTexCoord3i(33985, -65534, 65535, -65534);
					OpenGL.glVertex2f(0.0F, 0.0F);
					OpenGL.glTexCoord3i(65534, 65535, -65534);
					OpenGL.glMultiTexCoord3i(33985, 65534, 65535, -65534);
					OpenGL.glVertex2f(1.0F, 0.0F);
					OpenGL.glTexCoord3i(65534, 65535, 65534);
					OpenGL.glMultiTexCoord3i(33985, 65534, 65535, 65534);
					OpenGL.glVertex2f(1.0F, 1.0F);
					OpenGL.glTexCoord3i(-65534, 65535, 65534);
					OpenGL.glMultiTexCoord3i(33985, -65534, 65535, 65534);
					OpenGL.glVertex2f(0.0F, 1.0F);
					break;
				case 34072:
					OpenGL.glTexCoord3i(-65534, -65535, 65534);
					OpenGL.glMultiTexCoord3i(33985, -65534, -65535, 65534);
					OpenGL.glVertex2f(0.0F, 0.0F);
					OpenGL.glTexCoord3i(65534, -65535, 65534);
					OpenGL.glMultiTexCoord3i(33985, 65534, -65535, 65534);
					OpenGL.glVertex2f(1.0F, 0.0F);
					OpenGL.glTexCoord3i(65534, -65535, -65534);
					OpenGL.glMultiTexCoord3i(33985, 65534, -65535, -65534);
					OpenGL.glVertex2f(1.0F, 1.0F);
					OpenGL.glTexCoord3i(-65534, -65535, -65534);
					OpenGL.glMultiTexCoord3i(33985, -65534, -65535, -65534);
					OpenGL.glVertex2f(0.0F, 1.0F);
					break;
				case 34073:
					OpenGL.glTexCoord3i(-65534, 65534, 65535);
					OpenGL.glMultiTexCoord3i(33985, -65534, 65534, 65535);
					OpenGL.glVertex2f(0.0F, 0.0F);
					OpenGL.glTexCoord3i(65534, 65534, 65535);
					OpenGL.glMultiTexCoord3i(33985, 65534, 65534, 65535);
					OpenGL.glVertex2f(1.0F, 0.0F);
					OpenGL.glTexCoord3i(65534, -65534, 65535);
					OpenGL.glMultiTexCoord3i(33985, 65534, -65534, 65535);
					OpenGL.glVertex2f(1.0F, 1.0F);
					OpenGL.glTexCoord3i(-65534, -65534, 65535);
					OpenGL.glMultiTexCoord3i(33985, -65534, -65534, 65535);
					OpenGL.glVertex2f(0.0F, 1.0F);
					break;
				case 34074:
					OpenGL.glTexCoord3i(65534, 65534, -65535);
					OpenGL.glMultiTexCoord3i(33985, 65534, 65534, -65535);
					OpenGL.glVertex2f(0.0F, 0.0F);
					OpenGL.glTexCoord3i(-65534, 65534, -65535);
					OpenGL.glMultiTexCoord3i(33985, -65534, 65534, -65535);
					OpenGL.glVertex2f(1.0F, 0.0F);
					OpenGL.glTexCoord3i(-65534, -65534, -65535);
					OpenGL.glMultiTexCoord3i(33985, -65534, -65534, -65535);
					OpenGL.glVertex2f(1.0F, 1.0F);
					OpenGL.glTexCoord3i(65534, -65534, -65535);
					OpenGL.glMultiTexCoord3i(33985, 65534, -65534, -65535);
					OpenGL.glVertex2f(0.0F, 1.0F);
			}
			OpenGL.glEnd();
		}
		local5.method23513(0, null);
		this.aClass86_Sub3_34.method19972(local5);
		this.aClass86_Sub3_34.method6190(1);
		this.aClass86_Sub3_34.method6195(null);
		this.aClass86_Sub3_34.method6207(8448, 8448);
		this.aClass86_Sub3_34.method6190(0);
		this.aClass86_Sub3_34.method6195(null);
		this.aClass86_Sub3_34.method20151(anIntArray234[0], anIntArray234[1], anIntArray234[2], anIntArray234[3]);
		this.aClass86_Sub3_34.method20104(anIntArray235[0], anIntArray235[1], anIntArray235[2], anIntArray235[3]);
		if (local1 && !this.aClass86_Sub3_34.aBoolean129) {
			this.aClass78_Sub1_1.method17459();
		}
		return local1;
	}

	@OriginalMember(owner = "client!apb", name = "g", descriptor = "(Lclient!adf;Lclient!adf;F)Z", line = 27)
	boolean method18371(@OriginalArg(0) Class78_Sub1 arg0, @OriginalArg(1) Class78_Sub1 arg1, @OriginalArg(2) float arg2) {
		@Pc(1) boolean local1 = true;
		@Pc(5) Class92_Sub1_Sub1 local5 = this.aClass86_Sub3_34.aClass92_Sub1_Sub1_1;
		this.aClass86_Sub3_34.method20142(anIntArray234);
		this.aClass86_Sub3_34.method20299();
		this.aClass86_Sub3_34.method20080(anIntArray235);
		this.aClass86_Sub3_34.method6087();
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glViewport(0, 0, this.aClass78_Sub1_1.anInt254, this.aClass78_Sub1_1.anInt254);
		this.aClass86_Sub3_34.method6229(false);
		this.aClass86_Sub3_34.method6233(false);
		this.aClass86_Sub3_34.method6239(false);
		this.aClass86_Sub3_34.method6241(false);
		this.aClass86_Sub3_34.method6180(-2);
		this.aClass86_Sub3_34.method6190(1);
		this.aClass86_Sub3_34.method6220(0.0F, 0.0F, 0.0F, arg2);
		this.aClass86_Sub3_34.method6207(34165, 34165);
		this.aClass86_Sub3_34.method6195(arg1);
		this.aClass86_Sub3_34.method6190(0);
		this.aClass86_Sub3_34.method6198(1);
		this.aClass86_Sub3_34.method6195(arg0);
		this.aClass86_Sub3_34.method19968(local5);
		for (@Pc(100) int local100 = 0; local100 < 6; local100++) {
			@Pc(107) int local107 = local100 + 34069;
			local5.method23513(0, this.aClass78_Sub1_1.method1385(local107, 0));
			local5.method17580(0);
			if (!local5.method23514()) {
				local1 = false;
				break;
			}
			OpenGL.glBegin(7);
			switch(local107) {
				case 34069:
					OpenGL.glTexCoord3i(65535, 65534, 65534);
					OpenGL.glMultiTexCoord3i(33985, 65535, 65534, 65534);
					OpenGL.glVertex2f(0.0F, 0.0F);
					OpenGL.glTexCoord3i(65535, 65534, -65534);
					OpenGL.glMultiTexCoord3i(33985, 65535, 65534, -65534);
					OpenGL.glVertex2f(1.0F, 0.0F);
					OpenGL.glTexCoord3i(65535, -65534, -65534);
					OpenGL.glMultiTexCoord3i(33985, 65535, -65534, -65534);
					OpenGL.glVertex2f(1.0F, 1.0F);
					OpenGL.glTexCoord3i(65535, -65534, 65534);
					OpenGL.glMultiTexCoord3i(33985, 65535, -65534, 65534);
					OpenGL.glVertex2f(0.0F, 1.0F);
					break;
				case 34070:
					OpenGL.glTexCoord3i(-65535, 65534, -65534);
					OpenGL.glMultiTexCoord3i(33985, -65535, 65534, -65534);
					OpenGL.glVertex2f(0.0F, 0.0F);
					OpenGL.glTexCoord3i(-65535, 65534, 65534);
					OpenGL.glMultiTexCoord3i(33985, -65535, 65534, 65534);
					OpenGL.glVertex2f(1.0F, 0.0F);
					OpenGL.glTexCoord3i(-65535, -65534, 65534);
					OpenGL.glMultiTexCoord3i(33985, -65535, -65534, 65534);
					OpenGL.glVertex2f(1.0F, 1.0F);
					OpenGL.glTexCoord3i(-65535, -65534, -65534);
					OpenGL.glMultiTexCoord3i(33985, -65535, -65534, -65534);
					OpenGL.glVertex2f(0.0F, 1.0F);
					break;
				case 34071:
					OpenGL.glTexCoord3i(-65534, 65535, -65534);
					OpenGL.glMultiTexCoord3i(33985, -65534, 65535, -65534);
					OpenGL.glVertex2f(0.0F, 0.0F);
					OpenGL.glTexCoord3i(65534, 65535, -65534);
					OpenGL.glMultiTexCoord3i(33985, 65534, 65535, -65534);
					OpenGL.glVertex2f(1.0F, 0.0F);
					OpenGL.glTexCoord3i(65534, 65535, 65534);
					OpenGL.glMultiTexCoord3i(33985, 65534, 65535, 65534);
					OpenGL.glVertex2f(1.0F, 1.0F);
					OpenGL.glTexCoord3i(-65534, 65535, 65534);
					OpenGL.glMultiTexCoord3i(33985, -65534, 65535, 65534);
					OpenGL.glVertex2f(0.0F, 1.0F);
					break;
				case 34072:
					OpenGL.glTexCoord3i(-65534, -65535, 65534);
					OpenGL.glMultiTexCoord3i(33985, -65534, -65535, 65534);
					OpenGL.glVertex2f(0.0F, 0.0F);
					OpenGL.glTexCoord3i(65534, -65535, 65534);
					OpenGL.glMultiTexCoord3i(33985, 65534, -65535, 65534);
					OpenGL.glVertex2f(1.0F, 0.0F);
					OpenGL.glTexCoord3i(65534, -65535, -65534);
					OpenGL.glMultiTexCoord3i(33985, 65534, -65535, -65534);
					OpenGL.glVertex2f(1.0F, 1.0F);
					OpenGL.glTexCoord3i(-65534, -65535, -65534);
					OpenGL.glMultiTexCoord3i(33985, -65534, -65535, -65534);
					OpenGL.glVertex2f(0.0F, 1.0F);
					break;
				case 34073:
					OpenGL.glTexCoord3i(-65534, 65534, 65535);
					OpenGL.glMultiTexCoord3i(33985, -65534, 65534, 65535);
					OpenGL.glVertex2f(0.0F, 0.0F);
					OpenGL.glTexCoord3i(65534, 65534, 65535);
					OpenGL.glMultiTexCoord3i(33985, 65534, 65534, 65535);
					OpenGL.glVertex2f(1.0F, 0.0F);
					OpenGL.glTexCoord3i(65534, -65534, 65535);
					OpenGL.glMultiTexCoord3i(33985, 65534, -65534, 65535);
					OpenGL.glVertex2f(1.0F, 1.0F);
					OpenGL.glTexCoord3i(-65534, -65534, 65535);
					OpenGL.glMultiTexCoord3i(33985, -65534, -65534, 65535);
					OpenGL.glVertex2f(0.0F, 1.0F);
					break;
				case 34074:
					OpenGL.glTexCoord3i(65534, 65534, -65535);
					OpenGL.glMultiTexCoord3i(33985, 65534, 65534, -65535);
					OpenGL.glVertex2f(0.0F, 0.0F);
					OpenGL.glTexCoord3i(-65534, 65534, -65535);
					OpenGL.glMultiTexCoord3i(33985, -65534, 65534, -65535);
					OpenGL.glVertex2f(1.0F, 0.0F);
					OpenGL.glTexCoord3i(-65534, -65534, -65535);
					OpenGL.glMultiTexCoord3i(33985, -65534, -65534, -65535);
					OpenGL.glVertex2f(1.0F, 1.0F);
					OpenGL.glTexCoord3i(65534, -65534, -65535);
					OpenGL.glMultiTexCoord3i(33985, 65534, -65534, -65535);
					OpenGL.glVertex2f(0.0F, 1.0F);
			}
			OpenGL.glEnd();
		}
		local5.method23513(0, null);
		this.aClass86_Sub3_34.method19972(local5);
		this.aClass86_Sub3_34.method6190(1);
		this.aClass86_Sub3_34.method6195(null);
		this.aClass86_Sub3_34.method6207(8448, 8448);
		this.aClass86_Sub3_34.method6190(0);
		this.aClass86_Sub3_34.method6195(null);
		this.aClass86_Sub3_34.method20151(anIntArray234[0], anIntArray234[1], anIntArray234[2], anIntArray234[3]);
		this.aClass86_Sub3_34.method20104(anIntArray235[0], anIntArray235[1], anIntArray235[2], anIntArray235[3]);
		if (local1 && !this.aClass86_Sub3_34.aBoolean129) {
			this.aClass78_Sub1_1.method17459();
		}
		return local1;
	}
}
