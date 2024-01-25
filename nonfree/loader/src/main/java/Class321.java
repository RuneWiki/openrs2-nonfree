import java.awt.DisplayMode;
import java.awt.Frame;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!a")
public final class Class321 {

	@OriginalMember(owner = "loader!a", name = "a", descriptor = "Ljava/awt/DisplayMode;")
	private DisplayMode aDisplayMode1;

	@OriginalMember(owner = "loader!a", name = "b", descriptor = "Ljava/awt/GraphicsDevice;")
	private GraphicsDevice aGraphicsDevice1;

	@OriginalMember(owner = "loader!a", name = "<init>", descriptor = "()V")
	public Class321() throws Exception {
		@Pc(3) GraphicsEnvironment local3 = GraphicsEnvironment.getLocalGraphicsEnvironment();
		this.aGraphicsDevice1 = local3.getDefaultScreenDevice();
		if (!this.aGraphicsDevice1.isFullScreenSupported()) {
			@Pc(14) GraphicsDevice[] local14 = local3.getScreenDevices();
			for (@Pc(18) int local18 = 0; local18 < local14.length; local18++) {
				@Pc(30) GraphicsDevice local30 = local14[local18];
				if (local30 != null && local30.isFullScreenSupported()) {
					this.aGraphicsDevice1 = local30;
					return;
				}
			}
			throw new Exception();
		}
	}

	@OriginalMember(owner = "loader!a", name = "a", descriptor = "(IIIIILjava/awt/Frame;)V")
	public void method7991(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Frame arg4) {
		this.aDisplayMode1 = this.aGraphicsDevice1.getDisplayMode();
		if (this.aDisplayMode1 == null) {
			throw new NullPointerException();
		}
		arg4.setUndecorated(true);
		arg4.enableInputMethods(false);
		this.method7992(arg4);
		if (arg1 == 0) {
			@Pc(34) int local34 = this.aDisplayMode1.getRefreshRate();
			@Pc(38) DisplayMode[] local38 = this.aGraphicsDevice1.getDisplayModes();
			@Pc(40) boolean local40 = false;
			for (@Pc(42) int local42 = 0; local42 < local38.length; local42++) {
				if (arg3 == local38[local42].getWidth() && arg2 == local38[local42].getHeight() && local38[local42].getBitDepth() == arg0) {
					@Pc(69) int local69 = local38[local42].getRefreshRate();
					if (!local40 || Math.abs(local69 - local34) < Math.abs(arg1 - local34)) {
						arg1 = local69;
						local40 = true;
					}
				}
			}
			if (!local40) {
				arg1 = local34;
			}
		}
		this.aGraphicsDevice1.setDisplayMode(new DisplayMode(arg3, arg2, arg0, arg1));
	}

	@OriginalMember(owner = "loader!a", name = "a", descriptor = "(ILjava/awt/Frame;)V")
	private void method7992(@OriginalArg(1) Frame arg0) {
		try {
			this.aGraphicsDevice1.setFullScreenWindow(arg0);
		} finally {
			;
		}
	}

	@OriginalMember(owner = "loader!a", name = "a", descriptor = "(I)V")
	public void method7993() {
		if (this.aDisplayMode1 != null) {
			this.aGraphicsDevice1.setDisplayMode(this.aDisplayMode1);
			if (!this.aGraphicsDevice1.getDisplayMode().equals(this.aDisplayMode1)) {
				throw new RuntimeException("Did not return to correct resolution!");
			}
			this.aDisplayMode1 = null;
		}
		this.method7992(null);
	}

	@OriginalMember(owner = "loader!a", name = "b", descriptor = "(I)[I")
	public int[] method7994() {
		@Pc(3) DisplayMode[] local3 = this.aGraphicsDevice1.getDisplayModes();
		@Pc(9) int[] local9 = new int[local3.length << 2];
		for (@Pc(11) int local11 = 0; local11 < local3.length; local11++) {
			local9[local11 << 2] = local3[local11].getWidth();
			local9[(local11 << 2) + 1] = local3[local11].getHeight();
			local9[(local11 << 2) + 2] = local3[local11].getBitDepth();
			local9[(local11 << 2) + 3] = local3[local11].getRefreshRate();
		}
		return local9;
	}
}
