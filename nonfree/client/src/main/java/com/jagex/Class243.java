package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ir")
public class Class243 {

	@OriginalMember(owner = "client!ir", name = "c", descriptor = "Ljava/lang/Object;")
	static Object anObject13;

	@OriginalMember(owner = "client!ir", name = "g", descriptor = "I")
	public static final int anInt3778 = 16;

	@OriginalMember(owner = "client!ir", name = "j", descriptor = "Ljava/lang/Object;")
	static Object anObject14;

	@OriginalMember(owner = "client!ir", name = "p", descriptor = "I")
	static final int anInt3779 = 128;

	@OriginalMember(owner = "client!ir", name = "z", descriptor = "Ljava/lang/Object;")
	static Object anObject15;

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "I")
	static final int anInt3780 = 128;

	@OriginalMember(owner = "client!ir", name = "x", descriptor = "[Lclient!ic;")
	Interface20[] anInterface20Array2 = null;

	@OriginalMember(owner = "client!ir", name = "s", descriptor = "Lclient!in;")
	Interface23 anInterface23_1 = null;

	@OriginalMember(owner = "client!ir", name = "u", descriptor = "[Lclient!ic;")
	public Interface20[] anInterface20Array1 = null;

	@OriginalMember(owner = "client!ir", name = "y", descriptor = "Lclient!in;")
	public Interface23 anInterface23_2 = null;

	@OriginalMember(owner = "client!ir", name = "b", descriptor = "Lclient!in;")
	public Interface23 anInterface23_3 = null;

	@OriginalMember(owner = "client!ir", name = "l", descriptor = "Lclient!abv;")
	Class21_Sub3 aClass21_Sub3_36;

	@OriginalMember(owner = "client!ir", name = "h", descriptor = "Z")
	public boolean aBoolean682;

	@OriginalMember(owner = "client!ir", name = "l", descriptor = "()V", line = 25)
	static void method24754() {
		@Pc(11) byte[] local11;
		if (anObject13 == null) {
			@Pc(5) Class45_Sub1_Sub1 local5 = new Class45_Sub1_Sub1();
			local11 = local5.method18049(128, 128, 16);
			anObject13 = Class602.method33519(local11, false);
		}
		if (anObject15 == null) {
			@Pc(22) Class45_Sub2_Sub2 local22 = new Class45_Sub2_Sub2();
			local11 = local22.method18159(128, 128, 16);
			anObject15 = Class602.method33519(local11, false);
		}
	}

	@OriginalMember(owner = "client!ir", name = "p", descriptor = "()V", line = 25)
	static void method24759() {
		@Pc(11) byte[] local11;
		if (anObject13 == null) {
			@Pc(5) Class45_Sub1_Sub1 local5 = new Class45_Sub1_Sub1();
			local11 = local5.method18049(128, 128, 16);
			anObject13 = Class602.method33519(local11, false);
		}
		if (anObject15 == null) {
			@Pc(22) Class45_Sub2_Sub2 local22 = new Class45_Sub2_Sub2();
			local11 = local22.method18159(128, 128, 16);
			anObject15 = Class602.method33519(local11, false);
		}
	}

	@OriginalMember(owner = "client!ir", name = "<init>", descriptor = "(Lclient!abv;)V", line = 37)
	Class243(@OriginalArg(0) Class21_Sub3 arg0) {
		this.aClass21_Sub3_36 = arg0;
		this.aBoolean682 = this.aClass21_Sub3_36.aBoolean438;
		if (this.aBoolean682 && !this.aClass21_Sub3_36.aBoolean447) {
			this.aBoolean682 = false;
		}
		if (this.aBoolean682 && !this.aClass21_Sub3_36.method17500(Class121.aClass121_20, Class127.aClass127_23)) {
			this.aBoolean682 = false;
		}
		if (this.aBoolean682 || this.aClass21_Sub3_36.method17768(Class121.aClass121_20, Class127.aClass127_23)) {
			method24759();
			if (this.aBoolean682) {
				@Pc(128) byte[] local128 = Class3_Sub1_Sub19.method33681(anObject13, false);
				this.anInterface23_1 = this.aClass21_Sub3_36.method17509(Class121.aClass121_20, 128, 128, 16, true, local128);
				@Pc(144) byte[] local144 = Class3_Sub1_Sub19.method33681(anObject15, false);
				this.anInterface23_2 = this.aClass21_Sub3_36.method17509(Class121.aClass121_20, 128, 128, 16, true, local144);
			} else {
				this.anInterface20Array2 = new Interface20[16];
				@Pc(66) int local66;
				@Pc(77) byte[] local77;
				for (local66 = 0; local66 < 16; local66++) {
					local77 = Class445.method28338(anObject13, local66 * 32768, 32768);
					this.anInterface20Array2[local66] = this.aClass21_Sub3_36.method17502(Class121.aClass121_20, 128, 128, true, local77);
				}
				this.anInterface20Array1 = new Interface20[16];
				for (local66 = 0; local66 < 16; local66++) {
					local77 = Class445.method28338(anObject15, local66 * 32768, 32768);
					this.anInterface20Array1[local66] = this.aClass21_Sub3_36.method17502(Class121.aClass121_20, 128, 128, true, local77);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "()Z", line = 65)
	public boolean method24753() {
		return this.aBoolean682 ? this.anInterface23_1 != null : this.anInterface20Array2 != null;
	}

	@OriginalMember(owner = "client!ir", name = "s", descriptor = "()Z", line = 65)
	public boolean method24757() {
		return this.aBoolean682 ? this.anInterface23_1 != null : this.anInterface20Array2 != null;
	}

	@OriginalMember(owner = "client!ir", name = "x", descriptor = "()Z", line = 65)
	public boolean method24758() {
		return this.aBoolean682 ? this.anInterface23_1 != null : this.anInterface20Array2 != null;
	}

	@OriginalMember(owner = "client!ir", name = "u", descriptor = "()Z", line = 65)
	public boolean method24760() {
		return this.aBoolean682 ? this.anInterface23_1 != null : this.anInterface20Array2 != null;
	}

	@OriginalMember(owner = "client!ir", name = "h", descriptor = "()Z", line = 65)
	public boolean method24761() {
		return this.aBoolean682 ? this.anInterface23_1 != null : this.anInterface20Array2 != null;
	}

	@OriginalMember(owner = "client!ir", name = "g", descriptor = "()Z", line = 69)
	public boolean method24755() {
		if (!this.aClass21_Sub3_36.aBoolean438) {
			return false;
		}
		if (this.anInterface23_3 == null) {
			@Pc(25) byte[] local25;
			if (anObject14 == null) {
				local25 = Class397.method27515(128, 128, 16, 8, new Class59_Sub1(419684), 4.0F, 4.0F, 16.0F, 0.5F, 0.6F);
				anObject14 = Class602.method33519(local25, false);
			}
			local25 = Class3_Sub1_Sub19.method33681(anObject14, false);
			@Pc(41) byte[] local41 = new byte[local25.length * 4];
			@Pc(43) int local43 = 0;
			for (@Pc(45) int local45 = 0; local45 < 16; local45++) {
				@Pc(52) int local52 = local45 * 16384;
				@Pc(54) int local54 = local52;
				for (@Pc(56) int local56 = 0; local56 < 128; local56++) {
					@Pc(65) int local65 = local54 + local56 * 128;
					@Pc(75) int local75 = local54 + (local56 - 1 & 0x7F) * 128;
					@Pc(85) int local85 = local54 + (local56 + 1 & 0x7F) * 128;
					for (@Pc(87) int local87 = 0; local87 < 128; local87++) {
						@Pc(107) float local107 = (float) ((local25[local75 + local87] & 0xFF) - (local25[local85 + local87] & 0xFF));
						@Pc(132) float local132 = (float) ((local25[local65 + (local87 - 1 & 0x7F)] & 0xFF) - (local25[local65 + (local87 + 1 & 0x7F)] & 0xFF));
						@Pc(147) float local147 = (float) (128.0D / Math.sqrt((double) (local132 * local132 + 16384.0F + local107 * local107)));
						local41[local43++] = (byte) (local132 * local147 + 127.0F);
						local41[local43++] = (byte) (local147 * 128.0F + 127.0F);
						local41[local43++] = (byte) (local107 * local147 + 127.0F);
						local41[local43++] = local25[local52++];
					}
				}
			}
			this.anInterface23_3 = this.aClass21_Sub3_36.method17509(Class121.aClass121_17, 128, 128, 16, true, local41);
		}
		return this.anInterface23_3 != null;
	}

	@OriginalMember(owner = "client!ir", name = "y", descriptor = "()Z", line = 69)
	public boolean method24756() {
		if (!this.aClass21_Sub3_36.aBoolean438) {
			return false;
		}
		if (this.anInterface23_3 == null) {
			@Pc(25) byte[] local25;
			if (anObject14 == null) {
				local25 = Class397.method27515(128, 128, 16, 8, new Class59_Sub1(419684), 4.0F, 4.0F, 16.0F, 0.5F, 0.6F);
				anObject14 = Class602.method33519(local25, false);
			}
			local25 = Class3_Sub1_Sub19.method33681(anObject14, false);
			@Pc(41) byte[] local41 = new byte[local25.length * 4];
			@Pc(43) int local43 = 0;
			for (@Pc(45) int local45 = 0; local45 < 16; local45++) {
				@Pc(52) int local52 = local45 * 16384;
				@Pc(54) int local54 = local52;
				for (@Pc(56) int local56 = 0; local56 < 128; local56++) {
					@Pc(65) int local65 = local54 + local56 * 128;
					@Pc(75) int local75 = local54 + (local56 - 1 & 0x7F) * 128;
					@Pc(85) int local85 = local54 + (local56 + 1 & 0x7F) * 128;
					for (@Pc(87) int local87 = 0; local87 < 128; local87++) {
						@Pc(107) float local107 = (float) ((local25[local75 + local87] & 0xFF) - (local25[local85 + local87] & 0xFF));
						@Pc(132) float local132 = (float) ((local25[local65 + (local87 - 1 & 0x7F)] & 0xFF) - (local25[local65 + (local87 + 1 & 0x7F)] & 0xFF));
						@Pc(147) float local147 = (float) (128.0D / Math.sqrt((double) (local132 * local132 + 16384.0F + local107 * local107)));
						local41[local43++] = (byte) (local132 * local147 + 127.0F);
						local41[local43++] = (byte) (local147 * 128.0F + 127.0F);
						local41[local43++] = (byte) (local107 * local147 + 127.0F);
						local41[local43++] = local25[local52++];
					}
				}
			}
			this.anInterface23_3 = this.aClass21_Sub3_36.method17509(Class121.aClass121_17, 128, 128, 16, true, local41);
		}
		return this.anInterface23_3 != null;
	}

	@OriginalMember(owner = "client!ir", name = "b", descriptor = "()Z", line = 69)
	public boolean method24762() {
		if (!this.aClass21_Sub3_36.aBoolean438) {
			return false;
		}
		if (this.anInterface23_3 == null) {
			@Pc(25) byte[] local25;
			if (anObject14 == null) {
				local25 = Class397.method27515(128, 128, 16, 8, new Class59_Sub1(419684), 4.0F, 4.0F, 16.0F, 0.5F, 0.6F);
				anObject14 = Class602.method33519(local25, false);
			}
			local25 = Class3_Sub1_Sub19.method33681(anObject14, false);
			@Pc(41) byte[] local41 = new byte[local25.length * 4];
			@Pc(43) int local43 = 0;
			for (@Pc(45) int local45 = 0; local45 < 16; local45++) {
				@Pc(52) int local52 = local45 * 16384;
				@Pc(54) int local54 = local52;
				for (@Pc(56) int local56 = 0; local56 < 128; local56++) {
					@Pc(65) int local65 = local54 + local56 * 128;
					@Pc(75) int local75 = local54 + (local56 - 1 & 0x7F) * 128;
					@Pc(85) int local85 = local54 + (local56 + 1 & 0x7F) * 128;
					for (@Pc(87) int local87 = 0; local87 < 128; local87++) {
						@Pc(107) float local107 = (float) ((local25[local75 + local87] & 0xFF) - (local25[local85 + local87] & 0xFF));
						@Pc(132) float local132 = (float) ((local25[local65 + (local87 - 1 & 0x7F)] & 0xFF) - (local25[local65 + (local87 + 1 & 0x7F)] & 0xFF));
						@Pc(147) float local147 = (float) (128.0D / Math.sqrt((double) (local132 * local132 + 16384.0F + local107 * local107)));
						local41[local43++] = (byte) (local132 * local147 + 127.0F);
						local41[local43++] = (byte) (local147 * 128.0F + 127.0F);
						local41[local43++] = (byte) (local107 * local147 + 127.0F);
						local41[local43++] = local25[local52++];
					}
				}
			}
			this.anInterface23_3 = this.aClass21_Sub3_36.method17509(Class121.aClass121_17, 128, 128, 16, true, local41);
		}
		return this.anInterface23_3 != null;
	}

	@OriginalMember(owner = "client!ir", name = "c", descriptor = "()Z", line = 69)
	public boolean method24763() {
		if (!this.aClass21_Sub3_36.aBoolean438) {
			return false;
		}
		if (this.anInterface23_3 == null) {
			@Pc(25) byte[] local25;
			if (anObject14 == null) {
				local25 = Class397.method27515(128, 128, 16, 8, new Class59_Sub1(419684), 4.0F, 4.0F, 16.0F, 0.5F, 0.6F);
				anObject14 = Class602.method33519(local25, false);
			}
			local25 = Class3_Sub1_Sub19.method33681(anObject14, false);
			@Pc(41) byte[] local41 = new byte[local25.length * 4];
			@Pc(43) int local43 = 0;
			for (@Pc(45) int local45 = 0; local45 < 16; local45++) {
				@Pc(52) int local52 = local45 * 16384;
				@Pc(54) int local54 = local52;
				for (@Pc(56) int local56 = 0; local56 < 128; local56++) {
					@Pc(65) int local65 = local54 + local56 * 128;
					@Pc(75) int local75 = local54 + (local56 - 1 & 0x7F) * 128;
					@Pc(85) int local85 = local54 + (local56 + 1 & 0x7F) * 128;
					for (@Pc(87) int local87 = 0; local87 < 128; local87++) {
						@Pc(107) float local107 = (float) ((local25[local75 + local87] & 0xFF) - (local25[local85 + local87] & 0xFF));
						@Pc(132) float local132 = (float) ((local25[local65 + (local87 - 1 & 0x7F)] & 0xFF) - (local25[local65 + (local87 + 1 & 0x7F)] & 0xFF));
						@Pc(147) float local147 = (float) (128.0D / Math.sqrt((double) (local132 * local132 + 16384.0F + local107 * local107)));
						local41[local43++] = (byte) (local132 * local147 + 127.0F);
						local41[local43++] = (byte) (local147 * 128.0F + 127.0F);
						local41[local43++] = (byte) (local107 * local147 + 127.0F);
						local41[local43++] = local25[local52++];
					}
				}
			}
			this.anInterface23_3 = this.aClass21_Sub3_36.method17509(Class121.aClass121_17, 128, 128, 16, true, local41);
		}
		return this.anInterface23_3 != null;
	}
}
