package com.jagex;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine.Info;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qz")
public class Class422 {

	@OriginalMember(owner = "client!qz", name = "h", descriptor = "I")
	int anInt4848;

	@OriginalMember(owner = "client!qz", name = "x", descriptor = "I")
	int anInt4851;

	// $FF: synthetic field
	@OriginalMember(owner = "client!qz", name = "this$0", descriptor = "Lclient!aew;")
	final Class48_Sub2 this$0;

	@OriginalMember(owner = "client!qz", name = "y", descriptor = "I")
	int anInt4847;

	@OriginalMember(owner = "client!qz", name = "b", descriptor = "I")
	int anInt4850;

	@OriginalMember(owner = "client!qz", name = "c", descriptor = "Ljava/util/List;")
	List aList16;

	@OriginalMember(owner = "client!qz", name = "u", descriptor = "F")
	float aFloat301;

	@OriginalMember(owner = "client!qz", name = "a", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
	SourceDataLine aSourceDataLine1;

	@OriginalMember(owner = "client!qz", name = "g", descriptor = "[B")
	byte[] aByteArray89;

	@OriginalMember(owner = "client!qz", name = "l", descriptor = "[B")
	byte[] aByteArray90;

	@OriginalMember(owner = "client!qz", name = "s", descriptor = "I")
	int anInt4849;

	@OriginalMember(owner = "client!qz", name = "p", descriptor = "Z")
	boolean aBoolean757;

	@OriginalMember(owner = "client!qz", name = "p", descriptor = "(Ljava/lang/CharSequence;CI)I", line = 11)
	static int method27874(@OriginalArg(0) CharSequence arg0, @OriginalArg(1) char arg1) {
		@Pc(1) int local1 = 0;
		@Pc(4) int local4 = arg0.length();
		for (@Pc(6) int local6 = 0; local6 < local4; local6++) {
			if (arg0.charAt(local6) == arg1) {
				local1++;
			}
		}
		return local1;
	}

	@OriginalMember(owner = "client!qz", name = "<init>", descriptor = "(Lclient!aew;FI)V", line = 340)
	Class422(@OriginalArg(0) Class48_Sub2 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2) {
		this.this$0 = arg0;
		this.anInt4847 = 1591857520;
		this.anInt4850 = 1137703930;
		this.aList16 = new ArrayList();
		if (!this.aBoolean757) {
			this.aFloat301 = arg1;
			if (this.anInt4847 * 1913449127 > 16) {
				throw new RuntimeException("");
			}
			try {
				@Pc(49) AudioFormat local49 = new AudioFormat(this.aFloat301, this.anInt4847 * 1913449127, this.anInt4850 * -545405099, true, false);
				try {
					@Pc(56) Info local56 = new Info(SourceDataLine.class, local49, arg2);
					this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local56);
				} catch (@Pc(63) IllegalArgumentException local63) {
					return;
				}
				this.aSourceDataLine1.open(local49, arg2);
				this.aSourceDataLine1.start();
			} catch (@Pc(74) LineUnavailableException local74) {
				return;
			}
			this.aByteArray89 = new byte[arg2];
			this.aByteArray90 = new byte[this.anInt4847 * 1913449127 / 8];
			this.anInt4849 = 0;
			this.aBoolean757 = true;
		}
	}

	@OriginalMember(owner = "client!qz", name = "p", descriptor = "(I)V", line = 366)
	void method27854() {
		if (this.aBoolean757 && this.aSourceDataLine1 != null) {
			this.anInt4848 = this.aSourceDataLine1.available() * 9926065;
		}
	}

	@OriginalMember(owner = "client!qz", name = "x", descriptor = "()V", line = 366)
	void method27856() {
		if (this.aBoolean757 && this.aSourceDataLine1 != null) {
			this.anInt4848 = this.aSourceDataLine1.available() * 9926065;
		}
	}

	@OriginalMember(owner = "client!qz", name = "s", descriptor = "()V", line = 366)
	void method27860() {
		if (this.aBoolean757 && this.aSourceDataLine1 != null) {
			this.anInt4848 = this.aSourceDataLine1.available() * 9926065;
		}
	}

	@OriginalMember(owner = "client!qz", name = "u", descriptor = "()V", line = 366)
	void method27861() {
		if (this.aBoolean757 && this.aSourceDataLine1 != null) {
			this.anInt4848 = this.aSourceDataLine1.available() * 9926065;
		}
	}

	@OriginalMember(owner = "client!qz", name = "b", descriptor = "()V", line = 373)
	void method27858() {
		this.anInt4851 = 0;
		this.method27855();
		while (this.anInt4851 * -531113883 > 0) {
			@Pc(15) int local15 = this.anInt4851 * -531113883;
			if (this.anInt4849 * -1365258107 + local15 >= this.aByteArray89.length) {
				local15 = this.aByteArray89.length - this.anInt4849 * -1365258107;
			}
			this.aSourceDataLine1.write(this.aByteArray89, this.anInt4849 * -1365258107, local15);
			for (@Pc(47) int local47 = 0; local47 < local15; local47++) {
				this.aByteArray89[this.anInt4849 * -1365258107 + local47] = 0;
			}
			this.anInt4849 += local15 * 602646605;
			this.anInt4849 = this.anInt4849 * -1365258107 % this.aByteArray89.length * 602646605;
			this.anInt4851 -= local15 * -1079305875;
		}
	}

	@OriginalMember(owner = "client!qz", name = "y", descriptor = "()V", line = 373)
	void method27862() {
		this.anInt4851 = 0;
		this.method27855();
		while (this.anInt4851 * -531113883 > 0) {
			@Pc(15) int local15 = this.anInt4851 * -531113883;
			if (this.anInt4849 * -1365258107 + local15 >= this.aByteArray89.length) {
				local15 = this.aByteArray89.length - this.anInt4849 * -1365258107;
			}
			this.aSourceDataLine1.write(this.aByteArray89, this.anInt4849 * -1365258107, local15);
			for (@Pc(47) int local47 = 0; local47 < local15; local47++) {
				this.aByteArray89[this.anInt4849 * -1365258107 + local47] = 0;
			}
			this.anInt4849 += local15 * 602646605;
			this.anInt4849 = this.anInt4849 * -1365258107 % this.aByteArray89.length * 602646605;
			this.anInt4851 -= local15 * -1079305875;
		}
	}

	@OriginalMember(owner = "client!qz", name = "a", descriptor = "(I)V", line = 373)
	void method27867() {
		this.anInt4851 = 0;
		this.method27855();
		while (this.anInt4851 * -531113883 > 0) {
			@Pc(15) int local15 = this.anInt4851 * -531113883;
			if (this.anInt4849 * -1365258107 + local15 >= this.aByteArray89.length) {
				local15 = this.aByteArray89.length - this.anInt4849 * -1365258107;
			}
			this.aSourceDataLine1.write(this.aByteArray89, this.anInt4849 * -1365258107, local15);
			for (@Pc(47) int local47 = 0; local47 < local15; local47++) {
				this.aByteArray89[this.anInt4849 * -1365258107 + local47] = 0;
			}
			this.anInt4849 += local15 * 602646605;
			this.anInt4849 = this.anInt4849 * -1365258107 % this.aByteArray89.length * 602646605;
			this.anInt4851 -= local15 * -1079305875;
		}
	}

	@OriginalMember(owner = "client!qz", name = "g", descriptor = "(I)V", line = 391)
	void method27855() {
		synchronized (this) {
			@Pc(5) int local5 = Integer.MAX_VALUE;
			@Pc(18) double local18 = (double) (this.anInt4850 * -545405099 * (this.anInt4847 * 1913449127 / 8));
			@Pc(20) boolean local20 = false;
			@Pc(24) Iterator local24 = this.aList16.iterator();
			while (local24.hasNext()) {
				@Pc(31) Class419 local31 = (Class419) local24.next();
				@Pc(40) int local40 = local31.aByteArray87.length - local31.anInt4842 * -141161107;
				if (local31.aFloat300 != this.aFloat301) {
					local40 = (int) ((float) local40 * (this.aFloat301 / local31.aFloat300));
					local40 = (int) (local18 * Math.ceil((double) local40 / local18));
				}
				local31.anInt4843 = local40 * -1963137125;
				if (local40 > 0 && local40 < local5) {
					local20 = true;
					local5 = local40;
				}
			}
			if (local5 > this.anInt4848 * 848933713) {
				local5 = this.anInt4848 * 848933713;
			}
			if (local5 != 0 && local20) {
				@Pc(106) int local106 = this.anInt4847 * 1913449127 / 8;
				@Pc(110) Iterator local110 = this.aList16.iterator();
				while (true) {
					@Pc(117) Class419 local117;
					do {
						if (!local110.hasNext()) {
							this.anInt4851 = local5 * -1079305875;
							return;
						}
						local117 = (Class419) local110.next();
					} while (local117.anInt4843 * -1332599149 < local5);
					@Pc(129) int local129 = this.anInt4849 * -1365258107;
					@Pc(131) int local131 = 0;
					@Pc(138) int local138 = local117.anInt4844 * -1626414291 / 8;
					@Pc(140) double local140 = 0.0D;
					@Pc(142) int local142 = 0;
					@Pc(146) double local146 = (double) this.aFloat301;
					@Pc(150) double local150 = (double) local117.aFloat300;
					@Pc(155) int local155 = local117.anInt4840 * 458331599;
					while (local117.anInt4843 * -1332599149 > 0 && local131 < local5) {
						@Pc(165) short local165 = 0;
						@Pc(167) short local167 = 0;
						@Pc(170) byte[] local170 = this.aByteArray90;
						for (@Pc(172) int local172 = 0; local172 < local170.length; local172++) {
							local170[local172] = this.aByteArray89[local129 + local172];
							local165 = (short) (local165 | (local170[local172] & 0xFF) << local172 * 8);
						}
						@Pc(209) byte[] local209;
						if (local117.aFloat300 == this.aFloat301) {
							local209 = local117.aByteArray88;
							for (@Pc(396) int local396 = 0; local396 < local209.length; local396++) {
								local209[local396] = local117.aByteArray87[local396 + local117.anInt4840 * 458331599];
								local167 = (short) (local167 | (local209[local396] & 0xFF) << local396 * 8);
							}
							local117.anInt4840 += local138 * 1362186543;
							local117.anInt4840 = local117.anInt4840 * 458331599 % local117.aByteArray87.length * 1362186543;
							local117.anInt4842 += local138 * -728562587;
						} else {
							local209 = local117.aByteArray88;
							@Pc(216) float local216 = (float) (local140 / local146 * local150);
							@Pc(221) float local221 = (float) Math.floor((double) local216);
							@Pc(223) short local223 = 0;
							@Pc(225) short local225 = 0;
							@Pc(230) int local230 = (int) Math.floor((double) local216);
							@Pc(235) int local235 = (int) Math.ceil((double) local216);
							@Pc(250) int local250 = local209.length * local142 + local230 * -1113018561 * local117.anInt4841 * local209.length;
							@Pc(265) int local265 = local117.anInt4841 * -1113018561 * local209.length * local235 + local209.length * local142;
							@Pc(269) int local269 = local250 + local155;
							@Pc(273) int local273 = local265 + local155;
							@Pc(279) int local279 = local269 % local117.aByteArray87.length;
							@Pc(285) int local285 = local273 % local117.aByteArray87.length;
							@Pc(287) int local287;
							for (local287 = 0; local287 < local209.length; local287++) {
								local209[local287] = local117.aByteArray87[local287 + local279];
								local223 = (short) (local223 | (local209[local287] & 0xFF) << local287 * 8);
							}
							for (local287 = 0; local287 < local209.length; local287++) {
								local209[local287] = local117.aByteArray87[local285 + local287];
								local225 = (short) (local225 | (local209[local287] & 0xFF) << local287 * 8);
							}
							@Pc(349) float local349 = local216 - local221;
							if (local349 < 0.0F || local349 > 1.0F) {
								throw new RuntimeException("");
							}
							@Pc(367) float local367 = (float) (local225 - local223);
							local167 = (short) (local367 * local349 + (float) local223);
							local142++;
							local142 %= local117.anInt4841 * -1113018561;
							if (local142 == 0) {
								local140++;
							}
						}
						local167 += local165;
						if (local167 > 32767) {
							local167 = 32767;
						}
						if (local167 < -32768) {
							local167 = -32768;
						}
						this.aByteArray89[local129] = (byte) local167;
						this.aByteArray89[local129 + 1] = (byte) (local167 >> 8);
						local129 += local106;
						local129 %= this.aByteArray89.length;
						local131 += local138;
					}
					if (local117.aFloat300 != this.aFloat301) {
						@Pc(516) double local516 = (double) local5 * (local150 / local146);
						@Pc(524) int local524 = (int) (local18 * Math.ceil(local516 / local18));
						local117.anInt4840 += local524 * 1362186543;
						local117.anInt4840 = local117.anInt4840 * 458331599 % local117.aByteArray87.length * 1362186543;
						local117.anInt4842 += local524 * -728562587;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!qz", name = "c", descriptor = "()V", line = 391)
	void method27864() {
		synchronized (this) {
			@Pc(5) int local5 = Integer.MAX_VALUE;
			@Pc(18) double local18 = (double) (this.anInt4850 * -545405099 * (this.anInt4847 * 1913449127 / 8));
			@Pc(20) boolean local20 = false;
			@Pc(24) Iterator local24 = this.aList16.iterator();
			while (local24.hasNext()) {
				@Pc(31) Class419 local31 = (Class419) local24.next();
				@Pc(40) int local40 = local31.aByteArray87.length - local31.anInt4842 * -141161107;
				if (local31.aFloat300 != this.aFloat301) {
					local40 = (int) ((float) local40 * (this.aFloat301 / local31.aFloat300));
					local40 = (int) (local18 * Math.ceil((double) local40 / local18));
				}
				local31.anInt4843 = local40 * -1963137125;
				if (local40 > 0 && local40 < local5) {
					local20 = true;
					local5 = local40;
				}
			}
			if (local5 > this.anInt4848 * 848933713) {
				local5 = this.anInt4848 * 848933713;
			}
			if (local5 != 0 && local20) {
				@Pc(106) int local106 = this.anInt4847 * 1913449127 / 8;
				@Pc(110) Iterator local110 = this.aList16.iterator();
				while (true) {
					@Pc(117) Class419 local117;
					do {
						if (!local110.hasNext()) {
							this.anInt4851 = local5 * -1079305875;
							return;
						}
						local117 = (Class419) local110.next();
					} while (local117.anInt4843 * -1332599149 < local5);
					@Pc(129) int local129 = this.anInt4849 * -1365258107;
					@Pc(131) int local131 = 0;
					@Pc(138) int local138 = local117.anInt4844 * -1626414291 / 8;
					@Pc(140) double local140 = 0.0D;
					@Pc(142) int local142 = 0;
					@Pc(146) double local146 = (double) this.aFloat301;
					@Pc(150) double local150 = (double) local117.aFloat300;
					@Pc(155) int local155 = local117.anInt4840 * 458331599;
					while (local117.anInt4843 * -1332599149 > 0 && local131 < local5) {
						@Pc(165) short local165 = 0;
						@Pc(167) short local167 = 0;
						@Pc(170) byte[] local170 = this.aByteArray90;
						for (@Pc(172) int local172 = 0; local172 < local170.length; local172++) {
							local170[local172] = this.aByteArray89[local129 + local172];
							local165 = (short) (local165 | (local170[local172] & 0xFF) << local172 * 8);
						}
						@Pc(209) byte[] local209;
						if (local117.aFloat300 == this.aFloat301) {
							local209 = local117.aByteArray88;
							for (@Pc(396) int local396 = 0; local396 < local209.length; local396++) {
								local209[local396] = local117.aByteArray87[local396 + local117.anInt4840 * 458331599];
								local167 = (short) (local167 | (local209[local396] & 0xFF) << local396 * 8);
							}
							local117.anInt4840 += local138 * 1362186543;
							local117.anInt4840 = local117.anInt4840 * 458331599 % local117.aByteArray87.length * 1362186543;
							local117.anInt4842 += local138 * -728562587;
						} else {
							local209 = local117.aByteArray88;
							@Pc(216) float local216 = (float) (local140 / local146 * local150);
							@Pc(221) float local221 = (float) Math.floor((double) local216);
							@Pc(223) short local223 = 0;
							@Pc(225) short local225 = 0;
							@Pc(230) int local230 = (int) Math.floor((double) local216);
							@Pc(235) int local235 = (int) Math.ceil((double) local216);
							@Pc(250) int local250 = local209.length * local142 + local230 * -1113018561 * local117.anInt4841 * local209.length;
							@Pc(265) int local265 = local117.anInt4841 * -1113018561 * local209.length * local235 + local209.length * local142;
							@Pc(269) int local269 = local250 + local155;
							@Pc(273) int local273 = local265 + local155;
							@Pc(279) int local279 = local269 % local117.aByteArray87.length;
							@Pc(285) int local285 = local273 % local117.aByteArray87.length;
							@Pc(287) int local287;
							for (local287 = 0; local287 < local209.length; local287++) {
								local209[local287] = local117.aByteArray87[local287 + local279];
								local223 = (short) (local223 | (local209[local287] & 0xFF) << local287 * 8);
							}
							for (local287 = 0; local287 < local209.length; local287++) {
								local209[local287] = local117.aByteArray87[local285 + local287];
								local225 = (short) (local225 | (local209[local287] & 0xFF) << local287 * 8);
							}
							@Pc(349) float local349 = local216 - local221;
							if (local349 < 0.0F || local349 > 1.0F) {
								throw new RuntimeException("");
							}
							@Pc(367) float local367 = (float) (local225 - local223);
							local167 = (short) (local367 * local349 + (float) local223);
							local142++;
							local142 %= local117.anInt4841 * -1113018561;
							if (local142 == 0) {
								local140++;
							}
						}
						local167 += local165;
						if (local167 > 32767) {
							local167 = 32767;
						}
						if (local167 < -32768) {
							local167 = -32768;
						}
						this.aByteArray89[local129] = (byte) local167;
						this.aByteArray89[local129 + 1] = (byte) (local167 >> 8);
						local129 += local106;
						local129 %= this.aByteArray89.length;
						local131 += local138;
					}
					if (local117.aFloat300 != this.aFloat301) {
						@Pc(516) double local516 = (double) local5 * (local150 / local146);
						@Pc(524) int local524 = (int) (local18 * Math.ceil(local516 / local18));
						local117.anInt4840 += local524 * 1362186543;
						local117.anInt4840 = local117.anInt4840 * 458331599 % local117.aByteArray87.length * 1362186543;
						local117.anInt4842 += local524 * -728562587;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!qz", name = "z", descriptor = "()V", line = 391)
	void method27865() {
		synchronized (this) {
			@Pc(5) int local5 = Integer.MAX_VALUE;
			@Pc(18) double local18 = (double) (this.anInt4850 * -545405099 * (this.anInt4847 * 1913449127 / 8));
			@Pc(20) boolean local20 = false;
			@Pc(24) Iterator local24 = this.aList16.iterator();
			while (local24.hasNext()) {
				@Pc(31) Class419 local31 = (Class419) local24.next();
				@Pc(40) int local40 = local31.aByteArray87.length - local31.anInt4842 * -141161107;
				if (local31.aFloat300 != this.aFloat301) {
					local40 = (int) ((float) local40 * (this.aFloat301 / local31.aFloat300));
					local40 = (int) (local18 * Math.ceil((double) local40 / local18));
				}
				local31.anInt4843 = local40 * -1963137125;
				if (local40 > 0 && local40 < local5) {
					local20 = true;
					local5 = local40;
				}
			}
			if (local5 > this.anInt4848 * 848933713) {
				local5 = this.anInt4848 * 848933713;
			}
			if (local5 != 0 && local20) {
				@Pc(106) int local106 = this.anInt4847 * 1913449127 / 8;
				@Pc(110) Iterator local110 = this.aList16.iterator();
				while (true) {
					@Pc(117) Class419 local117;
					do {
						if (!local110.hasNext()) {
							this.anInt4851 = local5 * -1079305875;
							return;
						}
						local117 = (Class419) local110.next();
					} while (local117.anInt4843 * -1332599149 < local5);
					@Pc(129) int local129 = this.anInt4849 * -1365258107;
					@Pc(131) int local131 = 0;
					@Pc(138) int local138 = local117.anInt4844 * -1626414291 / 8;
					@Pc(140) double local140 = 0.0D;
					@Pc(142) int local142 = 0;
					@Pc(146) double local146 = (double) this.aFloat301;
					@Pc(150) double local150 = (double) local117.aFloat300;
					@Pc(155) int local155 = local117.anInt4840 * 458331599;
					while (local117.anInt4843 * -1332599149 > 0 && local131 < local5) {
						@Pc(165) short local165 = 0;
						@Pc(167) short local167 = 0;
						@Pc(170) byte[] local170 = this.aByteArray90;
						for (@Pc(172) int local172 = 0; local172 < local170.length; local172++) {
							local170[local172] = this.aByteArray89[local129 + local172];
							local165 = (short) (local165 | (local170[local172] & 0xFF) << local172 * 8);
						}
						@Pc(209) byte[] local209;
						if (local117.aFloat300 == this.aFloat301) {
							local209 = local117.aByteArray88;
							for (@Pc(396) int local396 = 0; local396 < local209.length; local396++) {
								local209[local396] = local117.aByteArray87[local396 + local117.anInt4840 * 458331599];
								local167 = (short) (local167 | (local209[local396] & 0xFF) << local396 * 8);
							}
							local117.anInt4840 += local138 * 1362186543;
							local117.anInt4840 = local117.anInt4840 * 458331599 % local117.aByteArray87.length * 1362186543;
							local117.anInt4842 += local138 * -728562587;
						} else {
							local209 = local117.aByteArray88;
							@Pc(216) float local216 = (float) (local140 / local146 * local150);
							@Pc(221) float local221 = (float) Math.floor((double) local216);
							@Pc(223) short local223 = 0;
							@Pc(225) short local225 = 0;
							@Pc(230) int local230 = (int) Math.floor((double) local216);
							@Pc(235) int local235 = (int) Math.ceil((double) local216);
							@Pc(250) int local250 = local209.length * local142 + local230 * -1113018561 * local117.anInt4841 * local209.length;
							@Pc(265) int local265 = local117.anInt4841 * -1113018561 * local209.length * local235 + local209.length * local142;
							@Pc(269) int local269 = local250 + local155;
							@Pc(273) int local273 = local265 + local155;
							@Pc(279) int local279 = local269 % local117.aByteArray87.length;
							@Pc(285) int local285 = local273 % local117.aByteArray87.length;
							@Pc(287) int local287;
							for (local287 = 0; local287 < local209.length; local287++) {
								local209[local287] = local117.aByteArray87[local287 + local279];
								local223 = (short) (local223 | (local209[local287] & 0xFF) << local287 * 8);
							}
							for (local287 = 0; local287 < local209.length; local287++) {
								local209[local287] = local117.aByteArray87[local285 + local287];
								local225 = (short) (local225 | (local209[local287] & 0xFF) << local287 * 8);
							}
							@Pc(349) float local349 = local216 - local221;
							if (local349 < 0.0F || local349 > 1.0F) {
								throw new RuntimeException("");
							}
							@Pc(367) float local367 = (float) (local225 - local223);
							local167 = (short) (local367 * local349 + (float) local223);
							local142++;
							local142 %= local117.anInt4841 * -1113018561;
							if (local142 == 0) {
								local140++;
							}
						}
						local167 += local165;
						if (local167 > 32767) {
							local167 = 32767;
						}
						if (local167 < -32768) {
							local167 = -32768;
						}
						this.aByteArray89[local129] = (byte) local167;
						this.aByteArray89[local129 + 1] = (byte) (local167 >> 8);
						local129 += local106;
						local129 %= this.aByteArray89.length;
						local131 += local138;
					}
					if (local117.aFloat300 != this.aFloat301) {
						@Pc(516) double local516 = (double) local5 * (local150 / local146);
						@Pc(524) int local524 = (int) (local18 * Math.ceil(local516 / local18));
						local117.anInt4840 += local524 * 1362186543;
						local117.anInt4840 = local117.anInt4840 * 458331599 % local117.aByteArray87.length * 1362186543;
						local117.anInt4842 += local524 * -728562587;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!qz", name = "l", descriptor = "(Lclient!qw;I)V", line = 504)
	void method27857(@OriginalArg(0) Class419 arg0) {
		this.aList16.add(arg0);
	}

	@OriginalMember(owner = "client!qz", name = "e", descriptor = "(Lclient!qw;)V", line = 504)
	void method27859(@OriginalArg(0) Class419 arg0) {
		this.aList16.add(arg0);
	}

	@OriginalMember(owner = "client!qz", name = "n", descriptor = "(Lclient!qw;)V", line = 504)
	void method27863(@OriginalArg(0) Class419 arg0) {
		this.aList16.add(arg0);
	}

	@OriginalMember(owner = "client!qz", name = "j", descriptor = "(Lclient!qw;)V", line = 504)
	void method27866(@OriginalArg(0) Class419 arg0) {
		this.aList16.add(arg0);
	}

	@OriginalMember(owner = "client!qz", name = "h", descriptor = "(Lclient!qw;B)V", line = 508)
	void method27868(@OriginalArg(0) Class419 arg0) {
		this.aList16.remove(arg0);
	}

	@OriginalMember(owner = "client!qz", name = "r", descriptor = "(Lclient!qw;)V", line = 508)
	void method27869(@OriginalArg(0) Class419 arg0) {
		this.aList16.remove(arg0);
	}

	@OriginalMember(owner = "client!qz", name = "d", descriptor = "(Lclient!qw;)V", line = 508)
	void method27870(@OriginalArg(0) Class419 arg0) {
		this.aList16.remove(arg0);
	}

	@OriginalMember(owner = "client!qz", name = "iw", descriptor = "(IIIII)V", line = 5334)
	static final void method27876(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		Class592.method33350(Class613.aClass21_13);
		Class110.method22013(arg0, arg1, arg2, arg3);
		Class584.method33270(arg0, arg1, arg2, arg3, 256, 256);
		Class498.method29363(arg0, arg1, arg2, arg3);
		Class19_Sub2.method21424(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!qz", name = "amp", descriptor = "(Lclient!vs;B)V", line = 11210)
	static final void method27871(@OriginalArg(0) Class536 arg0) {
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = client.aBoolean579 ? 1 : 0;
	}

	@OriginalMember(owner = "client!qz", name = "ans", descriptor = "(Lclient!vs;I)V", line = 11399)
	static final void method27875(@OriginalArg(0) Class536 arg0) {
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub17_1, arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381]);
		Class26_Sub1_Sub1_Sub1.method16728();
		client.aBoolean573 = false;
	}

	@OriginalMember(owner = "client!qz", name = "atj", descriptor = "(Lclient!vs;B)V", line = 12386)
	static final void method27872(@OriginalArg(0) Class536 arg0) {
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = Class510.aClass3_Sub45_37.aClass60_Sub8_1.method13311() ? 1 : 0;
	}

	@OriginalMember(owner = "client!qz", name = "aur", descriptor = "(Lclient!vs;B)V", line = 12570)
	static final void method27873(@OriginalArg(0) Class536 arg0) {
		client.aBoolean599 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381] == 1;
		if (client.aBoolean599) {
			Class191.method24057();
		}
	}
}
