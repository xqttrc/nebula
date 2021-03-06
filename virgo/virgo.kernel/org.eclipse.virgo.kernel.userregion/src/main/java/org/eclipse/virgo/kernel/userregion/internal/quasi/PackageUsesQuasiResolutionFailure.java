/*******************************************************************************
 * Copyright (c) 2008, 2010 VMware Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   VMware Inc. - initial contribution
 *******************************************************************************/

package org.eclipse.virgo.kernel.userregion.internal.quasi;

import org.eclipse.virgo.kernel.osgi.quasi.QuasiBundle;
import org.eclipse.virgo.kernel.osgi.quasi.QuasiPackageUsesResolutionFailure;
import org.eclipse.virgo.util.osgi.manifest.VersionRange;

/**
 * <p>
 * TODO Document PackageUsesQuasiResolutionFailure
 * </p>
 *
 * <strong>Concurrent Semantics</strong><br />
 *
 * TODO Document concurrent semantics of PackageUsesQuasiResolutionFailure
 *
 */
class PackageUsesQuasiResolutionFailure extends PackageQuasiResolutionFailure implements QuasiPackageUsesResolutionFailure {

    public PackageUsesQuasiResolutionFailure(String description, QuasiBundle quasiBundle, String pkg,
        VersionRange pkgVersionRange, String bundleSymbolicName, VersionRange bundleVersionRange) {
        super(description, quasiBundle, pkg, pkgVersionRange, bundleSymbolicName, bundleVersionRange);
    }

}
