package a.a;

import a.Class11;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ColorModel;
import java.awt.image.DirectColorModel;
import java.awt.image.ImageConsumer;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("mudclient!a/a/g")
public class Class3 implements ImageProducer, ImageObserver {

	@OriginalMember(owner = "mudclient!a/a/g", name = "B", descriptor = "I")
	private static int anInt327;

	@OriginalMember(owner = "mudclient!a/a/g", name = "z", descriptor = "[[B")
	private static byte[][] aByteArrayArray6 = new byte[50][];

	@OriginalMember(owner = "mudclient!a/a/g", name = "A", descriptor = "[I")
	private static int[] anIntArray155;

	@OriginalMember(owner = "mudclient!a/a/g", name = "h", descriptor = "Ljava/awt/image/ImageConsumer;")
	private ImageConsumer anImageConsumer2;

	@OriginalMember(owner = "mudclient!a/a/g", name = "u", descriptor = "I")
	private int anInt323;

	@OriginalMember(owner = "mudclient!a/a/g", name = "w", descriptor = "I")
	private int anInt325;

	@OriginalMember(owner = "mudclient!a/a/g", name = "D", descriptor = "[I")
	private int[] anIntArray156;

	@OriginalMember(owner = "mudclient!a/a/g", name = "E", descriptor = "[I")
	private int[] anIntArray157;

	@OriginalMember(owner = "mudclient!a/a/g", name = "F", descriptor = "[I")
	private int[] anIntArray158;

	@OriginalMember(owner = "mudclient!a/a/g", name = "G", descriptor = "[I")
	private int[] anIntArray159;

	@OriginalMember(owner = "mudclient!a/a/g", name = "H", descriptor = "[I")
	private int[] anIntArray160;

	@OriginalMember(owner = "mudclient!a/a/g", name = "I", descriptor = "[I")
	private int[] anIntArray161;

	@OriginalMember(owner = "mudclient!a/a/g", name = "J", descriptor = "[I")
	private int[] anIntArray162;

	@OriginalMember(owner = "mudclient!a/a/g", name = "y", descriptor = "Z")
	public boolean aBoolean50 = false;

	@OriginalMember(owner = "mudclient!a/a/g", name = "C", descriptor = "Z")
	public boolean aBoolean51 = false;

	@OriginalMember(owner = "mudclient!a/a/g", name = "i", descriptor = "Ljava/awt/Component;")
	private Component aComponent2;

	@OriginalMember(owner = "mudclient!a/a/g", name = "v", descriptor = "I")
	private int anInt324;

	@OriginalMember(owner = "mudclient!a/a/g", name = "x", descriptor = "I")
	private int anInt326;

	@OriginalMember(owner = "mudclient!a/a/g", name = "a", descriptor = "I")
	public int anInt318;

	@OriginalMember(owner = "mudclient!a/a/g", name = "d", descriptor = "I")
	private int anInt321;

	@OriginalMember(owner = "mudclient!a/a/g", name = "b", descriptor = "I")
	public int anInt319;

	@OriginalMember(owner = "mudclient!a/a/g", name = "e", descriptor = "I")
	private int anInt322;

	@OriginalMember(owner = "mudclient!a/a/g", name = "c", descriptor = "I")
	private int anInt320;

	@OriginalMember(owner = "mudclient!a/a/g", name = "g", descriptor = "[I")
	public int[] anIntArray148;

	@OriginalMember(owner = "mudclient!a/a/g", name = "k", descriptor = "[[I")
	public int[][] anIntArrayArray16;

	@OriginalMember(owner = "mudclient!a/a/g", name = "t", descriptor = "[Z")
	private boolean[] aBooleanArray10;

	@OriginalMember(owner = "mudclient!a/a/g", name = "l", descriptor = "[[B")
	public byte[][] aByteArrayArray5;

	@OriginalMember(owner = "mudclient!a/a/g", name = "m", descriptor = "[[I")
	public int[][] anIntArrayArray17;

	@OriginalMember(owner = "mudclient!a/a/g", name = "n", descriptor = "[I")
	public int[] anIntArray149;

	@OriginalMember(owner = "mudclient!a/a/g", name = "o", descriptor = "[I")
	public int[] anIntArray150;

	@OriginalMember(owner = "mudclient!a/a/g", name = "r", descriptor = "[I")
	public int[] anIntArray153;

	@OriginalMember(owner = "mudclient!a/a/g", name = "s", descriptor = "[I")
	public int[] anIntArray154;

	@OriginalMember(owner = "mudclient!a/a/g", name = "p", descriptor = "[I")
	private int[] anIntArray151;

	@OriginalMember(owner = "mudclient!a/a/g", name = "q", descriptor = "[I")
	private int[] anIntArray152;

	@OriginalMember(owner = "mudclient!a/a/g", name = "f", descriptor = "Ljava/awt/image/ColorModel;")
	private ColorModel aColorModel2;

	@OriginalMember(owner = "mudclient!a/a/g", name = "j", descriptor = "Ljava/awt/Image;")
	private Image anImage4;

	static {
		@Pc(4) String local4 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";
		anIntArray155 = new int[256];
		for (@Pc(9) int local9 = 0; local9 < 256; local9++) {
			@Pc(14) int local14 = local4.indexOf(local9);
			if (local14 == -1) {
				local14 = 74;
			}
			anIntArray155[local9] = local14 * 9;
		}
	}

	@OriginalMember(owner = "mudclient!a/a/g", name = "b", descriptor = "(III)I")
	public static int method375(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return (arg0 << 16) + (arg1 << 8) + arg2;
	}

	@OriginalMember(owner = "mudclient!a/a/g", name = "a", descriptor = "([B)I")
	public static int method404(@OriginalArg(0) byte[] arg0) {
		aByteArrayArray6[anInt327] = arg0;
		return anInt327++;
	}

	@OriginalMember(owner = "mudclient!a/a/g", name = "<init>", descriptor = "(IIILjava/awt/Component;)V")
	public Class3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Component arg3) {
		this.aComponent2 = arg3;
		this.anInt324 = arg1;
		this.anInt326 = arg0;
		this.anInt321 = this.anInt318 = arg0;
		this.anInt322 = this.anInt319 = arg1;
		this.anInt320 = arg0 * arg1;
		this.anIntArray148 = new int[arg0 * arg1];
		this.anIntArrayArray16 = new int[arg2][];
		this.aBooleanArray10 = new boolean[arg2];
		this.aByteArrayArray5 = new byte[arg2][];
		this.anIntArrayArray17 = new int[arg2][];
		this.anIntArray149 = new int[arg2];
		this.anIntArray150 = new int[arg2];
		this.anIntArray153 = new int[arg2];
		this.anIntArray154 = new int[arg2];
		this.anIntArray151 = new int[arg2];
		this.anIntArray152 = new int[arg2];
		if (arg0 > 1 && arg1 > 1 && arg3 != null) {
			this.aColorModel2 = new DirectColorModel(32, 16711680, 65280, 255);
			@Pc(102) int local102 = this.anInt318 * this.anInt319;
			for (@Pc(104) int local104 = 0; local104 < local102; local104++) {
				this.anIntArray148[local104] = 0;
			}
			this.anImage4 = arg3.createImage(this);
			this.method360();
			arg3.prepareImage(this.anImage4, arg3);
			this.method360();
			arg3.prepareImage(this.anImage4, arg3);
			this.method360();
			arg3.prepareImage(this.anImage4, arg3);
		}
	}

	@OriginalMember(owner = "mudclient!a/a/g", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public final synchronized void addConsumer(@OriginalArg(0) ImageConsumer arg0) {
		this.anImageConsumer2 = arg0;
		arg0.setDimensions(this.anInt318, this.anInt319);
		arg0.setProperties(null);
		arg0.setColorModel(this.aColorModel2);
		arg0.setHints(14);
	}

	@OriginalMember(owner = "mudclient!a/a/g", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
	@Override
	public final synchronized boolean isConsumer(@OriginalArg(0) ImageConsumer arg0) {
		return this.anImageConsumer2 == arg0;
	}

	@OriginalMember(owner = "mudclient!a/a/g", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public final synchronized void removeConsumer(@OriginalArg(0) ImageConsumer arg0) {
		if (this.anImageConsumer2 == arg0) {
			this.anImageConsumer2 = null;
		}
	}

	@OriginalMember(owner = "mudclient!a/a/g", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public final void startProduction(@OriginalArg(0) ImageConsumer arg0) {
		this.addConsumer(arg0);
	}

	@OriginalMember(owner = "mudclient!a/a/g", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public final void requestTopDownLeftRightResend(@OriginalArg(0) ImageConsumer arg0) {
		System.out.println("TDLR");
	}

	@OriginalMember(owner = "mudclient!a/a/g", name = "a", descriptor = "()V")
	private synchronized void method360() {
		if (this.anImageConsumer2 != null) {
			this.anImageConsumer2.setPixels(0, 0, this.anInt318, this.anInt319, this.aColorModel2, this.anIntArray148, 0, this.anInt318);
			this.anImageConsumer2.imageComplete(2);
		}
	}

	@OriginalMember(owner = "mudclient!a/a/g", name = "a", descriptor = "(IIII)V")
	public final void method361(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (arg1 < 0) {
			arg1 = 0;
		}
		if (arg2 > this.anInt318) {
			arg2 = this.anInt318;
		}
		if (arg3 > this.anInt319) {
			arg3 = this.anInt319;
		}
		this.anInt325 = arg0;
		this.anInt323 = arg1;
		this.anInt326 = arg2;
		this.anInt324 = arg3;
	}

	@OriginalMember(owner = "mudclient!a/a/g", name = "b", descriptor = "()V")
	public final void method362() {
		this.anInt325 = 0;
		this.anInt323 = 0;
		this.anInt326 = this.anInt318;
		this.anInt324 = this.anInt319;
	}

	@OriginalMember(owner = "mudclient!a/a/g", name = "a", descriptor = "(Ljava/awt/Graphics;II)V")
	public final void method363(@OriginalArg(0) Graphics arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.method360();
		arg0.drawImage(this.anImage4, arg1, arg2, this);
	}

	@OriginalMember(owner = "mudclient!a/a/g", name = "c", descriptor = "()V")
	public final void method364() {
		@Pc(7) int local7 = this.anInt318 * this.anInt319;
		@Pc(13) int local13;
		if (!this.aBoolean50) {
			for (local13 = 0; local13 < local7; local13++) {
				this.anIntArray148[local13] = 0;
			}
			return;
		}
		local13 = 0;
		for (@Pc(31) int local31 = -this.anInt319; local31 < 0; local31 += 2) {
			for (@Pc(37) int local37 = -this.anInt318; local37 < 0; local37++) {
				this.anIntArray148[local13++] = 0;
			}
			local13 += this.anInt318;
		}
	}

	@OriginalMember(owner = "mudclient!a/a/g", name = "a", descriptor = "(IIIII)V")
	public final void method365(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(5) int local5 = 256 - arg4;
		@Pc(13) int local13 = (arg3 >> 16 & 0xFF) * arg4;
		@Pc(21) int local21 = (arg3 >> 8 & 0xFF) * arg4;
		@Pc(27) int local27 = (arg3 & 0xFF) * arg4;
		@Pc(31) int local31 = arg1 - arg2;
		if (local31 < 0) {
			local31 = 0;
		}
		@Pc(39) int local39 = arg1 + arg2;
		if (local39 >= this.anInt319) {
			local39 = this.anInt319 - 1;
		}
		@Pc(50) byte local50 = 1;
		if (this.aBoolean50) {
			local50 = 2;
			if ((local31 & 0x1) != 0) {
				local31++;
			}
		}
		for (@Pc(63) int local63 = local31; local63 <= local39; local63 += local50) {
			@Pc(69) int local69 = local63 - arg1;
			@Pc(80) int local80 = (int) Math.sqrt((double) (arg2 * arg2 - local69 * local69));
			@Pc(84) int local84 = arg0 - local80;
			if (local84 < 0) {
				local84 = 0;
			}
			@Pc(92) int local92 = arg0 + local80;
			if (local92 >= this.anInt318) {
				local92 = this.anInt318 - 1;
			}
			@Pc(108) int local108 = local84 + local63 * this.anInt318;
			for (@Pc(110) int local110 = local84; local110 <= local92; local110++) {
				@Pc(123) int local123 = (this.anIntArray148[local108] >> 16 & 0xFF) * local5;
				@Pc(134) int local134 = (this.anIntArray148[local108] >> 8 & 0xFF) * local5;
				@Pc(143) int local143 = (this.anIntArray148[local108] & 0xFF) * local5;
				@Pc(165) int local165 = (local13 + local123 >> 8 << 16) + (local21 + local134 >> 8 << 8) + (local27 + local143 >> 8);
				this.anIntArray148[local108++] = local165;
			}
		}
	}

	@OriginalMember(owner = "mudclient!a/a/g", name = "a", descriptor = "(IIIIII)V")
	public final void method366(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 < this.anInt325) {
			arg2 -= this.anInt325 - arg0;
			arg0 = this.anInt325;
		}
		if (arg1 < this.anInt323) {
			arg3 -= this.anInt323 - arg1;
			arg1 = this.anInt323;
		}
		if (arg0 + arg2 > this.anInt326) {
			arg2 = this.anInt326 - arg0;
		}
		if (arg1 + arg3 > this.anInt324) {
			arg3 = this.anInt324 - arg1;
		}
		@Pc(55) int local55 = 256 - arg5;
		@Pc(63) int local63 = (arg4 >> 16 & 0xFF) * arg5;
		@Pc(71) int local71 = (arg4 >> 8 & 0xFF) * arg5;
		@Pc(77) int local77 = (arg4 & 0xFF) * arg5;
		@Pc(82) int local82 = this.anInt318 - arg2;
		@Pc(84) byte local84 = 1;
		if (this.aBoolean50) {
			local84 = 2;
			local82 += this.anInt318;
			if ((arg1 & 0x1) != 0) {
				arg1++;
				arg3--;
			}
		}
		@Pc(108) int local108 = arg0 + arg1 * this.anInt318;
		for (@Pc(110) int local110 = 0; local110 < arg3; local110 += local84) {
			for (@Pc(115) int local115 = -arg2; local115 < 0; local115++) {
				@Pc(128) int local128 = (this.anIntArray148[local108] >> 16 & 0xFF) * local55;
				@Pc(139) int local139 = (this.anIntArray148[local108] >> 8 & 0xFF) * local55;
				@Pc(148) int local148 = (this.anIntArray148[local108] & 0xFF) * local55;
				@Pc(170) int local170 = (local63 + local128 >> 8 << 16) + (local71 + local139 >> 8 << 8) + (local77 + local148 >> 8);
				this.anIntArray148[local108++] = local170;
			}
			local108 += local82;
		}
	}

	@OriginalMember(owner = "mudclient!a/a/g", name = "b", descriptor = "(IIIIII)V")
	public final void method367(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 < this.anInt325) {
			arg2 -= this.anInt325 - arg0;
			arg0 = this.anInt325;
		}
		if (arg0 + arg2 > this.anInt326) {
			arg2 = this.anInt326 - arg0;
		}
		@Pc(32) int local32 = arg5 >> 16 & 0xFF;
		@Pc(38) int local38 = arg5 >> 8 & 0xFF;
		@Pc(42) int local42 = arg5 & 0xFF;
		@Pc(48) int local48 = arg4 >> 16 & 0xFF;
		@Pc(54) int local54 = arg4 >> 8 & 0xFF;
		@Pc(58) int local58 = arg4 & 0xFF;
		@Pc(63) int local63 = this.anInt318 - arg2;
		@Pc(65) byte local65 = 1;
		if (this.aBoolean50) {
			local65 = 2;
			local63 += this.anInt318;
			if ((arg1 & 0x1) != 0) {
				arg1++;
				arg3--;
			}
		}
		@Pc(89) int local89 = arg0 + arg1 * this.anInt318;
		for (@Pc(91) int local91 = 0; local91 < arg3; local91 += local65) {
			if (local91 + arg1 >= this.anInt323 && local91 + arg1 < this.anInt324) {
				@Pc(145) int local145 = ((local32 * local91 + local48 * (arg3 - local91)) / arg3 << 16) + ((local38 * local91 + local54 * (arg3 - local91)) / arg3 << 8) + (local42 * local91 + local58 * (arg3 - local91)) / arg3;
				for (@Pc(148) int local148 = -arg2; local148 < 0; local148++) {
					this.anIntArray148[local89++] = local145;
				}
				local89 += local63;
			} else {
				local89 += this.anInt318;
			}
		}
	}

	@OriginalMember(owner = "mudclient!a/a/g", name = "b", descriptor = "(IIIII)V")
	public final void method368(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 < this.anInt325) {
			arg2 -= this.anInt325 - arg0;
			arg0 = this.anInt325;
		}
		if (arg1 < this.anInt323) {
			arg3 -= this.anInt323 - arg1;
			arg1 = this.anInt323;
		}
		if (arg0 + arg2 > this.anInt326) {
			arg2 = this.anInt326 - arg0;
		}
		if (arg1 + arg3 > this.anInt324) {
			arg3 = this.anInt324 - arg1;
		}
		@Pc(56) int local56 = this.anInt318 - arg2;
		@Pc(58) byte local58 = 1;
		if (this.aBoolean50) {
			local58 = 2;
			local56 += this.anInt318;
			if ((arg1 & 0x1) != 0) {
				arg1++;
				arg3--;
			}
		}
		@Pc(82) int local82 = arg0 + arg1 * this.anInt318;
		for (@Pc(85) int local85 = -arg3; local85 < 0; local85 += local58) {
			for (@Pc(90) int local90 = -arg2; local90 < 0; local90++) {
				this.anIntArray148[local82++] = arg4;
			}
			local82 += local56;
		}
	}

	@OriginalMember(owner = "mudclient!a/a/g", name = "c", descriptor = "(IIIII)V")
	public final void method369(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method370(arg0, arg1, arg2, arg4);
		this.method370(arg0, arg1 + arg3 - 1, arg2, arg4);
		this.method371(arg0, arg1, arg3, arg4);
		this.method371(arg0 + arg2 - 1, arg1, arg3, arg4);
	}

	@OriginalMember(owner = "mudclient!a/a/g", name = "b", descriptor = "(IIII)V")
	public final void method370(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg1 < this.anInt323 || arg1 >= this.anInt324) {
			return;
		}
		if (arg0 < this.anInt325) {
			arg2 -= this.anInt325 - arg0;
			arg0 = this.anInt325;
		}
		if (arg0 + arg2 > this.anInt326) {
			arg2 = this.anInt326 - arg0;
		}
		@Pc(40) int local40 = arg0 + arg1 * this.anInt318;
		for (@Pc(42) int local42 = 0; local42 < arg2; local42++) {
			this.anIntArray148[local40 + local42] = arg3;
		}
	}

	@OriginalMember(owner = "mudclient!a/a/g", name = "c", descriptor = "(IIII)V")
	public final void method371(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 < this.anInt325 || arg0 >= this.anInt326) {
			return;
		}
		if (arg1 < this.anInt323) {
			arg2 -= this.anInt323 - arg1;
			arg1 = this.anInt323;
		}
		if (arg1 + arg2 > this.anInt326) {
			arg2 = this.anInt324 - arg1;
		}
		@Pc(40) int local40 = arg0 + arg1 * this.anInt318;
		for (@Pc(42) int local42 = 0; local42 < arg2; local42++) {
			this.anIntArray148[local40 + local42 * this.anInt318] = arg3;
		}
	}

	@OriginalMember(owner = "mudclient!a/a/g", name = "a", descriptor = "(III)V")
	public final void method372(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 >= this.anInt325 && arg1 >= this.anInt323 && arg0 < this.anInt326 && arg1 < this.anInt324) {
			this.anIntArray148[arg0 + arg1 * this.anInt318] = arg2;
		}
	}

	@OriginalMember(owner = "mudclient!a/a/g", name = "d", descriptor = "()V")
	public final void method373() {
		@Pc(5) int local5 = this.anInt318 * this.anInt319;
		for (@Pc(7) int local7 = 0; local7 < local5; local7++) {
			@Pc(16) int local16 = this.anIntArray148[local7] & 0xFFFFFF;
			this.anIntArray148[local7] = (local16 >>> 1 & 0x7F7F7F) + (local16 >>> 2 & 0x3F3F3F) + (local16 >>> 3 & 0x1F1F1F) + (local16 >>> 4 & 0xF0F0F);
		}
	}

	@OriginalMember(owner = "mudclient!a/a/g", name = "c", descriptor = "(IIIIII)V")
	public final void method374(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		for (@Pc(3) int local3 = arg2; local3 < arg2 + arg4; local3++) {
			for (@Pc(7) int local7 = arg3; local7 < arg3 + arg5; local7++) {
				@Pc(11) int local11 = 0;
				@Pc(13) int local13 = 0;
				@Pc(15) int local15 = 0;
				@Pc(17) int local17 = 0;
				for (@Pc(21) int local21 = local3 - arg0; local21 <= local3 + arg0; local21++) {
					if (local21 >= 0 && local21 < this.anInt318) {
						for (@Pc(33) int local33 = local7 - arg1; local33 <= local7 + arg1; local33++) {
							if (local33 >= 0 && local33 < this.anInt319) {
								@Pc(51) int local51 = this.anIntArray148[local21 + this.anInt318 * local33];
								local11 += local51 >> 16 & 0xFF;
								local13 += local51 >> 8 & 0xFF;
								local15 += local51 & 0xFF;
								local17++;
							}
						}
					}
				}
				this.anIntArray148[local3 + this.anInt318 * local7] = (local11 / local17 << 16) + (local13 / local17 << 8) + local15 / local17;
			}
		}
	}

	@OriginalMember(owner = "mudclient!a/a/g", name = "e", descriptor = "()V")
	public final void method376() {
		for (@Pc(1) int local1 = 0; local1 < this.anIntArrayArray16.length; local1++) {
			this.anIntArrayArray16[local1] = null;
			this.anIntArray149[local1] = 0;
			this.anIntArray150[local1] = 0;
			this.aByteArrayArray5[local1] = null;
			this.anIntArrayArray17[local1] = null;
		}
	}

	@OriginalMember(owner = "mudclient!a/a/g", name = "a", descriptor = "(I[B[BI)V")
	public final void method377(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		@Pc(5) int local5 = Class11.method306(arg1, 0);
		@Pc(9) int local9 = Class11.method306(arg2, local5);
		@Pc(10) int local10 = local5 + 2;
		@Pc(14) int local14 = Class11.method306(arg2, local10);
		@Pc(15) int local15 = local10 + 2;
		local5 = local15 + 1;
		@Pc(22) int local22 = arg2[local15] & 0xFF;
		@Pc(25) int[] local25 = new int[local22];
		local25[0] = 16711935;
		for (@Pc(31) int local31 = 0; local31 < local22 - 1; local31++) {
			local25[local31 + 1] = ((arg2[local5] & 0xFF) << 16) + ((arg2[local5 + 1] & 0xFF) << 8) + (arg2[local5 + 2] & 0xFF);
			local5 += 3;
		}
		@Pc(72) int local72 = 2;
		for (@Pc(74) int local74 = arg0; local74 < arg0 + arg3; local74++) {
			this.anIntArray151[local74] = arg2[local5++] & 0xFF;
			this.anIntArray152[local74] = arg2[local5++] & 0xFF;
			this.anIntArray149[local74] = Class11.method306(arg2, local5);
			local5 += 2;
			this.anIntArray150[local74] = Class11.method306(arg2, local5);
			local5 += 2;
			@Pc(119) int local119 = arg2[local5++] & 0xFF;
			@Pc(129) int local129 = this.anIntArray149[local74] * this.anIntArray150[local74];
			this.aByteArrayArray5[local74] = new byte[local129];
			this.anIntArrayArray17[local74] = local25;
			this.anIntArray153[local74] = local9;
			this.anIntArray154[local74] = local14;
			this.anIntArrayArray16[local74] = null;
			this.aBooleanArray10[local74] = false;
			if (this.anIntArray151[local74] != 0 || this.anIntArray152[local74] != 0) {
				this.aBooleanArray10[local74] = true;
			}
			@Pc(179) int local179;
			if (local119 == 0) {
				for (local179 = 0; local179 < local129; local179++) {
					this.aByteArrayArray5[local74][local179] = arg1[local72++];
					if (this.aByteArrayArray5[local74][local179] == 0) {
						this.aBooleanArray10[local74] = true;
					}
				}
			} else if (local119 == 1) {
				for (local179 = 0; local179 < this.anIntArray149[local74]; local179++) {
					for (@Pc(218) int local218 = 0; local218 < this.anIntArray150[local74]; local218++) {
						this.aByteArrayArray5[local74][local179 + local218 * this.anIntArray149[local74]] = arg1[local72++];
						if (this.aByteArrayArray5[local74][local179 + local218 * this.anIntArray149[local74]] == 0) {
							this.aBooleanArray10[local74] = true;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "mudclient!a/a/g", name = "a", descriptor = "(I[B)V")
	public final void method378(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		@Pc(9) int[] local9 = this.anIntArrayArray16[arg0] = new int[10200];
		this.anIntArray149[arg0] = 255;
		this.anIntArray150[arg0] = 40;
		this.anIntArray151[arg0] = 0;
		this.anIntArray152[arg0] = 0;
		this.anIntArray153[arg0] = 255;
		this.anIntArray154[arg0] = 40;
		this.aBooleanArray10[arg0] = false;
		@Pc(46) int local46 = 0;
		@Pc(48) int local48 = 1;
		@Pc(50) int local50 = 0;
		@Pc(59) int local59;
		@Pc(61) int local61;
		while (local50 < 255) {
			local59 = arg1[local48++] & 0xFF;
			for (local61 = 0; local61 < local59; local61++) {
				local9[local50++] = local46;
			}
			local46 = 16777215 - local46;
		}
		for (local59 = 1; local59 < 40; local59++) {
			local61 = 0;
			while (local61 < 255) {
				@Pc(94) int local94 = arg1[local48++] & 0xFF;
				for (@Pc(96) int local96 = 0; local96 < local94; local96++) {
					local9[local50] = local9[local50 - 255];
					local50++;
					local61++;
				}
				if (local61 < 255) {
					local9[local50] = 16777215 - local9[local50 - 255];
					local50++;
					local61++;
				}
			}
		}
	}

	@OriginalMember(owner = "mudclient!a/a/g", name = "a", descriptor = "(I)V")
	public final void method379(@OriginalArg(0) int arg0) {
		@Pc(11) int local11 = this.anIntArray149[arg0] * this.anIntArray150[arg0];
		@Pc(16) int[] local16 = this.anIntArrayArray16[arg0];
		@Pc(19) int[] local19 = new int[32768];
		for (@Pc(21) int local21 = 0; local21 < local11; local21++) {
			@Pc(27) int local27 = local16[local21];
			local19[(local27 >> 9 & 0x7C00) + ((local27 & 0xF800) >> 6) + (local27 >> 3 & 0x1F)]++;
		}
		@Pc(57) int[] local57 = new int[256];
		local57[0] = 16711935;
		@Pc(64) int[] local64 = new int[256];
		@Pc(79) int local79;
		@Pc(88) int local88;
		for (@Pc(66) int local66 = 0; local66 < 32768; local66++) {
			@Pc(72) int local72 = local19[local66];
			if (local72 > local64[255]) {
				for (local79 = 1; local79 < 256; local79++) {
					if (local72 > local64[local79]) {
						for (local88 = 255; local88 > local79; local88--) {
							local57[local88] = local57[local88 - 1];
							local64[local88] = local64[local88 - 1];
						}
						local57[local79] = ((local66 & 0x7C00) << 9) + ((local66 & 0x3E0) << 6) + ((local66 & 0x1F) << 3) + 263172;
						local64[local79] = local72;
						break;
					}
				}
			}
			local19[local66] = -1;
		}
		@Pc(153) byte[] local153 = new byte[local11];
		for (local79 = 0; local79 < local11; local79++) {
			local88 = local16[local79];
			@Pc(179) int local179 = (local88 >> 9 & 0x7C00) + ((local88 & 0xF800) >> 6) + (local88 >> 3 & 0x1F);
			@Pc(183) int local183 = local19[local179];
			if (local183 == -1) {
				@Pc(188) int local188 = 999999999;
				@Pc(194) int local194 = local88 >> 16 & 0xFF;
				@Pc(200) int local200 = local88 >> 8 & 0xFF;
				@Pc(204) int local204 = local88 & 0xFF;
				for (@Pc(206) int local206 = 0; local206 < 256; local206++) {
					@Pc(212) int local212 = local57[local206];
					@Pc(218) int local218 = local212 >> 16 & 0xFF;
					@Pc(224) int local224 = local212 >> 8 & 0xFF;
					@Pc(228) int local228 = local212 & 0xFF;
					@Pc(252) int local252 = (local194 - local218) * (local194 - local218) + (local200 - local224) * (local200 - local224) + (local204 - local228) * (local204 - local228);
					if (local252 < local188) {
						local188 = local252;
						local183 = local206;
					}
				}
				local19[local179] = local183;
			}
			local153[local79] = (byte) local183;
		}
		this.aByteArrayArray5[arg0] = local153;
		this.anIntArrayArray17[arg0] = local57;
		this.anIntArrayArray16[arg0] = null;
	}

	@OriginalMember(owner = "mudclient!a/a/g", name = "b", descriptor = "(I)V")
	public final void method380(@OriginalArg(0) int arg0) {
		if (this.aByteArrayArray5[arg0] == null) {
			return;
		}
		@Pc(17) int local17 = this.anIntArray149[arg0] * this.anIntArray150[arg0];
		@Pc(22) byte[] local22 = this.aByteArrayArray5[arg0];
		@Pc(27) int[] local27 = this.anIntArrayArray17[arg0];
		@Pc(30) int[] local30 = new int[local17];
		for (@Pc(32) int local32 = 0; local32 < local17; local32++) {
			@Pc(42) int local42 = local27[local22[local32] & 0xFF];
			if (local42 == 0) {
				local42 = 1;
			} else if (local42 == 16711935) {
				local42 = 0;
			}
			local30[local32] = local42;
		}
		this.anIntArrayArray16[arg0] = local30;
		this.aByteArrayArray5[arg0] = null;
		this.anIntArrayArray17[arg0] = null;
	}

	@OriginalMember(owner = "mudclient!a/a/g", name = "d", descriptor = "(IIIII)V")
	public final void method381(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anIntArray149[arg0] = arg3;
		this.anIntArray150[arg0] = arg4;
		this.aBooleanArray10[arg0] = false;
		this.anIntArray151[arg0] = 0;
		this.anIntArray152[arg0] = 0;
		this.anIntArray153[arg0] = arg3;
		this.anIntArray154[arg0] = arg4;
		@Pc(40) int local40 = arg3 * arg4;
		@Pc(42) int local42 = 0;
		this.anIntArrayArray16[arg0] = new int[local40];
		for (@Pc(50) int local50 = arg1; local50 < arg1 + arg3; local50++) {
			for (@Pc(54) int local54 = arg2; local54 < arg2 + arg4; local54++) {
				this.anIntArrayArray16[arg0][local42++] = this.anIntArray148[local50 + local54 * this.anInt318];
			}
		}
	}

	@OriginalMember(owner = "mudclient!a/a/g", name = "e", descriptor = "(IIIII)V")
	public final void method382(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anIntArray149[arg0] = arg3;
		this.anIntArray150[arg0] = arg4;
		this.aBooleanArray10[arg0] = false;
		this.anIntArray151[arg0] = 0;
		this.anIntArray152[arg0] = 0;
		this.anIntArray153[arg0] = arg3;
		this.anIntArray154[arg0] = arg4;
		@Pc(40) int local40 = arg3 * arg4;
		@Pc(42) int local42 = 0;
		this.anIntArrayArray16[arg0] = new int[local40];
		for (@Pc(50) int local50 = arg2; local50 < arg2 + arg4; local50++) {
			for (@Pc(54) int local54 = arg1; local54 < arg1 + arg3; local54++) {
				this.anIntArrayArray16[arg0][local42++] = this.anIntArray148[local54 + local50 * this.anInt318];
			}
		}
	}

	@OriginalMember(owner = "mudclient!a/a/g", name = "c", descriptor = "(III)V")
	public final void method383(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aBooleanArray10[arg2]) {
			arg0 += this.anIntArray151[arg2];
			arg1 += this.anIntArray152[arg2];
		}
		@Pc(25) int local25 = arg0 + arg1 * this.anInt318;
		@Pc(27) int local27 = 0;
		@Pc(32) int local32 = this.anIntArray150[arg2];
		@Pc(37) int local37 = this.anIntArray149[arg2];
		@Pc(42) int local42 = this.anInt318 - local37;
		@Pc(44) int local44 = 0;
		@Pc(53) int local53;
		if (arg1 < this.anInt323) {
			local53 = this.anInt323 - arg1;
			local32 -= local53;
			arg1 = this.anInt323;
			local27 += local53 * local37;
			local25 += local53 * this.anInt318;
		}
		if (arg1 + local32 >= this.anInt324) {
			local32 -= arg1 + local32 + 1 - this.anInt324;
		}
		if (arg0 < this.anInt325) {
			local53 = this.anInt325 - arg0;
			local37 -= local53;
			arg0 = this.anInt325;
			local27 += local53;
			local25 += local53;
			local44 += local53;
			local42 += local53;
		}
		if (arg0 + local37 >= this.anInt326) {
			local53 = arg0 + local37 + 1 - this.anInt326;
			local37 -= local53;
			local44 += local53;
			local42 += local53;
		}
		if (local37 <= 0 || local32 <= 0) {
			return;
		}
		@Pc(156) byte local156 = 1;
		if (this.aBoolean50) {
			local156 = 2;
			local42 += this.anInt318;
			local44 += this.anIntArray149[arg2];
			if ((arg1 & 0x1) != 0) {
				local25 += this.anInt318;
				local32--;
			}
		}
		if (this.anIntArrayArray16[arg2] == null) {
			this.method389(this.anIntArray148, this.aByteArrayArray5[arg2], this.anIntArrayArray17[arg2], local27, local25, local37, local32, local42, local44, local156);
		} else {
			this.method388(this.anIntArray148, this.anIntArrayArray16[arg2], 0, local27, local25, local37, local32, local42, local44, local156);
		}
	}

	@OriginalMember(owner = "mudclient!a/a/g", name = "f", descriptor = "(IIIII)V")
	public final void method384(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		try {
			@Pc(4) int local4 = this.anIntArray149[arg4];
			@Pc(9) int local9 = this.anIntArray150[arg4];
			@Pc(11) int local11 = 0;
			@Pc(13) int local13 = 0;
			@Pc(19) int local19 = (local4 << 16) / arg2;
			@Pc(25) int local25 = (local9 << 16) / arg3;
			@Pc(35) int local35;
			@Pc(40) int local40;
			if (this.aBooleanArray10[arg4]) {
				local35 = this.anIntArray153[arg4];
				local40 = this.anIntArray154[arg4];
				local19 = (local35 << 16) / arg2;
				local25 = (local40 << 16) / arg3;
				arg0 += (this.anIntArray151[arg4] * arg2 + local35 - 1) / local35;
				arg1 += (this.anIntArray152[arg4] * arg3 + local40 - 1) / local40;
				if (this.anIntArray151[arg4] * arg2 % local35 != 0) {
					local11 = (local35 - this.anIntArray151[arg4] * arg2 % local35 << 16) / arg2;
				}
				if (this.anIntArray152[arg4] * arg3 % local40 != 0) {
					local13 = (local40 - this.anIntArray152[arg4] * arg3 % local40 << 16) / arg3;
				}
				arg2 = arg2 * (this.anIntArray149[arg4] - (local11 >> 16)) / local35;
				arg3 = arg3 * (this.anIntArray150[arg4] - (local13 >> 16)) / local40;
			}
			local35 = arg0 + arg1 * this.anInt318;
			local40 = this.anInt318 - arg2;
			@Pc(177) int local177;
			if (arg1 < this.anInt323) {
				local177 = this.anInt323 - arg1;
				arg3 -= local177;
				arg1 = 0;
				local35 += local177 * this.anInt318;
				local13 += local25 * local177;
			}
			if (arg1 + arg3 >= this.anInt324) {
				arg3 -= arg1 + arg3 + 1 - this.anInt324;
			}
			if (arg0 < this.anInt325) {
				local177 = this.anInt325 - arg0;
				arg2 -= local177;
				arg0 = 0;
				local35 += local177;
				local11 += local19 * local177;
				local40 += local177;
			}
			if (arg0 + arg2 >= this.anInt326) {
				local177 = arg0 + arg2 + 1 - this.anInt326;
				arg2 -= local177;
				local40 += local177;
			}
			@Pc(267) byte local267 = 1;
			if (this.aBoolean50) {
				local267 = 2;
				local40 += this.anInt318;
				local25 += local25;
				if ((arg1 & 0x1) != 0) {
					local35 += this.anInt318;
					arg3--;
				}
			}
			this.method390(this.anIntArray148, this.anIntArrayArray16[arg4], 0, local11, local13, local35, local40, arg2, arg3, local19, local25, local4, local267);
		} catch (@Pc(313) Exception local313) {
			System.out.println("error in sprite clipping routine");
		}
	}

	@OriginalMember(owner = "mudclient!a/a/g", name = "d", descriptor = "(IIII)V")
	public final void method385(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aBooleanArray10[arg2]) {
			arg0 += this.anIntArray151[arg2];
			arg1 += this.anIntArray152[arg2];
		}
		@Pc(25) int local25 = arg0 + arg1 * this.anInt318;
		@Pc(27) int local27 = 0;
		@Pc(32) int local32 = this.anIntArray150[arg2];
		@Pc(37) int local37 = this.anIntArray149[arg2];
		@Pc(42) int local42 = this.anInt318 - local37;
		@Pc(44) int local44 = 0;
		@Pc(53) int local53;
		if (arg1 < this.anInt323) {
			local53 = this.anInt323 - arg1;
			local32 -= local53;
			arg1 = this.anInt323;
			local27 += local53 * local37;
			local25 += local53 * this.anInt318;
		}
		if (arg1 + local32 >= this.anInt324) {
			local32 -= arg1 + local32 + 1 - this.anInt324;
		}
		if (arg0 < this.anInt325) {
			local53 = this.anInt325 - arg0;
			local37 -= local53;
			arg0 = this.anInt325;
			local27 += local53;
			local25 += local53;
			local44 += local53;
			local42 += local53;
		}
		if (arg0 + local37 >= this.anInt326) {
			local53 = arg0 + local37 + 1 - this.anInt326;
			local37 -= local53;
			local44 += local53;
			local42 += local53;
		}
		if (local37 <= 0 || local32 <= 0) {
			return;
		}
		@Pc(156) byte local156 = 1;
		if (this.aBoolean50) {
			local156 = 2;
			local42 += this.anInt318;
			local44 += this.anIntArray149[arg2];
			if ((arg1 & 0x1) != 0) {
				local25 += this.anInt318;
				local32--;
			}
		}
		if (this.anIntArrayArray16[arg2] == null) {
			this.method392(this.anIntArray148, this.aByteArrayArray5[arg2], this.anIntArrayArray17[arg2], local27, local25, local37, local32, local42, local44, local156, arg3);
		} else {
			this.method391(this.anIntArray148, this.anIntArrayArray16[arg2], 0, local27, local25, local37, local32, local42, local44, local156, arg3);
		}
	}

	@OriginalMember(owner = "mudclient!a/a/g", name = "d", descriptor = "(IIIIII)V")
	public final void method386(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		try {
			@Pc(4) int local4 = this.anIntArray149[arg4];
			@Pc(9) int local9 = this.anIntArray150[arg4];
			@Pc(11) int local11 = 0;
			@Pc(13) int local13 = 0;
			@Pc(19) int local19 = (local4 << 16) / arg2;
			@Pc(25) int local25 = (local9 << 16) / arg3;
			@Pc(35) int local35;
			@Pc(40) int local40;
			if (this.aBooleanArray10[arg4]) {
				local35 = this.anIntArray153[arg4];
				local40 = this.anIntArray154[arg4];
				local19 = (local35 << 16) / arg2;
				local25 = (local40 << 16) / arg3;
				arg0 += (this.anIntArray151[arg4] * arg2 + local35 - 1) / local35;
				arg1 += (this.anIntArray152[arg4] * arg3 + local40 - 1) / local40;
				if (this.anIntArray151[arg4] * arg2 % local35 != 0) {
					local11 = (local35 - this.anIntArray151[arg4] * arg2 % local35 << 16) / arg2;
				}
				if (this.anIntArray152[arg4] * arg3 % local40 != 0) {
					local13 = (local40 - this.anIntArray152[arg4] * arg3 % local40 << 16) / arg3;
				}
				arg2 = arg2 * (this.anIntArray149[arg4] - (local11 >> 16)) / local35;
				arg3 = arg3 * (this.anIntArray150[arg4] - (local13 >> 16)) / local40;
			}
			local35 = arg0 + arg1 * this.anInt318;
			local40 = this.anInt318 - arg2;
			@Pc(177) int local177;
			if (arg1 < this.anInt323) {
				local177 = this.anInt323 - arg1;
				arg3 -= local177;
				arg1 = 0;
				local35 += local177 * this.anInt318;
				local13 += local25 * local177;
			}
			if (arg1 + arg3 >= this.anInt324) {
				arg3 -= arg1 + arg3 + 1 - this.anInt324;
			}
			if (arg0 < this.anInt325) {
				local177 = this.anInt325 - arg0;
				arg2 -= local177;
				arg0 = 0;
				local35 += local177;
				local11 += local19 * local177;
				local40 += local177;
			}
			if (arg0 + arg2 >= this.anInt326) {
				local177 = arg0 + arg2 + 1 - this.anInt326;
				arg2 -= local177;
				local40 += local177;
			}
			@Pc(267) byte local267 = 1;
			if (this.aBoolean50) {
				local267 = 2;
				local40 += this.anInt318;
				local25 += local25;
				if ((arg1 & 0x1) != 0) {
					local35 += this.anInt318;
					arg3--;
				}
			}
			this.method393(this.anIntArray148, this.anIntArrayArray16[arg4], 0, local11, local13, local35, local40, arg2, arg3, local19, local25, local4, local267, arg5);
		} catch (@Pc(314) Exception local314) {
			System.out.println("error in sprite clipping routine");
		}
	}

	@OriginalMember(owner = "mudclient!a/a/g", name = "e", descriptor = "(IIIIII)V")
	public final void method387(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		try {
			@Pc(4) int local4 = this.anIntArray149[arg4];
			@Pc(9) int local9 = this.anIntArray150[arg4];
			@Pc(11) int local11 = 0;
			@Pc(13) int local13 = 0;
			@Pc(19) int local19 = (local4 << 16) / arg2;
			@Pc(25) int local25 = (local9 << 16) / arg3;
			@Pc(35) int local35;
			@Pc(40) int local40;
			if (this.aBooleanArray10[arg4]) {
				local35 = this.anIntArray153[arg4];
				local40 = this.anIntArray154[arg4];
				local19 = (local35 << 16) / arg2;
				local25 = (local40 << 16) / arg3;
				arg0 += (this.anIntArray151[arg4] * arg2 + local35 - 1) / local35;
				arg1 += (this.anIntArray152[arg4] * arg3 + local40 - 1) / local40;
				if (this.anIntArray151[arg4] * arg2 % local35 != 0) {
					local11 = (local35 - this.anIntArray151[arg4] * arg2 % local35 << 16) / arg2;
				}
				if (this.anIntArray152[arg4] * arg3 % local40 != 0) {
					local13 = (local40 - this.anIntArray152[arg4] * arg3 % local40 << 16) / arg3;
				}
				arg2 = arg2 * (this.anIntArray149[arg4] - (local11 >> 16)) / local35;
				arg3 = arg3 * (this.anIntArray150[arg4] - (local13 >> 16)) / local40;
			}
			local35 = arg0 + arg1 * this.anInt318;
			local40 = this.anInt318 - arg2;
			@Pc(177) int local177;
			if (arg1 < this.anInt323) {
				local177 = this.anInt323 - arg1;
				arg3 -= local177;
				arg1 = 0;
				local35 += local177 * this.anInt318;
				local13 += local25 * local177;
			}
			if (arg1 + arg3 >= this.anInt324) {
				arg3 -= arg1 + arg3 + 1 - this.anInt324;
			}
			if (arg0 < this.anInt325) {
				local177 = this.anInt325 - arg0;
				arg2 -= local177;
				arg0 = 0;
				local35 += local177;
				local11 += local19 * local177;
				local40 += local177;
			}
			if (arg0 + arg2 >= this.anInt326) {
				local177 = arg0 + arg2 + 1 - this.anInt326;
				arg2 -= local177;
				local40 += local177;
			}
			@Pc(267) byte local267 = 1;
			if (this.aBoolean50) {
				local267 = 2;
				local40 += this.anInt318;
				local25 += local25;
				if ((arg1 & 0x1) != 0) {
					local35 += this.anInt318;
					arg3--;
				}
			}
			this.method394(this.anIntArray148, this.anIntArrayArray16[arg4], 0, local11, local13, local35, local40, arg2, arg3, local19, local25, local4, local267, arg5);
		} catch (@Pc(314) Exception local314) {
			System.out.println("error in sprite clipping routine");
		}
	}

	@OriginalMember(owner = "mudclient!a/a/g", name = "a", descriptor = "([I[IIIIIIIII)V")
	private void method388(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		@Pc(6) int local6 = -(arg5 >> 2);
		@Pc(11) int local11 = -(arg5 & 0x3);
		for (@Pc(14) int local14 = -arg6; local14 < 0; local14 += arg9) {
			@Pc(25) int local25;
			for (@Pc(18) int local18 = local6; local18 < 0; local18++) {
				local25 = arg1[arg3++];
				if (local25 == 0) {
					arg4++;
				} else {
					arg0[arg4++] = local25;
				}
				local25 = arg1[arg3++];
				if (local25 == 0) {
					arg4++;
				} else {
					arg0[arg4++] = local25;
				}
				local25 = arg1[arg3++];
				if (local25 == 0) {
					arg4++;
				} else {
					arg0[arg4++] = local25;
				}
				local25 = arg1[arg3++];
				if (local25 == 0) {
					arg4++;
				} else {
					arg0[arg4++] = local25;
				}
			}
			for (@Pc(85) int local85 = local11; local85 < 0; local85++) {
				local25 = arg1[arg3++];
				if (local25 == 0) {
					arg4++;
				} else {
					arg0[arg4++] = local25;
				}
			}
			arg4 += arg7;
			arg3 += arg8;
		}
	}

	@OriginalMember(owner = "mudclient!a/a/g", name = "a", descriptor = "([I[B[IIIIIIII)V")
	private void method389(@OriginalArg(0) int[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		@Pc(6) int local6 = -(arg5 >> 2);
		@Pc(11) int local11 = -(arg5 & 0x3);
		for (@Pc(14) int local14 = -arg6; local14 < 0; local14 += arg9) {
			for (@Pc(18) int local18 = local6; local18 < 0; local18++) {
				@Pc(25) byte local25 = arg1[arg3++];
				if (local25 == 0) {
					arg4++;
				} else {
					arg0[arg4++] = arg2[local25 & 0xFF];
				}
				local25 = arg1[arg3++];
				if (local25 == 0) {
					arg4++;
				} else {
					arg0[arg4++] = arg2[local25 & 0xFF];
				}
				local25 = arg1[arg3++];
				if (local25 == 0) {
					arg4++;
				} else {
					arg0[arg4++] = arg2[local25 & 0xFF];
				}
				local25 = arg1[arg3++];
				if (local25 == 0) {
					arg4++;
				} else {
					arg0[arg4++] = arg2[local25 & 0xFF];
				}
			}
			for (@Pc(101) int local101 = local11; local101 < 0; local101++) {
				@Pc(108) byte local108 = arg1[arg3++];
				if (local108 == 0) {
					arg4++;
				} else {
					arg0[arg4++] = arg2[local108 & 0xFF];
				}
			}
			arg4 += arg7;
			arg3 += arg8;
		}
	}

	@OriginalMember(owner = "mudclient!a/a/g", name = "a", descriptor = "([I[IIIIIIIIIIII)V")
	private void method390(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		try {
			@Pc(3) int local3 = arg3;
			for (@Pc(6) int local6 = -arg8; local6 < 0; local6 += arg12) {
				@Pc(14) int local14 = (arg4 >> 16) * arg11;
				for (@Pc(17) int local17 = -arg7; local17 < 0; local17++) {
					@Pc(27) int local27 = arg1[(arg3 >> 16) + local14];
					if (local27 == 0) {
						arg5++;
					} else {
						arg0[arg5++] = local27;
					}
					arg3 += arg9;
				}
				arg4 += arg10;
				arg3 = local3;
				arg5 += arg6;
			}
		} catch (@Pc(62) Exception local62) {
			System.out.println("error in plot_scale");
		}
	}

	@OriginalMember(owner = "mudclient!a/a/g", name = "a", descriptor = "([I[IIIIIIIIII)V")
	private void method391(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		@Pc(5) int local5 = 256 - arg10;
		for (@Pc(8) int local8 = -arg6; local8 < 0; local8 += arg9) {
			for (@Pc(13) int local13 = -arg5; local13 < 0; local13++) {
				@Pc(20) int local20 = arg1[arg3++];
				if (local20 == 0) {
					arg4++;
				} else {
					@Pc(26) int local26 = arg0[arg4];
					arg0[arg4++] = ((local20 & 0xFF00FF) * arg10 + (local26 & 0xFF00FF) * local5 & 0xFF00FF00) + ((local20 & 0xFF00) * arg10 + (local26 & 0xFF00) * local5 & 0xFF0000) >> 8;
				}
			}
			arg4 += arg7;
			arg3 += arg8;
		}
	}

	@OriginalMember(owner = "mudclient!a/a/g", name = "a", descriptor = "([I[B[IIIIIIIII)V")
	private void method392(@OriginalArg(0) int[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		@Pc(5) int local5 = 256 - arg10;
		for (@Pc(8) int local8 = -arg6; local8 < 0; local8 += arg9) {
			for (@Pc(13) int local13 = -arg5; local13 < 0; local13++) {
				@Pc(20) byte local20 = arg1[arg3++];
				if (local20 == 0) {
					arg4++;
				} else {
					@Pc(28) int local28 = arg2[local20 & 0xFF];
					@Pc(32) int local32 = arg0[arg4];
					arg0[arg4++] = ((local28 & 0xFF00FF) * arg10 + (local32 & 0xFF00FF) * local5 & 0xFF00FF00) + ((local28 & 0xFF00) * arg10 + (local32 & 0xFF00) * local5 & 0xFF0000) >> 8;
				}
			}
			arg4 += arg7;
			arg3 += arg8;
		}
	}

	@OriginalMember(owner = "mudclient!a/a/g", name = "a", descriptor = "([I[IIIIIIIIIIIII)V")
	private void method393(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13) {
		@Pc(5) int local5 = 256 - arg13;
		try {
			@Pc(7) int local7 = arg3;
			for (@Pc(10) int local10 = -arg8; local10 < 0; local10 += arg12) {
				@Pc(18) int local18 = (arg4 >> 16) * arg11;
				for (@Pc(21) int local21 = -arg7; local21 < 0; local21++) {
					@Pc(31) int local31 = arg1[(arg3 >> 16) + local18];
					if (local31 == 0) {
						arg5++;
					} else {
						@Pc(37) int local37 = arg0[arg5];
						arg0[arg5++] = ((local31 & 0xFF00FF) * arg13 + (local37 & 0xFF00FF) * local5 & 0xFF00FF00) + ((local31 & 0xFF00) * arg13 + (local37 & 0xFF00) * local5 & 0xFF0000) >> 8;
					}
					arg3 += arg9;
				}
				arg4 += arg10;
				arg3 = local7;
				arg5 += arg6;
			}
		} catch (@Pc(98) Exception local98) {
			System.out.println("error in tran_scale");
		}
	}

	@OriginalMember(owner = "mudclient!a/a/g", name = "b", descriptor = "([I[IIIIIIIIIIIII)V")
	private void method394(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13) {
		@Pc(7) int local7 = arg13 >> 16 & 0xFF;
		@Pc(13) int local13 = arg13 >> 8 & 0xFF;
		@Pc(17) int local17 = arg13 & 0xFF;
		try {
			@Pc(19) int local19 = arg3;
			for (@Pc(22) int local22 = -arg8; local22 < 0; local22 += arg12) {
				@Pc(30) int local30 = (arg4 >> 16) * arg11;
				for (@Pc(33) int local33 = -arg7; local33 < 0; local33++) {
					@Pc(43) int local43 = arg1[(arg3 >> 16) + local30];
					if (local43 == 0) {
						arg5++;
					} else {
						@Pc(51) int local51 = local43 >> 16 & 0xFF;
						@Pc(57) int local57 = local43 >> 8 & 0xFF;
						@Pc(61) int local61 = local43 & 0xFF;
						if (local51 == local57 && local57 == local61) {
							arg0[arg5++] = (local51 * local7 >> 8 << 16) + (local57 * local13 >> 8 << 8) + (local61 * local17 >> 8);
						} else {
							arg0[arg5++] = local43;
						}
					}
					arg3 += arg9;
				}
				arg4 += arg10;
				arg3 = local19;
				arg5 += arg6;
			}
		} catch (@Pc(127) Exception local127) {
			System.out.println("error in plot_scale");
		}
	}

	@OriginalMember(owner = "mudclient!a/a/g", name = "g", descriptor = "(IIIII)V")
	public final void method395(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(4) int local4 = this.anInt318;
		@Pc(7) int local7 = this.anInt319;
		@Pc(16) int local16;
		if (this.anIntArray156 == null) {
			this.anIntArray156 = new int[512];
			for (local16 = 0; local16 < 256; local16++) {
				this.anIntArray156[local16] = (int) (Math.sin((double) local16 * 0.02454369D) * 32768.0D);
				this.anIntArray156[local16 + 256] = (int) (Math.cos((double) local16 * 0.02454369D) * 32768.0D);
			}
		}
		local16 = -this.anIntArray153[arg2] / 2;
		@Pc(69) int local69 = -this.anIntArray154[arg2] / 2;
		if (this.aBooleanArray10[arg2]) {
			local16 += this.anIntArray151[arg2];
			local69 += this.anIntArray152[arg2];
		}
		@Pc(95) int local95 = local16 + this.anIntArray149[arg2];
		@Pc(102) int local102 = local69 + this.anIntArray150[arg2];
		@Pc(114) int local114 = arg3 & 0xFF;
		@Pc(121) int local121 = this.anIntArray156[local114] * arg4;
		@Pc(130) int local130 = this.anIntArray156[local114 + 256] * arg4;
		@Pc(142) int local142 = arg0 + (local69 * local121 + local16 * local130 >> 22);
		@Pc(154) int local154 = arg1 + (local69 * local130 - local16 * local121 >> 22);
		@Pc(166) int local166 = arg0 + (local69 * local121 + local95 * local130 >> 22);
		@Pc(178) int local178 = arg1 + (local69 * local130 - local95 * local121 >> 22);
		@Pc(190) int local190 = arg0 + (local102 * local121 + local95 * local130 >> 22);
		@Pc(202) int local202 = arg1 + (local102 * local130 - local95 * local121 >> 22);
		@Pc(214) int local214 = arg0 + (local102 * local121 + local16 * local130 >> 22);
		@Pc(226) int local226 = arg1 + (local102 * local130 - local16 * local121 >> 22);
		@Pc(228) int local228 = local154;
		@Pc(230) int local230 = local154;
		if (local178 < local154) {
			local228 = local178;
		} else if (local178 > local154) {
			local230 = local178;
		}
		if (local202 < local228) {
			local228 = local202;
		} else if (local202 > local230) {
			local230 = local202;
		}
		if (local226 < local228) {
			local228 = local226;
		} else if (local226 > local230) {
			local230 = local226;
		}
		if (local228 < this.anInt323) {
			local228 = this.anInt323;
		}
		if (local230 > this.anInt324) {
			local230 = this.anInt324;
		}
		if (this.anIntArray157 == null || this.anIntArray157.length != local7 + 1) {
			this.anIntArray157 = new int[local7 + 1];
			this.anIntArray158 = new int[local7 + 1];
			this.anIntArray159 = new int[local7 + 1];
			this.anIntArray160 = new int[local7 + 1];
			this.anIntArray161 = new int[local7 + 1];
			this.anIntArray162 = new int[local7 + 1];
		}
		for (@Pc(328) int local328 = local228; local328 <= local230; local328++) {
			this.anIntArray157[local328] = 99999999;
			this.anIntArray158[local328] = -99999999;
		}
		@Pc(346) int local346 = 0;
		@Pc(348) int local348 = 0;
		@Pc(350) int local350 = 0;
		@Pc(355) int local355 = this.anIntArray149[arg2];
		@Pc(360) int local360 = this.anIntArray150[arg2];
		@Pc(362) byte local362 = 0;
		@Pc(364) byte local364 = 0;
		@Pc(368) int local368 = local355 - 1;
		@Pc(370) byte local370 = 0;
		local95 = local355 - 1;
		local102 = local360 - 1;
		@Pc(380) byte local380 = 0;
		@Pc(384) int local384 = local360 - 1;
		if (local226 != local154) {
			local346 = (local214 - local142 << 8) / (local226 - local154);
			local350 = (local384 - local364 << 8) / (local226 - local154);
		}
		@Pc(420) int local420;
		@Pc(422) int local422;
		@Pc(414) int local414;
		@Pc(418) int local418;
		if (local154 > local226) {
			local414 = local214 << 8;
			local418 = local384 << 8;
			local420 = local226;
			local422 = local154;
		} else {
			local414 = local142 << 8;
			local418 = local364 << 8;
			local420 = local154;
			local422 = local226;
		}
		if (local420 < 0) {
			local414 -= local346 * local420;
			local418 -= local350 * local420;
			local420 = 0;
		}
		if (local422 > local7 - 1) {
			local422 = local7 - 1;
		}
		for (@Pc(463) int local463 = local420; local463 <= local422; local463++) {
			this.anIntArray157[local463] = this.anIntArray158[local463] = local414;
			local414 += local346;
			this.anIntArray159[local463] = this.anIntArray160[local463] = 0;
			this.anIntArray161[local463] = this.anIntArray162[local463] = local418;
			local418 += local350;
		}
		if (local178 != local154) {
			local346 = (local166 - local142 << 8) / (local178 - local154);
			local348 = (local368 - local362 << 8) / (local178 - local154);
		}
		@Pc(541) int local541;
		if (local154 > local178) {
			local414 = local166 << 8;
			local541 = local368 << 8;
			local420 = local178;
			local422 = local154;
		} else {
			local414 = local142 << 8;
			local541 = local362 << 8;
			local420 = local154;
			local422 = local178;
		}
		if (local420 < 0) {
			local414 -= local346 * local420;
			local541 -= local348 * local420;
			local420 = 0;
		}
		if (local422 > local7 - 1) {
			local422 = local7 - 1;
		}
		for (@Pc(586) int local586 = local420; local586 <= local422; local586++) {
			if (local414 < this.anIntArray157[local586]) {
				this.anIntArray157[local586] = local414;
				this.anIntArray159[local586] = local541;
				this.anIntArray161[local586] = 0;
			}
			if (local414 > this.anIntArray158[local586]) {
				this.anIntArray158[local586] = local414;
				this.anIntArray160[local586] = local541;
				this.anIntArray162[local586] = 0;
			}
			local414 += local346;
			local541 += local348;
		}
		if (local202 != local178) {
			local346 = (local190 - local166 << 8) / (local202 - local178);
			local350 = (local102 - local370 << 8) / (local202 - local178);
		}
		if (local178 > local202) {
			local414 = local190 << 8;
			local541 = local95 << 8;
			local418 = local102 << 8;
			local420 = local202;
			local422 = local178;
		} else {
			local414 = local166 << 8;
			local541 = local368 << 8;
			local418 = local370 << 8;
			local420 = local178;
			local422 = local202;
		}
		if (local420 < 0) {
			local414 -= local346 * local420;
			local418 -= local350 * local420;
			local420 = 0;
		}
		if (local422 > local7 - 1) {
			local422 = local7 - 1;
		}
		for (@Pc(729) int local729 = local420; local729 <= local422; local729++) {
			if (local414 < this.anIntArray157[local729]) {
				this.anIntArray157[local729] = local414;
				this.anIntArray159[local729] = local541;
				this.anIntArray161[local729] = local418;
			}
			if (local414 > this.anIntArray158[local729]) {
				this.anIntArray158[local729] = local414;
				this.anIntArray160[local729] = local541;
				this.anIntArray162[local729] = local418;
			}
			local414 += local346;
			local418 += local350;
		}
		if (local226 != local202) {
			local346 = (local214 - local190 << 8) / (local226 - local202);
			local348 = (local380 - local95 << 8) / (local226 - local202);
		}
		if (local202 > local226) {
			local414 = local214 << 8;
			local541 = local380 << 8;
			local418 = local384 << 8;
			local420 = local226;
			local422 = local202;
		} else {
			local414 = local190 << 8;
			local541 = local95 << 8;
			local418 = local102 << 8;
			local420 = local202;
			local422 = local226;
		}
		if (local420 < 0) {
			local414 -= local346 * local420;
			local541 -= local348 * local420;
			local420 = 0;
		}
		if (local422 > local7 - 1) {
			local422 = local7 - 1;
		}
		for (@Pc(872) int local872 = local420; local872 <= local422; local872++) {
			if (local414 < this.anIntArray157[local872]) {
				this.anIntArray157[local872] = local414;
				this.anIntArray159[local872] = local541;
				this.anIntArray161[local872] = local418;
			}
			if (local414 > this.anIntArray158[local872]) {
				this.anIntArray158[local872] = local414;
				this.anIntArray160[local872] = local541;
				this.anIntArray162[local872] = local418;
			}
			local414 += local346;
			local541 += local348;
		}
		@Pc(932) int local932 = local228 * local4;
		@Pc(937) int[] local937 = this.anIntArrayArray16[arg2];
		for (@Pc(939) int local939 = local228; local939 < local230; local939++) {
			@Pc(948) int local948 = this.anIntArray157[local939] >> 8;
			@Pc(955) int local955 = this.anIntArray158[local939] >> 8;
			if (local955 - local948 <= 0) {
				local932 += local4;
			} else {
				@Pc(972) int local972 = this.anIntArray159[local939] << 9;
				@Pc(985) int local985 = ((this.anIntArray160[local939] << 9) - local972) / (local955 - local948);
				@Pc(992) int local992 = this.anIntArray161[local939] << 9;
				@Pc(1005) int local1005 = ((this.anIntArray162[local939] << 9) - local992) / (local955 - local948);
				if (local948 < this.anInt325) {
					local972 += (this.anInt325 - local948) * local985;
					local992 += (this.anInt325 - local948) * local1005;
					local948 = this.anInt325;
				}
				if (local955 > this.anInt326) {
					local955 = this.anInt326;
				}
				if (!this.aBoolean50 || (local939 & 0x1) == 0) {
					if (this.aBooleanArray10[arg2]) {
						this.method397(this.anIntArray148, local937, 0, local932 + local948, local972, local992, local985, local1005, local948 - local955, local355);
					} else {
						this.method396(this.anIntArray148, local937, 0, local932 + local948, local972, local992, local985, local1005, local948 - local955, local355);
					}
				}
				local932 += local4;
			}
		}
	}

	@OriginalMember(owner = "mudclient!a/a/g", name = "b", descriptor = "([I[IIIIIIIII)V")
	private void method396(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		for (@Pc(1) int local1 = arg8; local1 < 0; local1++) {
			this.anIntArray148[arg3++] = arg1[(arg4 >> 17) + (arg5 >> 17) * arg9];
			arg4 += arg6;
			arg5 += arg7;
		}
	}

	@OriginalMember(owner = "mudclient!a/a/g", name = "c", descriptor = "([I[IIIIIIIII)V")
	private void method397(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		for (@Pc(3) int local3 = arg8; local3 < 0; local3++) {
			@Pc(17) int local17 = arg1[(arg4 >> 17) + (arg5 >> 17) * arg9];
			if (local17 == 0) {
				arg3++;
			} else {
				this.anIntArray148[arg3++] = local17;
			}
			arg4 += arg6;
			arg5 += arg7;
		}
	}

	@OriginalMember(owner = "mudclient!a/a/g", name = "a", descriptor = "(IIIIIII)V")
	public void method398(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.method384(arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "mudclient!a/a/g", name = "a", descriptor = "(IIIIIIIIZ)V")
	public final void method399(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		try {
			if (arg5 == 0) {
				arg5 = 16777215;
			}
			if (arg6 == 0) {
				arg6 = 16777215;
			}
			@Pc(12) int local12 = this.anIntArray149[arg4];
			@Pc(17) int local17 = this.anIntArray150[arg4];
			@Pc(19) int local19 = 0;
			@Pc(21) int local21 = 0;
			@Pc(25) int local25 = arg7 << 16;
			@Pc(31) int local31 = (local12 << 16) / arg2;
			@Pc(37) int local37 = (local17 << 16) / arg3;
			@Pc(44) int local44 = -(arg7 << 16) / arg3;
			@Pc(54) int local54;
			@Pc(59) int local59;
			if (this.aBooleanArray10[arg4]) {
				local54 = this.anIntArray153[arg4];
				local59 = this.anIntArray154[arg4];
				local31 = (local54 << 16) / arg2;
				local37 = (local59 << 16) / arg3;
				@Pc(76) int local76 = this.anIntArray151[arg4];
				@Pc(81) int local81 = this.anIntArray152[arg4];
				if (arg8) {
					local76 = local54 - this.anIntArray149[arg4] - local76;
				}
				arg0 += (local76 * arg2 + local54 - 1) / local54;
				@Pc(114) int local114 = (local81 * arg3 + local59 - 1) / local59;
				arg1 += local114;
				local25 += local114 * local44;
				if (local76 * arg2 % local54 != 0) {
					local19 = (local54 - local76 * arg2 % local54 << 16) / arg2;
				}
				if (local81 * arg3 % local59 != 0) {
					local21 = (local59 - local81 * arg3 % local59 << 16) / arg3;
				}
				arg2 = ((this.anIntArray149[arg4] << 16) + local31 - local19 - 1) / local31;
				arg3 = ((this.anIntArray150[arg4] << 16) + local37 - local21 - 1) / local37;
			}
			local54 = arg1 * this.anInt318;
			local25 += arg0 << 16;
			if (arg1 < this.anInt323) {
				local59 = this.anInt323 - arg1;
				arg3 -= local59;
				arg1 = this.anInt323;
				local54 += local59 * this.anInt318;
				local21 += local37 * local59;
				local25 += local44 * local59;
			}
			if (arg1 + arg3 >= this.anInt324) {
				arg3 -= arg1 + arg3 + 1 - this.anInt324;
			}
			local59 = local54 / this.anInt318 & 0x1;
			if (!this.aBoolean50) {
				local59 = 2;
			}
			if (arg6 == 16777215) {
				if (this.anIntArrayArray16[arg4] == null) {
					if (arg8) {
						this.method402(this.anIntArray148, this.aByteArrayArray5[arg4], this.anIntArrayArray17[arg4], 0, (this.anIntArray149[arg4] << 16) - local19 - 1, local21, local54, arg2, arg3, -local31, local37, local12, arg5, local25, local44, local59);
					} else {
						this.method402(this.anIntArray148, this.aByteArrayArray5[arg4], this.anIntArrayArray17[arg4], 0, local19, local21, local54, arg2, arg3, local31, local37, local12, arg5, local25, local44, local59);
					}
				} else if (arg8) {
					this.method400(this.anIntArray148, this.anIntArrayArray16[arg4], 0, (this.anIntArray149[arg4] << 16) - local19 - 1, local21, local54, arg2, arg3, -local31, local37, local12, arg5, local25, local44, local59);
				} else {
					this.method400(this.anIntArray148, this.anIntArrayArray16[arg4], 0, local19, local21, local54, arg2, arg3, local31, local37, local12, arg5, local25, local44, local59);
				}
			} else if (this.anIntArrayArray16[arg4] == null) {
				if (arg8) {
					this.method403(this.anIntArray148, this.aByteArrayArray5[arg4], this.anIntArrayArray17[arg4], 0, (this.anIntArray149[arg4] << 16) - local19 - 1, local21, local54, arg2, arg3, -local31, local37, local12, arg5, arg6, local25, local44, local59);
				} else {
					this.method403(this.anIntArray148, this.aByteArrayArray5[arg4], this.anIntArrayArray17[arg4], 0, local19, local21, local54, arg2, arg3, local31, local37, local12, arg5, arg6, local25, local44, local59);
				}
			} else if (arg8) {
				this.method401(this.anIntArray148, this.anIntArrayArray16[arg4], 0, (this.anIntArray149[arg4] << 16) - local19 - 1, local21, local54, arg2, arg3, -local31, local37, local12, arg5, arg6, local25, local44, local59);
			} else {
				this.method401(this.anIntArray148, this.anIntArrayArray16[arg4], 0, local19, local21, local54, arg2, arg3, local31, local37, local12, arg5, arg6, local25, local44, local59);
			}
		} catch (@Pc(523) Exception local523) {
			System.out.println("error in sprite clipping routine");
		}
	}

	@OriginalMember(owner = "mudclient!a/a/g", name = "a", descriptor = "([I[IIIIIIIIIIIIII)V")
	private void method400(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		@Pc(7) int local7 = arg11 >> 16 & 0xFF;
		@Pc(13) int local13 = arg11 >> 8 & 0xFF;
		@Pc(17) int local17 = arg11 & 0xFF;
		try {
			@Pc(19) int local19 = arg3;
			for (@Pc(22) int local22 = -arg7; local22 < 0; local22++) {
				@Pc(30) int local30 = (arg4 >> 16) * arg10;
				@Pc(34) int local34 = arg12 >> 16;
				@Pc(36) int local36 = arg6;
				@Pc(45) int local45;
				if (local34 < this.anInt325) {
					local45 = this.anInt325 - local34;
					local36 = arg6 - local45;
					local34 = this.anInt325;
					arg3 += arg8 * local45;
				}
				if (local34 + local36 >= this.anInt326) {
					local45 = local34 + local36 - this.anInt326;
					local36 -= local45;
				}
				arg14 = 1 - arg14;
				if (arg14 != 0) {
					for (local45 = local34; local45 < local34 + local36; local45++) {
						@Pc(93) int local93 = arg1[(arg3 >> 16) + local30];
						if (local93 != 0) {
							@Pc(101) int local101 = local93 >> 16 & 0xFF;
							@Pc(107) int local107 = local93 >> 8 & 0xFF;
							@Pc(111) int local111 = local93 & 0xFF;
							if (local101 == local107 && local107 == local111) {
								arg0[local45 + arg5] = (local101 * local7 >> 8 << 16) + (local107 * local13 >> 8 << 8) + (local111 * local17 >> 8);
							} else {
								arg0[local45 + arg5] = local93;
							}
						}
						arg3 += arg8;
					}
				}
				arg4 += arg9;
				arg3 = local19;
				arg5 += this.anInt318;
				arg12 += arg13;
			}
		} catch (@Pc(181) Exception local181) {
			System.out.println("error in transparent sprite plot routine");
		}
	}

	@OriginalMember(owner = "mudclient!a/a/g", name = "a", descriptor = "([I[IIIIIIIIIIIIIII)V")
	private void method401(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15) {
		@Pc(7) int local7 = arg11 >> 16 & 0xFF;
		@Pc(13) int local13 = arg11 >> 8 & 0xFF;
		@Pc(17) int local17 = arg11 & 0xFF;
		@Pc(23) int local23 = arg12 >> 16 & 0xFF;
		@Pc(29) int local29 = arg12 >> 8 & 0xFF;
		@Pc(33) int local33 = arg12 & 0xFF;
		try {
			@Pc(35) int local35 = arg3;
			for (@Pc(38) int local38 = -arg7; local38 < 0; local38++) {
				@Pc(46) int local46 = (arg4 >> 16) * arg10;
				@Pc(50) int local50 = arg13 >> 16;
				@Pc(52) int local52 = arg6;
				@Pc(61) int local61;
				if (local50 < this.anInt325) {
					local61 = this.anInt325 - local50;
					local52 = arg6 - local61;
					local50 = this.anInt325;
					arg3 += arg8 * local61;
				}
				if (local50 + local52 >= this.anInt326) {
					local61 = local50 + local52 - this.anInt326;
					local52 -= local61;
				}
				arg15 = 1 - arg15;
				if (arg15 != 0) {
					for (local61 = local50; local61 < local50 + local52; local61++) {
						@Pc(109) int local109 = arg1[(arg3 >> 16) + local46];
						if (local109 != 0) {
							@Pc(117) int local117 = local109 >> 16 & 0xFF;
							@Pc(123) int local123 = local109 >> 8 & 0xFF;
							@Pc(127) int local127 = local109 & 0xFF;
							if (local117 == local123 && local123 == local127) {
								arg0[local61 + arg5] = (local117 * local7 >> 8 << 16) + (local123 * local13 >> 8 << 8) + (local127 * local17 >> 8);
							} else if (local117 == 255 && local123 == local127) {
								arg0[local61 + arg5] = (local117 * local23 >> 8 << 16) + (local123 * local29 >> 8 << 8) + (local127 * local33 >> 8);
							} else {
								arg0[local61 + arg5] = local109;
							}
						}
						arg3 += arg8;
					}
				}
				arg4 += arg9;
				arg3 = local35;
				arg5 += this.anInt318;
				arg13 += arg14;
			}
		} catch (@Pc(231) Exception local231) {
			System.out.println("error in transparent sprite plot routine");
		}
	}

	@OriginalMember(owner = "mudclient!a/a/g", name = "a", descriptor = "([I[B[IIIIIIIIIIIIII)V")
	private void method402(@OriginalArg(0) int[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15) {
		@Pc(7) int local7 = arg12 >> 16 & 0xFF;
		@Pc(13) int local13 = arg12 >> 8 & 0xFF;
		@Pc(17) int local17 = arg12 & 0xFF;
		try {
			@Pc(19) int local19 = arg4;
			for (@Pc(22) int local22 = -arg8; local22 < 0; local22++) {
				@Pc(30) int local30 = (arg5 >> 16) * arg11;
				@Pc(34) int local34 = arg13 >> 16;
				@Pc(36) int local36 = arg7;
				@Pc(45) int local45;
				if (local34 < this.anInt325) {
					local45 = this.anInt325 - local34;
					local36 = arg7 - local45;
					local34 = this.anInt325;
					arg4 += arg9 * local45;
				}
				if (local34 + local36 >= this.anInt326) {
					local45 = local34 + local36 - this.anInt326;
					local36 -= local45;
				}
				arg15 = 1 - arg15;
				if (arg15 != 0) {
					for (local45 = local34; local45 < local34 + local36; local45++) {
						@Pc(95) int local95 = arg1[(arg4 >> 16) + local30] & 0xFF;
						if (local95 != 0) {
							local95 = arg2[local95];
							@Pc(107) int local107 = local95 >> 16 & 0xFF;
							@Pc(113) int local113 = local95 >> 8 & 0xFF;
							@Pc(117) int local117 = local95 & 0xFF;
							if (local107 == local113 && local113 == local117) {
								arg0[local45 + arg6] = (local107 * local7 >> 8 << 16) + (local113 * local13 >> 8 << 8) + (local117 * local17 >> 8);
							} else {
								arg0[local45 + arg6] = local95;
							}
						}
						arg4 += arg9;
					}
				}
				arg5 += arg10;
				arg4 = local19;
				arg6 += this.anInt318;
				arg13 += arg14;
			}
		} catch (@Pc(187) Exception local187) {
			System.out.println("error in transparent sprite plot routine");
		}
	}

	@OriginalMember(owner = "mudclient!a/a/g", name = "a", descriptor = "([I[B[IIIIIIIIIIIIIII)V")
	private void method403(@OriginalArg(0) int[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15, @OriginalArg(16) int arg16) {
		@Pc(7) int local7 = arg12 >> 16 & 0xFF;
		@Pc(13) int local13 = arg12 >> 8 & 0xFF;
		@Pc(17) int local17 = arg12 & 0xFF;
		@Pc(23) int local23 = arg13 >> 16 & 0xFF;
		@Pc(29) int local29 = arg13 >> 8 & 0xFF;
		@Pc(33) int local33 = arg13 & 0xFF;
		try {
			@Pc(35) int local35 = arg4;
			for (@Pc(38) int local38 = -arg8; local38 < 0; local38++) {
				@Pc(46) int local46 = (arg5 >> 16) * arg11;
				@Pc(50) int local50 = arg14 >> 16;
				@Pc(52) int local52 = arg7;
				@Pc(61) int local61;
				if (local50 < this.anInt325) {
					local61 = this.anInt325 - local50;
					local52 = arg7 - local61;
					local50 = this.anInt325;
					arg4 += arg9 * local61;
				}
				if (local50 + local52 >= this.anInt326) {
					local61 = local50 + local52 - this.anInt326;
					local52 -= local61;
				}
				arg16 = 1 - arg16;
				if (arg16 != 0) {
					for (local61 = local50; local61 < local50 + local52; local61++) {
						@Pc(111) int local111 = arg1[(arg4 >> 16) + local46] & 0xFF;
						if (local111 != 0) {
							local111 = arg2[local111];
							@Pc(123) int local123 = local111 >> 16 & 0xFF;
							@Pc(129) int local129 = local111 >> 8 & 0xFF;
							@Pc(133) int local133 = local111 & 0xFF;
							if (local123 == local129 && local129 == local133) {
								arg0[local61 + arg6] = (local123 * local7 >> 8 << 16) + (local129 * local13 >> 8 << 8) + (local133 * local17 >> 8);
							} else if (local123 == 255 && local129 == local133) {
								arg0[local61 + arg6] = (local123 * local23 >> 8 << 16) + (local129 * local29 >> 8 << 8) + (local133 * local33 >> 8);
							} else {
								arg0[local61 + arg6] = local111;
							}
						}
						arg4 += arg9;
					}
				}
				arg5 += arg10;
				arg4 = local35;
				arg6 += this.anInt318;
				arg14 += arg15;
			}
		} catch (@Pc(237) Exception local237) {
			System.out.println("error in transparent sprite plot routine");
		}
	}

	@OriginalMember(owner = "mudclient!a/a/g", name = "a", descriptor = "(Ljava/lang/String;IIII)V")
	public final void method405(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method408(arg0, arg1 - this.method412(arg0, arg3), arg2, arg3, arg4);
	}

	@OriginalMember(owner = "mudclient!a/a/g", name = "b", descriptor = "(Ljava/lang/String;IIII)V")
	public final void method406(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method408(arg0, arg1 - this.method412(arg0, arg3) / 2, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "mudclient!a/a/g", name = "a", descriptor = "(Ljava/lang/String;IIIII)V")
	public final void method407(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		try {
			@Pc(3) int local3 = 0;
			@Pc(7) byte[] local7 = aByteArrayArray6[arg3];
			@Pc(9) int local9 = 0;
			@Pc(11) int local11 = 0;
			for (@Pc(13) int local13 = 0; local13 < arg0.length(); local13++) {
				if (arg0.charAt(local13) == '@' && local13 + 4 < arg0.length() && arg0.charAt(local13 + 4) == '@') {
					local13 += 4;
				} else if (arg0.charAt(local13) == '~' && local13 + 4 < arg0.length() && arg0.charAt(local13 + 4) == '~') {
					local13 += 4;
				} else {
					local3 += local7[anIntArray155[arg0.charAt(local13)] + 7];
				}
				if (arg0.charAt(local13) == ' ') {
					local11 = local13;
				}
				if (arg0.charAt(local13) == '%') {
					local11 = local13;
					local3 = 1000;
				}
				if (local3 > arg5) {
					if (local11 <= local9) {
						local11 = local13;
					}
					this.method406(arg0.substring(local9, local11), arg1, arg2, arg3, arg4);
					local3 = 0;
					local9 = local13 = local11 + 1;
					arg2 += this.method411(arg3);
				}
			}
			if (local3 > 0) {
				this.method406(arg0.substring(local9), arg1, arg2, arg3, arg4);
				return;
			}
		} catch (@Pc(135) Exception local135) {
			System.out.println("centrepara: " + local135);
			local135.printStackTrace();
		}
	}

	@OriginalMember(owner = "mudclient!a/a/g", name = "c", descriptor = "(Ljava/lang/String;IIII)V")
	public final void method408(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		try {
			@Pc(5) byte[] local5 = aByteArrayArray6[arg3];
			for (@Pc(7) int local7 = 0; local7 < arg0.length(); local7++) {
				if (arg0.charAt(local7) == '@' && local7 + 4 < arg0.length() && arg0.charAt(local7 + 4) == '@') {
					if (arg0.substring(local7 + 1, local7 + 4).equalsIgnoreCase("red")) {
						arg4 = 16711680;
					} else if (arg0.substring(local7 + 1, local7 + 4).equalsIgnoreCase("lre")) {
						arg4 = 16748608;
					} else if (arg0.substring(local7 + 1, local7 + 4).equalsIgnoreCase("yel")) {
						arg4 = 16776960;
					} else if (arg0.substring(local7 + 1, local7 + 4).equalsIgnoreCase("gre")) {
						arg4 = 65280;
					} else if (arg0.substring(local7 + 1, local7 + 4).equalsIgnoreCase("blu")) {
						arg4 = 255;
					} else if (arg0.substring(local7 + 1, local7 + 4).equalsIgnoreCase("cya")) {
						arg4 = 65535;
					} else if (arg0.substring(local7 + 1, local7 + 4).equalsIgnoreCase("mag")) {
						arg4 = 16711935;
					} else if (arg0.substring(local7 + 1, local7 + 4).equalsIgnoreCase("whi")) {
						arg4 = 16777215;
					} else if (arg0.substring(local7 + 1, local7 + 4).equalsIgnoreCase("bla")) {
						arg4 = 0;
					} else if (arg0.substring(local7 + 1, local7 + 4).equalsIgnoreCase("dre")) {
						arg4 = 12582912;
					} else if (arg0.substring(local7 + 1, local7 + 4).equalsIgnoreCase("ora")) {
						arg4 = 16748608;
					} else if (arg0.substring(local7 + 1, local7 + 4).equalsIgnoreCase("ran")) {
						arg4 = (int) (Math.random() * 1.6777215E7D);
					} else if (arg0.substring(local7 + 1, local7 + 4).equalsIgnoreCase("or1")) {
						arg4 = 16756736;
					} else if (arg0.substring(local7 + 1, local7 + 4).equalsIgnoreCase("or2")) {
						arg4 = 16740352;
					} else if (arg0.substring(local7 + 1, local7 + 4).equalsIgnoreCase("or3")) {
						arg4 = 16723968;
					} else if (arg0.substring(local7 + 1, local7 + 4).equalsIgnoreCase("gr1")) {
						arg4 = 12648192;
					} else if (arg0.substring(local7 + 1, local7 + 4).equalsIgnoreCase("gr2")) {
						arg4 = 8453888;
					} else if (arg0.substring(local7 + 1, local7 + 4).equalsIgnoreCase("gr3")) {
						arg4 = 4259584;
					}
					local7 += 4;
				} else if (arg0.charAt(local7) == '~' && local7 + 4 < arg0.length() && arg0.charAt(local7 + 4) == '~') {
					@Pc(325) char local325 = arg0.charAt(local7 + 1);
					@Pc(331) char local331 = arg0.charAt(local7 + 2);
					@Pc(337) char local337 = arg0.charAt(local7 + 3);
					if (local325 >= '0' && local325 <= '9' && local331 >= '0' && local331 <= '9' && local337 >= '0' && local337 <= '9') {
						arg1 = Integer.parseInt(arg0.substring(local7 + 1, local7 + 4));
					}
					local7 += 4;
				} else {
					@Pc(374) int local374 = anIntArray155[arg0.charAt(local7)];
					if (this.aBoolean51 && arg4 != 0) {
						this.method409(local374, arg1 + 1, arg2, 0, local5);
					}
					if (this.aBoolean51 && arg4 != 0) {
						this.method409(local374, arg1, arg2 + 1, 0, local5);
					}
					this.method409(local374, arg1, arg2, arg4, local5);
					arg1 += local5[local374 + 7];
				}
			}
		} catch (@Pc(424) Exception local424) {
			System.out.println("drawstring: " + local424);
			local424.printStackTrace();
		}
	}

	@OriginalMember(owner = "mudclient!a/a/g", name = "a", descriptor = "(IIII[B)V")
	private void method409(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4) {
		@Pc(7) int local7 = arg1 + arg4[arg0 + 5];
		@Pc(15) int local15 = arg2 - arg4[arg0 + 6];
		@Pc(21) int local21 = arg4[arg0 + 3];
		@Pc(27) int local27 = arg4[arg0 + 4];
		@Pc(47) int local47 = arg4[arg0] * 16384 + arg4[arg0 + 1] * 128 + arg4[arg0 + 2];
		@Pc(54) int local54 = local7 + local15 * this.anInt318;
		@Pc(59) int local59 = this.anInt318 - local21;
		@Pc(61) int local61 = 0;
		@Pc(70) int local70;
		if (local15 < this.anInt323) {
			local70 = this.anInt323 - local15;
			local27 -= local70;
			local15 = this.anInt323;
			local47 += local70 * local21;
			local54 += local70 * this.anInt318;
		}
		if (local15 + local27 >= this.anInt324) {
			local27 -= local15 + local27 + 1 - this.anInt324;
		}
		if (local7 < this.anInt325) {
			local70 = this.anInt325 - local7;
			local21 -= local70;
			local7 = this.anInt325;
			local47 += local70;
			local54 += local70;
			local61 += local70;
			local59 += local70;
		}
		if (local7 + local21 >= this.anInt326) {
			local70 = local7 + local21 + 1 - this.anInt326;
			local21 -= local70;
			local61 += local70;
			local59 += local70;
		}
		if (local21 > 0 && local27 > 0) {
			this.method410(this.anIntArray148, arg4, arg3, local47, local54, local21, local27, local59, local61);
		}
	}

	@OriginalMember(owner = "mudclient!a/a/g", name = "a", descriptor = "([I[BIIIIIII)V")
	private void method410(@OriginalArg(0) int[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		try {
			@Pc(6) int local6 = -(arg5 >> 2);
			@Pc(11) int local11 = -(arg5 & 0x3);
			for (@Pc(14) int local14 = -arg6; local14 < 0; local14++) {
				for (@Pc(18) int local18 = local6; local18 < 0; local18++) {
					if (arg1[arg3++] == 0) {
						arg4++;
					} else {
						arg0[arg4++] = arg2;
					}
					if (arg1[arg3++] == 0) {
						arg4++;
					} else {
						arg0[arg4++] = arg2;
					}
					if (arg1[arg3++] == 0) {
						arg4++;
					} else {
						arg0[arg4++] = arg2;
					}
					if (arg1[arg3++] == 0) {
						arg4++;
					} else {
						arg0[arg4++] = arg2;
					}
				}
				for (@Pc(77) int local77 = local11; local77 < 0; local77++) {
					if (arg1[arg3++] == 0) {
						arg4++;
					} else {
						arg0[arg4++] = arg2;
					}
				}
				arg4 += arg7;
				arg3 += arg8;
			}
		} catch (@Pc(108) Exception local108) {
			System.out.println("plotletter: " + local108);
			local108.printStackTrace();
		}
	}

	@OriginalMember(owner = "mudclient!a/a/g", name = "c", descriptor = "(I)I")
	public final int method411(@OriginalArg(0) int arg0) {
		return arg0 == 0 ? aByteArrayArray6[arg0][8] - 2 : aByteArrayArray6[arg0][8] - 1;
	}

	@OriginalMember(owner = "mudclient!a/a/g", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public final int method412(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = 0;
		@Pc(7) byte[] local7 = aByteArrayArray6[arg1];
		for (@Pc(9) int local9 = 0; local9 < arg0.length(); local9++) {
			if (arg0.charAt(local9) == '@' && local9 + 4 < arg0.length() && arg0.charAt(local9 + 4) == '@') {
				local9 += 4;
			} else if (arg0.charAt(local9) == '~' && local9 + 4 < arg0.length() && arg0.charAt(local9 + 4) == '~') {
				local9 += 4;
			} else {
				local3 += local7[anIntArray155[arg0.charAt(local9)] + 7];
			}
		}
		return local3;
	}

	@OriginalMember(owner = "mudclient!a/a/g", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
	@Override
	public final boolean imageUpdate(@OriginalArg(0) Image arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return true;
	}
}
