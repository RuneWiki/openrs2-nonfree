package com.jagex;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import javax.imageio.ImageIO;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dr")
public abstract class Class87 implements Interface24 {

	@OriginalMember(owner = "client!dr", name = "p", descriptor = "D")
	static double aDouble2 = -1.0D;

	@OriginalMember(owner = "client!dr", name = "c", descriptor = "[I")
	static final int[] anIntArray38 = new int[256];

	@OriginalMember(owner = "client!dr", name = "<init>", descriptor = "()V", line = 14)
	Class87() {
	}

	@OriginalMember(owner = "client!dr", name = "e", descriptor = "([ID)V", line = 17)
	static void method4236(@OriginalArg(0) int[] arg0, @OriginalArg(1) double arg1) {
		@Pc(5) int local5;
		@Pc(18) int local18;
		if (arg1 != aDouble2) {
			for (local5 = 0; local5 < 256; local5++) {
				local18 = (int) (Math.pow((double) local5 / 255.0D, arg1) * 255.0D);
				anIntArray38[local5] = local18 > 255 ? 255 : local18;
			}
			aDouble2 = arg1;
		}
		for (local5 = 0; local5 < arg0.length; local5++) {
			local18 = anIntArray38[arg0[local5] >> 16 & 0xFF];
			@Pc(57) int local57 = anIntArray38[arg0[local5] >> 8 & 0xFF];
			@Pc(67) int local67 = anIntArray38[arg0[local5] >> 0 & 0xFF];
			arg0[local5] = arg0[local5] & 0xFF000000 | local18 << 16 | local57 << 8 | local67;
		}
	}

	@OriginalMember(owner = "client!dr", name = "k", descriptor = "([ID)V", line = 17)
	static void method4237(@OriginalArg(0) int[] arg0, @OriginalArg(1) double arg1) {
		@Pc(5) int local5;
		@Pc(18) int local18;
		if (arg1 != aDouble2) {
			for (local5 = 0; local5 < 256; local5++) {
				local18 = (int) (Math.pow((double) local5 / 255.0D, arg1) * 255.0D);
				anIntArray38[local5] = local18 > 255 ? 255 : local18;
			}
			aDouble2 = arg1;
		}
		for (local5 = 0; local5 < arg0.length; local5++) {
			local18 = anIntArray38[arg0[local5] >> 16 & 0xFF];
			@Pc(57) int local57 = anIntArray38[arg0[local5] >> 8 & 0xFF];
			@Pc(67) int local67 = anIntArray38[arg0[local5] >> 0 & 0xFF];
			arg0[local5] = arg0[local5] & 0xFF000000 | local18 << 16 | local57 << 8 | local67;
		}
	}

	@OriginalMember(owner = "client!dr", name = "u", descriptor = "([ID)V", line = 17)
	static void method4238(@OriginalArg(0) int[] arg0, @OriginalArg(1) double arg1) {
		@Pc(5) int local5;
		@Pc(18) int local18;
		if (arg1 != aDouble2) {
			for (local5 = 0; local5 < 256; local5++) {
				local18 = (int) (Math.pow((double) local5 / 255.0D, arg1) * 255.0D);
				anIntArray38[local5] = local18 > 255 ? 255 : local18;
			}
			aDouble2 = arg1;
		}
		for (local5 = 0; local5 < arg0.length; local5++) {
			local18 = anIntArray38[arg0[local5] >> 16 & 0xFF];
			@Pc(57) int local57 = anIntArray38[arg0[local5] >> 8 & 0xFF];
			@Pc(67) int local67 = anIntArray38[arg0[local5] >> 0 & 0xFF];
			arg0[local5] = arg0[local5] & 0xFF000000 | local18 << 16 | local57 << 8 | local67;
		}
	}

	@OriginalMember(owner = "client!dr", name = "l", descriptor = "(Lclient!vi;ID)[I", line = 36)
	int[] method4239(@OriginalArg(0) Class596 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) double arg2) {
		@Pc(5) int[] local5 = this.method4242(arg0, arg1, arg2);
		if (local5 == null) {
			return null;
		}
		for (@Pc(12) int local12 = 0; local12 < local5.length; local12++) {
			if ((local5[local12] & 0xFFFFFF) == 0) {
				local5[local12] &= 0xFFFFFF;
			} else {
				local5[local12] |= 0xFF000000;
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!dr", name = "f", descriptor = "(Lclient!vi;ID)[I", line = 36)
	int[] method4240(@OriginalArg(0) Class596 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) double arg2) {
		@Pc(5) int[] local5 = this.method4242(arg0, arg1, arg2);
		if (local5 == null) {
			return null;
		}
		for (@Pc(12) int local12 = 0; local12 < local5.length; local12++) {
			if ((local5[local12] & 0xFFFFFF) == 0) {
				local5[local12] &= 0xFFFFFF;
			} else {
				local5[local12] |= 0xFF000000;
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!dr", name = "o", descriptor = "(Lclient!vi;ID)[I", line = 36)
	int[] method4241(@OriginalArg(0) Class596 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) double arg2) {
		@Pc(5) int[] local5 = this.method4242(arg0, arg1, arg2);
		if (local5 == null) {
			return null;
		}
		for (@Pc(12) int local12 = 0; local12 < local5.length; local12++) {
			if ((local5[local12] & 0xFFFFFF) == 0) {
				local5[local12] &= 0xFFFFFF;
			} else {
				local5[local12] |= 0xFF000000;
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!dr", name = "y", descriptor = "(Lclient!vi;ID)[I", line = 50)
	int[] method4242(@OriginalArg(0) Class596 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) double arg2) {
		@Pc(5) byte[] local5 = this.method4255(arg0, arg1);
		if (local5 == null) {
			return null;
		}
		try {
			@Pc(17) byte local17 = (byte) (local5[0] & 0xFF);
			if (Class596.aClass596_1 == arg0) {
				if (local17 != 6) {
					return null;
				}
				@Pc(27) int[] local27 = null;
				@Pc(29) int local29 = 1;
				for (@Pc(31) int local31 = 0; local31 < 6; local31++) {
					@Pc(70) int local70 = (local5[local29] & 0xFF) << 24 | (local5[local29 + 1] & 0xFF) << 16 | (local5[local29 + 2] & 0xFF) << 8 | local5[local29 + 3] & 0xFF;
					@Pc(73) byte[] local73 = new byte[local70];
					System.arraycopy(local5, local29 + 4, local73, 0, local70);
					@Pc(87) int[] local87 = this.method4248(local73, false);
					if (local31 == 0) {
						local27 = new int[local87.length * 6];
					}
					System.arraycopy(local87, 0, local27, local31 * local87.length, local87.length);
					local29 += local70 + 4;
				}
				if (arg2 != 1.0D) {
					Class339.method27726(local27, arg2);
				}
				return local27;
			} else if (local17 == 1) {
				@Pc(134) byte[] local134 = new byte[local5.length - 5];
				System.arraycopy(local5, 5, local134, 0, local5.length - 5);
				@Pc(149) int[] local149 = this.method4248(local134, false);
				if (local149 == null) {
					return null;
				} else {
					if (arg2 != 1.0D) {
						Class339.method27726(local149, arg2);
					}
					return local149;
				}
			} else {
				return null;
			}
		} catch (@Pc(163) IOException local163) {
			return null;
		}
	}

	@OriginalMember(owner = "client!dr", name = "b", descriptor = "(Lclient!vi;ID)[I", line = 50)
	int[] method4243(@OriginalArg(0) Class596 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) double arg2) {
		@Pc(5) byte[] local5 = this.method4255(arg0, arg1);
		if (local5 == null) {
			return null;
		}
		try {
			@Pc(17) byte local17 = (byte) (local5[0] & 0xFF);
			if (Class596.aClass596_1 == arg0) {
				if (local17 != 6) {
					return null;
				}
				@Pc(27) int[] local27 = null;
				@Pc(29) int local29 = 1;
				for (@Pc(31) int local31 = 0; local31 < 6; local31++) {
					@Pc(70) int local70 = (local5[local29] & 0xFF) << 24 | (local5[local29 + 1] & 0xFF) << 16 | (local5[local29 + 2] & 0xFF) << 8 | local5[local29 + 3] & 0xFF;
					@Pc(73) byte[] local73 = new byte[local70];
					System.arraycopy(local5, local29 + 4, local73, 0, local70);
					@Pc(87) int[] local87 = this.method4248(local73, false);
					if (local31 == 0) {
						local27 = new int[local87.length * 6];
					}
					System.arraycopy(local87, 0, local27, local31 * local87.length, local87.length);
					local29 += local70 + 4;
				}
				if (arg2 != 1.0D) {
					Class339.method27726(local27, arg2);
				}
				return local27;
			} else if (local17 == 1) {
				@Pc(134) byte[] local134 = new byte[local5.length - 5];
				System.arraycopy(local5, 5, local134, 0, local5.length - 5);
				@Pc(149) int[] local149 = this.method4248(local134, false);
				if (local149 == null) {
					return null;
				} else {
					if (arg2 != 1.0D) {
						Class339.method27726(local149, arg2);
					}
					return local149;
				}
			} else {
				return null;
			}
		} catch (@Pc(163) IOException local163) {
			return null;
		}
	}

	@OriginalMember(owner = "client!dr", name = "n", descriptor = "(Lclient!vi;ID)[I", line = 50)
	int[] method4244(@OriginalArg(0) Class596 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) double arg2) {
		@Pc(5) byte[] local5 = this.method4255(arg0, arg1);
		if (local5 == null) {
			return null;
		}
		try {
			@Pc(17) byte local17 = (byte) (local5[0] & 0xFF);
			if (Class596.aClass596_1 == arg0) {
				if (local17 != 6) {
					return null;
				}
				@Pc(27) int[] local27 = null;
				@Pc(29) int local29 = 1;
				for (@Pc(31) int local31 = 0; local31 < 6; local31++) {
					@Pc(70) int local70 = (local5[local29] & 0xFF) << 24 | (local5[local29 + 1] & 0xFF) << 16 | (local5[local29 + 2] & 0xFF) << 8 | local5[local29 + 3] & 0xFF;
					@Pc(73) byte[] local73 = new byte[local70];
					System.arraycopy(local5, local29 + 4, local73, 0, local70);
					@Pc(87) int[] local87 = this.method4248(local73, false);
					if (local31 == 0) {
						local27 = new int[local87.length * 6];
					}
					System.arraycopy(local87, 0, local27, local31 * local87.length, local87.length);
					local29 += local70 + 4;
				}
				if (arg2 != 1.0D) {
					Class339.method27726(local27, arg2);
				}
				return local27;
			} else if (local17 == 1) {
				@Pc(134) byte[] local134 = new byte[local5.length - 5];
				System.arraycopy(local5, 5, local134, 0, local5.length - 5);
				@Pc(149) int[] local149 = this.method4248(local134, false);
				if (local149 == null) {
					return null;
				} else {
					if (arg2 != 1.0D) {
						Class339.method27726(local149, arg2);
					}
					return local149;
				}
			} else {
				return null;
			}
		} catch (@Pc(163) IOException local163) {
			return null;
		}
	}

	@OriginalMember(owner = "client!dr", name = "w", descriptor = "(Lclient!vi;ID)[F", line = 94)
	float[] method4245(@OriginalArg(0) Class596 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) double arg2) {
		if (Class596.aClass596_2 != arg0) {
			return null;
		}
		@Pc(10) int[] local10 = this.method4242(arg0, arg1, arg2);
		if (local10 == null) {
			return null;
		}
		@Pc(16) int[] local16 = null;
		@Pc(22) byte[] local22 = this.method4255(Class596.aClass596_3, arg1);
		@Pc(60) int local60;
		if (local22 != null) {
			try {
				@Pc(32) byte local32 = (byte) (local22[0] & 0xFF);
				if (local32 != 1) {
					return null;
				}
				@Pc(43) byte[] local43 = new byte[local22.length - 5];
				System.arraycopy(local22, 5, local43, 0, local22.length - 5);
				local16 = this.method4248(local43, false);
				for (local60 = 0; local60 < local16.length; local60++) {
					local16[local60] &= 0xFF;
				}
			} catch (@Pc(76) IOException local76) {
			}
		}
		if (local16 == null) {
			local16 = new int[local10.length];
		}
		@Pc(89) float[] local89 = new float[local10.length * 4];
		@Pc(91) int local91 = 0;
		for (@Pc(93) int local93 = 0; local93 < local10.length; local93++) {
			local60 = local10[local93];
			@Pc(105) int local105 = local60 >>> 24;
			@Pc(111) int local111 = local60 >> 16 & 0xFF;
			@Pc(117) int local117 = local60 >> 8 & 0xFF;
			@Pc(121) int local121 = local60 & 0xFF;
			@Pc(132) float local132 = (float) local16[local93] * 31.0F / 255.0F + 1.0F;
			local89[local91++] = local132 * (float) local111 / 255.0F;
			local89[local91++] = (float) local117 * local132 / 255.0F;
			local89[local91++] = (float) local121 * local132 / 255.0F;
			local89[local91++] = (float) local105 / 255.0F;
		}
		return local89;
	}

	@OriginalMember(owner = "client!dr", name = "m", descriptor = "(Lclient!vi;ID)[F", line = 94)
	float[] method4246(@OriginalArg(0) Class596 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) double arg2) {
		if (Class596.aClass596_2 != arg0) {
			return null;
		}
		@Pc(10) int[] local10 = this.method4242(arg0, arg1, arg2);
		if (local10 == null) {
			return null;
		}
		@Pc(16) int[] local16 = null;
		@Pc(22) byte[] local22 = this.method4255(Class596.aClass596_3, arg1);
		@Pc(60) int local60;
		if (local22 != null) {
			try {
				@Pc(32) byte local32 = (byte) (local22[0] & 0xFF);
				if (local32 != 1) {
					return null;
				}
				@Pc(43) byte[] local43 = new byte[local22.length - 5];
				System.arraycopy(local22, 5, local43, 0, local22.length - 5);
				local16 = this.method4248(local43, false);
				for (local60 = 0; local60 < local16.length; local60++) {
					local16[local60] &= 0xFF;
				}
			} catch (@Pc(76) IOException local76) {
			}
		}
		if (local16 == null) {
			local16 = new int[local10.length];
		}
		@Pc(89) float[] local89 = new float[local10.length * 4];
		@Pc(91) int local91 = 0;
		for (@Pc(93) int local93 = 0; local93 < local10.length; local93++) {
			local60 = local10[local93];
			@Pc(105) int local105 = local60 >>> 24;
			@Pc(111) int local111 = local60 >> 16 & 0xFF;
			@Pc(117) int local117 = local60 >> 8 & 0xFF;
			@Pc(121) int local121 = local60 & 0xFF;
			@Pc(132) float local132 = (float) local16[local93] * 31.0F / 255.0F + 1.0F;
			local89[local91++] = local132 * (float) local111 / 255.0F;
			local89[local91++] = (float) local117 * local132 / 255.0F;
			local89[local91++] = (float) local121 * local132 / 255.0F;
			local89[local91++] = (float) local105 / 255.0F;
		}
		return local89;
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(Lclient!vi;ID)[F", line = 94)
	float[] method4247(@OriginalArg(0) Class596 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) double arg2) {
		if (Class596.aClass596_2 != arg0) {
			return null;
		}
		@Pc(10) int[] local10 = this.method4242(arg0, arg1, arg2);
		if (local10 == null) {
			return null;
		}
		@Pc(16) int[] local16 = null;
		@Pc(22) byte[] local22 = this.method4255(Class596.aClass596_3, arg1);
		@Pc(60) int local60;
		if (local22 != null) {
			try {
				@Pc(32) byte local32 = (byte) (local22[0] & 0xFF);
				if (local32 != 1) {
					return null;
				}
				@Pc(43) byte[] local43 = new byte[local22.length - 5];
				System.arraycopy(local22, 5, local43, 0, local22.length - 5);
				local16 = this.method4248(local43, false);
				for (local60 = 0; local60 < local16.length; local60++) {
					local16[local60] &= 0xFF;
				}
			} catch (@Pc(76) IOException local76) {
			}
		}
		if (local16 == null) {
			local16 = new int[local10.length];
		}
		@Pc(89) float[] local89 = new float[local10.length * 4];
		@Pc(91) int local91 = 0;
		for (@Pc(93) int local93 = 0; local93 < local10.length; local93++) {
			local60 = local10[local93];
			@Pc(105) int local105 = local60 >>> 24;
			@Pc(111) int local111 = local60 >> 16 & 0xFF;
			@Pc(117) int local117 = local60 >> 8 & 0xFF;
			@Pc(121) int local121 = local60 & 0xFF;
			@Pc(132) float local132 = (float) local16[local93] * 31.0F / 255.0F + 1.0F;
			local89[local91++] = local132 * (float) local111 / 255.0F;
			local89[local91++] = (float) local117 * local132 / 255.0F;
			local89[local91++] = (float) local121 * local132 / 255.0F;
			local89[local91++] = (float) local105 / 255.0F;
		}
		return local89;
	}

	@OriginalMember(owner = "client!dr", name = "t", descriptor = "(I)V", line = 140)
	@Override
	public void method4227() {
	}

	@OriginalMember(owner = "client!dr", name = "h", descriptor = "()V", line = 140)
	@Override
	public void method4235() {
	}

	@OriginalMember(owner = "client!dr", name = "q", descriptor = "(Lclient!vi;IFIIZI)[I", line = 143)
	@Override
	public int[] method4224(@OriginalArg(0) Class596 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return this.method4239(arg0, arg1, (double) arg2);
	}

	@OriginalMember(owner = "client!dr", name = "aj", descriptor = "(Lclient!vi;IFIIZ)[I", line = 143)
	@Override
	public int[] method4229(@OriginalArg(0) Class596 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
		return this.method4239(arg0, arg1, (double) arg2);
	}

	@OriginalMember(owner = "client!dr", name = "ai", descriptor = "(Lclient!vi;IFIIZ)[I", line = 143)
	@Override
	public int[] method4232(@OriginalArg(0) Class596 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
		return this.method4239(arg0, arg1, (double) arg2);
	}

	@OriginalMember(owner = "client!dr", name = "x", descriptor = "(Lclient!vi;IFIIZI)[I", line = 147)
	@Override
	public int[] method4225(@OriginalArg(0) Class596 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return this.method4242(arg0, arg1, (double) arg2);
	}

	@OriginalMember(owner = "client!dr", name = "ag", descriptor = "(Lclient!vi;IFIIZ)[I", line = 147)
	@Override
	public int[] method4230(@OriginalArg(0) Class596 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
		return this.method4242(arg0, arg1, (double) arg2);
	}

	@OriginalMember(owner = "client!dr", name = "al", descriptor = "(Lclient!vi;IFIIZ)[I", line = 147)
	@Override
	public int[] method4234(@OriginalArg(0) Class596 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
		return this.method4242(arg0, arg1, (double) arg2);
	}

	@OriginalMember(owner = "client!dr", name = "d", descriptor = "(Lclient!vi;IFIIZI)[F", line = 151)
	@Override
	public float[] method4226(@OriginalArg(0) Class596 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return this.method4245(arg0, arg1, (double) arg2);
	}

	@OriginalMember(owner = "client!dr", name = "ao", descriptor = "(Lclient!vi;IFIIZ)[F", line = 151)
	@Override
	public float[] method4223(@OriginalArg(0) Class596 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
		return this.method4245(arg0, arg1, (double) arg2);
	}

	@OriginalMember(owner = "client!dr", name = "s", descriptor = "([BZI)[I", line = 155)
	int[] method4248(@OriginalArg(0) byte[] arg0, @OriginalArg(1) boolean arg1) throws IOException {
		@Pc(5) BufferedImage local5 = ImageIO.read(new ByteArrayInputStream(arg0));
		if (local5 == null) {
			return null;
		}
		@Pc(13) int[] local13 = Class664.method33108(local5);
		if (arg1) {
			for (@Pc(20) int local20 = local5.getHeight() - 1; local20 >= 0; local20--) {
				@Pc(27) int local27 = local20 * local5.getWidth();
				@Pc(34) int local34 = (local20 + 1) * local5.getWidth();
				while (local27 < local34) {
					local34--;
					@Pc(42) int local42 = local13[local27];
					local13[local27] = local13[local34];
					local13[local34] = local42;
					local27++;
				}
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!dr", name = "au", descriptor = "([BZ)[I", line = 155)
	int[] method4249(@OriginalArg(0) byte[] arg0, @OriginalArg(1) boolean arg1) throws IOException {
		@Pc(5) BufferedImage local5 = ImageIO.read(new ByteArrayInputStream(arg0));
		if (local5 == null) {
			return null;
		}
		@Pc(13) int[] local13 = Class664.method33108(local5);
		if (arg1) {
			for (@Pc(20) int local20 = local5.getHeight() - 1; local20 >= 0; local20--) {
				@Pc(27) int local27 = local20 * local5.getWidth();
				@Pc(34) int local34 = (local20 + 1) * local5.getWidth();
				while (local27 < local34) {
					local34--;
					@Pc(42) int local42 = local13[local27];
					local13[local27] = local13[local34];
					local13[local34] = local42;
					local27++;
				}
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!dr", name = "ak", descriptor = "([BZ)[I", line = 155)
	int[] method4250(@OriginalArg(0) byte[] arg0, @OriginalArg(1) boolean arg1) throws IOException {
		@Pc(5) BufferedImage local5 = ImageIO.read(new ByteArrayInputStream(arg0));
		if (local5 == null) {
			return null;
		}
		@Pc(13) int[] local13 = Class664.method33108(local5);
		if (arg1) {
			for (@Pc(20) int local20 = local5.getHeight() - 1; local20 >= 0; local20--) {
				@Pc(27) int local27 = local20 * local5.getWidth();
				@Pc(34) int local34 = (local20 + 1) * local5.getWidth();
				while (local27 < local34) {
					local34--;
					@Pc(42) int local42 = local13[local27];
					local13[local27] = local13[local34];
					local13[local34] = local42;
					local27++;
				}
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!dr", name = "ar", descriptor = "(Ljava/awt/image/BufferedImage;)[I", line = 175)
	public static int[] method4251(@OriginalArg(0) BufferedImage arg0) {
		if (arg0.getType() != 10 && arg0.getType() != 0) {
			return arg0.getRGB(0, 0, arg0.getWidth(), arg0.getHeight(), null, 0, arg0.getWidth());
		}
		@Pc(8) Object local8 = null;
		@Pc(19) int[] local19 = arg0.getRaster().getPixels(0, 0, arg0.getWidth(), arg0.getHeight(), (int[]) local8);
		@Pc(26) int[] local26 = new int[arg0.getWidth() * arg0.getHeight()];
		@Pc(32) int local32;
		if (arg0.getType() == 10) {
			for (local32 = 0; local32 < local26.length; local32++) {
				local26[local32] = (local19[local32] << 16) + (local19[local32] << 8) + local19[local32] + -16777216;
			}
		} else {
			for (local32 = 0; local32 < local26.length; local32++) {
				@Pc(69) int local69 = local32 * 2;
				local26[local32] = (local19[local69] << 8) + (local19[local69] << 16) + (local19[local69 + 1] << 24) + local19[local69];
			}
		}
		return local26;
	}

	@OriginalMember(owner = "client!dr", name = "ax", descriptor = "(Ljava/awt/image/BufferedImage;)[I", line = 175)
	public static int[] method4252(@OriginalArg(0) BufferedImage arg0) {
		if (arg0.getType() != 10 && arg0.getType() != 0) {
			return arg0.getRGB(0, 0, arg0.getWidth(), arg0.getHeight(), null, 0, arg0.getWidth());
		}
		@Pc(8) Object local8 = null;
		@Pc(19) int[] local19 = arg0.getRaster().getPixels(0, 0, arg0.getWidth(), arg0.getHeight(), (int[]) local8);
		@Pc(26) int[] local26 = new int[arg0.getWidth() * arg0.getHeight()];
		@Pc(32) int local32;
		if (arg0.getType() == 10) {
			for (local32 = 0; local32 < local26.length; local32++) {
				local26[local32] = (local19[local32] << 16) + (local19[local32] << 8) + local19[local32] + -16777216;
			}
		} else {
			for (local32 = 0; local32 < local26.length; local32++) {
				@Pc(69) int local69 = local32 * 2;
				local26[local32] = (local19[local69] << 8) + (local19[local69] << 16) + (local19[local69 + 1] << 24) + local19[local69];
			}
		}
		return local26;
	}

	@OriginalMember(owner = "client!dr", name = "hu", descriptor = "(IIIIIZI)V", line = 3695)
	public static final void method4253(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		Class96_Sub7.anInt829 = arg0 * -827897067;
		Class96_Sub9.anInt833 = arg1 * 1775664559;
		Class127_Sub2.anInt1420 = arg2 * -180780363;
		Class337.anInt4132 = arg3 * -2035229685;
		Class80.anInt319 = arg4 * -161837411;
		if (Class11.anInt36 * -891094135 == 3) {
			Class58.method865();
		}
		if (arg5 && Class80.anInt319 * -579311691 >= 100) {
			Class96_Sub13.anInt883 = Class96_Sub7.anInt829 * 514687488 + 329831680;
			Class633.anInt5710 = Class96_Sub9.anInt833 * -392624640 + 1581550848;
			Class672.anInt5796 = (Class277.method26658(Class96_Sub13.anInt883 * -116109187, Class633.anInt5710 * -1098179003, Class669.anInt5790 * -878424575) - Class127_Sub2.anInt1420 * -2055021667) * 996845503;
		}
		Class11.anInt36 = 1301785316;
		Class142.anInt2017 = 309821991;
		Class70.anInt203 = 1899572639;
	}

	@OriginalMember(owner = "client!dr", name = "aor", descriptor = "(Lclient!yf;B)V", line = 12124)
	static final void method4254(@OriginalArg(0) Class665 arg0) {
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub11_1, arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307] == 1 ? 1 : 0);
		Class632.method32649();
		client.aClass517_1.method30443().method32293();
		Class667.method33150();
		client.aBoolean593 = false;
	}

	@OriginalMember(owner = "client!dr", name = "c", descriptor = "(Lclient!vi;II)[B")
	abstract byte[] method4255(@OriginalArg(0) Class596 arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!dr", name = "g", descriptor = "(Lclient!vi;ILclient!vy;FIIZ)Z")
	public abstract boolean method4228(@OriginalArg(0) Class596 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class609 arg2, @OriginalArg(3) float arg3);

	@OriginalMember(owner = "client!dr", name = "z", descriptor = "(Lclient!vi;ILclient!vy;FIIZ)Z")
	public abstract boolean method4233(@OriginalArg(0) Class596 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class609 arg2, @OriginalArg(3) float arg3);

	@OriginalMember(owner = "client!dr", name = "j", descriptor = "(Lclient!vi;I)[B")
	abstract byte[] method4256(@OriginalArg(0) Class596 arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!dr", name = "v", descriptor = "(Lclient!vi;ILclient!vy;FIIZI)Z")
	public abstract boolean method4231(@OriginalArg(0) Class596 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class609 arg2, @OriginalArg(3) float arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!dr", name = "i", descriptor = "(Lclient!vi;I)[B")
	abstract byte[] method4257(@OriginalArg(0) Class596 arg0, @OriginalArg(1) int arg1);
}
