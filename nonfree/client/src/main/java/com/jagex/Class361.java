package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kf")
public class Class361 {

	@OriginalMember(owner = "client!kf", name = "v", descriptor = "I")
	public static final int anInt4511 = 16;

	@OriginalMember(owner = "client!kf", name = "c", descriptor = "I")
	static final int anInt4512 = 128;

	@OriginalMember(owner = "client!kf", name = "s", descriptor = "Ljava/lang/Object;")
	static Object anObject15;

	@OriginalMember(owner = "client!kf", name = "p", descriptor = "I")
	static final int anInt4513 = 128;

	@OriginalMember(owner = "client!kf", name = "r", descriptor = "Ljava/lang/Object;")
	static Object anObject16;

	@OriginalMember(owner = "client!kf", name = "g", descriptor = "Ljava/lang/Object;")
	static Object anObject17;

	@OriginalMember(owner = "client!kf", name = "w", descriptor = "[Lclient!ks;")
	Interface37[] anInterface37Array1 = null;

	@OriginalMember(owner = "client!kf", name = "t", descriptor = "Lclient!kn;")
	Interface34 anInterface34_3 = null;

	@OriginalMember(owner = "client!kf", name = "q", descriptor = "[Lclient!ks;")
	public Interface37[] anInterface37Array2 = null;

	@OriginalMember(owner = "client!kf", name = "x", descriptor = "Lclient!kn;")
	public Interface34 anInterface34_1 = null;

	@OriginalMember(owner = "client!kf", name = "d", descriptor = "Lclient!kn;")
	public Interface34 anInterface34_2 = null;

	@OriginalMember(owner = "client!kf", name = "l", descriptor = "Lclient!aed;")
	Class86_Sub1 aClass86_Sub1_36;

	@OriginalMember(owner = "client!kf", name = "y", descriptor = "Z")
	public boolean aBoolean722;

	@OriginalMember(owner = "client!kf", name = "p", descriptor = "()V", line = 25)
	static void method28005() {
		@Pc(11) byte[] local11;
		if (anObject15 == null) {
			@Pc(5) Class119_Sub1_Sub2 local5 = new Class119_Sub1_Sub2();
			local11 = local5.method21346(128, 128, 16);
			anObject15 = Class29.method498(local11, false);
		}
		if (anObject16 == null) {
			@Pc(22) Class119_Sub2_Sub2 local22 = new Class119_Sub2_Sub2();
			local11 = local22.method18627(128, 128, 16);
			anObject16 = Class29.method498(local11, false);
		}
	}

	@OriginalMember(owner = "client!kf", name = "l", descriptor = "()V", line = 25)
	static void method28006() {
		@Pc(11) byte[] local11;
		if (anObject15 == null) {
			@Pc(5) Class119_Sub1_Sub2 local5 = new Class119_Sub1_Sub2();
			local11 = local5.method21346(128, 128, 16);
			anObject15 = Class29.method498(local11, false);
		}
		if (anObject16 == null) {
			@Pc(22) Class119_Sub2_Sub2 local22 = new Class119_Sub2_Sub2();
			local11 = local22.method18627(128, 128, 16);
			anObject16 = Class29.method498(local11, false);
		}
	}

	@OriginalMember(owner = "client!kf", name = "<init>", descriptor = "(Lclient!aed;)V", line = 37)
	Class361(@OriginalArg(0) Class86_Sub1 arg0) {
		this.aClass86_Sub1_36 = arg0;
		this.aBoolean722 = this.aClass86_Sub1_36.aBoolean458;
		if (this.aBoolean722 && !this.aClass86_Sub1_36.aBoolean459) {
			this.aBoolean722 = false;
		}
		if (this.aBoolean722 && !this.aClass86_Sub1_36.method20691(Class212.aClass212_26, Class206.aClass206_23)) {
			this.aBoolean722 = false;
		}
		if (this.aBoolean722 || this.aClass86_Sub1_36.method20676(Class212.aClass212_26, Class206.aClass206_23)) {
			method28005();
			if (this.aBoolean722) {
				@Pc(128) byte[] local128 = Class21.method417(anObject15, false);
				this.anInterface34_3 = this.aClass86_Sub1_36.method20766(Class212.aClass212_26, 128, 128, 16, true, local128);
				@Pc(144) byte[] local144 = Class21.method417(anObject16, false);
				this.anInterface34_1 = this.aClass86_Sub1_36.method20766(Class212.aClass212_26, 128, 128, 16, true, local144);
			} else {
				this.anInterface37Array1 = new Interface37[16];
				@Pc(66) int local66;
				@Pc(77) byte[] local77;
				for (local66 = 0; local66 < 16; local66++) {
					local77 = Class137.method14102(anObject15, local66 * 32768, 32768);
					this.anInterface37Array1[local66] = this.aClass86_Sub1_36.method20533(Class212.aClass212_26, 128, 128, true, local77);
				}
				this.anInterface37Array2 = new Interface37[16];
				for (local66 = 0; local66 < 16; local66++) {
					local77 = Class137.method14102(anObject16, local66 * 32768, 32768);
					this.anInterface37Array2[local66] = this.aClass86_Sub1_36.method20533(Class212.aClass212_26, 128, 128, true, local77);
				}
			}
		}
	}

	@OriginalMember(owner = "client!kf", name = "c", descriptor = "()Z", line = 65)
	public boolean method28007() {
		return this.aBoolean722 ? this.anInterface34_3 != null : this.anInterface37Array1 != null;
	}

	@OriginalMember(owner = "client!kf", name = "v", descriptor = "()Z", line = 69)
	public boolean method28008() {
		if (!this.aClass86_Sub1_36.aBoolean458) {
			return false;
		}
		if (this.anInterface34_2 == null) {
			@Pc(25) byte[] local25;
			if (anObject17 == null) {
				local25 = Class531.method30738(128, 128, 16, 8, new Class140_Sub1(419684), 4.0F, 4.0F, 16.0F, 0.5F, 0.6F);
				anObject17 = Class29.method498(local25, false);
			}
			local25 = Class21.method417(anObject17, false);
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
			this.anInterface34_2 = this.aClass86_Sub1_36.method20766(Class212.aClass212_18, 128, 128, 16, true, local41);
		}
		return this.anInterface34_2 != null;
	}

	@OriginalMember(owner = "client!kf", name = "y", descriptor = "()Z", line = 69)
	public boolean method28009() {
		if (!this.aClass86_Sub1_36.aBoolean458) {
			return false;
		}
		if (this.anInterface34_2 == null) {
			@Pc(25) byte[] local25;
			if (anObject17 == null) {
				local25 = Class531.method30738(128, 128, 16, 8, new Class140_Sub1(419684), 4.0F, 4.0F, 16.0F, 0.5F, 0.6F);
				anObject17 = Class29.method498(local25, false);
			}
			local25 = Class21.method417(anObject17, false);
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
			this.anInterface34_2 = this.aClass86_Sub1_36.method20766(Class212.aClass212_18, 128, 128, 16, true, local41);
		}
		return this.anInterface34_2 != null;
	}

	@OriginalMember(owner = "client!kf", name = "w", descriptor = "()Z", line = 69)
	public boolean method28010() {
		if (!this.aClass86_Sub1_36.aBoolean458) {
			return false;
		}
		if (this.anInterface34_2 == null) {
			@Pc(25) byte[] local25;
			if (anObject17 == null) {
				local25 = Class531.method30738(128, 128, 16, 8, new Class140_Sub1(419684), 4.0F, 4.0F, 16.0F, 0.5F, 0.6F);
				anObject17 = Class29.method498(local25, false);
			}
			local25 = Class21.method417(anObject17, false);
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
			this.anInterface34_2 = this.aClass86_Sub1_36.method20766(Class212.aClass212_18, 128, 128, 16, true, local41);
		}
		return this.anInterface34_2 != null;
	}

	@OriginalMember(owner = "client!kf", name = "t", descriptor = "()Z", line = 69)
	public boolean method28011() {
		if (!this.aClass86_Sub1_36.aBoolean458) {
			return false;
		}
		if (this.anInterface34_2 == null) {
			@Pc(25) byte[] local25;
			if (anObject17 == null) {
				local25 = Class531.method30738(128, 128, 16, 8, new Class140_Sub1(419684), 4.0F, 4.0F, 16.0F, 0.5F, 0.6F);
				anObject17 = Class29.method498(local25, false);
			}
			local25 = Class21.method417(anObject17, false);
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
			this.anInterface34_2 = this.aClass86_Sub1_36.method20766(Class212.aClass212_18, 128, 128, 16, true, local41);
		}
		return this.anInterface34_2 != null;
	}
}
