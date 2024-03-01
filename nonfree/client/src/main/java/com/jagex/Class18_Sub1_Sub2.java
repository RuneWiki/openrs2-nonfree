package com.jagex;

import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!akr")
public class Class18_Sub1_Sub2 extends Class18_Sub1 {

	@OriginalMember(owner = "client!akr", name = "g", descriptor = "[I")
	static final int[] anIntArray247 = new int[4];

	@OriginalMember(owner = "client!akr", name = "p", descriptor = "Lclient!abt;")
	final Class21_Sub2 aClass21_Sub2_32;

	@OriginalMember(owner = "client!akr", name = "a", descriptor = "Lclient!aae;")
	Class4_Sub2 aClass4_Sub2_2;

	@OriginalMember(owner = "client!akr", name = "<init>", descriptor = "(Lclient!abt;I)V", line = 12)
	Class18_Sub1_Sub2(@OriginalArg(0) Class21_Sub2 arg0, @OriginalArg(1) int arg1) {
		this.aClass21_Sub2_32 = arg0;
		this.aClass4_Sub2_2 = new Class4_Sub2(arg0, Class121.aClass121_17, Class127.aClass127_23, arg1);
	}

	@OriginalMember(owner = "client!akr", name = "h", descriptor = "()I", line = 18)
	int method16880() {
		return this.aClass4_Sub2_2.anInt80;
	}

	@OriginalMember(owner = "client!akr", name = "y", descriptor = "()I", line = 18)
	int method16883() {
		return this.aClass4_Sub2_2.anInt80;
	}

	@OriginalMember(owner = "client!akr", name = "s", descriptor = "()I", line = 18)
	int method16884() {
		return this.aClass4_Sub2_2.anInt80;
	}

	@OriginalMember(owner = "client!akr", name = "u", descriptor = "()I", line = 18)
	int method16885() {
		return this.aClass4_Sub2_2.anInt80;
	}

	@OriginalMember(owner = "client!akr", name = "g", descriptor = "()Lclient!aae;", line = 22)
	@Override
	Class4_Sub2 method16876() {
		return this.aClass4_Sub2_2;
	}

	@OriginalMember(owner = "client!akr", name = "p", descriptor = "()Lclient!aae;", line = 22)
	@Override
	Class4_Sub2 method16877() {
		return this.aClass4_Sub2_2;
	}

	@OriginalMember(owner = "client!akr", name = "a", descriptor = "()Lclient!aae;", line = 22)
	@Override
	Class4_Sub2 method16879() {
		return this.aClass4_Sub2_2;
	}

	@OriginalMember(owner = "client!akr", name = "l", descriptor = "()Lclient!aae;", line = 22)
	@Override
	Class4_Sub2 method16878() {
		return this.aClass4_Sub2_2;
	}

	@OriginalMember(owner = "client!akr", name = "x", descriptor = "(Lclient!aae;Lclient!aae;F)Z", line = 26)
	boolean method16881(@OriginalArg(0) Class4_Sub2 arg0, @OriginalArg(1) Class4_Sub2 arg1, @OriginalArg(2) float arg2) {
		@Pc(1) boolean local1 = true;
		@Pc(5) Class19_Sub1_Sub3 local5 = this.aClass21_Sub2_32.aClass19_Sub1_Sub3_1;
		this.aClass21_Sub2_32.method17060(anIntArray247);
		this.aClass21_Sub2_32.method17056();
		this.aClass21_Sub2_32.method4161();
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glPushAttrib(2048);
		OpenGL.glViewport(0, 0, this.aClass4_Sub2_2.anInt80, this.aClass4_Sub2_2.anInt80);
		this.aClass21_Sub2_32.method4083(false);
		this.aClass21_Sub2_32.method4084(false);
		this.aClass21_Sub2_32.method4086(false);
		this.aClass21_Sub2_32.method4087(false);
		this.aClass21_Sub2_32.method4070(-2);
		this.aClass21_Sub2_32.method4073(1);
		this.aClass21_Sub2_32.method4080(0.0F, 0.0F, 0.0F, arg2);
		this.aClass21_Sub2_32.method4114(34165, 34165);
		this.aClass21_Sub2_32.method4074(arg1);
		this.aClass21_Sub2_32.method4073(0);
		this.aClass21_Sub2_32.method4115(1);
		this.aClass21_Sub2_32.method4074(arg0);
		this.aClass21_Sub2_32.method17044(local5);
		for (@Pc(98) int local98 = 0; local98 < 6; local98++) {
			@Pc(105) int local105 = local98 + 34069;
			local5.method20882(0, this.aClass4_Sub2_2.method493(local105, 0));
			local5.method17949(0);
			if (!local5.method20883()) {
				local1 = false;
				break;
			}
			OpenGL.glBegin(7);
			switch(local105) {
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
		local5.method20882(0, null);
		this.aClass21_Sub2_32.method17263(local5);
		this.aClass21_Sub2_32.method4073(1);
		this.aClass21_Sub2_32.method4074(null);
		this.aClass21_Sub2_32.method4114(8448, 8448);
		this.aClass21_Sub2_32.method4073(0);
		this.aClass21_Sub2_32.method4074(null);
		OpenGL.glPopAttrib();
		this.aClass21_Sub2_32.method17079(anIntArray247[0], anIntArray247[1], anIntArray247[2], anIntArray247[3]);
		if (local1 && !this.aClass21_Sub2_32.aBoolean75) {
			this.aClass4_Sub2_2.method33714();
		}
		return local1;
	}

	@OriginalMember(owner = "client!akr", name = "b", descriptor = "(Lclient!aae;Lclient!aae;F)Z", line = 26)
	boolean method16882(@OriginalArg(0) Class4_Sub2 arg0, @OriginalArg(1) Class4_Sub2 arg1, @OriginalArg(2) float arg2) {
		@Pc(1) boolean local1 = true;
		@Pc(5) Class19_Sub1_Sub3 local5 = this.aClass21_Sub2_32.aClass19_Sub1_Sub3_1;
		this.aClass21_Sub2_32.method17060(anIntArray247);
		this.aClass21_Sub2_32.method17056();
		this.aClass21_Sub2_32.method4161();
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glPushAttrib(2048);
		OpenGL.glViewport(0, 0, this.aClass4_Sub2_2.anInt80, this.aClass4_Sub2_2.anInt80);
		this.aClass21_Sub2_32.method4083(false);
		this.aClass21_Sub2_32.method4084(false);
		this.aClass21_Sub2_32.method4086(false);
		this.aClass21_Sub2_32.method4087(false);
		this.aClass21_Sub2_32.method4070(-2);
		this.aClass21_Sub2_32.method4073(1);
		this.aClass21_Sub2_32.method4080(0.0F, 0.0F, 0.0F, arg2);
		this.aClass21_Sub2_32.method4114(34165, 34165);
		this.aClass21_Sub2_32.method4074(arg1);
		this.aClass21_Sub2_32.method4073(0);
		this.aClass21_Sub2_32.method4115(1);
		this.aClass21_Sub2_32.method4074(arg0);
		this.aClass21_Sub2_32.method17044(local5);
		for (@Pc(98) int local98 = 0; local98 < 6; local98++) {
			@Pc(105) int local105 = local98 + 34069;
			local5.method20882(0, this.aClass4_Sub2_2.method493(local105, 0));
			local5.method17949(0);
			if (!local5.method20883()) {
				local1 = false;
				break;
			}
			OpenGL.glBegin(7);
			switch(local105) {
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
		local5.method20882(0, null);
		this.aClass21_Sub2_32.method17263(local5);
		this.aClass21_Sub2_32.method4073(1);
		this.aClass21_Sub2_32.method4074(null);
		this.aClass21_Sub2_32.method4114(8448, 8448);
		this.aClass21_Sub2_32.method4073(0);
		this.aClass21_Sub2_32.method4074(null);
		OpenGL.glPopAttrib();
		this.aClass21_Sub2_32.method17079(anIntArray247[0], anIntArray247[1], anIntArray247[2], anIntArray247[3]);
		if (local1 && !this.aClass21_Sub2_32.aBoolean75) {
			this.aClass4_Sub2_2.method33714();
		}
		return local1;
	}

	@OriginalMember(owner = "client!akr", name = "c", descriptor = "(Lclient!aae;Lclient!aae;F)Z", line = 26)
	boolean method16886(@OriginalArg(0) Class4_Sub2 arg0, @OriginalArg(1) Class4_Sub2 arg1, @OriginalArg(2) float arg2) {
		@Pc(1) boolean local1 = true;
		@Pc(5) Class19_Sub1_Sub3 local5 = this.aClass21_Sub2_32.aClass19_Sub1_Sub3_1;
		this.aClass21_Sub2_32.method17060(anIntArray247);
		this.aClass21_Sub2_32.method17056();
		this.aClass21_Sub2_32.method4161();
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glPushAttrib(2048);
		OpenGL.glViewport(0, 0, this.aClass4_Sub2_2.anInt80, this.aClass4_Sub2_2.anInt80);
		this.aClass21_Sub2_32.method4083(false);
		this.aClass21_Sub2_32.method4084(false);
		this.aClass21_Sub2_32.method4086(false);
		this.aClass21_Sub2_32.method4087(false);
		this.aClass21_Sub2_32.method4070(-2);
		this.aClass21_Sub2_32.method4073(1);
		this.aClass21_Sub2_32.method4080(0.0F, 0.0F, 0.0F, arg2);
		this.aClass21_Sub2_32.method4114(34165, 34165);
		this.aClass21_Sub2_32.method4074(arg1);
		this.aClass21_Sub2_32.method4073(0);
		this.aClass21_Sub2_32.method4115(1);
		this.aClass21_Sub2_32.method4074(arg0);
		this.aClass21_Sub2_32.method17044(local5);
		for (@Pc(98) int local98 = 0; local98 < 6; local98++) {
			@Pc(105) int local105 = local98 + 34069;
			local5.method20882(0, this.aClass4_Sub2_2.method493(local105, 0));
			local5.method17949(0);
			if (!local5.method20883()) {
				local1 = false;
				break;
			}
			OpenGL.glBegin(7);
			switch(local105) {
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
		local5.method20882(0, null);
		this.aClass21_Sub2_32.method17263(local5);
		this.aClass21_Sub2_32.method4073(1);
		this.aClass21_Sub2_32.method4074(null);
		this.aClass21_Sub2_32.method4114(8448, 8448);
		this.aClass21_Sub2_32.method4073(0);
		this.aClass21_Sub2_32.method4074(null);
		OpenGL.glPopAttrib();
		this.aClass21_Sub2_32.method17079(anIntArray247[0], anIntArray247[1], anIntArray247[2], anIntArray247[3]);
		if (local1 && !this.aClass21_Sub2_32.aBoolean75) {
			this.aClass4_Sub2_2.method33714();
		}
		return local1;
	}

	@OriginalMember(owner = "client!akr", name = "z", descriptor = "(Lclient!aae;Lclient!aae;F)Z", line = 26)
	boolean method16887(@OriginalArg(0) Class4_Sub2 arg0, @OriginalArg(1) Class4_Sub2 arg1, @OriginalArg(2) float arg2) {
		@Pc(1) boolean local1 = true;
		@Pc(5) Class19_Sub1_Sub3 local5 = this.aClass21_Sub2_32.aClass19_Sub1_Sub3_1;
		this.aClass21_Sub2_32.method17060(anIntArray247);
		this.aClass21_Sub2_32.method17056();
		this.aClass21_Sub2_32.method4161();
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glPushAttrib(2048);
		OpenGL.glViewport(0, 0, this.aClass4_Sub2_2.anInt80, this.aClass4_Sub2_2.anInt80);
		this.aClass21_Sub2_32.method4083(false);
		this.aClass21_Sub2_32.method4084(false);
		this.aClass21_Sub2_32.method4086(false);
		this.aClass21_Sub2_32.method4087(false);
		this.aClass21_Sub2_32.method4070(-2);
		this.aClass21_Sub2_32.method4073(1);
		this.aClass21_Sub2_32.method4080(0.0F, 0.0F, 0.0F, arg2);
		this.aClass21_Sub2_32.method4114(34165, 34165);
		this.aClass21_Sub2_32.method4074(arg1);
		this.aClass21_Sub2_32.method4073(0);
		this.aClass21_Sub2_32.method4115(1);
		this.aClass21_Sub2_32.method4074(arg0);
		this.aClass21_Sub2_32.method17044(local5);
		for (@Pc(98) int local98 = 0; local98 < 6; local98++) {
			@Pc(105) int local105 = local98 + 34069;
			local5.method20882(0, this.aClass4_Sub2_2.method493(local105, 0));
			local5.method17949(0);
			if (!local5.method20883()) {
				local1 = false;
				break;
			}
			OpenGL.glBegin(7);
			switch(local105) {
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
		local5.method20882(0, null);
		this.aClass21_Sub2_32.method17263(local5);
		this.aClass21_Sub2_32.method4073(1);
		this.aClass21_Sub2_32.method4074(null);
		this.aClass21_Sub2_32.method4114(8448, 8448);
		this.aClass21_Sub2_32.method4073(0);
		this.aClass21_Sub2_32.method4074(null);
		OpenGL.glPopAttrib();
		this.aClass21_Sub2_32.method17079(anIntArray247[0], anIntArray247[1], anIntArray247[2], anIntArray247[3]);
		if (local1 && !this.aClass21_Sub2_32.aBoolean75) {
			this.aClass4_Sub2_2.method33714();
		}
		return local1;
	}
}
