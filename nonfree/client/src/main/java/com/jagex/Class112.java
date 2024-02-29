package com.jagex;

import com.jagex.twitchtv.TwitchEvent;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hi")
public abstract class Class112 {

	@OriginalMember(owner = "client!hi", name = "dq", descriptor = "Lclient!ms;")
	public static Class405 aClass405_3;

	@OriginalMember(owner = "client!hi", name = "q", descriptor = "Lclient!hx;")
	static final Interface28 anInterface28_3 = new Class313();

	@OriginalMember(owner = "client!hi", name = "t", descriptor = "I")
	protected int anInt1105 = 1164303385;

	@OriginalMember(owner = "client!hi", name = "p", descriptor = "Ljava/lang/String;")
	String aString38;

	@OriginalMember(owner = "client!hi", name = "y", descriptor = "I")
	int anInt1104;

	@OriginalMember(owner = "client!hi", name = "v", descriptor = "Lclient!he;")
	Class296 aClass296_6;

	@OriginalMember(owner = "client!hi", name = "w", descriptor = "I")
	int anInt1103;

	@OriginalMember(owner = "client!hi", name = "l", descriptor = "Lclient!he;")
	Class296 aClass296_5;

	@OriginalMember(owner = "client!hi", name = "c", descriptor = "[Lclient!hr;")
	Class105[] aClass105Array5;

	@OriginalMember(owner = "client!hi", name = "<init>", descriptor = "(Lclient!aed;Lclient!ha;)V", line = 24)
	Class112(@OriginalArg(0) Class86_Sub1 arg0, @OriginalArg(1) Class292 arg1) {
		this.aString38 = arg1.aString182;
		this.anInt1104 = arg1.aClass297Array1.length * -1047330003;
		this.aClass296_6 = new Class296(this.anInt1104 * -379370331, anInterface28_3);
		@Pc(27) int local27;
		for (local27 = 0; local27 < this.anInt1104 * -379370331; local27++) {
			this.aClass296_6.method27046(local27, arg1.aClass297Array1[local27].aString186, this.method9548(arg1.aClass297Array1[local27]));
		}
		this.anInt1103 = arg1.aClass297Array2.length * -1792656291;
		this.aClass296_5 = new Class296(this.anInt1103 * 1613592565, anInterface28_3);
		for (local27 = 0; local27 < this.anInt1103 * 1613592565; local27++) {
			this.aClass296_5.method27046(local27, arg1.aClass297Array2[local27].aString186, this.method9548(arg1.aClass297Array2[local27]));
		}
		this.aClass105Array5 = new Class105[arg1.aClass307Array1.length];
		for (local27 = 0; local27 < arg1.aClass307Array1.length; local27++) {
			this.aClass105Array5[local27] = this.method9565(arg0, arg1.aClass307Array1[local27]);
		}
	}

	@OriginalMember(owner = "client!hi", name = "l", descriptor = "(B)Ljava/lang/String;", line = 47)
	public String method9454() {
		return this.aString38;
	}

	@OriginalMember(owner = "client!hi", name = "af", descriptor = "()Ljava/lang/String;", line = 47)
	public String method9455() {
		return this.aString38;
	}

	@OriginalMember(owner = "client!hi", name = "an", descriptor = "()Ljava/lang/String;", line = 47)
	public String method9456() {
		return this.aString38;
	}

	@OriginalMember(owner = "client!hi", name = "c", descriptor = "(I)V", line = 48)
	static void method9457() {
		Class434.aClass107_Sub1_1 = null;
		Class434.aBoolean749 = false;
	}

	@OriginalMember(owner = "client!hi", name = "w", descriptor = "(Ljava/lang/String;I)Lclient!hr;", line = 54)
	public Class105 method9458(@OriginalArg(0) String arg0) throws Exception_Sub3_Sub2 {
		@Pc(2) Class105[] local2 = this.aClass105Array5;
		for (@Pc(4) int local4 = 0; local4 < local2.length; local4++) {
			@Pc(12) Class105 local12 = local2[local4];
			@Pc(16) String local16 = local12.method9577();
			if (local16 != null && local16.equals(arg0)) {
				if (!local12.method9595()) {
					throw new Exception_Sub3_Sub2(arg0);
				}
				return local12;
			}
		}
		throw new Exception_Sub3_Sub2(arg0);
	}

	@OriginalMember(owner = "client!hi", name = "bc", descriptor = "(Ljava/lang/String;)Lclient!hr;", line = 54)
	public Class105 method9459(@OriginalArg(0) String arg0) throws Exception_Sub3_Sub2 {
		@Pc(2) Class105[] local2 = this.aClass105Array5;
		for (@Pc(4) int local4 = 0; local4 < local2.length; local4++) {
			@Pc(12) Class105 local12 = local2[local4];
			@Pc(16) String local16 = local12.method9577();
			if (local16 != null && local16.equals(arg0)) {
				if (!local12.method9595()) {
					throw new Exception_Sub3_Sub2(arg0);
				}
				return local12;
			}
		}
		throw new Exception_Sub3_Sub2(arg0);
	}

	@OriginalMember(owner = "client!hi", name = "t", descriptor = "(B)I", line = 70)
	public final int method9460() {
		return this.aClass105Array5.length;
	}

	@OriginalMember(owner = "client!hi", name = "q", descriptor = "(II)Lclient!hr;", line = 74)
	public final Class105 method9461(@OriginalArg(0) int arg0) {
		return this.aClass105Array5[arg0];
	}

	@OriginalMember(owner = "client!hi", name = "bj", descriptor = "(I)Lclient!hr;", line = 74)
	public final Class105 method9462(@OriginalArg(0) int arg0) {
		return this.aClass105Array5[arg0];
	}

	@OriginalMember(owner = "client!hi", name = "x", descriptor = "(Lclient!hr;B)I", line = 78)
	public int method9463(@OriginalArg(0) Class105 arg0) {
		for (@Pc(1) int local1 = 0; local1 < this.aClass105Array5.length; local1++) {
			if (this.aClass105Array5[local1] == arg0) {
				return local1;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!hi", name = "bv", descriptor = "(Lclient!hr;)I", line = 78)
	public int method9464(@OriginalArg(0) Class105 arg0) {
		for (@Pc(1) int local1 = 0; local1 < this.aClass105Array5.length; local1++) {
			if (this.aClass105Array5[local1] == arg0) {
				return local1;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!hi", name = "d", descriptor = "(I)Lclient!hr;", line = 86)
	public Class105 method9465() {
		@Pc(2) Class105[] local2 = this.aClass105Array5;
		for (@Pc(4) int local4 = 0; local4 < local2.length; local4++) {
			@Pc(12) Class105 local12 = local2[local4];
			if (local12.method9595()) {
				return local12;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!hi", name = "ba", descriptor = "()Lclient!hr;", line = 86)
	public Class105 method9466() {
		@Pc(2) Class105[] local2 = this.aClass105Array5;
		for (@Pc(4) int local4 = 0; local4 < local2.length; local4++) {
			@Pc(12) Class105 local12 = local2[local4];
			if (local12.method9595()) {
				return local12;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!hi", name = "bl", descriptor = "()Lclient!hr;", line = 86)
	public Class105 method9467() {
		@Pc(2) Class105[] local2 = this.aClass105Array5;
		for (@Pc(4) int local4 = 0; local4 < local2.length; local4++) {
			@Pc(12) Class105 local12 = local2[local4];
			if (local12.method9595()) {
				return local12;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!hi", name = "bb", descriptor = "()Lclient!hr;", line = 86)
	public Class105 method9468() {
		@Pc(2) Class105[] local2 = this.aClass105Array5;
		for (@Pc(4) int local4 = 0; local4 < local2.length; local4++) {
			@Pc(12) Class105 local12 = local2[local4];
			if (local12.method9595()) {
				return local12;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!hi", name = "r", descriptor = "(I)Lclient!hr;", line = 100)
	public final Class105 method9469() {
		return this.anInt1105 * 567951319 >= 0 ? this.aClass105Array5[this.anInt1105 * 567951319] : null;
	}

	@OriginalMember(owner = "client!hi", name = "g", descriptor = "(I)I", line = 104)
	public final int method9470() {
		return this.anInt1105 * 567951319;
	}

	@OriginalMember(owner = "client!hi", name = "bg", descriptor = "()I", line = 104)
	public final int method9471() {
		return this.anInt1105 * 567951319;
	}

	@OriginalMember(owner = "client!hi", name = "bi", descriptor = "()I", line = 104)
	public final int method9472() {
		return this.anInt1105 * 567951319;
	}

	@OriginalMember(owner = "client!hi", name = "q", descriptor = "(IZB)Lclient!ajf;", line = 106)
	static Class77_Sub7 method9473(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(8) long local8 = (long) (arg0 | (arg1 ? Integer.MIN_VALUE : 0));
		return (Class77_Sub7) Class77_Sub7.aClass12_10.method173(local8);
	}

	@OriginalMember(owner = "client!hi", name = "j", descriptor = "(Lclient!aqz;FB)V", line = 110)
	public final void method9474(@OriginalArg(0) Class77_Sub12_Sub1 arg0, @OriginalArg(1) float arg1) {
		this.aClass105Array5[this.anInt1105 * 567951319].method9583(arg0, arg1);
	}

	@OriginalMember(owner = "client!hi", name = "bz", descriptor = "(Lclient!aqz;F)V", line = 110)
	public final void method9475(@OriginalArg(0) Class77_Sub12_Sub1 arg0, @OriginalArg(1) float arg1) {
		this.aClass105Array5[this.anInt1105 * 567951319].method9583(arg0, arg1);
	}

	@OriginalMember(owner = "client!hi", name = "bt", descriptor = "(Lclient!aqz;F)V", line = 110)
	public final void method9476(@OriginalArg(0) Class77_Sub12_Sub1 arg0, @OriginalArg(1) float arg1) {
		this.aClass105Array5[this.anInt1105 * 567951319].method9583(arg0, arg1);
	}

	@OriginalMember(owner = "client!hi", name = "bf", descriptor = "(Lclient!aqz;FF)V", line = 114)
	public final void method9477(@OriginalArg(0) Class77_Sub12_Sub1 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		this.aClass105Array5[this.anInt1105 * 567951319].method9625(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!hi", name = "i", descriptor = "(Lclient!aqz;FFI)V", line = 114)
	public final void method9478(@OriginalArg(0) Class77_Sub12_Sub1 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		this.aClass105Array5[this.anInt1105 * 567951319].method9625(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!hi", name = "bu", descriptor = "(Lclient!aqz;FF)V", line = 114)
	public final void method9479(@OriginalArg(0) Class77_Sub12_Sub1 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		this.aClass105Array5[this.anInt1105 * 567951319].method9625(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!hi", name = "k", descriptor = "(Lclient!aqz;FFFI)V", line = 118)
	public final void method9480(@OriginalArg(0) Class77_Sub12_Sub1 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		this.aClass105Array5[this.anInt1105 * 567951319].method9585(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!hi", name = "bn", descriptor = "(Lclient!aqz;FFF)V", line = 118)
	public final void method9481(@OriginalArg(0) Class77_Sub12_Sub1 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		this.aClass105Array5[this.anInt1105 * 567951319].method9585(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!hi", name = "bp", descriptor = "(Lclient!aqz;FFF)V", line = 118)
	public final void method9482(@OriginalArg(0) Class77_Sub12_Sub1 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		this.aClass105Array5[this.anInt1105 * 567951319].method9585(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!hi", name = "u", descriptor = "(Lclient!aqz;FFFFI)V", line = 122)
	public final void method9483(@OriginalArg(0) Class77_Sub12_Sub1 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4) {
		this.aClass105Array5[this.anInt1105 * 567951319].method9586(arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!hi", name = "bm", descriptor = "(Lclient!aqz;FFFF)V", line = 122)
	public final void method9484(@OriginalArg(0) Class77_Sub12_Sub1 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4) {
		this.aClass105Array5[this.anInt1105 * 567951319].method9586(arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!hi", name = "e", descriptor = "(Lclient!aqz;Lclient!oo;I)V", line = 126)
	public final void method9485(@OriginalArg(0) Class77_Sub12_Sub1 arg0, @OriginalArg(1) Class447 arg1) {
		this.aClass105Array5[this.anInt1105 * 567951319].method9585(arg0, arg1.aFloat277, arg1.aFloat276, arg1.aFloat278);
	}

	@OriginalMember(owner = "client!hi", name = "bo", descriptor = "(Lclient!aqz;Lclient!oo;)V", line = 126)
	public final void method9486(@OriginalArg(0) Class77_Sub12_Sub1 arg0, @OriginalArg(1) Class447 arg1) {
		this.aClass105Array5[this.anInt1105 * 567951319].method9585(arg0, arg1.aFloat277, arg1.aFloat276, arg1.aFloat278);
	}

	@OriginalMember(owner = "client!hi", name = "f", descriptor = "(Lclient!aqz;Lclient!or;I)V", line = 130)
	public final void method9487(@OriginalArg(0) Class77_Sub12_Sub1 arg0, @OriginalArg(1) Class450 arg1) {
		this.aClass105Array5[this.anInt1105 * 567951319].method9586(arg0, arg1.aFloat279, arg1.aFloat280, arg1.aFloat282, arg1.aFloat281);
	}

	@OriginalMember(owner = "client!hi", name = "bk", descriptor = "(Lclient!aqz;Lclient!or;)V", line = 130)
	public final void method9488(@OriginalArg(0) Class77_Sub12_Sub1 arg0, @OriginalArg(1) Class450 arg1) {
		this.aClass105Array5[this.anInt1105 * 567951319].method9586(arg0, arg1.aFloat279, arg1.aFloat280, arg1.aFloat282, arg1.aFloat281);
	}

	@OriginalMember(owner = "client!hi", name = "bh", descriptor = "(Lclient!aqz;[F)V", line = 134)
	public final void method9489(@OriginalArg(0) Class77_Sub12_Sub1 arg0, @OriginalArg(1) float[] arg1) {
		this.aClass105Array5[this.anInt1105 * 567951319].method9614(arg0, arg1, arg1.length);
	}

	@OriginalMember(owner = "client!hi", name = "o", descriptor = "(Lclient!aqz;[FI)V", line = 134)
	public final void method9490(@OriginalArg(0) Class77_Sub12_Sub1 arg0, @OriginalArg(1) float[] arg1) {
		this.aClass105Array5[this.anInt1105 * 567951319].method9614(arg0, arg1, arg1.length);
	}

	@OriginalMember(owner = "client!hi", name = "bq", descriptor = "(Lclient!aqz;[F)V", line = 134)
	public final void method9491(@OriginalArg(0) Class77_Sub12_Sub1 arg0, @OriginalArg(1) float[] arg1) {
		this.aClass105Array5[this.anInt1105 * 567951319].method9614(arg0, arg1, arg1.length);
	}

	@OriginalMember(owner = "client!hi", name = "br", descriptor = "(Lclient!aqz;[F)V", line = 134)
	public final void method9492(@OriginalArg(0) Class77_Sub12_Sub1 arg0, @OriginalArg(1) float[] arg1) {
		this.aClass105Array5[this.anInt1105 * 567951319].method9614(arg0, arg1, arg1.length);
	}

	@OriginalMember(owner = "client!hi", name = "b", descriptor = "(Lclient!aqz;II)V", line = 138)
	public final void method9493(@OriginalArg(0) Class77_Sub12_Sub1 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) float local8 = (float) (arg1 >> 16 & 0xFF) / 255.0F;
		@Pc(17) float local17 = (float) (arg1 >> 8 & 0xFF) / 255.0F;
		@Pc(24) float local24 = (float) (arg1 & 0xFF) / 255.0F;
		@Pc(33) float local33 = (float) (arg1 >> 24 & 0xFF) / 255.0F;
		this.method9483(arg0, local8, local17, local24, local33);
	}

	@OriginalMember(owner = "client!hi", name = "cb", descriptor = "(Lclient!aqz;I)V", line = 138)
	public final void method9494(@OriginalArg(0) Class77_Sub12_Sub1 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) float local8 = (float) (arg1 >> 16 & 0xFF) / 255.0F;
		@Pc(17) float local17 = (float) (arg1 >> 8 & 0xFF) / 255.0F;
		@Pc(24) float local24 = (float) (arg1 & 0xFF) / 255.0F;
		@Pc(33) float local33 = (float) (arg1 >> 24 & 0xFF) / 255.0F;
		this.method9483(arg0, local8, local17, local24, local33);
	}

	@OriginalMember(owner = "client!hi", name = "be", descriptor = "(Lclient!aqz;I)V", line = 138)
	public final void method9495(@OriginalArg(0) Class77_Sub12_Sub1 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) float local8 = (float) (arg1 >> 16 & 0xFF) / 255.0F;
		@Pc(17) float local17 = (float) (arg1 >> 8 & 0xFF) / 255.0F;
		@Pc(24) float local24 = (float) (arg1 & 0xFF) / 255.0F;
		@Pc(33) float local33 = (float) (arg1 >> 24 & 0xFF) / 255.0F;
		this.method9483(arg0, local8, local17, local24, local33);
	}

	@OriginalMember(owner = "client!hi", name = "cg", descriptor = "(Lclient!aqz;Lclient!oi;)V", line = 146)
	public final void method9496(@OriginalArg(0) Class77_Sub12_Sub1 arg0, @OriginalArg(1) Class442 arg1) {
		this.aClass105Array5[this.anInt1105 * 567951319].method9588(arg0, arg1);
	}

	@OriginalMember(owner = "client!hi", name = "n", descriptor = "(Lclient!aqz;Lclient!oi;I)V", line = 146)
	public final void method9497(@OriginalArg(0) Class77_Sub12_Sub1 arg0, @OriginalArg(1) Class442 arg1) {
		this.aClass105Array5[this.anInt1105 * 567951319].method9588(arg0, arg1);
	}

	@OriginalMember(owner = "client!hi", name = "cf", descriptor = "(Lclient!aqz;Lclient!oi;)V", line = 146)
	public final void method9498(@OriginalArg(0) Class77_Sub12_Sub1 arg0, @OriginalArg(1) Class442 arg1) {
		this.aClass105Array5[this.anInt1105 * 567951319].method9588(arg0, arg1);
	}

	@OriginalMember(owner = "client!hi", name = "cc", descriptor = "(Lclient!aqz;Lclient!oi;)V", line = 146)
	public final void method9499(@OriginalArg(0) Class77_Sub12_Sub1 arg0, @OriginalArg(1) Class442 arg1) {
		this.aClass105Array5[this.anInt1105 * 567951319].method9588(arg0, arg1);
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(Lclient!aqz;Lclient!oi;I)V", line = 150)
	public final void method9500(@OriginalArg(0) Class77_Sub12_Sub1 arg0, @OriginalArg(1) Class442 arg1) {
		this.aClass105Array5[this.anInt1105 * 567951319].method9589(arg0, arg1);
	}

	@OriginalMember(owner = "client!hi", name = "cl", descriptor = "(Lclient!aqz;Lclient!oi;)V", line = 150)
	public final void method9501(@OriginalArg(0) Class77_Sub12_Sub1 arg0, @OriginalArg(1) Class442 arg1) {
		this.aClass105Array5[this.anInt1105 * 567951319].method9589(arg0, arg1);
	}

	@OriginalMember(owner = "client!hi", name = "cp", descriptor = "(Lclient!aqz;Lclient!oi;)V", line = 150)
	public final void method9502(@OriginalArg(0) Class77_Sub12_Sub1 arg0, @OriginalArg(1) Class442 arg1) {
		this.aClass105Array5[this.anInt1105 * 567951319].method9589(arg0, arg1);
	}

	@OriginalMember(owner = "client!hi", name = "m", descriptor = "(Lclient!aqz;ILclient!ls;I)V", line = 154)
	public final void method9503(@OriginalArg(0) Class77_Sub12_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface42 arg2) {
		this.aClass105Array5[this.anInt1105 * 567951319].method9590(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!hi", name = "h", descriptor = "(IFFFB)V", line = 158)
	public final void method9504(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		this.aClass105Array5[this.anInt1105 * 567951319].method9591(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!hi", name = "cw", descriptor = "(IFFF)V", line = 158)
	public final void method9505(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		this.aClass105Array5[this.anInt1105 * 567951319].method9591(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!hi", name = "ck", descriptor = "(IFFF)V", line = 158)
	public final void method9506(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		this.aClass105Array5[this.anInt1105 * 567951319].method9591(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!hi", name = "aj", descriptor = "(IFFFFS)V", line = 162)
	public final void method9507(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4) {
		this.aClass105Array5[this.anInt1105 * 567951319].method9592(arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!hi", name = "ai", descriptor = "(ILclient!oo;I)V", line = 166)
	public final void method9508(@OriginalArg(0) int arg0, @OriginalArg(1) Class447 arg1) {
		this.aClass105Array5[this.anInt1105 * 567951319].method9591(arg0, arg1.aFloat277, arg1.aFloat276, arg1.aFloat278);
	}

	@OriginalMember(owner = "client!hi", name = "ch", descriptor = "(ILclient!oo;)V", line = 166)
	public final void method9509(@OriginalArg(0) int arg0, @OriginalArg(1) Class447 arg1) {
		this.aClass105Array5[this.anInt1105 * 567951319].method9591(arg0, arg1.aFloat277, arg1.aFloat276, arg1.aFloat278);
	}

	@OriginalMember(owner = "client!hi", name = "ag", descriptor = "(I[FII)V", line = 170)
	public final void method9510(@OriginalArg(0) int arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) int arg2) {
		this.aClass105Array5[this.anInt1105 * 567951319].method9607(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!hi", name = "al", descriptor = "(ILclient!oi;S)V", line = 174)
	public final void method9511(@OriginalArg(0) int arg0, @OriginalArg(1) Class442 arg1) {
		this.aClass105Array5[this.anInt1105 * 567951319].method9593(arg0, arg1);
	}

	@OriginalMember(owner = "client!hi", name = "cz", descriptor = "(ILclient!oi;)V", line = 174)
	public final void method9512(@OriginalArg(0) int arg0, @OriginalArg(1) Class442 arg1) {
		this.aClass105Array5[this.anInt1105 * 567951319].method9593(arg0, arg1);
	}

	@OriginalMember(owner = "client!hi", name = "ca", descriptor = "(ILclient!oi;)V", line = 174)
	public final void method9513(@OriginalArg(0) int arg0, @OriginalArg(1) Class442 arg1) {
		this.aClass105Array5[this.anInt1105 * 567951319].method9593(arg0, arg1);
	}

	@OriginalMember(owner = "client!hi", name = "ao", descriptor = "(ILclient!oi;I)V", line = 178)
	public final void method9514(@OriginalArg(0) int arg0, @OriginalArg(1) Class442 arg1) {
		this.aClass105Array5[this.anInt1105 * 567951319].method9594(arg0, arg1);
	}

	@OriginalMember(owner = "client!hi", name = "cr", descriptor = "(ILclient!oi;)V", line = 178)
	public final void method9515(@OriginalArg(0) int arg0, @OriginalArg(1) Class442 arg1) {
		this.aClass105Array5[this.anInt1105 * 567951319].method9594(arg0, arg1);
	}

	@OriginalMember(owner = "client!hi", name = "cu", descriptor = "(ILclient!oi;)V", line = 182)
	public final void method9516(@OriginalArg(0) int arg0, @OriginalArg(1) Class442 arg1) {
		this.aClass105Array5[this.anInt1105 * 567951319].method9597(arg0, arg1);
	}

	@OriginalMember(owner = "client!hi", name = "ak", descriptor = "(ILclient!oi;B)V", line = 182)
	public final void method9517(@OriginalArg(0) int arg0, @OriginalArg(1) Class442 arg1) {
		this.aClass105Array5[this.anInt1105 * 567951319].method9597(arg0, arg1);
	}

	@OriginalMember(owner = "client!hi", name = "cv", descriptor = "(ILclient!oi;)V", line = 182)
	public final void method9518(@OriginalArg(0) int arg0, @OriginalArg(1) Class442 arg1) {
		this.aClass105Array5[this.anInt1105 * 567951319].method9597(arg0, arg1);
	}

	@OriginalMember(owner = "client!hi", name = "cm", descriptor = "(ILclient!oi;)V", line = 182)
	public final void method9519(@OriginalArg(0) int arg0, @OriginalArg(1) Class442 arg1) {
		this.aClass105Array5[this.anInt1105 * 567951319].method9597(arg0, arg1);
	}

	@OriginalMember(owner = "client!hi", name = "cx", descriptor = "(ILclient!oi;)V", line = 182)
	public final void method9520(@OriginalArg(0) int arg0, @OriginalArg(1) Class442 arg1) {
		this.aClass105Array5[this.anInt1105 * 567951319].method9597(arg0, arg1);
	}

	@OriginalMember(owner = "client!hi", name = "ct", descriptor = "(ILclient!oi;)V", line = 182)
	public final void method9521(@OriginalArg(0) int arg0, @OriginalArg(1) Class442 arg1) {
		this.aClass105Array5[this.anInt1105 * 567951319].method9597(arg0, arg1);
	}

	@OriginalMember(owner = "client!hi", name = "au", descriptor = "(IILclient!ls;I)V", line = 186)
	public final void method9522(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface42 arg2) {
		this.aClass105Array5[this.anInt1105 * 567951319].method9596(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!hi", name = "ci", descriptor = "(IILclient!ls;)V", line = 186)
	public final void method9523(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface42 arg2) {
		this.aClass105Array5[this.anInt1105 * 567951319].method9596(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!hi", name = "ax", descriptor = "(Ljava/lang/String;I)Lclient!aqz;", line = 190)
	public Class77_Sub12_Sub1 method9524(@OriginalArg(0) String arg0) throws Exception_Sub3_Sub1 {
		@Pc(6) Class77_Sub12_Sub1 local6 = (Class77_Sub12_Sub1) this.aClass296_6.method27042(arg0);
		if (local6 == null) {
			throw new Exception_Sub3_Sub1(arg0);
		}
		return local6;
	}

	@OriginalMember(owner = "client!hi", name = "co", descriptor = "(Ljava/lang/String;)Lclient!aqz;", line = 190)
	public Class77_Sub12_Sub1 method9525(@OriginalArg(0) String arg0) throws Exception_Sub3_Sub1 {
		@Pc(6) Class77_Sub12_Sub1 local6 = (Class77_Sub12_Sub1) this.aClass296_6.method27042(arg0);
		if (local6 == null) {
			throw new Exception_Sub3_Sub1(arg0);
		}
		return local6;
	}

	@OriginalMember(owner = "client!hi", name = "ar", descriptor = "(B)I", line = 196)
	public int method9526() {
		return this.anInt1103 * 1613592565;
	}

	@OriginalMember(owner = "client!hi", name = "cn", descriptor = "()I", line = 196)
	public int method9527() {
		return this.anInt1103 * 1613592565;
	}

	@OriginalMember(owner = "client!hi", name = "ad", descriptor = "(II)Lclient!aqz;", line = 200)
	public Class77_Sub12_Sub1 method9528(@OriginalArg(0) int arg0) {
		return (Class77_Sub12_Sub1) this.aClass296_5.method27037(arg0);
	}

	@OriginalMember(owner = "client!hi", name = "cq", descriptor = "(I)Lclient!aqz;", line = 200)
	public Class77_Sub12_Sub1 method9529(@OriginalArg(0) int arg0) {
		return (Class77_Sub12_Sub1) this.aClass296_5.method27037(arg0);
	}

	@OriginalMember(owner = "client!hi", name = "cy", descriptor = "(I)Lclient!aqz;", line = 200)
	public Class77_Sub12_Sub1 method9530(@OriginalArg(0) int arg0) {
		return (Class77_Sub12_Sub1) this.aClass296_5.method27037(arg0);
	}

	@OriginalMember(owner = "client!hi", name = "ac", descriptor = "(Ljava/lang/String;I)Lclient!aqz;", line = 204)
	public Class77_Sub12_Sub1 method9531(@OriginalArg(0) String arg0) {
		return (Class77_Sub12_Sub1) this.aClass296_5.method27042(arg0);
	}

	@OriginalMember(owner = "client!hi", name = "cs", descriptor = "(Ljava/lang/String;)Lclient!aqz;", line = 204)
	public Class77_Sub12_Sub1 method9532(@OriginalArg(0) String arg0) {
		return (Class77_Sub12_Sub1) this.aClass296_5.method27042(arg0);
	}

	@OriginalMember(owner = "client!hi", name = "cd", descriptor = "(Ljava/lang/String;)Lclient!aqz;", line = 204)
	public Class77_Sub12_Sub1 method9533(@OriginalArg(0) String arg0) {
		return (Class77_Sub12_Sub1) this.aClass296_5.method27042(arg0);
	}

	@OriginalMember(owner = "client!hi", name = "av", descriptor = "(B)I", line = 208)
	public int method9534() {
		return this.anInt1104 * -379370331;
	}

	@OriginalMember(owner = "client!hi", name = "cj", descriptor = "()I", line = 208)
	public int method9535() {
		return this.anInt1104 * -379370331;
	}

	@OriginalMember(owner = "client!hi", name = "at", descriptor = "(II)Lclient!aqz;", line = 212)
	public Class77_Sub12_Sub1 method9536(@OriginalArg(0) int arg0) {
		return (Class77_Sub12_Sub1) this.aClass296_6.method27037(arg0);
	}

	@OriginalMember(owner = "client!hi", name = "do", descriptor = "(I)Lclient!aqz;", line = 212)
	public Class77_Sub12_Sub1 method9537(@OriginalArg(0) int arg0) {
		return (Class77_Sub12_Sub1) this.aClass296_6.method27037(arg0);
	}

	@OriginalMember(owner = "client!hi", name = "ce", descriptor = "(I)Lclient!aqz;", line = 212)
	public Class77_Sub12_Sub1 method9538(@OriginalArg(0) int arg0) {
		return (Class77_Sub12_Sub1) this.aClass296_6.method27037(arg0);
	}

	@OriginalMember(owner = "client!hi", name = "ae", descriptor = "()V", line = 215)
	void method9539() {
	}

	@OriginalMember(owner = "client!hi", name = "dt", descriptor = "()V", line = 215)
	void method9540() {
	}

	@OriginalMember(owner = "client!hi", name = "g", descriptor = "(ILclient!com/jagex/twitchtv/TwitchEvent;B)V", line = 339)
	public static void method9541(@OriginalArg(0) int arg0, @OriginalArg(1) TwitchEvent arg1) {
		@Pc(5) Class77_Sub1_Sub9 local5 = Class438.method28917(Class135.aClass135_42, arg0, -1);
		if (local5 == null) {
			return;
		}
		@Pc(11) Class665 local11 = Class566.method31372();
		if (local5.anInt3015 * -2103375343 != 0) {
			local11.aLongArray27 = new long[local5.anInt3015 * -2103375343];
		}
		if (local5.anInt3012 * -39710947 != 0) {
			local11.anIntArray537 = new int[local5.anInt3012 * -39710947];
		}
		if (local5.anInt3013 * 1127446605 != 0) {
			local11.anObjectArray46 = new String[local5.anInt3013 * 1127446605];
		}
		arg1.p(local11.anIntArray537, local11.aLongArray27, local11.anObjectArray46);
		Class320.method27452(local5, 500000, local11);
	}

	@OriginalMember(owner = "client!hi", name = "akt", descriptor = "(Lclient!yf;B)V", line = 11258)
	static final void method9542(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = Class578.anInt5428 * -506156481 & 0x1;
	}

	@OriginalMember(owner = "client!hi", name = "c", descriptor = "()V")
	public abstract void method9543();

	@OriginalMember(owner = "client!hi", name = "v", descriptor = "()Z")
	public abstract boolean method9544();

	@OriginalMember(owner = "client!hi", name = "p", descriptor = "()V")
	public abstract void method9545();

	@OriginalMember(owner = "client!hi", name = "bs", descriptor = "(Lclient!hf;)Lclient!aqz;")
	abstract Class77_Sub12_Sub1 method9546(@OriginalArg(0) Class297 arg0);

	@OriginalMember(owner = "client!hi", name = "s", descriptor = "(Lclient!hr;)Z")
	public abstract boolean method9547(@OriginalArg(0) Class105 arg0);

	@OriginalMember(owner = "client!hi", name = "z", descriptor = "(Lclient!hf;)Lclient!aqz;")
	abstract Class77_Sub12_Sub1 method9548(@OriginalArg(0) Class297 arg0);

	@OriginalMember(owner = "client!hi", name = "ah", descriptor = "()V")
	public abstract void method9549();

	@OriginalMember(owner = "client!hi", name = "ay", descriptor = "()Z")
	public abstract boolean method9550();

	@OriginalMember(owner = "client!hi", name = "dy", descriptor = "()V")
	public abstract void method9551();

	@OriginalMember(owner = "client!hi", name = "ab", descriptor = "(Lclient!aed;Lclient!hq;)Lclient!hr;")
	abstract Class105 method9552(@OriginalArg(0) Class86_Sub1 arg0, @OriginalArg(1) Class307 arg1);

	@OriginalMember(owner = "client!hi", name = "aa", descriptor = "(Lclient!aed;Lclient!hq;)Lclient!hr;")
	abstract Class105 method9553(@OriginalArg(0) Class86_Sub1 arg0, @OriginalArg(1) Class307 arg1);

	@OriginalMember(owner = "client!hi", name = "ap", descriptor = "(Lclient!aed;Lclient!hq;)Lclient!hr;")
	abstract Class105 method9554(@OriginalArg(0) Class86_Sub1 arg0, @OriginalArg(1) Class307 arg1);

	@OriginalMember(owner = "client!hi", name = "aw", descriptor = "(Lclient!aed;Lclient!hq;)Lclient!hr;")
	abstract Class105 method9555(@OriginalArg(0) Class86_Sub1 arg0, @OriginalArg(1) Class307 arg1);

	@OriginalMember(owner = "client!hi", name = "az", descriptor = "(Lclient!aed;Lclient!hq;)Lclient!hr;")
	abstract Class105 method9556(@OriginalArg(0) Class86_Sub1 arg0, @OriginalArg(1) Class307 arg1);

	@OriginalMember(owner = "client!hi", name = "as", descriptor = "()V")
	public abstract void method9557();

	@OriginalMember(owner = "client!hi", name = "bd", descriptor = "(Lclient!hr;)Z")
	public abstract boolean method9558(@OriginalArg(0) Class105 arg0);

	@OriginalMember(owner = "client!hi", name = "by", descriptor = "(Lclient!hr;)Z")
	public abstract boolean method9559(@OriginalArg(0) Class105 arg0);

	@OriginalMember(owner = "client!hi", name = "bx", descriptor = "(Lclient!hr;)Z")
	public abstract boolean method9560(@OriginalArg(0) Class105 arg0);

	@OriginalMember(owner = "client!hi", name = "bw", descriptor = "(Lclient!hr;)Z")
	public abstract boolean method9561(@OriginalArg(0) Class105 arg0);

	@OriginalMember(owner = "client!hi", name = "aq", descriptor = "()V")
	public abstract void method9562();

	@OriginalMember(owner = "client!hi", name = "dh", descriptor = "()V")
	public abstract void method9563();

	@OriginalMember(owner = "client!hi", name = "am", descriptor = "()Z")
	public abstract boolean method9564();

	@OriginalMember(owner = "client!hi", name = "y", descriptor = "(Lclient!aed;Lclient!hq;)Lclient!hr;")
	abstract Class105 method9565(@OriginalArg(0) Class86_Sub1 arg0, @OriginalArg(1) Class307 arg1);

	@OriginalMember(owner = "client!hi", name = "dq", descriptor = "()V")
	public abstract void method9566();

	@OriginalMember(owner = "client!hi", name = "dn", descriptor = "()V")
	public abstract void method9567();

	@OriginalMember(owner = "client!hi", name = "dv", descriptor = "()V")
	public abstract void method9568();

	@OriginalMember(owner = "client!hi", name = "da", descriptor = "()V")
	public abstract void method9569();
}
