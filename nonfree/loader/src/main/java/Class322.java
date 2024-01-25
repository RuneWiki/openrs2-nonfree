import java.awt.DisplayMode;
import java.awt.Frame;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!b")
public final class Class322 {

	@OriginalMember(owner = "loader!b", name = "b", descriptor = "Ljava/awt/DisplayMode;")
	private DisplayMode aDisplayMode1;

	@OriginalMember(owner = "loader!b", name = "a", descriptor = "Ljava/awt/GraphicsDevice;")
	private GraphicsDevice aGraphicsDevice1;

	@OriginalMember(owner = "loader!b", name = "<init>", descriptor = "()V")
	public Class322() throws Exception {
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

	@OriginalMember(owner = "loader!b", name = "a", descriptor = "(BLjava/awt/Frame;)V")
	private void method7489(@OriginalArg(1) Frame arg0) {
		try {
			this.aGraphicsDevice1.setFullScreenWindow(arg0);
		} finally {
			;
		}
	}

	@OriginalMember(owner = "loader!b", name = "a", descriptor = "(B)V")
	public void method7490() {
		if (this.aDisplayMode1 != null) {
			this.aGraphicsDevice1.setDisplayMode(this.aDisplayMode1);
			if (!this.aGraphicsDevice1.getDisplayMode().equals(this.aDisplayMode1)) {
				throw new RuntimeException("Did not return to correct resolution!");
			}
			this.aDisplayMode1 = null;
		}
		this.method7489(null);
	}

	@OriginalMember(owner = "loader!b", name = "b", descriptor = "(B)[I")
	public int[] method7491() {
		@Pc(3) DisplayMode[] local3 = this.aGraphicsDevice1.getDisplayModes();
		@Pc(9) int[] local9 = new int[local3.length << 2];
		for (@Pc(17) int local17 = 0; local17 < local3.length; local17++) {
			local9[local17 << 2] = local3[local17].getWidth();
			local9[(local17 << 2) + 1] = local3[local17].getHeight();
			local9[(local17 << 2) + 2] = local3[local17].getBitDepth();
			local9[(local17 << 2) + 3] = local3[local17].getRefreshRate();
		}
		return local9;
	}

	@OriginalMember(owner = "loader!b", name = "a", descriptor = "(IILjava/awt/Frame;ZII)V")
	public void method7492(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Frame arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.aDisplayMode1 = this.aGraphicsDevice1.getDisplayMode();
		if (this.aDisplayMode1 == null) {
			throw new NullPointerException();
		}
		arg2.setUndecorated(true);
		arg2.enableInputMethods(false);
		this.method7489(arg2);
		if (arg1 == 0) {
			@Pc(30) int local30 = this.aDisplayMode1.getRefreshRate();
			@Pc(34) DisplayMode[] local34 = this.aGraphicsDevice1.getDisplayModes();
			@Pc(36) boolean local36 = false;
			for (@Pc(38) int local38 = 0; local38 < local34.length; local38++) {
				if (arg4 == local34[local38].getWidth() && local34[local38].getHeight() == arg0 && arg3 == local34[local38].getBitDepth()) {
					@Pc(70) int local70 = local34[local38].getRefreshRate();
					if (!local36 || Math.abs(local70 - local30) < Math.abs(arg1 - local30)) {
						arg1 = local70;
						local36 = true;
					}
				}
			}
			if (!local36) {
				arg1 = local30;
			}
		}
		this.aGraphicsDevice1.setDisplayMode(new DisplayMode(arg4, arg0, arg3, arg1));
	}
}
