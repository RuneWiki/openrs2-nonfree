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

@OriginalClass("client!tz")
public class Class568 {

	@OriginalMember(owner = "client!tz", name = "y", descriptor = "I")
	int anInt5343;

	@OriginalMember(owner = "client!tz", name = "w", descriptor = "I")
	int anInt5344;

	// $FF: synthetic field
	@OriginalMember(owner = "client!tz", name = "this$0", descriptor = "Lclient!ahe;")
	final Class117_Sub1 this$0;

	@OriginalMember(owner = "client!tz", name = "x", descriptor = "I")
	int anInt5342;

	@OriginalMember(owner = "client!tz", name = "d", descriptor = "I")
	int anInt5345;

	@OriginalMember(owner = "client!tz", name = "s", descriptor = "Ljava/util/List;")
	List aList23;

	@OriginalMember(owner = "client!tz", name = "q", descriptor = "F")
	float aFloat312;

	@OriginalMember(owner = "client!tz", name = "c", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
	SourceDataLine aSourceDataLine1;

	@OriginalMember(owner = "client!tz", name = "v", descriptor = "[B")
	byte[] aByteArray99;

	@OriginalMember(owner = "client!tz", name = "l", descriptor = "[B")
	byte[] aByteArray98;

	@OriginalMember(owner = "client!tz", name = "t", descriptor = "I")
	int anInt5346;

	@OriginalMember(owner = "client!tz", name = "p", descriptor = "Z")
	boolean aBoolean801;

	@OriginalMember(owner = "client!tz", name = "c", descriptor = "(II)V", line = 24)
	public static void method31387(@OriginalArg(0) int arg0) {
		Class86.method19916(new Class584(arg0));
	}

	@OriginalMember(owner = "client!tz", name = "p", descriptor = "(Lclient!ws;B)V", line = 45)
	public static void method31388(@OriginalArg(0) Class629 arg0) {
		Class611.anInt5569 = arg0.anInt5675 * -5766567;
		Class611.anInt5570 = arg0.anInt5681 * -501365457;
		Class611.anInt5571 = arg0.anInt5692 * -2139802421;
	}

	@OriginalMember(owner = "client!tz", name = "y", descriptor = "(I)V", line = 83)
	public static void method31389() {
		Class622.aClass12_37 = new Class12(8);
		Class622.anInt5630 = 0;
		@Pc(9) Iterator local9 = Class622.aList24.iterator();
		while (local9.hasNext()) {
			@Pc(16) Class626 local16 = (Class626) local9.next();
			local16.method32501();
		}
	}

	@OriginalMember(owner = "client!tz", name = "<init>", descriptor = "(Lclient!ahe;FI)V", line = 340)
	Class568(@OriginalArg(0) Class117_Sub1 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2) {
		this.this$0 = arg0;
		this.anInt5342 = -141149584;
		this.anInt5345 = -859393982;
		this.aList23 = new ArrayList();
		if (!this.aBoolean801) {
			this.aFloat312 = arg1;
			if (this.anInt5342 * -1827073001 > 16) {
				throw new RuntimeException("");
			}
			try {
				@Pc(49) AudioFormat local49 = new AudioFormat(this.aFloat312, this.anInt5342 * -1827073001, this.anInt5345 * -828232735, true, false);
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
			this.aByteArray99 = new byte[arg2];
			this.aByteArray98 = new byte[this.anInt5342 * -1827073001 / 8];
			this.anInt5346 = 0;
			this.aBoolean801 = true;
		}
	}

	@OriginalMember(owner = "client!tz", name = "t", descriptor = "()V", line = 366)
	void method31390() {
		if (this.aBoolean801 && this.aSourceDataLine1 != null) {
			this.anInt5343 = this.aSourceDataLine1.available() * -464037189;
		}
	}

	@OriginalMember(owner = "client!tz", name = "p", descriptor = "(I)V", line = 366)
	void method31391() {
		if (this.aBoolean801 && this.aSourceDataLine1 != null) {
			this.anInt5343 = this.aSourceDataLine1.available() * -464037189;
		}
	}

	@OriginalMember(owner = "client!tz", name = "x", descriptor = "()V", line = 366)
	void method31392() {
		if (this.aBoolean801 && this.aSourceDataLine1 != null) {
			this.anInt5343 = this.aSourceDataLine1.available() * -464037189;
		}
	}

	@OriginalMember(owner = "client!tz", name = "d", descriptor = "()V", line = 366)
	void method31393() {
		if (this.aBoolean801 && this.aSourceDataLine1 != null) {
			this.anInt5343 = this.aSourceDataLine1.available() * -464037189;
		}
	}

	@OriginalMember(owner = "client!tz", name = "s", descriptor = "()V", line = 366)
	void method31394() {
		if (this.aBoolean801 && this.aSourceDataLine1 != null) {
			this.anInt5343 = this.aSourceDataLine1.available() * -464037189;
		}
	}

	@OriginalMember(owner = "client!tz", name = "q", descriptor = "()V", line = 366)
	void method31395() {
		if (this.aBoolean801 && this.aSourceDataLine1 != null) {
			this.anInt5343 = this.aSourceDataLine1.available() * -464037189;
		}
	}

	@OriginalMember(owner = "client!tz", name = "w", descriptor = "()V", line = 366)
	void method31396() {
		if (this.aBoolean801 && this.aSourceDataLine1 != null) {
			this.anInt5343 = this.aSourceDataLine1.available() * -464037189;
		}
	}

	@OriginalMember(owner = "client!tz", name = "c", descriptor = "(S)V", line = 373)
	void method31397() {
		this.anInt5344 = 0;
		this.method31402();
		while (this.anInt5344 * 1338147443 > 0) {
			@Pc(15) int local15 = this.anInt5344 * 1338147443;
			if (local15 + this.anInt5346 * 2045773485 >= this.aByteArray99.length) {
				local15 = this.aByteArray99.length - this.anInt5346 * 2045773485;
			}
			this.aSourceDataLine1.write(this.aByteArray99, this.anInt5346 * 2045773485, local15);
			for (@Pc(47) int local47 = 0; local47 < local15; local47++) {
				this.aByteArray99[local47 + this.anInt5346 * 2045773485] = 0;
			}
			this.anInt5346 += local15 * -635351771;
			this.anInt5346 = this.anInt5346 * 2045773485 % this.aByteArray99.length * -635351771;
			this.anInt5344 -= local15 * 1937699515;
		}
	}

	@OriginalMember(owner = "client!tz", name = "r", descriptor = "()V", line = 373)
	void method31398() {
		this.anInt5344 = 0;
		this.method31402();
		while (this.anInt5344 * 1338147443 > 0) {
			@Pc(15) int local15 = this.anInt5344 * 1338147443;
			if (local15 + this.anInt5346 * 2045773485 >= this.aByteArray99.length) {
				local15 = this.aByteArray99.length - this.anInt5346 * 2045773485;
			}
			this.aSourceDataLine1.write(this.aByteArray99, this.anInt5346 * 2045773485, local15);
			for (@Pc(47) int local47 = 0; local47 < local15; local47++) {
				this.aByteArray99[local47 + this.anInt5346 * 2045773485] = 0;
			}
			this.anInt5346 += local15 * -635351771;
			this.anInt5346 = this.anInt5346 * 2045773485 % this.aByteArray99.length * -635351771;
			this.anInt5344 -= local15 * 1937699515;
		}
	}

	@OriginalMember(owner = "client!tz", name = "g", descriptor = "()V", line = 373)
	void method31399() {
		this.anInt5344 = 0;
		this.method31402();
		while (this.anInt5344 * 1338147443 > 0) {
			@Pc(15) int local15 = this.anInt5344 * 1338147443;
			if (local15 + this.anInt5346 * 2045773485 >= this.aByteArray99.length) {
				local15 = this.aByteArray99.length - this.anInt5346 * 2045773485;
			}
			this.aSourceDataLine1.write(this.aByteArray99, this.anInt5346 * 2045773485, local15);
			for (@Pc(47) int local47 = 0; local47 < local15; local47++) {
				this.aByteArray99[local47 + this.anInt5346 * 2045773485] = 0;
			}
			this.anInt5346 += local15 * -635351771;
			this.anInt5346 = this.anInt5346 * 2045773485 % this.aByteArray99.length * -635351771;
			this.anInt5344 -= local15 * 1937699515;
		}
	}

	@OriginalMember(owner = "client!tz", name = "j", descriptor = "()V", line = 373)
	void method31400() {
		this.anInt5344 = 0;
		this.method31402();
		while (this.anInt5344 * 1338147443 > 0) {
			@Pc(15) int local15 = this.anInt5344 * 1338147443;
			if (local15 + this.anInt5346 * 2045773485 >= this.aByteArray99.length) {
				local15 = this.aByteArray99.length - this.anInt5346 * 2045773485;
			}
			this.aSourceDataLine1.write(this.aByteArray99, this.anInt5346 * 2045773485, local15);
			for (@Pc(47) int local47 = 0; local47 < local15; local47++) {
				this.aByteArray99[local47 + this.anInt5346 * 2045773485] = 0;
			}
			this.anInt5346 += local15 * -635351771;
			this.anInt5346 = this.anInt5346 * 2045773485 % this.aByteArray99.length * -635351771;
			this.anInt5344 -= local15 * 1937699515;
		}
	}

	@OriginalMember(owner = "client!tz", name = "z", descriptor = "()V", line = 373)
	void method31401() {
		this.anInt5344 = 0;
		this.method31402();
		while (this.anInt5344 * 1338147443 > 0) {
			@Pc(15) int local15 = this.anInt5344 * 1338147443;
			if (local15 + this.anInt5346 * 2045773485 >= this.aByteArray99.length) {
				local15 = this.aByteArray99.length - this.anInt5346 * 2045773485;
			}
			this.aSourceDataLine1.write(this.aByteArray99, this.anInt5346 * 2045773485, local15);
			for (@Pc(47) int local47 = 0; local47 < local15; local47++) {
				this.aByteArray99[local47 + this.anInt5346 * 2045773485] = 0;
			}
			this.anInt5346 += local15 * -635351771;
			this.anInt5346 = this.anInt5346 * 2045773485 % this.aByteArray99.length * -635351771;
			this.anInt5344 -= local15 * 1937699515;
		}
	}

	@OriginalMember(owner = "client!tz", name = "v", descriptor = "(B)V", line = 391)
	void method31402() {
		synchronized (this) {
			@Pc(5) int local5 = Integer.MAX_VALUE;
			@Pc(18) double local18 = (double) (this.anInt5342 * -1827073001 / 8 * this.anInt5345 * -828232735);
			@Pc(20) boolean local20 = false;
			@Pc(24) Iterator local24 = this.aList23.iterator();
			while (local24.hasNext()) {
				@Pc(31) Class564 local31 = (Class564) local24.next();
				@Pc(40) int local40 = local31.aByteArray94.length - local31.anInt5331 * 1052763975;
				if (local31.aFloat311 != this.aFloat312) {
					local40 = (int) ((float) local40 * (this.aFloat312 / local31.aFloat311));
					local40 = (int) (local18 * Math.ceil((double) local40 / local18));
				}
				local31.anInt5332 = local40 * -785239911;
				if (local40 > 0 && local40 < local5) {
					local20 = true;
					local5 = local40;
				}
			}
			if (local5 > this.anInt5343 * 1779292787) {
				local5 = this.anInt5343 * 1779292787;
			}
			if (local5 != 0 && local20) {
				@Pc(107) int local107 = this.anInt5342 * -1827073001 / 8;
				@Pc(111) Iterator local111 = this.aList23.iterator();
				while (true) {
					@Pc(118) Class564 local118;
					do {
						if (!local111.hasNext()) {
							this.anInt5344 = local5 * 1937699515;
							return;
						}
						local118 = (Class564) local111.next();
					} while (local118.anInt5332 * -509533271 < local5);
					@Pc(130) int local130 = this.anInt5346 * 2045773485;
					@Pc(132) int local132 = 0;
					@Pc(139) int local139 = local118.anInt5329 * -1888009577 / 8;
					@Pc(141) double local141 = 0.0D;
					@Pc(143) int local143 = 0;
					@Pc(147) double local147 = (double) this.aFloat312;
					@Pc(151) double local151 = (double) local118.aFloat311;
					@Pc(156) int local156 = local118.anInt5333 * -1790662003;
					while (local118.anInt5332 * -509533271 > 0 && local132 < local5) {
						@Pc(166) short local166 = 0;
						@Pc(168) short local168 = 0;
						@Pc(171) byte[] local171 = this.aByteArray98;
						for (@Pc(173) int local173 = 0; local173 < local171.length; local173++) {
							local171[local173] = this.aByteArray99[local173 + local130];
							local166 = (short) (local166 | (local171[local173] & 0xFF) << local173 * 8);
						}
						@Pc(210) byte[] local210;
						if (local118.aFloat311 == this.aFloat312) {
							local210 = local118.aByteArray95;
							for (@Pc(398) int local398 = 0; local398 < local210.length; local398++) {
								local210[local398] = local118.aByteArray94[local118.anInt5333 * -1790662003 + local398];
								local168 = (short) (local168 | (local210[local398] & 0xFF) << local398 * 8);
							}
							local118.anInt5333 += local139 * 1731733573;
							local118.anInt5333 = local118.anInt5333 * -1790662003 % local118.aByteArray94.length * 1731733573;
							local118.anInt5331 += local139 * -1837919625;
						} else {
							local210 = local118.aByteArray95;
							@Pc(217) float local217 = (float) (local151 * (local141 / local147));
							@Pc(222) float local222 = (float) Math.floor((double) local217);
							@Pc(224) short local224 = 0;
							@Pc(226) short local226 = 0;
							@Pc(231) int local231 = (int) Math.floor((double) local217);
							@Pc(236) int local236 = (int) Math.ceil((double) local217);
							@Pc(251) int local251 = local231 * local210.length * -1273949407 * local118.anInt5334 + local143 * local210.length;
							@Pc(266) int local266 = local143 * local210.length + local118.anInt5334 * -1273949407 * local210.length * local236;
							@Pc(270) int local270 = local251 + local156;
							@Pc(274) int local274 = local266 + local156;
							@Pc(280) int local280 = local270 % local118.aByteArray94.length;
							@Pc(286) int local286 = local274 % local118.aByteArray94.length;
							@Pc(288) int local288;
							for (local288 = 0; local288 < local210.length; local288++) {
								local210[local288] = local118.aByteArray94[local280 + local288];
								local224 = (short) (local224 | (local210[local288] & 0xFF) << local288 * 8);
							}
							for (local288 = 0; local288 < local210.length; local288++) {
								local210[local288] = local118.aByteArray94[local286 + local288];
								local226 = (short) (local226 | (local210[local288] & 0xFF) << local288 * 8);
							}
							@Pc(350) float local350 = local217 - local222;
							if (local350 < 0.0F || local350 > 1.0F) {
								throw new RuntimeException("");
							}
							@Pc(368) float local368 = (float) (local226 - local224);
							local168 = (short) ((float) local224 + local368 * local350);
							local143++;
							local143 %= local118.anInt5334 * -1273949407;
							if (local143 == 0) {
								local141++;
							}
						}
						local168 += local166;
						if (local168 > 32767) {
							local168 = 32767;
						}
						if (local168 < -32768) {
							local168 = -32768;
						}
						this.aByteArray99[local130] = (byte) local168;
						this.aByteArray99[local130 + 1] = (byte) (local168 >> 8);
						local130 += local107;
						local130 %= this.aByteArray99.length;
						local132 += local139;
					}
					if (local118.aFloat311 != this.aFloat312) {
						@Pc(518) double local518 = (double) local5 * (local151 / local147);
						@Pc(526) int local526 = (int) (local18 * Math.ceil(local518 / local18));
						local118.anInt5333 += local526 * 1731733573;
						local118.anInt5333 = local118.anInt5333 * -1790662003 % local118.aByteArray94.length * 1731733573;
						local118.anInt5331 += local526 * -1837919625;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!tz", name = "i", descriptor = "()V", line = 391)
	void method31403() {
		synchronized (this) {
			@Pc(5) int local5 = Integer.MAX_VALUE;
			@Pc(18) double local18 = (double) (this.anInt5342 * -1827073001 / 8 * this.anInt5345 * -828232735);
			@Pc(20) boolean local20 = false;
			@Pc(24) Iterator local24 = this.aList23.iterator();
			while (local24.hasNext()) {
				@Pc(31) Class564 local31 = (Class564) local24.next();
				@Pc(40) int local40 = local31.aByteArray94.length - local31.anInt5331 * 1052763975;
				if (local31.aFloat311 != this.aFloat312) {
					local40 = (int) ((float) local40 * (this.aFloat312 / local31.aFloat311));
					local40 = (int) (local18 * Math.ceil((double) local40 / local18));
				}
				local31.anInt5332 = local40 * -785239911;
				if (local40 > 0 && local40 < local5) {
					local20 = true;
					local5 = local40;
				}
			}
			if (local5 > this.anInt5343 * 1779292787) {
				local5 = this.anInt5343 * 1779292787;
			}
			if (local5 != 0 && local20) {
				@Pc(107) int local107 = this.anInt5342 * -1827073001 / 8;
				@Pc(111) Iterator local111 = this.aList23.iterator();
				while (true) {
					@Pc(118) Class564 local118;
					do {
						if (!local111.hasNext()) {
							this.anInt5344 = local5 * 1937699515;
							return;
						}
						local118 = (Class564) local111.next();
					} while (local118.anInt5332 * -509533271 < local5);
					@Pc(130) int local130 = this.anInt5346 * 2045773485;
					@Pc(132) int local132 = 0;
					@Pc(139) int local139 = local118.anInt5329 * -1888009577 / 8;
					@Pc(141) double local141 = 0.0D;
					@Pc(143) int local143 = 0;
					@Pc(147) double local147 = (double) this.aFloat312;
					@Pc(151) double local151 = (double) local118.aFloat311;
					@Pc(156) int local156 = local118.anInt5333 * -1790662003;
					while (local118.anInt5332 * -509533271 > 0 && local132 < local5) {
						@Pc(166) short local166 = 0;
						@Pc(168) short local168 = 0;
						@Pc(171) byte[] local171 = this.aByteArray98;
						for (@Pc(173) int local173 = 0; local173 < local171.length; local173++) {
							local171[local173] = this.aByteArray99[local173 + local130];
							local166 = (short) (local166 | (local171[local173] & 0xFF) << local173 * 8);
						}
						@Pc(210) byte[] local210;
						if (local118.aFloat311 == this.aFloat312) {
							local210 = local118.aByteArray95;
							for (@Pc(398) int local398 = 0; local398 < local210.length; local398++) {
								local210[local398] = local118.aByteArray94[local118.anInt5333 * -1790662003 + local398];
								local168 = (short) (local168 | (local210[local398] & 0xFF) << local398 * 8);
							}
							local118.anInt5333 += local139 * 1731733573;
							local118.anInt5333 = local118.anInt5333 * -1790662003 % local118.aByteArray94.length * 1731733573;
							local118.anInt5331 += local139 * -1837919625;
						} else {
							local210 = local118.aByteArray95;
							@Pc(217) float local217 = (float) (local151 * (local141 / local147));
							@Pc(222) float local222 = (float) Math.floor((double) local217);
							@Pc(224) short local224 = 0;
							@Pc(226) short local226 = 0;
							@Pc(231) int local231 = (int) Math.floor((double) local217);
							@Pc(236) int local236 = (int) Math.ceil((double) local217);
							@Pc(251) int local251 = local231 * local210.length * -1273949407 * local118.anInt5334 + local143 * local210.length;
							@Pc(266) int local266 = local143 * local210.length + local118.anInt5334 * -1273949407 * local210.length * local236;
							@Pc(270) int local270 = local251 + local156;
							@Pc(274) int local274 = local266 + local156;
							@Pc(280) int local280 = local270 % local118.aByteArray94.length;
							@Pc(286) int local286 = local274 % local118.aByteArray94.length;
							@Pc(288) int local288;
							for (local288 = 0; local288 < local210.length; local288++) {
								local210[local288] = local118.aByteArray94[local280 + local288];
								local224 = (short) (local224 | (local210[local288] & 0xFF) << local288 * 8);
							}
							for (local288 = 0; local288 < local210.length; local288++) {
								local210[local288] = local118.aByteArray94[local286 + local288];
								local226 = (short) (local226 | (local210[local288] & 0xFF) << local288 * 8);
							}
							@Pc(350) float local350 = local217 - local222;
							if (local350 < 0.0F || local350 > 1.0F) {
								throw new RuntimeException("");
							}
							@Pc(368) float local368 = (float) (local226 - local224);
							local168 = (short) ((float) local224 + local368 * local350);
							local143++;
							local143 %= local118.anInt5334 * -1273949407;
							if (local143 == 0) {
								local141++;
							}
						}
						local168 += local166;
						if (local168 > 32767) {
							local168 = 32767;
						}
						if (local168 < -32768) {
							local168 = -32768;
						}
						this.aByteArray99[local130] = (byte) local168;
						this.aByteArray99[local130 + 1] = (byte) (local168 >> 8);
						local130 += local107;
						local130 %= this.aByteArray99.length;
						local132 += local139;
					}
					if (local118.aFloat311 != this.aFloat312) {
						@Pc(518) double local518 = (double) local5 * (local151 / local147);
						@Pc(526) int local526 = (int) (local18 * Math.ceil(local518 / local18));
						local118.anInt5333 += local526 * 1731733573;
						local118.anInt5333 = local118.anInt5333 * -1790662003 % local118.aByteArray94.length * 1731733573;
						local118.anInt5331 += local526 * -1837919625;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!tz", name = "k", descriptor = "(Lclient!tv;)V", line = 504)
	void method31404(@OriginalArg(0) Class564 arg0) {
		this.aList23.add(arg0);
	}

	@OriginalMember(owner = "client!tz", name = "l", descriptor = "(Lclient!tv;B)V", line = 504)
	void method31405(@OriginalArg(0) Class564 arg0) {
		this.aList23.add(arg0);
	}

	@OriginalMember(owner = "client!tz", name = "u", descriptor = "(Lclient!tv;)V", line = 504)
	void method31406(@OriginalArg(0) Class564 arg0) {
		this.aList23.add(arg0);
	}

	@OriginalMember(owner = "client!tz", name = "y", descriptor = "(Lclient!tv;S)V", line = 508)
	void method31407(@OriginalArg(0) Class564 arg0) {
		this.aList23.remove(arg0);
	}

	@OriginalMember(owner = "client!tz", name = "e", descriptor = "(Lclient!tv;)V", line = 508)
	void method31408(@OriginalArg(0) Class564 arg0) {
		this.aList23.remove(arg0);
	}

	@OriginalMember(owner = "client!tz", name = "hl", descriptor = "(Lclient!yf;B)V", line = 5789)
	static final void method31409(@OriginalArg(0) Class665 arg0) {
		@Pc(8) Class662 local8 = arg0.aBoolean857 ? arg0.aClass662_1 : arg0.aClass662_2;
		@Pc(11) Class277 local11 = local8.aClass277_12;
		@Pc(14) Class273 local14 = local8.aClass273_4;
		Class77_Sub19.method13488(local11, local14, false, 0, arg0);
	}

	@OriginalMember(owner = "client!tz", name = "so", descriptor = "(Lclient!yf;I)V", line = 7826)
	static final void method31410(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		@Pc(16) Class277 local16 = Class155.method23628(local12);
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = local16.anInt3876 * -742015869;
	}
}
