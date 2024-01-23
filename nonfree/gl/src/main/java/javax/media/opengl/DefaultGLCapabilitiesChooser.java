package javax.media.opengl;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("gl!javax/media/opengl/DefaultGLCapabilitiesChooser")
public final class DefaultGLCapabilitiesChooser implements GLCapabilitiesChooser {

	@OriginalMember(owner = "gl!javax/media/opengl/DefaultGLCapabilitiesChooser", name = "sign", descriptor = "(I)I")
	private static int sign(@OriginalArg(0) int arg0) {
		return arg0 < 0 ? -1 : 1;
	}

	@OriginalMember(owner = "gl!javax/media/opengl/DefaultGLCapabilitiesChooser", name = "chooseCapabilities", descriptor = "(Lgl!javax/media/opengl/GLCapabilities;[Lgl!javax/media/opengl/GLCapabilities;I)I")
	@Override
	public int chooseCapabilities(@OriginalArg(0) GLCapabilities arg0, @OriginalArg(1) GLCapabilities[] arg1, @OriginalArg(2) int arg2) {
		if (arg2 >= 0 && arg2 < arg1.length && arg1[arg2] != null) {
			return arg2;
		}
		@Pc(15) int[] local15 = new int[arg1.length];
		@Pc(17) int local17 = -9999999;
		@Pc(19) short local19 = 1000;
		@Pc(21) short local21 = 500;
		@Pc(23) byte local23 = 36;
		@Pc(25) byte local25 = 6;
		@Pc(27) byte local27 = 1;
		@Pc(29) byte local29 = 3;
		@Pc(31) int local31;
		for (local31 = 0; local31 < local15.length; local31++) {
			local15[local31] = local17;
		}
		@Pc(90) int local90;
		for (local31 = 0; local31 < local15.length; local31++) {
			@Pc(51) GLCapabilities local51 = arg1[local31];
			if (local51 != null && arg0.getStereo() == local51.getStereo()) {
				@Pc(62) byte local62 = 0;
				local90 = local62 + local23 * (local51.getRedBits() + local51.getGreenBits() + local51.getBlueBits() + local51.getAlphaBits() - arg0.getRedBits() - arg0.getGreenBits() - arg0.getBlueBits() - arg0.getAlphaBits());
				@Pc(104) int local104 = local90 + local25 * sign(local90) * Math.abs(local51.getDepthBits() - arg0.getDepthBits());
				@Pc(136) int local136 = local104 + local27 * sign(local104) * Math.abs(local51.getAccumRedBits() + local51.getAccumGreenBits() + local51.getAccumBlueBits() + local51.getAccumAlphaBits() - arg0.getAccumRedBits() - arg0.getAccumGreenBits() - arg0.getAccumBlueBits() - arg0.getAccumAlphaBits());
				local90 = local136 + local29 * sign(local136) * (local51.getStencilBits() - arg0.getStencilBits());
				if (local51.getDoubleBuffered() != arg0.getDoubleBuffered()) {
					local90 += sign(local90) * local19;
				}
				if (arg0.getStencilBits() > 0 && local51.getStencilBits() == 0) {
					local90 += sign(local90) * local21;
				}
				local15[local31] = local90;
			}
		}
		@Pc(182) boolean local182 = false;
		@Pc(184) int local184 = 0;
		@Pc(194) int local194;
		@Pc(202) GLCapabilities local202;
		@Pc(208) int local208;
		for (local90 = 0; local90 < local15.length; local90++) {
			local194 = local15[local90];
			if (local194 != local17) {
				local202 = arg1[local90];
				if (local202.getHardwareAccelerated()) {
					local208 = Math.abs(local194);
					if (!local182 || local208 > local184) {
						local182 = true;
						local184 = local208;
					}
				}
			}
		}
		if (local182) {
			for (local90 = 0; local90 < local15.length; local90++) {
				local194 = local15[local90];
				if (local194 != local17) {
					local202 = arg1[local90];
					if (!local202.getHardwareAccelerated()) {
						if (local194 <= 0) {
							local194 -= local184;
						} else if (local194 > 0) {
							local194 += local184;
						}
						local15[local90] = local194;
					}
				}
			}
		}
		local90 = local17;
		local194 = -1;
		for (@Pc(267) int local267 = 0; local267 < local15.length; local267++) {
			local208 = local15[local267];
			if (local208 != local17 && (local90 == local17 || Math.abs(local208) < Math.abs(local90) && (sign(local90) < 0 || sign(local208) > 0))) {
				local90 = local208;
				local194 = local267;
			}
		}
		if (local194 < 0) {
			throw new GLException("Unable to select one of the provided GLCapabilities");
		}
		return local194;
	}
}
